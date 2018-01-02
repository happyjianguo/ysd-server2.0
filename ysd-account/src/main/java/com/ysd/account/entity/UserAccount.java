package com.ysd.account.entity;

import com.ysd.base.entity.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 表名:fy_user_account
 * 
 */
public class UserAccount extends BaseEntity {
    /**
     *  编号
     */
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 用户总金额（可用金额+冻结金额+待收金额）
     */
    private BigDecimal total;

    /**
     * 可用金额，可提现金额
     */
    private BigDecimal ableMoney;

    /**
     * 冻结金额
     */
    private BigDecimal unableMoney;

    /**
     * 待收金额
     */
    private BigDecimal collection;

    /**
     * 创建日期
     */
    private Date createDate;

    /**
     * 修改日期
     */
    private Date modifyDate;

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
     * 用户续投总额
     */
    private BigDecimal continueTotal;

    /**
     * 用户积分
     */
    private Integer userPoints;

    /**
     * 红包金额
     */
    private BigDecimal awardMoney;

    /**
     * 体验金
     */
    private BigDecimal tasteMoney;

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

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getAbleMoney() {
        return ableMoney;
    }

    public void setAbleMoney(BigDecimal ableMoney) {
        this.ableMoney = ableMoney;
    }

    public BigDecimal getUnableMoney() {
        return unableMoney;
    }

    public void setUnableMoney(BigDecimal unableMoney) {
        this.unableMoney = unableMoney;
    }

    public BigDecimal getCollection() {
        return collection;
    }

    public void setCollection(BigDecimal collection) {
        this.collection = collection;
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

    public Integer getUserPoints() {
        return userPoints;
    }

    public void setUserPoints(Integer userPoints) {
        this.userPoints = userPoints;
    }

    public BigDecimal getAwardMoney() {
        return awardMoney;
    }

    public void setAwardMoney(BigDecimal awardMoney) {
        this.awardMoney = awardMoney;
    }

    public BigDecimal getTasteMoney() {
        return tasteMoney;
    }

    public void setTasteMoney(BigDecimal tasteMoney) {
        this.tasteMoney = tasteMoney;
    }
}