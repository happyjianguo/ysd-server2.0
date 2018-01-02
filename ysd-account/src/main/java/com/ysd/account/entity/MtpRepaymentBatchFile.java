package com.ysd.account.entity;

import com.ysd.base.entity.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 表名:mtp_repayment_batch_file
 * 
 */
public class MtpRepaymentBatchFile extends BaseEntity {
    private Integer id;

    /**
     * 文件生成时间
     */
    private Date createTime;

    /**
     * 批量还款文件提交到接口的时间
     */
    private String submitTime;

    /**
     * 批量回盘处理完成的时间
     */
    private Date backTime;

    /**
     * 批量还款文件的处理状态;-1:废弃;0:新创建,未提交;1：已经提交;2:回盘成功3:回盘失败;
     */
    private Integer status;

    /**
     * 上传明细的总份额。目前同total_count
     */
    private BigDecimal totalUnits;

    /**
     * 上传明细的总金额; 单位分
     */
    private BigDecimal totalAmount;

    /**
     * 上传明细的总笔数
     */
    private BigDecimal totalCount;

    /**
     * 上传明细的贴息总金额
     */
    private BigDecimal totalDiscount;

    /**
     * 文件上传的批次号，格式：O_D_20141001_00_70000001_ST，O_D_交易日期_批次_机构编号_ST，批次从00开始; 该字段相当于是文件名称
     */
    private String batchNo;

    /**
     * 产品号。固定值:WZ5555
     */
    private String productNum;

    /**
     * 交易日期，格式:YYYYMMDD
     */
    private String transDate;

    /**
     * 回盘批次号。相当于回盘的文件号
     */
    private String backBatchNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public Date getBackTime() {
        return backTime;
    }

    public void setBackTime(Date backTime) {
        this.backTime = backTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getTotalUnits() {
        return totalUnits;
    }

    public void setTotalUnits(BigDecimal totalUnits) {
        this.totalUnits = totalUnits;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
    }

    public BigDecimal getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(BigDecimal totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

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

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getBackBatchNo() {
        return backBatchNo;
    }

    public void setBackBatchNo(String backBatchNo) {
        this.backBatchNo = backBatchNo;
    }
}