package com.ysd.account.entity;

import com.ysd.base.entity.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 表名:fy_account_cash
 * 
 */
public class AccountCash extends BaseEntity {
    /**
     * 现提ID
     */
    private Integer id;

    /**
     * 请申提现人ID
     */
    private Integer userId;

    /**
     * 态状
     */
    private Integer status;

    /**
     * 银行账号
     */
    private String account;

    /**
     * 应对银行代码（300表工商银行）
     */
    private String bank;

    /**
     * 行支名称
     */
    private String branch;

    /**
     * 现提金额（实际到账+收付费）
     */
    private BigDecimal total;

    /**
     * 际实到账金额
     */
    private BigDecimal credited;

    /**
     * 续费手
     */
    private BigDecimal fee;

    /**
     * 核审人ID
     */
    private Integer verifyUserid;

    /**
     * 核审时间
     */
    private Date verifyTime;

    /**
     * 注备
     */
    private String verifyRemark;

    /**
     * 请申时间
     */
    private Date addtime;

    /**
     * 请申IP
     */
    private String addip;

    /**
     * 建创时间
     */
    private Date createDate;

    /**
     * 改修时间
     */
    private Date modifyDate;

    /**
     * 调整值
     */
    private BigDecimal changeNum;

    /**
     * 整调原因
     */
    private String changeRemark;

    /**
     * 可提现金额（在申请提现是实时计算出的）
     */
    private BigDecimal ableCashMoney;

    /**
     * 费免提现金额（在申请提现是实时计算出的）
     */
    private BigDecimal freeCashMoney;

    /**
     * 提现的订单号
     */
    private String tradeNo;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getCredited() {
        return credited;
    }

    public void setCredited(BigDecimal credited) {
        this.credited = credited;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public Integer getVerifyUserid() {
        return verifyUserid;
    }

    public void setVerifyUserid(Integer verifyUserid) {
        this.verifyUserid = verifyUserid;
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    public String getVerifyRemark() {
        return verifyRemark;
    }

    public void setVerifyRemark(String verifyRemark) {
        this.verifyRemark = verifyRemark;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getAddip() {
        return addip;
    }

    public void setAddip(String addip) {
        this.addip = addip;
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

    public BigDecimal getChangeNum() {
        return changeNum;
    }

    public void setChangeNum(BigDecimal changeNum) {
        this.changeNum = changeNum;
    }

    public String getChangeRemark() {
        return changeRemark;
    }

    public void setChangeRemark(String changeRemark) {
        this.changeRemark = changeRemark;
    }

    public BigDecimal getAbleCashMoney() {
        return ableCashMoney;
    }

    public void setAbleCashMoney(BigDecimal ableCashMoney) {
        this.ableCashMoney = ableCashMoney;
    }

    public BigDecimal getFreeCashMoney() {
        return freeCashMoney;
    }

    public void setFreeCashMoney(BigDecimal freeCashMoney) {
        this.freeCashMoney = freeCashMoney;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }
}