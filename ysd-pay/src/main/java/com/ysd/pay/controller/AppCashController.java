package com.ysd.pay.controller;

import com.aipg.common.AipgRsp;
import com.aipg.common.InfoRsp;
import com.aipg.rtreq.Trans;
import com.aipg.rtrsp.TransRet;
import com.allinpay.util.AllinPayUtil;
import com.allinpay.xmltrans.constant.Bank;
import com.allinpay.xmltrans.constant.IDType;
import com.allinpay.xmltrans.service.TranxService;
import com.allinpay.xmltrans.service.impl.TranxServiceImpl;
import com.ysd.account.criteria.AccountBankCriteria;
import com.ysd.account.criteria.AccountCashCriteria;
import com.ysd.account.criteria.UserAccountRechargeCriteria;
import com.ysd.account.dao.*;
import com.ysd.account.entity.*;
import com.ysd.pay.exception.PayException;
import com.ysd.pay.service.CashService;
import com.ysd.user.dao.UserMapper;
import com.ysd.user.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户提现
 * Created by yujian on 2017/9/13.
 */
@Controller
@RequestMapping("/app")
public class AppCashController extends BaseController{

    private Logger log = LogManager.getLogger(AppCashController.class);
    private Logger LOG = LogManager.getLogger("paylogger");

    @Autowired
    private CashService cashService;
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BankSearchMapper bankSearchMapper;
    @Autowired
    private AccountCashMapper accountCashMapper;

    @Autowired
    private MtpRepaymentRecordMapper mtpRepaymentRecordMapper;

    @Autowired
    private AccountBankMapper accountBankMapper;

    @Autowired
    private UserAccountMapper userAccountMapper;

    @RequestMapping("/cash")
    @ResponseBody
    public Map<String,Object> cash(HttpServletRequest request) {

        //打印
        printInfo(LOG,request);
        Map<String,String> _map = getRequestMap(request);
        String tradeNo=request.getParameter("tradeNo");
        String _userId=request.getParameter("userId");
        int userId = Integer.parseInt(_userId);
        String amount=request.getParameter("amount");
        String fee=request.getParameter("Fee");
        if(fee ==null||"".endsWith(fee)){
            fee = "0";
        }
        try{

            AccountBankCriteria aCriteria = new AccountBankCriteria();
            aCriteria.or().andUserIdEqualTo(userId);

            List<AccountBank> aList=accountBankMapper.selectByCriteria(aCriteria);
            AccountBank accountBank = null;
            List<AccountBank> as = accountBankMapper.selectByCriteria(aCriteria);
            if(as==null || as.size()==0){
                return null;
            }
            accountBank = as.get(0);

            UserAccount userAccount = userAccountMapper.selectByUserId(userId);

            //插入表mtp_repayment_record

            MtpRepaymentRecord record = new MtpRepaymentRecord();
            record.setUserId(userId);
            record.setStatus(0);//0-审核中；1-审核成功；2-审核失败；3-用户取消；4-处理中
            record.setAccount(accountBank.getAccount());
            record.setBank(accountBank.getBankId());
            record.setBranch("");
            record.setTotal(new BigDecimal(amount));
            record.setFee(new BigDecimal(0));
            record.setCredited(record.getTotal().subtract(record.getFee()));
            record.setAddtime(new Date());
            record.setCreateDate(record.getAddtime());
            record.setAbleCashMoney(userAccount.getAbleMoney());
            record.setTradeNo(tradeNo);
            record.setMtpRepaymentStatus(0);//'-1:废弃;0:新创建,未提交;1：已经提交;2:回盘成功3:回盘失败;',

            mtpRepaymentRecordMapper.insert(record);


        }catch (Exception ex){
            log.error(ex);
            log.info("提现逻辑失败,人工处理---------:{}",tradeNo);
            return json("4444",ex.getMessage());
        }


        return json("0000","提现正在处理");
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
