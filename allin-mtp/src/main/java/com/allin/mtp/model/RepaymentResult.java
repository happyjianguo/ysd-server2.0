package com.allin.mtp.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author xishengchun on 2017-12-14.
 * 还款结果部分字段
 */
public class RepaymentResult {

    /**
     * 申请方交易流水号
     */
    private String tradeNo;

    /**
     * 受理方交易流水号
     */
    private String allinTradeNo;

    /**
     * 通联会员号
     */
    private String signNum;

    /**
     * 交易返回码
     */
    private String respCode;

    /**
     * 交易返回信息
     */
    private String respMsg;

    /**
     * 清算日期
     */
    private String clearingDate;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getAllinTradeNo() {
        return allinTradeNo;
    }

    public void setAllinTradeNo(String allinTradeNo) {
        this.allinTradeNo = allinTradeNo;
    }

    public String getSignNum() {
        return signNum;
    }

    public void setSignNum(String signNum) {
        this.signNum = signNum;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public String getClearingDate() {
        return clearingDate;
    }

    public void setClearingDate(String clearingDate) {
        this.clearingDate = clearingDate;
    }

    public boolean ok() {
        return "0000".equals(respCode);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
