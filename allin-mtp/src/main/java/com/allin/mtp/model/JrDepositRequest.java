package com.allin.mtp.model;

/**
 * @author xishengchun on 2017-12-11.
 *         提现
 */
public class JrDepositRequest {
    /**
     * 申请方交易流水号
     */
    private String reqTraceNum;

    /**
     * 二级商户号
     */
    private String subMerchantId;

    /**
     * 通联会员号
     */
    private String signNum;

    /**
     * 支付模式
     * 0.银行卡支付；2.余额账户支付；3.份额支付；4.机构自付；
     */
    private String payMode;

    /**
     * 账户标识
     * 0.余额账户；1.现金账户；
     */
    private String chargeFlag;

    /**
     * 银行编码
     */
    private String bnkId;

    /**
     * 账户类型	M	　	1.借记卡；2.贷记卡；3.准贷记卡；4.预付费卡；5.手机号；6:对公账户
     */
    private String acctType;

    /**
     * 账号
     */
    private String acctNum;

    /**
     * 联行号	C	　	账户类型为对公账户为必填
     */
    private String cnapsCode;

    /**
     * 电话号码
     */
    private String telNum;

    /**
     * 交易币种
     * 156（人民币）
     */
    private String curType;

    /**
     * 交易金额
     */
    private String amtTran;

    /**
     * 营销金额
     */
    private String promotionFee;

    /**
     * 现金账户代码	C	R	账户为现金账户必填
     */
    private String productCodeCashAcct;

    /**
     * 后台应答地址
     */
    private String respUrl;

    /**
     * ip地址
     * 客户IP地址
     */
    private String ipAddr;

    /**
     * 附加信息1O
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

    public String getSignNum() {
        return signNum;
    }

    public void setSignNum(String signNum) {
        this.signNum = signNum;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public String getChargeFlag() {
        return chargeFlag;
    }

    public void setChargeFlag(String chargeFlag) {
        this.chargeFlag = chargeFlag;
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

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getCurType() {
        return curType;
    }

    public void setCurType(String curType) {
        this.curType = curType;
    }

    public String getAmtTran() {
        return amtTran;
    }

    public void setAmtTran(String amtTran) {
        this.amtTran = amtTran;
    }

    public String getPromotionFee() {
        return promotionFee;
    }

    public void setPromotionFee(String promotionFee) {
        this.promotionFee = promotionFee;
    }

    public String getProductCodeCashAcct() {
        return productCodeCashAcct;
    }

    public void setProductCodeCashAcct(String productCodeCashAcct) {
        this.productCodeCashAcct = productCodeCashAcct;
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
}
