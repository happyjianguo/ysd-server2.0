package com.allin.mtp.model;

import com.allin.mtp.util.AllinMTPConfig;
import com.mind.platform.system.base.CMData;
import com.mind.platform.system.base.DataRow;

/**
 * @author xishengchun on 2017-12-11.
 *         充值
 */
public class BuyProductRequest {

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
     * 购买类型	O	R	0.购买；1.认购；2.申购；
     */
    private String purchaseType = "0";

    /**
     * 支付模式	O	R	0.银行卡支付；2.余额账户支付；3.份额支付；4.机构自付；5.联合账户支付
     */
    private String payMode = "0";

    /**
     * 银行编码
     */
    private String bnkId;//		M	R

    /**
     * 账户类型	M	　	1.借记卡；2.贷记卡；3.准贷记卡；4.预付费卡；5.手机号；6:对公账户
     */
    private String acctType = "1";

    /**
     * 账号
     */
    private String acctNum;

    /**
     * 电话号码	M	R	个人账户必填，公司账户非必填
     */
    private String telNum;//

    /**
     * 交易币种	M	R	156（人民币）
     */
    private String curType;

    /**
     * 交易金额
     * 单位分
     */
    private String amtTran;

    /**
     * 营销金额
     * 单位分
     */
    private String promotionFee;

    /**
     * 产品引入方	M	R	0.机构引入；1.通联引入；
     */
    private String prodImportFlag = "0";

    /**
     * 供应商编码	C	R	通联引入产品为必填
     */
    private String supplyInstCode;

    /**
     * 产品编码
     * 由机构提供，在产品上线前提供给通联，同一机构不可重复
     */
    private String productNum = AllinMTPConfig.getProductNum();

    /**
     * 交易份额	O	R	通联引入产品为必填
     */
    private String transUnits;

    /**
     * 现金账户代码	C	R	预留，账户为现金账户必填
     */
    private String productCodeCashAcct;

    /**
     * 指定认购日期
     */
    private String specSubscDate;

    /**
     * 交易订单号
     */
    private String orderNum;

    /**
     * 合作商户号	O	R	支付模式为联合账户支付必填
     */
    private String coIcode;

    /**
     * 后台应答地址	M	　	　
     */
    private String respUrl;

    /**
     * ip地址	O	　	客户IP地址
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

    public String getSignNum() {
        return signNum;
    }

    public void setSignNum(String signNum) {
        this.signNum = signNum;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
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

    public String getProdImportFlag() {
        return prodImportFlag;
    }

    public void setProdImportFlag(String prodImportFlag) {
        this.prodImportFlag = prodImportFlag;
    }

    public String getSupplyInstCode() {
        return supplyInstCode;
    }

    public void setSupplyInstCode(String supplyInstCode) {
        this.supplyInstCode = supplyInstCode;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getTransUnits() {
        return transUnits;
    }

    public void setTransUnits(String transUnits) {
        this.transUnits = transUnits;
    }

    public String getProductCodeCashAcct() {
        return productCodeCashAcct;
    }

    public void setProductCodeCashAcct(String productCodeCashAcct) {
        this.productCodeCashAcct = productCodeCashAcct;
    }

    public String getSpecSubscDate() {
        return specSubscDate;
    }

    public void setSpecSubscDate(String specSubscDate) {
        this.specSubscDate = specSubscDate;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getCoIcode() {
        return coIcode;
    }

    public void setCoIcode(String coIcode) {
        this.coIcode = coIcode;
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
        requestListRow.put("sub_merchant_id", this.subMerchantId);
        requestListRow.put("sign_num", this.signNum);
        requestListRow.put("purchase_type", this.purchaseType);
        requestListRow.put("pay_mode", this.payMode);
        requestListRow.put("bnk_id", this.bnkId);
        requestListRow.put("acct_type", this.acctType);
        requestListRow.put("acct_num", this.acctNum);
        requestListRow.put("tel_num", this.telNum);
        requestListRow.put("cur_type", this.curType);
        requestListRow.put("amt_tran", this.amtTran);
        requestListRow.put("promotion_fee", this.promotionFee);
        requestListRow.put("prod_import_flag", this.prodImportFlag);
        requestListRow.put("supply_inst_code", this.supplyInstCode);
        requestListRow.put("product_num", this.productNum);
        requestListRow.put("trans_units", this.transUnits);
        requestListRow.put("product_code_cash_acct", this.productCodeCashAcct);
        requestListRow.put("spec_subsc_date", this.specSubscDate);
        requestListRow.put("order_num", this.orderNum);
        requestListRow.put("co_icode", this.coIcode);
        requestListRow.put("resp_url", this.respUrl);
        requestListRow.put("ip_addr", this.ipAddr);
        requestListRow.put("addtnl_data1", this.addtnlData1);
        return requestListRow;
    }
}
