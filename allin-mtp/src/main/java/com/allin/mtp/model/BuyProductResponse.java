package com.allin.mtp.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author xishengchun on 2017-12-11.
 */
public class BuyProductResponse extends BuyProductRequest {

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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     * 交易成功
     * @return
     */
    public boolean ok() {
        return "0000".equals(respCode);
    }

    /**
     * 受理中
     * @return
     */
    public boolean doing() {
        return "1111".equals(respCode);
    }
}
