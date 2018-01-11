package com.ysd.pay.controller;

import com.aipg.common.AipgRsp;
import com.aipg.common.InfoRsp;
import com.aipg.rtreq.Trans;
import com.aipg.transquery.QTDetail;
import com.aipg.transquery.QTransRsp;
import com.aipg.transquery.TransQueryReq;
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
import org.springframework.web.bind.annotation.RequestMethod;
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
public class RechargeController extends  BaseController{

    private Logger log = LogManager.getLogger(RechargeController.class);
    private Logger LOG = LogManager.getLogger("paylogger");

    @Autowired
    private RechargeService rechargeService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private AccountBankMapper accountBankMapper;
    @Autowired
    private BankSearchMapper bankSearchMapper;

    @Autowired
    private Environment env;

    @RequestMapping("/rechargeWg")
    public String rechargeWg(Model model, HttpServletRequest request) {
        printInfo(log,request);
        //充值

        Map<String,String> _map = getRequestMap(request);
        //String orderNo=request.getParameter("orderNo");
        String userId=request.getParameter("userId");
        String orderNo=request.getParameter("orderNo");
        model.addAttribute("orderNo",orderNo);

        String amount=request.getParameter("amount");
        String orderAmount = getBigDecimalMoneyUpper(amount);
        model.addAttribute("orderAmount",orderAmount);

        User user = userMapper.selectById(Integer.parseInt(userId));
        UserAccountRecharge  userAccountRecharge =  getAccountRecharge(orderNo);


        String serverUrl = env.getProperty("pay.wg.serverUrl");
        model.addAttribute("serverUrl",serverUrl);

        String key=env.getProperty("pay.wg.key");

        String version="v1.0";
        String language="1";
        String inputCharset= "1";
        String merchantId=env.getProperty("pay.wg.merchantId");
        model.addAttribute("merchantId",merchantId);
        String pickupUrl=env.getProperty("pay.wg.pickupUrl");
        model.addAttribute("pickupUrl",pickupUrl);
        String receiveUrl=env.getProperty("pay.wg.receiveUrl");
        model.addAttribute("receiveUrl",receiveUrl);
        String payType="0";
        String signType="1";




        String orderDatetime=getDate(userAccountRecharge.getCreateDate());
        model.addAttribute("orderDatetime",orderDatetime);
        String orderCurrency="0" ;

        String orderExpireDatetime="60";
        String payerTelephone=user.getPhone();
        model.addAttribute("payerTelephone",payerTelephone);
        String payerEmail="";
        model.addAttribute("payerEmail",payerEmail);
        String payerName=user.getRealName();
        model.addAttribute("payerName",payerName);
        String payerIDCard="";
        model.addAttribute("payerIDCard",payerIDCard);
        String pid="";
        String productName="用户充值";
        String productId="recharge";//商品标识
        String productNum= "1";
        model.addAttribute("productNum",productNum);
        String productPrice=orderAmount;
        model.addAttribute("productPrice",productPrice);
        String productDesc="用户充值";

        String ext1="";
        String ext2="";
        String extTL="";//通联商户拓展业务字段，在v2.2.0版本之后才使用到的，用于开通分账等业务
        String issuerId="";
        String pan="";
        String tradeNature = "SERVICES";
        model.addAttribute("tradeNature",tradeNature);
        String sign="";

        //若直连telpshx渠道，payerTelephone、payerName、payerIDCard、pan四个字段不可为空
        //其中payerIDCard、pan需使用公钥加密（PKCS1格式）后进行Base64编码
        if(null!=payerIDCard&&!"".equals(payerIDCard)){
            try{
                //payerIDCard = SecurityUtil.encryptByPublicKey("C:\\TLCert.cer", payerIDCard);
                payerIDCard = SecurityUtil.encryptByPublicKey("/opt/conf/TLCert.cer", payerIDCard);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        if(null!=pan&&!"".equals(pan)){
            try{
                pan = SecurityUtil.encryptByPublicKey("/opt/conf/TLCert.cer", pan);
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        //构造订单请求对象，生成signMsg。
        com.allinpay.ets.client.RequestOrder requestOrder = new com.allinpay.ets.client.RequestOrder();
        if(null!=inputCharset&&!"".equals(inputCharset)){
            requestOrder.setInputCharset(Integer.parseInt(inputCharset));
        }
        requestOrder.setPickupUrl(pickupUrl);
        requestOrder.setReceiveUrl(receiveUrl);
        requestOrder.setVersion(version);
        if(null!=language&&!"".equals(language)){
            requestOrder.setLanguage(Integer.parseInt(language));
        }
        requestOrder.setSignType(Integer.parseInt(signType));
        requestOrder.setPayType(Integer.parseInt(payType));
        requestOrder.setIssuerId(issuerId);
        requestOrder.setMerchantId(merchantId);
        requestOrder.setPayerName(payerName);
        requestOrder.setPayerEmail(payerEmail);
        requestOrder.setPayerTelephone(payerTelephone);
        requestOrder.setPayerIDCard(payerIDCard);
        requestOrder.setPid(pid);
        requestOrder.setOrderNo(orderNo);
        requestOrder.setOrderAmount(Long.parseLong(orderAmount));
        requestOrder.setOrderCurrency(orderCurrency);
        requestOrder.setOrderDatetime(orderDatetime);
        requestOrder.setOrderExpireDatetime(orderExpireDatetime);
        requestOrder.setProductName(productName);
        if(null!=productPrice&&!"".equals(productPrice)){
            requestOrder.setProductPrice(Long.parseLong(productPrice));
        }
        if(null!=productNum&&!"".equals(productNum)){
            requestOrder.setProductNum(Integer.parseInt(productNum));
        }
        requestOrder.setProductId(productId);
        requestOrder.setProductDesc(productDesc);
        requestOrder.setExt1(ext1);
        requestOrder.setExt2(ext2);
        requestOrder.setExtTL(extTL);//通联商户拓展业务字段，在v2.2.0版本之后才使用到的，用于开通分账等业务
        requestOrder.setPan(pan);
        requestOrder.setTradeNature(tradeNature);
        requestOrder.setKey(key); //key为MD5密钥，密钥是在通联支付网关会员服务网站上设置。

        //String strSrcMsg = requestOrder.getSrc(); // 此方法用于debug，测试通过后可注释。
        String strSignMsg = requestOrder.doSign(); // 签名，设为signMsg字段值。

        LOG.debug(strSignMsg);
        model.addAttribute("strSignMsg",strSignMsg);




        try{
            BankSearch bs = new BankSearch();
            bs.setBankOrderId(userAccountRecharge.getTradeNo());
            bs.setCreateDate(new Date());
            bs.setModifyDate(new Date());
            bs.setRetryNum((byte)0);
            bs.setStatus("0"); //初始状态
            bs.setSearchType("1");//网关支付
            bs.setOrderId( userAccountRecharge.getId().longValue() );
            bankSearchMapper.insert(bs);

        }catch(Exception ex){
            LOG.info("充值逻辑失败:trade_no:{}",orderNo);
        }


        return "wg_recharge";
    }


    @RequestMapping("/rechargeNotify")
    @ResponseBody
    public Map<String,Object> rechargeNotify(HttpServletRequest request) {

        //接收Server返回的支付结果
        String merchantId=request.getParameter("merchantId");
        String version=request.getParameter("version");
        String language=request.getParameter("language");
        String signType=request.getParameter("signType");
        String payType=request.getParameter("payType");
        String issuerId=request.getParameter("issuerId");
        String paymentOrderId=request.getParameter("paymentOrderId");
        String orderNo=request.getParameter("orderNo");
        String orderDatetime=request.getParameter("orderDatetime");
        String orderAmount=request.getParameter("orderAmount");
        String payDatetime=request.getParameter("payDatetime");
        String payAmount=request.getParameter("payAmount");
        String ext1=request.getParameter("ext1");
        String ext2=request.getParameter("ext2");
        String payResult=request.getParameter("payResult");
        String errorCode=request.getParameter("errorCode");
        String returnDatetime=request.getParameter("returnDatetime");
        String signMsg=request.getParameter("signMsg");
        log.info("before signMsg:{}", signMsg);
        // 将signMsg中的空格替换成+
        signMsg = signMsg.replaceAll(" ", "+");
        log.info("replace signMsg:{}", signMsg);

        //验签是商户为了验证接收到的报文数据确实是支付网关发送的。
        //构造订单结果对象，验证签名。
        com.allinpay.ets.client.PaymentResult paymentResult = new com.allinpay.ets.client.PaymentResult();
        paymentResult.setMerchantId(merchantId);
        paymentResult.setVersion(version);
        paymentResult.setLanguage(language);
        paymentResult.setSignType(signType);
        paymentResult.setPayType(payType);
        paymentResult.setIssuerId(issuerId);
        paymentResult.setPaymentOrderId(paymentOrderId);
        paymentResult.setOrderNo(orderNo);
        paymentResult.setOrderDatetime(orderDatetime);
        paymentResult.setOrderAmount(orderAmount);
        paymentResult.setPayDatetime(payDatetime);
        paymentResult.setPayAmount(payAmount);
        paymentResult.setExt1(ext1);
        paymentResult.setExt2(ext2);
        paymentResult.setPayResult(payResult);
        paymentResult.setErrorCode(errorCode);
        paymentResult.setReturnDatetime(returnDatetime);
        //signMsg为服务器端返回的签名值。
        paymentResult.setSignMsg(signMsg);
        //signType为"1"时，必须设置证书路径。
//        paymentResult.setCertPath("/opt/conf/TLCert.cer");
        String payCertPath = env.getProperty("pay.cert.path");
        if (StringUtils.isBlank(payCertPath)) {
            return json("40000", "证书无效");
        }
        paymentResult.setCertPath(payCertPath);

        //验证签名：返回true代表验签成功；否则验签失败。
        boolean verifyResult = paymentResult.verify();



        String result="";
        String msg = "";
        if(verifyResult){
            //TODO 商户订单处理
            //out.println("商户订单处理完成");


            if(payResult.equals("1")){
                Map<String,Object> map= new HashMap<String ,Object>();
                map.put("tranAmt",orderAmount);
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
            }else{
                Map<String,Object> map= new HashMap<String ,Object>();
                map.put("tranAmt",orderAmount);
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

        }else{
            LOG.info("验签失败:trade_no:{}",orderNo);
            result="44441";
            msg="验签失败";
        }

        return json(result,msg);
    }


    @RequestMapping("/recharge")
    @ResponseBody
    public Map<String,Object> recharge(HttpServletRequest request) {

        printInfo(log,request);
        //充值

        Map<String,String> _map = getRequestMap(request);
        String orderNo=request.getParameter("orderNo");
        String userId=request.getParameter("userId");
        String amount=request.getParameter("amount");


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


            UserAccountRecharge  userAccountRecharge =  getAccountRecharge(orderNo);

            Trans trans = new Trans();
            trans.setACCOUNT_NAME(user.getRealName());
            trans.setACCOUNT_NO(accountBank.getAccount());
            trans.setACCOUNT_PROP("0");
            //trans.setAMOUNT( getBigDecimalMoneyUpper(amount) );
            trans.setBANK_CODE(Bank.getBankIdByCode(accountBank.getBankId()));
            trans.setCURRENCY("CNY");
            trans.setCUST_USERID(user.getPhone());
            trans.setTEL(user.getPhone());
            trans.setID(user.getCardId());
            trans.setID_TYPE(IDType.ID_CARD.code.toString());

            String reqSN = AllinPayUtil.getReqSN();


            Long bankSearchId = 0L;
            try{
                BankSearch bs = new BankSearch();
                bs.setBankOrderId(reqSN);
                bs.setCreateDate(new Date());
                bs.setModifyDate(new Date());
                bs.setRetryNum((byte)0);
                bs.setStatus("0");
                bs.setSearchType("1");
                bs.setOrderId( userAccountRecharge.getId().longValue() );
                bankSearchMapper.insert(bs);

                bankSearchId = bs.getId();
            }catch(Exception ex){
                LOG.info("充值逻辑失败:trade_no:{}",orderNo);
                return json(result,"重复多笔提交充值订单,请重试");
            }


            AipgRsp recharge = tranxService.recharge(trans,reqSN);

            // 查询实名付的代收结果(即充值)
            TransQueryReq transQueryReq = new TransQueryReq();
            transQueryReq.setQUERY_SN(recharge.getINFO().getREQ_SN());
            AipgRsp aipgRsp = tranxService.queryTrans(transQueryReq);

            InfoRsp info = aipgRsp.getINFO();
            String infoRetCode = info.getRET_CODE();
            String errMsg = info.getERR_MSG();

            if ("0000".equals(infoRetCode)) {
                log.debug("提交成功");
                QTransRsp ret = (QTransRsp) aipgRsp.findObj(QTransRsp.class);
                QTDetail detail = (QTDetail)ret.getDetails().get(0);
                result = detail.getRET_CODE();
                msg = detail.getERR_MSG();

                if ("0000".equals(result)) {
                    //更新充值业务逻辑

                    Map<String,Object> map= new HashMap<String ,Object>();
                    map.put("tranAmt",amount);
                    map.put("feeAmt", "0");
                    map.put("tradeNo", orderNo);

                    try{
                        BankSearch bs = new BankSearch();
                        bs.setModifyDate(new Date());
                        bs.setStatus("1");//成功
                        bs.setId(bankSearchId);
                        bankSearchMapper.updateById(bs);

                        rechargeService.rechargeSuccess(map);

                    }catch(Exception ex){
                        LOG.info("充值失败:trade_no:{}",orderNo);
                        result="44440";
                        msg="充值失败";
                        return json(result,msg);
                    }

                }else{
                    log.info("充值等待查询:{}", orderNo);
                    //充值回退

                }
                log.info("充值交易结果:{}", detail.getRET_CODE(), detail.getERR_MSG());


            } else {

                result = infoRetCode;
                msg = errMsg;
                log.info("充值非0000状态:{}=={}=={}", orderNo,infoRetCode,errMsg);
                if("2000".equals(infoRetCode)||"2001".equals(infoRetCode)||"2003".equals(infoRetCode)
                        ||"2005".equals(infoRetCode)||"2007".equals(infoRetCode)||"2008".equals(infoRetCode)){
                    //中间状态,需要查询
                    //bankSearchMapper已经insert
                }else{
                    //充值回退
                    log.info("充值回退:{}", orderNo);
                    rechargeError(userAccountRecharge,info.getREQ_SN(),amount,orderNo,bankSearchId);
                }

            }

            return json(result,msg);
        } catch (Exception ex) {
            log.error(ex);
            log.info("充值逻辑失败,人工处理---------:{}",orderNo);

            return json("4444", ex.getMessage());
        }

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
