package com.allin.mtp.service.impl;

import com.allin.mtp.constant.Const;
import com.allin.mtp.model.*;
import com.allin.mtp.service.MTPTranxService;
import com.allin.mtp.util.AllinMTPConfig;
import com.allin.mtp.util.AllinMTPUtil;
import com.hitrust.tech.security.SecurityUtil;
import com.mind.platform.system.base.CMData;
import com.mind.platform.system.base.DataRow;
import encryption.DataGramB2cUtil;
import encryption.STSTxData;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.StringPart;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xishengchun on 2017-12-11.
 */
public class MTPTranxServiceImpl implements MTPTranxService {

    private Logger logger = LogManager.getLogger(MTPTranxServiceImpl.class);

    @Override
    public JrQianyueResponse bindCard(JrQianyueRequest request) throws Exception {
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setProcessingCode("1087");
        DataRow transactionDataRow = new CMData();
        DataRow headListRow = requestHeader.convert();
        DataRow requestListRow = request.convert();
        // REQUEST
        transactionDataRow.put("head", headListRow);
        transactionDataRow.put("request", requestListRow);
        String requestJrQianyueCryptoMsg = DataGramB2cUtil.createRequestJrQianyueCryptoMsg(transactionDataRow);
        String result = AllinMTPUtil.postFor(requestJrQianyueCryptoMsg);
        DataRow dataRow = DataGramB2cUtil.parseResponseJrQianyueCryptoMsg(result);

        CMData head = (CMData) dataRow.get("head");
        if (head == null) {
            throw new IllegalArgumentException("签约失败:报文头异常");
        }
        CMData response = (CMData) dataRow.get("response");
        if (response == null) {
            throw new IllegalArgumentException("签约失败:报文响应异常");
        }

        JrQianyueResponse mtpResponse = new JrQianyueResponse();
        mtpResponse.setTransTime(requestHeader.getTransTime());
        mtpResponse.setTransDate(requestHeader.getTransDate());
        mtpResponse.setRespCode(response.getString("resp_code"));
        mtpResponse.setRespMsg(response.getString("resp_msg"));
        mtpResponse.setRespTraceNum(response.getString("resp_trace_num"));
        mtpResponse.setDateSettlmt(response.getString("date_settlmt"));
        mtpResponse.setReqTraceNum(response.getString("req_trace_num"));
        return mtpResponse;
    }

    /**
     * 返回的signNum需要保存到数据库
     * @param msgVerifyRequest
     * @return
     * @throws Exception
     */
    @Override
    public MsgVerifyResponse sendSmsForBindCard(MsgVerifyRequest msgVerifyRequest) throws Exception {
        if (StringUtils.isBlank(msgVerifyRequest.getOrgReqTraceNum())) {
            throw new IllegalArgumentException("短信验证码上送失败:原交易号不能为空");
        }

        if (StringUtils.isBlank(msgVerifyRequest.getOrgTransDate())) {
            throw new IllegalArgumentException("短信验证码上送失败:原交易时间不能为空");
        }

        if (StringUtils.isBlank(msgVerifyRequest.getVerifyCode())) {
            throw new IllegalArgumentException("短信验证码上送失败:短信验证码不能为空");
        }

        msgVerifyRequest.setReqTraceNum(AllinMTPUtil.getReqTraceNum());
        msgVerifyRequest.setOrgProcessingCode("1087");

        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setProcessingCode("3010");
        DataRow headListRow = requestHeader.convert();


        DataRow requestListRow = msgVerifyRequest.convert();

        DataRow transactionDataRow = new CMData();
        transactionDataRow.put("head", headListRow);
        transactionDataRow.put("request", requestListRow);
        String requestMsgVerifyCryptoMsg = DataGramB2cUtil.createRequestMsgVerifyCryptoMsg(transactionDataRow);

        String result = AllinMTPUtil.postFor(requestMsgVerifyCryptoMsg);
        DataRow dataRow = DataGramB2cUtil.parseResponseMsgVerifyCryptoMsg(result);

        CMData head = (CMData) dataRow.get("head");
        if (head == null) {
            throw new IllegalArgumentException("短信验证码上送失败:报文头异常");
        }
        CMData response = (CMData) dataRow.get("response");
        if (response == null) {
            throw new IllegalArgumentException("短信验证码上送失败:报文响应异常");
        }

        MsgVerifyResponse msgVerifyResponse = new MsgVerifyResponse();
        msgVerifyResponse.setRespCode(response.getString("resp_code"));
        msgVerifyResponse.setRespMsg(response.getString("resp_msg"));
        msgVerifyResponse.setRespTraceNum(response.getString("resp_trace_num"));
        msgVerifyResponse.setSignNum(response.getString("sign_num"));
        return msgVerifyResponse;
    }

