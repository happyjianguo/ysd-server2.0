package com.ysd.task.search;

import com.aipg.common.AipgRsp;
import com.aipg.common.InfoRsp;
import com.aipg.transquery.QTDetail;
import com.aipg.transquery.QTransRsp;
import com.aipg.transquery.TransQueryReq;
import com.allinpay.ets.client.PaymentResult;
import com.allinpay.ets.client.SecurityUtil;
import com.allinpay.ets.client.StringUtil;
import com.allinpay.xmltrans.service.TranxService;
import com.allinpay.xmltrans.service.impl.TranxServiceImpl;
import com.ysd.account.dao.BankSearchMapper;
import com.ysd.account.dao.UserAccountRechargeMapper;
import com.ysd.account.entity.BankSearch;
import com.ysd.account.entity.UserAccountRecharge;
import com.ysd.pay.service.RechargeService;
import com.ysd.task.config.AppConfig;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.net.HttpURLConnection;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by yujian on 2017/9/27.
 */
@Component
public class WgRechargeSearchJob {

    private Logger logger = LogManager.getLogger(RechargeSearchJob.class);


    private AtomicBoolean isRunning = new AtomicBoolean(false);




    @Autowired
    private RechargeService rechargeService;
    @Autowired
    private UserAccountRechargeMapper userAccountRechargeMapper;

    @Autowired
    private AppConfig appConfig;

    @Autowired
    private Environment env;

    @Autowired
    private BankSearchMapper bankSearchMapper;

