package com.ysd.pay.controller;

import com.aipg.common.AipgRsp;
import com.aipg.common.InfoRsp;
import com.aipg.rtreq.Trans;
import com.aipg.transquery.QTDetail;
import com.aipg.transquery.QTransRsp;
import com.aipg.transquery.TransQueryReq;
import com.allin.mtp.constant.MTPBank;
import com.allin.mtp.model.BuyProductRequest;
import com.allin.mtp.model.BuyProductResponse;
import com.allin.mtp.service.MTPTranxService;
import com.allin.mtp.service.impl.MTPTranxServiceImpl;
import com.allin.mtp.util.AllinMTPConfig;
import com.allin.mtp.util.AllinMTPUtil;
import com.allinpay.ets.client.SecurityUtil;
import com.allinpay.util.AllinPayUtil;
import com.allinpay.xmltrans.constant.Bank;
import com.allinpay.xmltrans.constant.IDType;
import com.allinpay.xmltrans.service.TranxService;
import com.allinpay.xmltrans.service.impl.TranxServiceImpl;
import com.ysd.account.criteria.AccountBankCriteria;
import com.ysd.account.criteria.BankSearchCriteria;
import com.ysd.account.criteria.UserAccountRechargeCriteria;
import com.ysd.account.dao.AccountBankMapper;
import com.ysd.account.dao.BankSearchMapper;
import com.ysd.account.dao.UserAccountRechargeMapper;
import com.ysd.account.entity.AccountBank;
import com.ysd.account.entity.BankSearch;
import com.ysd.account.entity.UserAccountRecharge;
import com.ysd.pay.exception.PayException;
import com.ysd.pay.service.RechargeService;
import com.ysd.user.dao.UserMapper;
import com.ysd.user.entity.User;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yujian on 2017/9/11.
 */
@Controller
@RequestMapping("/app/")
public class AppRechargeController extends  BaseController{

    private Logger log = LogManager.getLogger(AppRechargeController.class);
    private Logger LOG = LogManager.getLogger("paylogger");

    @Autowired
    private RechargeService rechargeService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AccountBankMapper accountBankMapper;
    @Autowired
    private BankSearchMapper bankSearchMapper;

    @RequestMapping("/buy/product")
    @ResponseBody
    public Map<String,Object> rechargeWg(HttpServletRequest request) {
        printInfo(log,request);
        //充值

        Map<String,String> _map = getRequestMap(request);
        String userId=request.getParameter("userId");
        String orderNo=request.getParameter("orderNo");

        // 单位是元
        String amount=request.getParameter("amount");

        User user = userMapper.selectById(Integer.parseInt(userId));
        UserAccountRecharge  userAccountRecharge =  getAccountRecharge(orderNo);
        if (StringUtils.isBlank(user.getMtpSignNum())) {
            return json("9999", "通联会员号不存在,重新签约");
        }

        AccountBankCriteria aCriteria = new AccountBankCriteria();
        aCriteria.or()
                .andUserIdEqualTo(user.getId())
        ;
        AccountBank accountBank = null;
        List<AccountBank> as = accountBankMapper.selectByCriteria(aCriteria);
        if(as==null || as.size()==0){
            return null;
        }
        accountBank = as.get(0);

        String result = "";
        String msg = "";
        MTPTranxService mtpTranxService = new MTPTranxServiceImpl();
        try{
            BuyProductRequest buyProductRequest = new BuyProductRequest();
            buyProductRequest.setReqTraceNum(AllinMTPUtil.getReqTraceNum());
            buyProductRequest.setSignNum(user.getMtpSignNum());
            buyProductRequest.setBnkId(MTPBank.getBankIdByCode(accountBank.getBankId()));
            buyProductRequest.setAcctNum(accountBank.getAccount());
            buyProductRequest.setTelNum(accountBank.getPhone());
            buyProductRequest.setAmtTran(getBigDecimalMoneyUpper(amount));
            buyProductRequest.setCurType("156");
            buyProductRequest.setOrderNum(userAccountRecharge.getTradeNo());
            buyProductRequest.setTransUnits("1");
            buyProductRequest.setRespUrl(AllinMTPConfig.getBuyProductNotifyUrl());
            BuyProductResponse buyProductResponse = mtpTranxService.buyProduct(buyProductRequest);
            log.info("buyProductResponse:{}", buyProductResponse);
            if (!buyProductResponse.doing()) {
                result = buyProductResponse.getRespCode();
                msg = buyProductResponse.getRespMsg();
            } else {
                result = "0000";
                msg = "操作成功";
                BankSearch bs = new BankSearch();
                bs.setBankOrderId(userAccountRecharge.getTradeNo());
                bs.setCreateDate(new Date());
                bs.setModifyDate(new Date());
                bs.setRetryNum((byte)0);
                bs.setStatus("0"); //初始状态
                bs.setSearchType("1");//金融充值
                bs.setMtpBuyProduct("1");
                bs.setOrderId( userAccountRecharge.getId().longValue() );
                bankSearchMapper.insert(bs);
            }
        }catch(Exception ex){
            LOG.info("充值逻辑失败:trade_no:{}",orderNo, ex);
        }
        log.info("result:{}, msg:{}", result, msg);
        return json(result, msg);
    }