    @Override
    public BuyProductResponse buyProduct(BuyProductRequest buyProductRequest) throws Exception {
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setProcessingCode("2085");
        DataRow headListRow = requestHeader.convert();
        DataRow requestList = buyProductRequest.convert();

        DataRow transactionDataRow = new CMData();
        transactionDataRow.put("head", headListRow);
        transactionDataRow.put("request", requestList);
        String requestJrGouMaiShenQingCryptoMsg = DataGramB2cUtil.createRequestJrGouMaiShenQingCryptoMsg(transactionDataRow);

        String resultXml = AllinMTPUtil.postFor(requestJrGouMaiShenQingCryptoMsg);
        DataRow dataRow = DataGramB2cUtil.parseResponseJrGouMaiShenQingCryptoMsg(resultXml);
        System.out.println("response:" + dataRow);

        CMData head = (CMData) dataRow.get("head");
        if (head == null) {
            throw new IllegalArgumentException("购买申请失败:报文头异常");
        }
        CMData response = (CMData) dataRow.get("response");
        if (response == null) {
            throw new IllegalArgumentException("购买申请失败:报文响应异常");
        }

        BuyProductResponse buyProductResponse = new BuyProductResponse();
        buyProductResponse.setRespCode(response.getString("resp_code"));
        buyProductResponse.setRespMsg(response.getString("resp_msg"));
        buyProductResponse.setRespTraceNum(response.getString("resp_trace_num"));
        buyProductResponse.setSignNum(response.getString("sign_num"));
        return buyProductResponse;
    }

    @Override
    public BuyProductResponse notifyBuyProduct(String resultXML) throws Exception {
        String replaceResultXml = resultXML.replaceAll(" ", "+");
        DataRow dataRow = DataGramB2cUtil.parseResponseJrGouMaiShenQingCryptoMsg(replaceResultXml);
        CMData head = (CMData) dataRow.get("head");
        if (head == null) {
            throw new IllegalArgumentException("购买申请失败:报文头异常");
        }
        CMData response = (CMData) dataRow.get("response");
        if (response == null) {
            throw new IllegalArgumentException("购买申请失败:报文响应异常");
        }

        BuyProductResponse buyProductResponse = new BuyProductResponse();
        buyProductResponse.setRespCode(response.getString("resp_code"));
        buyProductResponse.setRespMsg(response.getString("resp_msg"));
        buyProductResponse.setRespTraceNum(response.getString("resp_trace_num"));
        buyProductResponse.setSignNum(response.getString("sign_num"));

        buyProductResponse.setOrderNum(response.getString("order_num"));

        // 单位是分
        buyProductResponse.setAmtTran(response.getString("amt_tran"));
        return buyProductResponse;
    }


