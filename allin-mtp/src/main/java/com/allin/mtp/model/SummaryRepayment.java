package com.allin.mtp.model;

/**
 * @author xishengchun on 2017-12-13.
 */
public class SummaryRepayment {

    /**
     * 批次号	M	文件上传的批次号，格式：O_D_20141001_00_70000001_ST，O_D_交易日期_批次_机构编号_ST，批次从00开始
     */
    private String batchNo;

    /**
     * 产品代码
     */
    private String productNum;

    /**
     * 上传明细的总笔数
     */
    private String totalCount;

    /**
     * 上传明细的总金额
     */
    private String totalAmount;

    /**
     * 交易份额;上传明细的总份额
     */
    private String totalUnits;

    /**
     * 营销金额;上传明细的贴息总金额
     */
    private String totalDiscount;

    /**
     * 上传日期
     */
    private String transDate;


    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTotalUnits() {
        return totalUnits;
    }

    public void setTotalUnits(String totalUnits) {
        this.totalUnits = totalUnits;
    }

    public String getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(String totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }
}
