package com.ysd.pay.service.impl;


import com.ysd.account.criteria.UserAccountRechargeCriteria;
import com.ysd.account.dao.UserAccountDetailMapper;
import com.ysd.account.dao.UserAccountMapper;
import com.ysd.account.dao.UserAccountRechargeMapper;
import com.ysd.account.entity.UserAccount;
import com.ysd.account.entity.UserAccountDetail;
import com.ysd.account.entity.UserAccountRecharge;
import com.ysd.biz.PushForBiz;
import com.ysd.pay.exception.PayException;
import com.ysd.pay.service.RechargeService;
import com.ysd.user.dao.UserMapper;
import com.ysd.user.entity.User;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 充值相关
 * Created by yujian on 2017/9/11.
 */
@Service("rechargeService")
public class RechargeServiceImpl implements RechargeService {

    private static Logger LOG = LogManager.getLogger("paylogger");
    private static Logger log = LogManager.getLogger(RechargeServiceImpl.class);

    @Autowired
    private UserAccountRechargeMapper userAccountRechargeMapper;
    @Autowired
    private UserAccountMapper userAccountMapper;
    @Autowired
    private UserAccountDetailMapper userAccountDetailMapper;
    @Autowired
    private UserMapper userMapper;




    /*
	 *detailMap:
	 *充值交易回调
	 * */
    @Transactional(propagation = Propagation.REQUIRED)
    public int rechargeSuccess(Map<String,Object> map){
        //BigDecimal tranAmt = BigDecimal.valueOf(Double.valueOf(map.get("tranAmt").toString()));



        BigDecimal feeAmt = new BigDecimal(0);
        String paymentFee = map.get("feeAmt").toString();
        if(StringUtils.isNotEmpty(paymentFee)){
            feeAmt = BigDecimal.valueOf(Double.valueOf(paymentFee));		//商户提取佣金金额
        }

        String tradeNo = (String)map.get("tradeNo");
        UserAccountRechargeCriteria aCriteria = new UserAccountRechargeCriteria();
        aCriteria.or()
                .andTradeNoEqualTo(tradeNo);
        List<UserAccountRecharge> aList = userAccountRechargeMapper.selectByCriteria(aCriteria);

        UserAccountRecharge entity = null;
        if(aList!=null && aList.size()==1){
            entity =aList.get(0);
        }else{
            LOG.info("充值状态更新失败,记录无法找到-{}",tradeNo);
            throw new PayException("充值状态更新失败");
        }

        if (entity.getStatus().equals(1)) {// 状态为1：已经充值完成
            return 1;
        }
        if (!entity.getStatus().equals(2)) {// 状态为非2：不是充值状态
            return 2;
        }

        BigDecimal tranAmt =entity.getMoney();

                //修改总账户记录-充值金额
        UserAccount userAccount = userAccountMapper.selectByUserId(entity.getUserId());

        userAccount.setModifyDate(new Date());
        userAccount.setTotal(userAccount.getTotal().add(tranAmt));
        userAccount.setAbleMoney(userAccount.getAbleMoney().add(tranAmt));
        //userAccountMapper.updateAmount(userAccount);

        //添加流水记录-充值金额
        UserAccountDetail userAccountDetail = fillUserAccountDetail("recharge",
                tranAmt, 10000, "线上充值:"+tranAmt+"元",
                "0.0.0.0", userAccount);
        userAccountDetailMapper.insert(userAccountDetail);

        if(feeAmt.doubleValue() > 0) {// 手续费大于0,金额变更

            //修改总账户记录-扣除手续费金额
            userAccount.setTotal(userAccount.getTotal().subtract(feeAmt));
            userAccount.setAbleMoney(userAccount.getAbleMoney().subtract(feeAmt));


            //添加流水记录-扣除手续费金额
            UserAccountDetail userAccountDetail_fee = fillUserAccountDetail("fee",
                        feeAmt, 10000, "扣除手续费:"+feeAmt+"元", "0.0.0.0", userAccount);
             userAccountDetailMapper.insert(userAccountDetail_fee);
        }
        this.userAccountMapper.updateAmount(userAccount);

        entity.setStatus(1);
        entity.setReturned("---");
        int num = userAccountRechargeMapper.updateByNotify(entity);
        if(num!=1){
            LOG.info("充值状态更新失败-{}",tradeNo);
            throw new PayException("充值状态更新失败");
        }

        User user = userMapper.selectById(userAccount.getUserId());
        try {
            PushForBiz.pushWhenRecharge(String.valueOf(user.getId()), user.getUsername(), tranAmt);
        } catch (Exception e) {
            e.printStackTrace();
        }

        LOG.info("recharge success end++");
        return 0;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public int rechargeBack(Map<String, Object> map){


        String tradeNo = (String)map.get("tradeNo");
        UserAccountRechargeCriteria aCriteria = new UserAccountRechargeCriteria();
        aCriteria.or()
                .andTradeNoEqualTo(tradeNo);
        List<UserAccountRecharge> aList = userAccountRechargeMapper.selectByCriteria(aCriteria);

        UserAccountRecharge entity = null;
        if(aList!=null && aList.size()==1){
            entity =aList.get(0);
        }else{
            LOG.info("充值状态更新失败,记录无法找到-{}",tradeNo);
            throw new PayException("充值状态更新失败");
        }

        if (entity.getStatus().equals(1)) {// 状态为1：已经充值完成
            return 1;
        }
        if (!entity.getStatus().equals(2)) {// 状态为非2：不是充值状态
            return 2;
        }

        BigDecimal tranAmt =entity.getMoney();

        //修改总账户记录-充值金额
        UserAccount userAccount = userAccountMapper.selectByUserId(entity.getUserId());
        userAccount.setModifyDate(new Date());

        User user = userMapper.selectById(entity.getUserId());


        //添加流水记录-充值金额
        UserAccountDetail userAccountDetail = fillUserAccountDetail("recharge_error",
                tranAmt, entity.getUserId(), "充值失败:"+tranAmt+"元",
                "0.0.0.0", userAccount);
        userAccountDetailMapper.insert(userAccountDetail);


        entity.setStatus(4);//充值失败
        entity.setReturned("充值失败");
        int num = userAccountRechargeMapper.updateByNotify(entity);
        if(num!=1){
            LOG.info("充值失败状态更新失败-{}",tradeNo);
            throw new PayException("充值失败状态更新失败");
        }

        LOG.info("recharge error end++");
        return 0;

    }


    private static UserAccountDetail fillUserAccountDetail(//
                                                          String type,//
                                                          BigDecimal money, //
                                                          Integer toUserId,//
                                                          String remark,//
                                                          String ip,//
                                                          UserAccount userAccount//
    ) {

        UserAccountDetail userAccountDetail = new UserAccountDetail();

        userAccountDetail.setType(type);
        userAccountDetail.setMoney(money);
        userAccountDetail.setToUser(toUserId);
        userAccountDetail.setRemark(remark);
        userAccountDetail.setOperatorIp(ip);
        userAccountDetail.setAddTime(new Date());
        userAccountDetail.setUserId(userAccount.getUserId());
        userAccountDetail.setTotal(userAccount.getTotal());
        userAccountDetail.setUseMoney(userAccount.getAbleMoney());
        userAccountDetail.setNoUseMoney(userAccount.getUnableMoney());
        userAccountDetail.setInvestorCollectionCapital(userAccount
                .getInvestorCollectionCapital());
        userAccountDetail.setInvestorCollectionInterest(userAccount
                .getInvestorCollectionInterest());
        userAccountDetail.setBorrowerCollectionCapital(userAccount
                .getBorrowerCollectionCapital());
        userAccountDetail.setBorrowerCollectionInterest(userAccount
                .getBorrowerCollectionInterest());
        userAccountDetail.setContinueTotal(userAccount.getContinueTotal());
        userAccountDetail.setAwardMoney(userAccount.getAwardMoney());
        userAccountDetail.setTasteMoney(userAccount.getTasteMoney());

        Date now = new Date();
        userAccountDetail.setModifyDate(now);
        userAccountDetail.setCreateDate(now);

        return userAccountDetail;
    }

}
