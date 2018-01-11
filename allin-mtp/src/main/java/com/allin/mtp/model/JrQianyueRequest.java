package com.allin.mtp.model;

import com.mind.platform.system.base.CMData;
import com.mind.platform.system.base.DataRow;
import org.apache.commons.lang3.StringUtils;

/**
 * @author xishengchun on 2017-12-11.
 */
public class JrQianyueRequest {

    /**
     * 申请方交易流水号
     * 必填
     */
    private String reqTraceNum;

    /**
     * 二级商户号
     */
    private String subMerchantId;

    /**
     * 1.网页；2.快捷；3.信任；4.供应商开户；5.合作签约；6:企业开户
     */
    private String signType;

    /**
     * 供应商标识
     * 0.不开通供应商账户；1.开通所有供应商账户；2.供应商产品账户；不填写默认为0
     */
    private String prodFlag;

    /**
     * 银行编码
     */
    private String bnkId;

    /**
     * 账户类型
     * 1.借记卡；2.贷记卡；3.准贷记卡；4.预付费卡；5.手机号；6:对公账户
     */
    private String acctType;

    /**
     * 账号
     */
    private String acctNum;

    /**
     * 联行号
     * 企业开户必填
     */
    private String cnapsCode;

    /**
     * 户名
     */
    private String hldName;

    /**
     * 证件类型
     */
    private String cerType;

    /**
     * 证件号码
     */
    private String cerNum;

    /**
     * 电话号码
     */
    private String telNum;

    /**
     * 供应商编码
     * 开户标识为2必填
     */
    private String supplyInstCode;

    /**
     * 短信发送标识
     * 短信兼容模式需上送
     */
    private String isSendMsg;

    /**
     * 短信内容机构名称
     */
    private String mhntName;

    /**
     * 短信签名机构名称
     */
    private String msSignature;

    /**
     * 前台请求地址
     * 纯后台同步请求，该项可选，其他必填
     */
    private String reqsUrl;

    /**
     * 后台应答地址	C	　	该项可选
     */
    private String respUrl;

    /**
     * ip地址	O	　	客户IP地址
     */
    private String ipAddr;

    /**
     * 附加信息1
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

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getProdFlag() {
        return prodFlag;
    }

    public void setProdFlag(String prodFlag) {
        this.prodFlag = prodFlag;
    }

    public String getBnkId() {
        return bnkId;
    }

    public void setBnkId(String bnkId) {
        this.bnkId = bnkId;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public String getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(String acctNum) {
        this.acctNum = acctNum;
    }

    public String getCnapsCode() {
        return cnapsCode;
    }

    public void setCnapsCode(String cnapsCode) {
        this.cnapsCode = cnapsCode;
    }

    public String getHldName() {
        return hldName;
    }

    public void setHldName(String hldName) {
        this.hldName = hldName;
    }

    public String getCerType() {
        return cerType;
    }

    public void setCerType(String cerType) {
        this.cerType = cerType;
    }

    public String getCerNum() {
        return cerNum;
    }

    public void setCerNum(String cerNum) {
        this.cerNum = cerNum;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getSupplyInstCode() {
        return supplyInstCode;
    }

    public void setSupplyInstCode(String supplyInstCode) {
        this.supplyInstCode = supplyInstCode;
    }

    public String getIsSendMsg() {
        return isSendMsg;
    }

    public void setIsSendMsg(String isSendMsg) {
        this.isSendMsg = isSendMsg;
    }

    public String getMhntName() {
        return mhntName;
    }

    public void setMhntName(String mhntName) {
        this.mhntName = mhntName;
    }

    public String getMsSignature() {
        return msSignature;
    }

    public void setMsSignature(String msSignature) {
        this.msSignature = msSignature;
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
        requestListRow.put("bnk_id", this.bnkId);
        requestListRow.put("acct_type", this.acctType);
        requestListRow.put("acct_num", this.acctNum);
        requestListRow.put("hld_name", this.hldName);
        requestListRow.put("tel_num", this.telNum);
        requestListRow.put("cer_type", this.cerType);
        requestListRow.put("cer_num", this.cerNum);
        requestListRow.put("sign_type", this.signType);
        requestListRow.put("prod_flag", this.prodFlag);
        requestListRow.put("supply_inst_code", this.supplyInstCode);
        if (!StringUtils.isBlank(this.isSendMsg))
        {
            requestListRow.put("is_send_msg", isSendMsg);
        }
        if (!StringUtils.isBlank(mhntName))
        {
            requestListRow.put("mhnt_name", mhntName);
        }
        if (!StringUtils.isBlank(subMerchantId))
        {
            requestListRow.put("sub_merchant_id", subMerchantId);
        }

        if (!StringUtils.isBlank(this.cnapsCode))
        {
            requestListRow.put("cnaps_code", this.cnapsCode);
        }

        requestListRow.put("reqs_url", this.reqsUrl);
        requestListRow.put("resp_url", this.respUrl);
        requestListRow.put("addtnl_data1", this.addtnlData1);
        return requestListRow;
    }
}
