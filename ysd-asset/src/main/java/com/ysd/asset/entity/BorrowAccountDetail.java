package com.ysd.asset.entity;

import com.ysd.base.entity.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 表名:fy_borrow_account_detail
 * 标的还款情况
 * 
 */
public class BorrowAccountDetail extends BaseEntity {
    private Integer id;

    private Date createDate;

    private Date modifyDate;

    /**
     * 项目ID
     */
    private Integer borrowId;

    /**
     * 服务商ID
     */
    private Integer agencyId;

    /**
     * 借款人ID
     */
    private Integer userId;

    /**
     * 操作类型
     */
    private String type;

    /**
     * 操作金额
     */
    private BigDecimal money;

    /**
     * 项目总额
     */
    private BigDecimal borrowTotal;

    /**
     * 已还本金
     */
    private BigDecimal borrowCapitalYes;

    /**
     * 已还利息
     */
    private BigDecimal borrowInterestYes;

    /**
     * 未还本金
     */
    private BigDecimal borrowCapitalNo;

    /**
     * 未还利息
     */
    private BigDecimal borrowInterestNo;

    private String ip;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(Integer borrowId) {
        this.borrowId = borrowId;
    }

    public Integer getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getBorrowTotal() {
        return borrowTotal;
    }

    public void setBorrowTotal(BigDecimal borrowTotal) {
        this.borrowTotal = borrowTotal;
    }

    public BigDecimal getBorrowCapitalYes() {
        return borrowCapitalYes;
    }

    public void setBorrowCapitalYes(BigDecimal borrowCapitalYes) {
        this.borrowCapitalYes = borrowCapitalYes;
    }

    public BigDecimal getBorrowInterestYes() {
        return borrowInterestYes;
    }

    public void setBorrowInterestYes(BigDecimal borrowInterestYes) {
        this.borrowInterestYes = borrowInterestYes;
    }

    public BigDecimal getBorrowCapitalNo() {
        return borrowCapitalNo;
    }

    public void setBorrowCapitalNo(BigDecimal borrowCapitalNo) {
        this.borrowCapitalNo = borrowCapitalNo;
    }

    public BigDecimal getBorrowInterestNo() {
        return borrowInterestNo;
    }

    public void setBorrowInterestNo(BigDecimal borrowInterestNo) {
        this.borrowInterestNo = borrowInterestNo;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}