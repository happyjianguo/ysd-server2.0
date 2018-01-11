package com.ysd.account.entity;

import com.ysd.base.entity.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 表名:fy_user_account_detail
 * 
 */
public class UserAccountDetail extends BaseEntity {
    /**
     *  编号
     */
    private Integer id;

    /**
     * 创建日期
     */
    private Date createDate;

    /**
     * 修改日期
     */
    private Date modifyDate;

    /**
     * 明细类型
     */
    private String type;

    /**
     * 总金额
     */
    private BigDecimal total;

    /**
     * 操作金额
     */
    private BigDecimal money;

    /**
     * 可用金额
     */
    private BigDecimal useMoney;

    /**
     * 冻结金额
     */
    private BigDecimal noUseMoney;

    /**
     * 当前待收金额
     */
    private BigDecimal collection;

    /**
     * 操作人
     */
    private String operatorer;

    /**
     * 获得金额的用户
     */
    private Integer toUser;

    /**
     * 明细描述
     */
    private String remark;

    /**
     * 添加时间
     */
    private Date addTime;

    /**
     * 操作IP
     */
    private String operatorIp;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 投资者待收本金
     */
    private BigDecimal investorCollectionCapital;

    /**
     * 投资者待收利息
     */
    private BigDecimal investorCollectionInterest;

    /**
     * 借款人待付本金
     */
    private BigDecimal borrowerCollectionCapital;

    /**
     * 借款人待付利息
     */
    private BigDecimal borrowerCollectionInterest;

    /**
     * 续投金额
     */
    private BigDecimal continueTotal;

    /**
     * 奖励账户
     */
    private BigDecimal awardMoney;

    /**
     * 标id
     */
    private Integer borrowId;

    /**
     * 体验金
     */
    private BigDecimal tasteMoney;

    /**
     * 是否查看
     */
    private Integer isLook;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getUseMoney() {
        return useMoney;
    }

    public void setUseMoney(BigDecimal useMoney) {
        this.useMoney = useMoney;
    }

    public BigDecimal getNoUseMoney() {
        return noUseMoney;
    }

    public void setNoUseMoney(BigDecimal noUseMoney) {
        this.noUseMoney = noUseMoney;
    }

    public BigDecimal getCollection() {
        return collection;
    }

    public void setCollection(BigDecimal collection) {
        this.collection = collection;
    }

    public String getOperatorer() {
        return operatorer;
    }

    public void setOperatorer(String operatorer) {
        this.operatorer = operatorer;
    }

    public Integer getToUser() {
        return toUser;
    }

    public void setToUser(Integer toUser) {
        this.toUser = toUser;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getOperatorIp() {
        return operatorIp;
    }

    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getInvestorCollectionCapital() {
        return investorCollectionCapital;
    }

    public void setInvestorCollectionCapital(BigDecimal investorCollectionCapital) {
        this.investorCollectionCapital = investorCollectionCapital;
    }

    public BigDecimal getInvestorCollectionInterest() {
        return investorCollectionInterest;
    }

    public void setInvestorCollectionInterest(BigDecimal investorCollectionInterest) {
        this.investorCollectionInterest = investorCollectionInterest;
    }

    public BigDecimal getBorrowerCollectionCapital() {
        return borrowerCollectionCapital;
    }

    public void setBorrowerCollectionCapital(BigDecimal borrowerCollectionCapital) {
        this.borrowerCollectionCapital = borrowerCollectionCapital;
    }

    public BigDecimal getBorrowerCollectionInterest() {
        return borrowerCollectionInterest;
    }

    public void setBorrowerCollectionInterest(BigDecimal borrowerCollectionInterest) {
        this.borrowerCollectionInterest = borrowerCollectionInterest;
    }

    public BigDecimal getContinueTotal() {
        return continueTotal;
    }

    public void setContinueTotal(BigDecimal continueTotal) {
        this.continueTotal = continueTotal;
    }

    public BigDecimal getAwardMoney() {
        return awardMoney;
    }

    public void setAwardMoney(BigDecimal awardMoney) {
        this.awardMoney = awardMoney;
    }

    public Integer getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(Integer borrowId) {
        this.borrowId = borrowId;
    }

    public BigDecimal getTasteMoney() {
        return tasteMoney;
    }

    public void setTasteMoney(BigDecimal tasteMoney) {
        this.tasteMoney = tasteMoney;
    }

    public Integer getIsLook() {
        return isLook;
    }

    public void setIsLook(Integer isLook) {
        this.isLook = isLook;
    }
}