    @RequestMapping("/buy/notify")
    @ResponseBody
    public Map<String,Object> rechargeNotify(HttpServletRequest request) {

        String result = "";
        String msg = "";
        try {
            String resultXML = request.getParameter("repMsg");
            log.info("********金融支付接口异步通知*****结果:{}", resultXML);
            MTPTranxService mtpTranxService = new MTPTranxServiceImpl();
            BuyProductResponse buyProductResponse = mtpTranxService.notifyBuyProduct(resultXML);
            log.info("********金融支付接口异步通知********buyProductResponse:{}", buyProductResponse);
            String orderAmount = buyProductResponse.getAmtTran();// 单位是分
            String bigDecimalMoneyDown = getBigDecimalMoneyDown(orderAmount);// 转换成元
            String orderNo = buyProductResponse.getOrderNum();
            String paymentOrderId = buyProductResponse.getOrderNum();
            if (buyProductResponse.ok()) {

                Map<String,Object> map= new HashMap<String ,Object>();
                map.put("tranAmt",bigDecimalMoneyDown);
                map.put("feeAmt", "0");
                map.put("tradeNo", orderNo);

                try{
                    BankSearch bs = new BankSearch();
                    bs.setModifyDate(new Date());
                    bs.setStatus("1");//成功
                    bs.setBankOrderId(paymentOrderId);

                    BankSearchCriteria bc = new BankSearchCriteria();
                    bc.or().andBankOrderIdEqualTo(orderNo);
                    bankSearchMapper.updateByCriteria(bs,bc);

                    rechargeService.rechargeSuccess(map);
                    result="0000";
                    msg="商户订单处理完成";
                    LOG.info("支付成功:trade_no:{}",orderNo);
                }catch(Exception ex){
                    LOG.info("充值失败:trade_no:{}",orderNo);
                    result="44440";
                    msg="充值失败";
                    return json(result,msg);
                }
            } else {
                Map<String,Object> map= new HashMap<String ,Object>();
                map.put("tranAmt",bigDecimalMoneyDown);
                map.put("feeAmt", "0");
                map.put("tradeNo", orderNo);
                result="44441";
                msg="充值失败";
                LOG.info("支付失败:trade_no:{}",orderNo);

                BankSearch bs = new BankSearch();
                bs.setModifyDate(new Date());
                bs.setStatus("2");//成功
                bs.setBankOrderId(paymentOrderId);

                BankSearchCriteria bc = new BankSearchCriteria();
                bc.or().andBankOrderIdEqualTo(orderNo);
                bankSearchMapper.updateByCriteria(bs,bc);

                rechargeService.rechargeBack(map);
            }
        } catch (Exception e) {
            log.error("回调错误", e);
        }

        return json(result,msg);
    }

    private void rechargeError(UserAccountRecharge userAccountRecharge,String reqSn,String amount,String orderNo,Long bankSearchId){

        BankSearch bs = new BankSearch();
        bs.setModifyDate(new Date());
        bs.setStatus("2");
        bs.setId(bankSearchId);
        bankSearchMapper.updateById(bs);

        Map<String,Object> map= new HashMap<String ,Object>();
        map.put("tranAmt",amount);
        map.put("feeAmt", "0");
        map.put("tradeNo", orderNo);

        rechargeService.rechargeBack(map);
    }


    @Autowired
    private UserAccountRechargeMapper userAccountRechargeMapper;

    private UserAccountRecharge getAccountRecharge(String tradeNo){

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
        return entity;
    }

}
