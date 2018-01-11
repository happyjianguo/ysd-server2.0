package com.ysd.pay.controller;

import com.aipg.common.AipgRsp;
import com.aipg.common.InfoRsp;
import com.aipg.rtreq.Trans;
import com.aipg.rtrsp.TransRet;
import com.aipg.transquery.QTDetail;
import com.aipg.transquery.QTransRsp;
import com.allinpay.util.AllinPayUtil;
import com.allinpay.xmltrans.constant.Bank;
import com.allinpay.xmltrans.constant.IDType;
import com.allinpay.xmltrans.service.TranxService;
import com.allinpay.xmltrans.service.impl.TranxServiceImpl;

import com.ysd.account.criteria.AccountBankCriteria;
import com.ysd.account.criteria.AccountCashCriteria;
import com.ysd.account.criteria.UserAccountRechargeCriteria;
import com.ysd.account.dao.AccountBankMapper;
import com.ysd.account.dao.AccountCashMapper;
import com.ysd.account.dao.BankSearchMapper;
import com.ysd.account.dao.UserAccountRechargeMapper;
import com.ysd.account.entity.AccountBank;
import com.ysd.account.entity.AccountCash;
import com.ysd.account.entity.BankSearch;
import com.ysd.account.entity.UserAccountRecharge;
import com.ysd.pay.exception.PayException;
import com.ysd.pay.service.CashService;
import com.ysd.pay.service.RechargeService;
import com.ysd.pay.util.CommonUtil;
import com.ysd.user.dao.UserMapper;
import com.ysd.user.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户提现
 * Created by yujian on 2017/9/13.
 */
@Controller
public class CashController extends BaseController{

    private Logger log = LogManager.getLogger(CashController.class);
    private Logger LOG = LogManager.getLogger("paylogger");

    @Autowired
    private CashService cashService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AccountBankMapper accountBankMapper;
    @Autowired
    private BankSearchMapper bankSearchMapper;
    @Autowired
    private AccountCashMapper accountCashMapper;


    @RequestMapping("/cash")
    @ResponseBody
    public Map<String,Object> cash(HttpServletRequest request) {

        //打印
        printInfo(LOG,request);
        Map<String,String> _map = getRequestMap(request);
        String orderNo=request.getParameter("orderNo");
        String userId=request.getParameter("userId");
        String amount=request.getParameter("amount");
        String fee=request.getParameter("Fee");
        if(fee ==null||"".endsWith(fee)){
            fee = "0";
        }
        try{
            TranxService tranxService = new TranxServiceImpl();
            String result = "";
            String msg = "";

            User user = userMapper.selectById(Integer.parseInt(userId));
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

            AccountCash accountCash = getAccountCash(orderNo);

            Trans trans = new Trans();
            trans.setACCOUNT_NAME(user.getRealName());
            trans.setACCOUNT_NO(accountBank.getAccount());
            trans.setACCOUNT_PROP("0");
            //trans.setAMOUNT( getBigDecimalMoneyUpper(amount) );
            trans.setBANK_CODE(Bank.ABC.code);
            trans.setCURRENCY("CNY");
            trans.setCUST_USERID(user.getPhone());
            trans.setTEL(user.getPhone());
            trans.setID_TYPE(IDType.ID_CARD.code.toString());
            trans.setID(user.getCardId());

            String reqSN = AllinPayUtil.getReqSN();

            Long bankSearchId = 0L;
            try{

                BankSearch bs = new BankSearch();
                bs.setBankOrderId(reqSN);
                bs.setCreateDate(new Date());
                bs.setModifyDate(new Date());
                bs.setRetryNum((byte)0);
                bs.setStatus("0");//成功
                bs.setSearchType("2");
                bs.setOrderId( accountCash.getId().longValue() );
                bankSearchMapper.insert(bs);
                bankSearchId = bs.getId();

            }catch(Exception ex){
                LOG.info("提现逻辑失败:trade_no:{}",orderNo);
                result="4440";
                msg="重复提现失败,请重新操作提现";
                return json(result,msg);
            }

            AipgRsp aipgRsp = tranxService.deposit(trans,reqSN);


            InfoRsp info = aipgRsp.getINFO();
            String infoRetCode = info.getRET_CODE();
            String errMsg = info.getERR_MSG();

            if ("0000".equals(infoRetCode)) {
                log.debug("提交成功");
                TransRet ret = (TransRet) aipgRsp.findObj(TransRet.class);

                result = ret.getRET_CODE();
                msg = ret.getERR_MSG();


                log.info("提现交易结果:{}", ret.getRET_CODE(), ret.getERR_MSG());

                if ("0000".equals(result)) {
                    //更新充值业务逻辑


                    Map<String,Object> map= new HashMap<String ,Object>();
                    map.put("tranAmt",amount);
                    map.put("feeAmt", fee);
                    map.put("cashId",orderNo);
                    map.put("status", "1");

                    try{

                        BankSearch bs = new BankSearch();
                        bs.setModifyDate(new Date());
                        bs.setStatus("1");//成功
                        bs.setId(bankSearchId);
                        bankSearchMapper.updateById(bs);

                        cashService.cashNotify(map);
                    }catch(Exception ex){
                        LOG.info("提现逻辑失败,人工处理:trade_no:{}",orderNo);
                        result="4440";
                        msg="提现失败";
                        return json(result,msg);
                    }
                }else{
                    log.info("提现等待查询:{}", orderNo);
                }


            } else {

                result = infoRetCode;
                msg = errMsg;
                log.info("提现非0000状态:{}=={}=={}", orderNo,infoRetCode,errMsg);

                if("2000".equals(infoRetCode)||"2001".equals(infoRetCode)||"2003".equals(infoRetCode)
                        ||"2005".equals(infoRetCode)||"2007".equals(infoRetCode)||"2008".equals(infoRetCode)){
                    //中间状态,需要查询
                }else{
                    //提现回退
                    log.info("提现回退:{}", orderNo);
                    cashError(amount,orderNo,fee,bankSearchId);
                }


            }

            return json(result,msg);
        }catch (Exception ex){
            log.error(ex);
            log.info("提现逻辑失败,人工处理---------:{}",orderNo);
            return json("4444",ex.getMessage());
        }
    }

    private void cashError(String amount, String orderNo,String fee,Long bankSearchId){

        BankSearch bs = new BankSearch();
        bs.setModifyDate(new Date());
        bs.setId(bankSearchId);
        bs.setStatus("2");
        bankSearchMapper.updateById(bs);

        Map<String,Object> map= new HashMap<String ,Object>();
        map.put("tranAmt",amount);
        map.put("feeAmt", fee);
        map.put("cashId",orderNo);
        map.put("status", "2");

        cashService.cashNotify(map);
    }



    private AccountCash getAccountCash(String tradeNo){

        AccountCashCriteria aCriteria = new AccountCashCriteria();
        aCriteria.or()
                .andTradeNoEqualTo(tradeNo);
        List<AccountCash> aList = accountCashMapper.selectByCriteria(aCriteria);

        AccountCash entity = null;
        if(aList!=null && aList.size()==1){
            entity =aList.get(0);
        }else{
            LOG.info("提现状态更新失败,记录无法找到-{}",tradeNo);
            throw new PayException("提现状态更新失败");
        }
        return entity;
    }



}
