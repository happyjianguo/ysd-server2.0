package com.allinpay.util;

import com.aipg.common.AipgRsp;
import com.aipg.common.InfoReq;
import com.aipg.common.XSUtil;
import com.allinpay.XmlTools;
import com.allinpay.xmltrans.pojo.TranxContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xishengchun on 2017-09-24.
 */
public class AllinPayUtil {

    private Logger logger = LogManager.getLogger(AllinPayUtil.class);

    private static TranxContext tranxContext = TranxContext.getInstance();

    /**
     * 报文组装
     *
     * @param trxcod
     * @return
     */
    public static InfoReq makeReq(String trxcod ) {
        return makeReq(trxcod, getReqSN());
    }

    public static InfoReq makeReq(String trxcod, String reqNo) {
        InfoReq info = new InfoReq();
        info.setTRX_CODE(trxcod);
        info.setREQ_SN(reqNo);
        info.setUSER_NAME(tranxContext.getAllinpayUserName());
        info.setUSER_PASS(tranxContext.getAllinpayPassword());
        info.setLEVEL("5");
        info.setDATA_TYPE("2");
        info.setVERSION("03");
        if ("300000".equals(trxcod) || "300001".equals(trxcod) || "300003".equals(trxcod) || "REFUND".equals(trxcod)) {
            info.setMERCHANT_ID(tranxContext.getMerchantId());
        }
        return info;
    }



    /**
     * 发送报文
     *
     * @param xml
     * @param flag
     * @param url
     * @return
     */
    public static String sendToTlt(String xml, boolean flag, String url) {
        try {
            if (!flag) {
                xml = signMsg(xml);
            } else {
                xml = xml.replaceAll("<SIGNED_MSG></SIGNED_MSG>", "");
            }
            return sendXml(xml, url, flag);
        } catch (Exception e) {
            e.printStackTrace();
            if (e.getCause() instanceof ConnectException || e instanceof ConnectException) {
                System.out.println("请求链接中断，如果是支付请求，请做交易结果查询，以确认该笔交易是否已被通联受理，避免重复交易");
            }
        }
        return "请求链接中断，如果是支付请求，请做交易结果查询，以确认该笔交易是否已被通联受理，避免重复交易";
    }

    /**
     * 发送报文
     *
     * @param xml
     * @param flag
     * @return
     */
    public static String sendToTlt(String xml, boolean flag) {
        return sendToTlt(xml, flag, tranxContext.getAllinpayProcessUrl());
    }


    /**
     * 报文签名
     *
     * @param xml
     * @return 日期：Sep 9, 2012
     * @throws Exception
     */
    public static String signMsg(String xml) throws Exception {
        xml = XmlTools.signMsg(xml, tranxContext.getFullPrivateKeyPath(), tranxContext.getPrivateKeyPassword(), false);
        return xml;
    }

    /**
     * 发送报文
     *
     * @param xml
     * @param url
     * @param isFront
     * @return
     * @throws UnsupportedEncodingException
     * @throws Exception
     */
    public static String sendXml(String xml, String url, boolean isFront) throws UnsupportedEncodingException, Exception {
        System.out.println("======================发送报文======================：\n" + xml);
        String resp = XmlTools.send(url, xml);
        System.out.println("======================响应内容======================");
        boolean flag = verifyMsg(resp, tranxContext.getFullPubKeyPath(), isFront);
        if (flag) {
            System.out.println("响应内容验证通过");
        } else {
            System.out.println("响应内容验证不通过");
        }
        System.out.println(resp);
        return resp;
    }

    /**
     * 验证签名
     *
     * @param msg
     * @return 日期：Sep 9, 2012
     * @throws Exception
     */
    public static boolean verifyMsg(String msg, String cer, boolean isFront) throws Exception {
        boolean flag = XmlTools.verifySign(msg, cer, false, isFront);
        System.out.println("验签结果[" + flag + "]");
        return flag;
    }

    /**
     * 处理返回结果
     * @param trxCode
     * 交易代码
     * @param resultXml
     * 交易结果
     * @return
     */
    public static AipgRsp handleResult(String trxCode, String resultXml) {
        AipgRsp aipgrsp= null;
        //或者交易码
        if (resultXml.indexOf("<TRX_CODE>") != -1) {
            int end = resultXml.indexOf("</TRX_CODE>");
            int begin = end - 6;
            if (begin >= 0) trxCode = resultXml.substring(begin, end);
        }
        aipgrsp= XSUtil.parseRsp(resultXml);
        return aipgrsp;
    }

    /**
     * 交易批次号
     * 商户号+时间+自定义流水
     * @return
     */
    public static String getReqSN() {
        return tranxContext.getMerchantId() + "-" + String.valueOf(System.currentTimeMillis());
    }

    /**
     * 返回时间
     * @return
     */
    public static String getDateString() {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        return df.format(new Date());
    }


}
