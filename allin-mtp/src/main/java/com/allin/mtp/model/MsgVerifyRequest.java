package com.allin.mtp.model;

import com.allin.mtp.util.AllinMTPUtil;
import com.mind.platform.system.base.CMData;
import com.mind.platform.system.base.DataRow;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author xishengchun on 2017-12-11.
 *         短信验证码上送
 */
public class MsgVerifyRequest {

    /**
     * 申请方交易流水号
     */
    private String reqTraceNum = AllinMTPUtil.getReqTraceNum();

    /**
     * 二级商户号
     */
    private String subMerchantId;

    /**
     * 原交易类型
     */
    private String orgProcessingCode;

    /**
     * 原申请方交易流水号
     */
    private String orgReqTraceNum;

    /**
     * 原交易日期
     * YYYYMMDD
     */
    private String orgTransDate;

    /**
     * 短信验证码
     */
    private String verifyCode;

    /**
     * 前台请求地址
     * 纯后台同步请求，该项可选，其他必填
     */
    private String reqsUrl;

    /**
     * 后台应答地址
     */
    private String respUrl;

    /**
     * ip地址
     */
    private String ipAddr;

    /**
     * 附加信息1	O
     */
    private String addtnlData1;

    public String getReqTraceNum() {
        return reqTraceNum;
    }

    public void setReqTraceNum(String reqTraceNum) {
        this.reqTraceNum = reqTraceNum;
    }

    public String getSubMerchantId() {
        return subMerchantId;
    }

    public void setSubMerchantId(String subMerchantId) {
        this.subMerchantId = subMerchantId;
    }

    public String getOrgProcessingCode() {
        return orgProcessingCode;
    }

    public void setOrgProcessingCode(String orgProcessingCode) {
        this.orgProcessingCode = orgProcessingCode;
    }

    public String getOrgReqTraceNum() {
        return orgReqTraceNum;
    }

    public void setOrgReqTraceNum(String orgReqTraceNum) {
        this.orgReqTraceNum = orgReqTraceNum;
    }

    public String getOrgTransDate() {
        return orgTransDate;
    }

    public void setOrgTransDate(String orgTransDate) {
        this.orgTransDate = orgTransDate;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getReqsUrl() {
        return reqsUrl;
    }

    public void setReqsUrl(String reqsUrl) {
        this.reqsUrl = reqsUrl;
    }

    public String getRespUrl() {
        return respUrl;
    }

    public void setRespUrl(String respUrl) {
        this.respUrl = respUrl;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public String getAddtnlData1() {
        return addtnlData1;
    }

    public void setAddtnlData1(String addtnlData1) {
        this.addtnlData1 = addtnlData1;
    }

    public DataRow convert() {
        DataRow requestListRow = new CMData();
        requestListRow.put("req_trace_num", this.reqTraceNum);
        requestListRow.put("org_processing_code", this.orgProcessingCode);
        requestListRow.put("org_req_trace_num", this.orgReqTraceNum);
        requestListRow.put("org_trans_date", this.orgTransDate);
        requestListRow.put("verify_code", this.verifyCode);
        return requestListRow;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