    /**
     * 订单查询
     */
    @Scheduled(cron = "${wgrecharge.end.job.cron}")
    public void search() {


        boolean b = false;
        try{
            logger.info("runtime:{}", appConfig.getRuntimeEnv());

            if(isRunning.compareAndSet(false,true)){
                logger.info("search not end recharge order...");


                //Thread.sleep(10000);
                List<BankSearch> aList = bankSearchMapper.selectRechargeNotEnd();

                if(aList == null || aList.size() <=0){
                    logger.debug("wg recharge bank search list is null");
                }

                for(BankSearch bs: aList){
                    dealOne(bs);
                }



                //isRunning.set(false);
            }else{
                logger.debug("recharge job is not end...");
                b = true;
                return;
            }

        }catch (Exception ex){
            ex.printStackTrace();
            logger.error(ex);

        }finally {
            if(!b){
                isRunning.set(false);
            }

        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    private void dealOne(BankSearch bs){

        // UserAccountRecharge uar
        UserAccountRecharge uar = userAccountRechargeMapper.selectById(bs.getOrderId().intValue());

        String serverUrl=env.getProperty("pay.wg.serverUrl");
        String key=env.getProperty("pay.wg.key");
        String merchantId=env.getProperty("pay.wg.merchantId");
        String orderNo = uar.getTradeNo();
        String version="v1.5";
        String signType="0";
        String orderDatetime=getDate(uar.getCreateDate());
        String queryDatetime=getDate(new Date());

        //设置签名

        logger.debug("{}-{}-{}-{}-{}-{}-",
                serverUrl,key, merchantId,orderNo,orderDatetime,queryDatetime);

        StringBuffer bufSignSrc=new StringBuffer();
        StringUtil.appendSignPara(bufSignSrc, "merchantId",merchantId);
        StringUtil.appendSignPara(bufSignSrc, "version", version);
        StringUtil.appendSignPara(bufSignSrc, "signType", signType);
        StringUtil.appendSignPara(bufSignSrc, "orderNo", orderNo);
        StringUtil.appendSignPara(bufSignSrc, "orderDatetime",orderDatetime);
        StringUtil.appendSignPara(bufSignSrc, "queryDatetime",queryDatetime);
        StringUtil.appendLastSignPara(bufSignSrc, "key", key);
        String signSrc=bufSignSrc.toString();

        String signMsg= SecurityUtil.MD5Encode(bufSignSrc.toString());
        logger.debug("{}",signMsg);


        // 提交查询请求
        boolean isSuccess = false;
        String resultMsg = "";
        Map<String, String> result = new HashMap<String, String>();
        try{
            String listenUrl=serverUrl;
            HttpClient httpclient=new HttpClient();
            PostMethod postmethod=new PostMethod(listenUrl);
            NameValuePair[] date = {
                    new NameValuePair("merchantId",merchantId),
                    new NameValuePair("version",version),
                    new NameValuePair("signType",signType),
                    new NameValuePair("orderNo",orderNo),
                    new NameValuePair("orderDatetime",orderDatetime),
                    new NameValuePair("queryDatetime",queryDatetime),
                    new NameValuePair("signMsg",signMsg)
            };
            postmethod.setRequestBody(date);
            int responseCode=httpclient.executeMethod(postmethod);



            if(responseCode == HttpURLConnection.HTTP_OK){
                String strResponse = postmethod.getResponseBodyAsString();

                logger.info("search strResponse:{}", strResponse);
                // 解析查询返回结果
                strResponse = URLDecoder.decode(strResponse);
                //	Map<String, String> result = new HashMap<String, String>();
                String[] parameters = strResponse.split("&");
                for (int i = 0; i < parameters.length; i++) {
                    String msg = parameters[i];
                    int index = msg.indexOf('=');
                    if (index > 0) {
                        String name = msg.substring(0, index);
                        String value = msg.substring(index + 1);
                        result.put(name, value);
                    }
                }

                // 查询结果会以Server方式通知商户(同支付返回)；
                // 若无法取得Server通知结果，可以通过解析查询返回结果，更新订单状态(参考如下).
                if (null != result.get("ERRORCODE")) {
                    // 未查询到订单
                    System.out.println("ERRORCODE=" + result.get("ERRORCODE"));
                    System.out.println("ERRORMSG=" + result.get("ERRORMSG"));
                    resultMsg = result.get("ERRORMSG");

                    if(bs.getRetryNum()>=2){

                        bs.setRetryNum((byte)3);
                        bs.setStatus("2");
                        bankSearchMapper.updateById(bs);
                    }else{
                        bs.setRetryNum((byte)(bs.getRetryNum().intValue()+1));
                        bankSearchMapper.updateById(bs);
                    }

                } else {
                    // 查询到订单
                    String payResult = result.get("payResult");

                    if(payResult == null){
                        return;
                    }

                    if (payResult.equals("1")) {
                        System.out.println("订单付款成功！");

                        // 支付成功，验证签名
                        PaymentResult paymentResult = new PaymentResult();
                        paymentResult.setMerchantId(result.get("merchantId"));
                        paymentResult.setVersion(result.get("version"));
                        paymentResult.setLanguage(result.get("language"));
                        paymentResult.setSignType(result.get("signType"));
                        paymentResult.setPayType(result.get("payType"));
                        paymentResult.setIssuerId(result.get("issuerId"));
                        paymentResult.setPaymentOrderId(result
                                .get("paymentOrderId"));
                        paymentResult.setOrderNo(result.get("orderNo"));
                        paymentResult.setOrderDatetime(result
                                .get("orderDatetime"));
                        paymentResult.setOrderAmount(result.get("orderAmount"));
                        paymentResult.setPayAmount(result.get("payAmount"));
                        paymentResult.setPayDatetime(result.get("payDatetime"));
                        paymentResult.setExt1(result.get("ext1"));
                        paymentResult.setExt2(result.get("ext2"));
                        paymentResult.setPayResult(result.get("payResult"));
                        paymentResult.setErrorCode(result.get("errorCode"));
                        paymentResult.setReturnDatetime(result
                                .get("returnDatetime"));
                        paymentResult.setKey(key);
                        paymentResult.setSignMsg(result.get("signMsg"));
                        paymentResult.setCertPath(env.getProperty("pay.cert.path"));

                        boolean verifyResult = paymentResult.verify();

                        if (verifyResult) {
                            logger.debug("验签成功！商户更新订单状态。order:{}",bs.getOrderId());
                            resultMsg = "订单支付成功，验签成功！商户更新订单状态。";
                            isSuccess = true;

                            deal(result,bs);
                        } else {
                            logger.debug("验签失败！order:{}",bs.getOrderId());
                            resultMsg = "订单支付成功，验签失败！";
                        }

                    } else {
                        logger.debug("订单尚未付款！");
                        resultMsg = "订单尚未付款！";
                        deal(result,bs);
                    }
                }

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    @Transactional(propagation = Propagation.REQUIRED)
    private void deal(Map<String, String> result ,BankSearch bs){

        String payResult = result.get("payResult");
        if ("1".equals(payResult)) {

            UserAccountRecharge uar= userAccountRechargeMapper.selectById( bs.getOrderId().intValue());
            Map<String,Object> map= new HashMap<String ,Object>();
            map.put("tranAmt",uar.getMoney());
            map.put("feeAmt", "0");
            map.put("tradeNo", uar.getTradeNo());
            rechargeService.rechargeSuccess(map);

            bs.setStatus("1");
            bs.setBankOrderId(result.get("paymentOrderId"));
            bankSearchMapper.updateById(bs);
        }else{
            logger.debug("订单失败");

            if(bs.getRetryNum()>=2){

                bs.setRetryNum((byte)3);
                bs.setStatus("2");
                bs.setBankOrderId(result.get("paymentOrderId"));
                bankSearchMapper.updateById(bs);
            }else{
                bs.setRetryNum((byte)(bs.getRetryNum().intValue()+1));
                bs.setBankOrderId(result.get("paymentOrderId"));
                bankSearchMapper.updateById(bs);
            }
        }
    }


    private static String getDate(Date date) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = formatter.format(date);
        return dateString;
    }



}
