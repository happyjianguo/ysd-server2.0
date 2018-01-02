package com.allin.mtp.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author xishengchun on 2017-12-11.
 */
public class JrQianyueResponse extends JrQianyueRequest {

    /**
     * 交易日期
     */
    private String transDate;

    /**
     * 交易时间
     */
    private String transTime;

    /**
     * 受理方交易流水号
     */
    private String respTraceNum;

    /**
     * 交易返回码
     */
    private String respCode;

    /**
     * 交易返回码信息
     */
    private String respMsg;

    /**
     * 清算日期
     */
    private String dateSettlmt;

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime;
    }

    public String getRespTraceNum() {
        return respTraceNum;
    }

    public void setRespTraceNum(String respTraceNum) {
        this.respTraceNum = respTraceNum;
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

    public String getDateSettlmt() {
        return dateSettlmt;
    }

    public void setDateSettlmt(String dateSettlmt) {
        this.dateSettlmt = dateSettlmt;
    }

    public boolean ok() {
        return "1112".equals(this.respCode);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
