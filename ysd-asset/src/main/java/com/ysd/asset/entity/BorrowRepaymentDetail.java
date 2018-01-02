package com.ysd.asset.entity;

import com.ysd.base.entity.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 表名:fy_borrow_repayment_detail
 * 还款详情
 */
public class BorrowRepaymentDetail extends BaseEntity {
    /**
     * id号
     */
    private Integer id;

    /**
     * 还款状态
     */
    private Integer status;

    /**
     * 网站是否替借款人还款
     */
    private Integer webstatus;

    /**
     * 借款标分期顺序
     */
    private Integer orderNum;

    /**
     * 标ID
     */
    private Integer borrowId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 预计本期还款时间
     */
    private Date repaymentTime;

    /**
     * 本期时间还款时间
     */
    private Date repaymentYestime;

    /**
     * 本期应还金额
     */
    private String repaymentAccount;

    /**
     * 本期应还金额
     */
    private String repaymentYesaccount;

    /**
     * 逾期天数
     */
    private Integer lateDays;

    /**
     * 逾期罚款金额
     */
    private String lateInterest;

    /**
     * 本期所还利息
     */
    private String interest;

    /**
     * 本期所还本金
     */
    private String capital;

    /**
     * 本期所还本金中的体验金
     */
    private String capitalTaste;

    /**
     * 本期所还本金中的直投
     */
    private String capitalDirect;

    /**
     * 滞纳金
     */
    private String forfeit;

    /**
     * 提醒费
     */
    private String reminderFee;

    /**
     * 添加时间
     */
    private Date addTime;

    /**
     * 操作IP
     */
    private String operatorId;

    /**
     * 创建日期
     */
    private Date createDate;

    /**
     * 修改日期
     */
    private Date modifyDate;

    /**
     * 还款日期(int)
     */
    private Integer repaymentDateInt;

    /**
     * 红包奖励总额
     */
    private String reward;

    /**
     * 充值状态0未1完2待审3拒绝4撤回
     */
    private Integer rechargeStatus;

    /**
     * 还款充值
     */
    private BigDecimal rechargeMoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getWebstatus() {
        return webstatus;
    }

    public void setWebstatus(Integer webstatus) {
        this.webstatus = webstatus;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(Integer borrowId) {
        this.borrowId = borrowId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getRepaymentTime() {
        return repaymentTime;
    }

    public void setRepaymentTime(Date repaymentTime) {
        this.repaymentTime = repaymentTime;
    }

    public Date getRepaymentYestime() {
        return repaymentYestime;
    }

    public void setRepaymentYestime(Date repaymentYestime) {
        this.repaymentYestime = repaymentYestime;
    }

    public String getRepaymentAccount() {
        return repaymentAccount;
    }

    public void setRepaymentAccount(String repaymentAccount) {
        this.repaymentAccount = repaymentAccount;
    }

    public String getRepaymentYesaccount() {
        return repaymentYesaccount;
    }

    public void setRepaymentYesaccount(String repaymentYesaccount) {
        this.repaymentYesaccount = repaymentYesaccount;
    }

    public Integer getLateDays() {
        return lateDays;
    }

    public void setLateDays(Integer lateDays) {
        this.lateDays = lateDays;
    }

    public String getLateInterest() {
        return lateInterest;
    }

    public void setLateInterest(String lateInterest) {
        this.lateInterest = lateInterest;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCapitalTaste() {
        return capitalTaste;
    }

    public void setCapitalTaste(String capitalTaste) {
        this.capitalTaste = capitalTaste;
    }

    public String getCapitalDirect() {
        return capitalDirect;
    }

    public void setCapitalDirect(String capitalDirect) {
        this.capitalDirect = capitalDirect;
    }

    public String getForfeit() {
        return forfeit;
    }

    public void setForfeit(String forfeit) {
        this.forfeit = forfeit;
    }

    public String getReminderFee() {
        return reminderFee;
    }

    public void setReminderFee(String reminderFee) {
        this.reminderFee = reminderFee;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
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

    public Integer getRepaymentDateInt() {
        return repaymentDateInt;
    }

    public void setRepaymentDateInt(Integer repaymentDateInt) {
        this.repaymentDateInt = repaymentDateInt;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public Integer getRechargeStatus() {
        return rechargeStatus;
    }

    public void setRechargeStatus(Integer rechargeStatus) {
        this.rechargeStatus = rechargeStatus;
    }

    public BigDecimal getRechargeMoney() {
        return rechargeMoney;
    }

    public void setRechargeMoney(BigDecimal rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }
}