    @Override
    public boolean batchRepayment(SummaryRepayment summaryRepayment) throws Exception {
        String batchNo = summaryRepayment.getBatchNo();// 文件名称

        String targetFilePath = AllinMTPConfig.getBatchRepaymentBuildFilePath() + "/" + batchNo;
        File targetFile = new File(targetFilePath);
        String fileContent = IOUtils.toString(new FileInputStream(targetFilePath), Charset.forName("utf-8"));
        String signedMsg = STSTxData.signMsgPriKey(fileContent, STSTxData.getPrivateKeyB2c());
        StringBuffer parasBuffer = new StringBuffer();
        parasBuffer.append("inst_id=");
        parasBuffer.append(AllinMTPConfig.getInstId());
        parasBuffer.append("&total_units=");
        parasBuffer.append(summaryRepayment.getTotalUnits());
        parasBuffer.append("&trans_date=");
        parasBuffer.append(summaryRepayment.getTransDate());
        parasBuffer.append("&total_amount=");
        parasBuffer.append(summaryRepayment.getTotalAmount());
        parasBuffer.append("&total_count=");
        parasBuffer.append(summaryRepayment.getTotalCount());
        parasBuffer.append("&total_discount=");
        parasBuffer.append(summaryRepayment.getTotalDiscount());
        parasBuffer.append("&batch_no=");
        parasBuffer.append(summaryRepayment.getBatchNo());
        parasBuffer.append("&product_num=");
        parasBuffer.append(AllinMTPConfig.getProductNum());

        PostMethod filePost = new PostMethod(AllinMTPConfig.getRepaymentUrl());
        filePost.setQueryString(parasBuffer.toString());
        Part[] parts = { new FilePart("upload_file", targetFile), new StringPart("sign_code", signedMsg) };
        filePost.setRequestEntity(new MultipartRequestEntity(parts, filePost.getParams()));
        HttpClient client = new HttpClient();
        client.getHttpConnectionManager().getParams().setConnectionTimeout(50000);
        int status = client.executeMethod(filePost);
        if (status == HttpStatus.SC_OK) {
            byte[] responseBody = filePost.getResponseBody();
            String outmsg = new String(responseBody, "UTF-8");
            System.out.println("batchNo: " + batchNo + " outmsg:" + outmsg);
            if (StringUtils.isNotBlank(outmsg) ) {
                String[] split = outmsg.split("\\|");
                if (split != null && split.length == 2) {
                    return "0000".equals(split[0]);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            System.out.println("批量还款的http请求失败");
            return false;
        }
    }

    @Override
    public boolean downloadRepayment(String transDate, String batchNo) throws Exception {


        String instId = AllinMTPConfig.getInstId();


        // start TODO 测试数据
//        batchNo = "O_D_20171113_12_78430000_ST";
//        transDate = "20171113";
//        instId = "78430000";
        // end

        // 替换成回盘要求的格式
        String backBatchNo = batchNo.replaceAll("ST", "RST");
        String plain = instId + transDate+ backBatchNo;
        String signData = STSTxData.signMsgPriKey(plain, STSTxData.getPrivateKeyB2c());
        List<NameValuePair> paramList = new ArrayList<>();
        paramList.add(new BasicNameValuePair("sign_code", signData));
        paramList.add(new BasicNameValuePair("inst_id", instId));
        paramList.add(new BasicNameValuePair("trans_date", transDate));
        paramList.add(new BasicNameValuePair("batch_no", backBatchNo));

        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost(AllinMTPConfig.getRepaymentResultUrl());

        httpPost.setEntity(new UrlEncodedFormEntity(paramList, Const.UTF8));
        HttpResponse response = httpClient.execute(httpPost);
        HttpEntity entity = response.getEntity();
        String resultHtml = EntityUtils.toString(entity, "UTF-8");
        String respCode = resultHtml.substring(0, 4);

        // 判断返回码是否正确
        if (!"0000".equals(respCode)) {
            logger.warn("backBatchNo:" + backBatchNo + " 回盘文件失败;" + " resultHtml:" + resultHtml);
            return false;
        }

        // 第一行的索引
        int firstIndex = resultHtml.indexOf("\n");
        String firstLine = resultHtml.substring(0, firstIndex);

        String signCode = firstLine.substring(resultHtml.indexOf("|") + 1);
        // 第一行之后的内容
        String itemLines = resultHtml.substring(firstIndex + 1);

        boolean b = SecurityUtil.verifySignature(itemLines.getBytes("utf-8"),
                Base64.decodeBase64(signCode.getBytes("utf-8")),
                "SHA1withRSA", STSTxData.getPublicKeyB2c().getPublicKey());

        // 判断签名是否正确
        boolean signSuccess = true;
        if (!b) {
            signSuccess = false;
            logger.warn("backBatchNo:" + backBatchNo + " 签名失败;");
        }

        String filePath = AllinMTPConfig.getResultRepaymentFilePath() + "/" + backBatchNo;
        // 签名错误的文件重命名
        if (!signSuccess) {
            filePath = filePath + "_SIGN_FAIL";
        }
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File(filePath);
            fileOutputStream = new FileOutputStream(file);
            IOUtils.write(resultHtml, fileOutputStream, "utf-8");
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
        return true;
    }


}
