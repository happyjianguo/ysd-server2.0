package com.allin.mtp.model;

import com.allin.mtp.util.AllinMTPConfig;
import com.allin.mtp.util.AllinMTPUtil;
import com.mind.platform.system.base.CMData;
import com.mind.platform.system.base.DataRow;

/**
 * @author xishengchun on 2017-12-11.
 */
public class RequestHeader {

    /**
     * 交易类型
     */
    private String processingCode;

    /**
     * 机构代码
     */
    private String instId = AllinMTPConfig.getInstId();

    /**
     * 交易日期
     * YYYYMMDD
     */
    private String transDate = AllinMTPUtil.getDateString();

    /**
     * 交易时间
     * HHMMSS
     */
    private String transTime = AllinMTPUtil.getTimeString();

    /**
     * 版本号
     * 固定值
     * 固定填写1.00（1代表大版本，00代表小版本）
     */
    private String verNum = "1.00";

    /**
     * 签名信息
     */
    private String signCode;

    public String getProcessingCode() {
        return processingCode;
    }

    public void setProcessingCode(String processingCode) {
        this.processingCode = processingCode;
    }

    public String getInstId() {
        return instId;
    }

    public void setInstId(String instId) {
        this.instId = instId;
    }

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

    public String getVerNum() {
        return verNum;
    }

    public void setVerNum(String verNum) {
        this.verNum = verNum;
    }

    public String getSignCode() {
        return signCode;
    }

    public void setSignCode(String signCode) {
        this.signCode = signCode;
    }

    public DataRow convert() {
        DataRow headListRow = new CMData();
        headListRow.put("processing_code", processingCode);
        headListRow.put("inst_id", instId);
        headListRow.put("trans_date", this.transDate);
        headListRow.put("trans_time", this.transTime);
        headListRow.put("ver_num", this.verNum);
        return headListRow;
    }
}
