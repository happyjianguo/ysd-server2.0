package com.ysd.asset.entity;

import com.ysd.base.entity.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 表名:fy_borrow_detail
 * 
 */
public class BorrowDetail extends BaseEntity {
    /**
     * ID
     */
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 投标状态
     * 【1：全部通过;2：部分通过】
     */
    private String status;

    /**
     * 标ID
     */
    private Integer borrowId;

    /**
     * 预计投标金额
     */
    private String money;

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
     * 待还款金额
     */
    private String waitAccount;

    /**
     * 已还利息
     */
    private String repaymentYesinterest;

    /**
     * 待还利息
     */
    private String waitInterest;

    /**
     * 添加人（投标用户ID）
     */
    private String addPersion;

    /**
     * 添加时间
     */
    private Date createTime;

    /**
     * 操作IP
     */
    private String operatorIp;

    private Date createDate;

    private Date modifyDate;

    /**
     * 可用金额
     */
    private String ableAmount;

    /**
     * 续投金额
     */
    private String continueAmount;

    /**
     * 使用红包金额
     */
    private String hongbaoAmount;

    /**
     * 体验资金
     */
    private String tasteAmount;

    private Integer backStatus;

    /**
     * 自投状态1自投0手动
     */
    private Integer autoTenderStatus;

    /**
     * 流转标奖励
     */
    private BigDecimal reward;

    /**
     * 请求的来源（0-PC;1-android;2-ios;5-H5)
     */
    private Integer clientType;

    /**
     * 流转标红包奖励
     */
    private BigDecimal hreward;

    /**
     * 渤海银行返回的冻结id.投资人投标成功后返回的。放款业务会使用
     */
    private String bankFreezeId;

    /**
     * 账户存管平台流水号
     */
    private String bankTransId;

    /**
     * 平台收取商户手续费，具体金额以签约协议为准.单位是分
     */
    private BigDecimal bankFeeAmt;

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

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
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

    public String getAddPersion() {
        return addPersion;
    }

    public void setAddPersion(String addPersion) {
        this.addPersion = addPersion;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getAbleAmount() {
        return ableAmount;
    }

    public void setAbleAmount(String ableAmount) {
        this.ableAmount = ableAmount;
    }

    public String getContinueAmount() {
        return continueAmount;
    }

    public void setContinueAmount(String continueAmount) {
        this.continueAmount = continueAmount;
    }

    public String getHongbaoAmount() {
        return hongbaoAmount;
    }

    public void setHongbaoAmount(String hongbaoAmount) {
        this.hongbaoAmount = hongbaoAmount;
    }

    public String getTasteAmount() {
        return tasteAmount;
    }

    public void setTasteAmount(String tasteAmount) {
        this.tasteAmount = tasteAmount;
    }

    public Integer getBackStatus() {
        return backStatus;
    }

    public void setBackStatus(Integer backStatus) {
        this.backStatus = backStatus;
    }

    public Integer getAutoTenderStatus() {
        return autoTenderStatus;
    }

    public void setAutoTenderStatus(Integer autoTenderStatus) {
        this.autoTenderStatus = autoTenderStatus;
    }

    public BigDecimal getReward() {
        return reward;
    }

    public void setReward(BigDecimal reward) {
        this.reward = reward;
    }

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    public BigDecimal getHreward() {
        return hreward;
    }

    public void setHreward(BigDecimal hreward) {
        this.hreward = hreward;
    }

    public String getBankFreezeId() {
        return bankFreezeId;
    }

    public void setBankFreezeId(String bankFreezeId) {
        this.bankFreezeId = bankFreezeId;
    }

    public String getBankTransId() {
        return bankTransId;
    }

    public void setBankTransId(String bankTransId) {
        this.bankTransId = bankTransId;
    }

    public BigDecimal getBankFeeAmt() {
        return bankFeeAmt;
    }

    public void setBankFeeAmt(BigDecimal bankFeeAmt) {
        this.bankFeeAmt = bankFeeAmt;
    }
}