package com.ysd.pay.service.impl;

import com.ysd.account.criteria.AccountCashCriteria;
import com.ysd.account.dao.AccountCashMapper;
import com.ysd.account.dao.UserAccountDetailMapper;
import com.ysd.account.dao.UserAccountMapper;
import com.ysd.account.entity.AccountCash;
import com.ysd.account.entity.UserAccount;
import com.ysd.account.entity.UserAccountDetail;
import com.ysd.biz.PushForBiz;
import com.ysd.pay.service.CashService;
import com.ysd.user.dao.UserMapper;
import com.ysd.user.entity.User;
import org.apache.commons.lang.StringUtils;
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
 * Created by yujian on 2017/9/13.
 */
@Service("cashService")
public class CashServiceImpl implements CashService{

    private static Logger LOG = LogManager.getLogger("paylogger");
    private static Logger log = LogManager.getLogger(CashServiceImpl.class);

    @Autowired
    private AccountCashMapper accountCashMapper;
    @Autowired
    private UserAccountMapper userAccountMapper;
    @Autowired
    private UserAccountDetailMapper userAccountDetailMapper;
    @Autowired
    private UserMapper userMapper;



    @Transactional(propagation = Propagation.REQUIRED)
    public void cashNotify(Map<String,Object> map){

        String cashId = map.get("cashId").toString();


        AccountCashCriteria aCriteria = new AccountCashCriteria();
        aCriteria.or()
                .andTradeNoEqualTo(cashId);
        List<AccountCash> accountCashList = accountCashMapper.selectByCriteria(aCriteria);

        AccountCash accountCash1 =null;
        if(accountCashList!=null && accountCashList.size()>0){
            accountCash1 = accountCashList.get(0);
        }

        //
        String  status = map.get("status").toString();

        //0审核中,4处理中
        if(accountCash1.getStatus().intValue()==0||accountCash1.getStatus().intValue()==4){


            UserAccount userAccount = userAccountMapper.selectByUserId(accountCash1.getUserId());

            if("1".equals(status)){//审核通过
                UserAccountDetail userAcDetail = new UserAccountDetail();
                userAccount.setUnableMoney(userAccount.getUnableMoney().subtract(accountCash1.getTotal()) );
                userAccount.setTotal(userAccount.getTotal().subtract(accountCash1.getTotal()));
                userAccountMapper.updateById(userAccount);//修改资金表数据

                log.info("保存资金账户操作详细记录--提现成功写记录");
                Date now = new Date();
                userAcDetail.setModifyDate(now);
                userAcDetail.setCreateDate(now);
                userAcDetail.setType("recharge_success");
                userAcDetail.setMoney(accountCash1.getTotal());
                userAcDetail.setNoUseMoney(userAccount.getUnableMoney());
                userAcDetail.setUseMoney(userAccount.getAbleMoney());
                userAcDetail.setCollection(userAccount.getCollection());
                userAcDetail.setToUser(0);
                userAcDetail.setTotal(userAccount.getTotal());
                userAcDetail.setRemark("提现成功【提现手续费:"+accountCash1.getFee()+"元，实际到账金额:"+accountCash1.getCredited()+"元】");
                userAcDetail.setUserId(accountCash1.getUserId());
                userAcDetail.setInvestorCollectionCapital(userAccount.getInvestorCollectionCapital());
                userAcDetail.setInvestorCollectionInterest(userAccount.getInvestorCollectionInterest());
                userAcDetail.setBorrowerCollectionCapital(userAccount.getBorrowerCollectionCapital());
                userAcDetail.setBorrowerCollectionInterest(userAccount.getBorrowerCollectionInterest());
                userAccountDetailMapper.insert(userAcDetail);

                //向App推送消息
                User user = userMapper.selectById(accountCash1.getUserId());
                if(StringUtils.isNotEmpty(user.getDeviceToken())){
                    try {
                        PushForBiz.pushWhenApplyCash(String.valueOf(user.getId()), user.getUsername(),
                                accountCash1.getTotal(), accountCash1.getAccount());
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }


            }else if("2".equals(status)){//审核失败
                UserAccountDetail userAcDetail = new UserAccountDetail();
                userAccount.setAbleMoney(userAccount.getAbleMoney().add(accountCash1.getTotal()));
                userAccount.setUnableMoney(userAccount.getUnableMoney().subtract(accountCash1.getTotal()));
                userAccountMapper.updateById(userAccount);//修改资金表数据

                log.info("保存资金账户操作详细记录--提现失败");
                Date now = new Date();
                userAcDetail.setModifyDate(now);
                userAcDetail.setCreateDate(now);
                userAcDetail.setType("cash_cancel");
                userAcDetail.setMoney(accountCash1.getTotal());
                userAcDetail.setNoUseMoney(userAccount.getUnableMoney());
                userAcDetail.setUseMoney(userAccount.getAbleMoney());
                userAcDetail.setCollection(userAccount.getCollection());
                userAcDetail.setToUser(0);
                userAcDetail.setTotal(userAccount.getTotal());
                userAcDetail.setRemark("退回到提现账户【提现手续费:"+accountCash1.getFee()+"元，提现金额:"+accountCash1.getCredited()+"元】");
                userAcDetail.setUserId(accountCash1.getUserId());
                userAcDetail.setInvestorCollectionCapital(userAccount.getInvestorCollectionCapital());
                userAcDetail.setInvestorCollectionInterest(userAccount.getInvestorCollectionInterest());
                userAcDetail.setBorrowerCollectionCapital(userAccount.getBorrowerCollectionCapital());
                userAcDetail.setBorrowerCollectionInterest(userAccount.getBorrowerCollectionInterest());
                userAccountDetailMapper.insert(userAcDetail	);

            }


            Map<String,Object> acMap = new HashMap<String,Object>();
            acMap.put("oriStatus",accountCash1.getStatus());
            acMap.put("newStatus",status);
            acMap.put("id",accountCash1.getId());
            accountCashMapper.updateByNotify(acMap);
        }
    }

}
