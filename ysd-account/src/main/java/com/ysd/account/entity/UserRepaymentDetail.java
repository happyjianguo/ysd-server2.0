package com.ysd.account.entity;

import com.ysd.base.entity.BaseEntity;
import java.util.Date;

/**
 * 表名:fy_user_repayment_detail
 * 
 */
public class UserRepaymentDetail extends BaseEntity {
    /**
     * ID
     */
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 还款状态
     */
    private String status;

    /**
     * 标ID
     */
    private Integer borrowId;

    /**
     * 实际成功金额
     */
    private String account;

    /**
     * 应还款金额（借款金额+利息）
     */
    private String repaymentAccount;

    /**
     * 借款利息
     */
    private String interest;

    /**
     * 已还款金额
     */
    private String repaymentYesaccount;

    /**
     * 本期待还款本金
     */
    private String waitAccount;

    /**
     * 已还利息
     */
    private String repaymentYesinterest;

    /**
     * 本期待还利息
     */
    private String waitInterest;

    /**
     * 管理费
     */
    private String serviceCharge;

    /**
     * 净收益
     */
    private String profit;

    /**
     * 添加人（作操用户ID）
     */
    private String addPersion;

    /**
     * 操作IP
     */
    private String operatorIp;

    /**
     * 建创时间
     */
    private Date createDate;

    /**
     * 改修时间
     */
    private Date modifyDate;

    /**
     * 标还款分期ID
     */
    private Integer borrowRepaymentDetailId;

    /**
     * 标还款顺序
     */
    private Integer borrowPeriods;

    /**
     * 应还款时间
     */
    private Date repaymentDate;

    /**
     * 投资ID
     */
    private Integer borrowDetailId;

    /**
     * 是否申请续投，如不为0或空，为已申请
     */
    private String applyContinueTotal;

    /**
     * 标的总期数
     */
    private Integer borrowDivides;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(Integer borrowId) {
        this.borrowId = borrowId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getRepaymentAccount() {
        return repaymentAccount;
    }

    public void setRepaymentAccount(String repaymentAccount) {
        this.repaymentAccount = repaymentAccount;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getRepaymentYesaccount() {
        return repaymentYesaccount;
    }

    public void setRepaymentYesaccount(String repaymentYesaccount) {
        this.repaymentYesaccount = repaymentYesaccount;
    }

    public String getWaitAccount() {
        return waitAccount;
    }

    public void setWaitAccount(String waitAccount) {
        this.waitAccount = waitAccount;
    }

    public String getRepaymentYesinterest() {
        return repaymentYesinterest;
    }

    public void setRepaymentYesinterest(String repaymentYesinterest) {
        this.repaymentYesinterest = repaymentYesinterest;
    }

    public String getWaitInterest() {
        return waitInterest;
    }

    public void setWaitInterest(String waitInterest) {
        this.waitInterest = waitInterest;
    }

    public String getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(String serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    public String getAddPersion() {
        return addPersion;
    }

    public void setAddPersion(String addPersion) {
        this.addPersion = addPersion;
    }

    public String getOperatorIp() {
        return operatorIp;
    }

    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp;
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

    public Integer getBorrowRepaymentDetailId() {
        return borrowRepaymentDetailId;
    }

    public void setBorrowRepaymentDetailId(Integer borrowRepaymentDetailId) {
        this.borrowRepaymentDetailId = borrowRepaymentDetailId;
    }

    public Integer getBorrowPeriods() {
        return borrowPeriods;
    }

    public void setBorrowPeriods(Integer borrowPeriods) {
        this.borrowPeriods = borrowPeriods;
    }

    public Date getRepaymentDate() {
        return repaymentDate;
    }

    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    public Integer getBorrowDetailId() {
        return borrowDetailId;
    }

    public void setBorrowDetailId(Integer borrowDetailId) {
        this.borrowDetailId = borrowDetailId;
    }

    public String getApplyContinueTotal() {
        return applyContinueTotal;
    }

    public void setApplyContinueTotal(String applyContinueTotal) {
        this.applyContinueTotal = applyContinueTotal;
    }

    public Integer getBorrowDivides() {
        return borrowDivides;
    }

    public void setBorrowDivides(Integer borrowDivides) {
        this.borrowDivides = borrowDivides;
    }
}