package com.ysd.asset.entity;

import com.ysd.base.entity.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 表名:fy_fangkuan
 * 放款情况
 */
public class Fangkuan extends BaseEntity {
    private Integer id;

    private Date createDate;

    private Date modifyDate;

    /**
     * 1:对项目放款；2:对保证金放款；3：对服务费放款
     */
    private Integer type;

    /**
     * 服务商ID
     */
    private Integer agencyId;

    /**
     * 借款人ID
     */
    private Integer userId;

    /**
     * 项目ID
     */
    private Integer borrowId;

    /**
     * 放款金额
     */
    private BigDecimal fangkuanMoney;

    /**
     * 放款账号
     */
    private String bankCard;

    /**
     * 开户银行
     */
    private String bankBranch;

    /**
     * 0:放款失败；1：放款成功；2：审核中
     */
    private Integer status;

    /**
     * 申请人ip
     */
    private String ip;

    /**
     * 放款审核时间
     */
    private Date verifyTime;

    /**
     * 放款审核人
     */
    private String verifyAdmin;

    /**
     * 审核人联系方法
     */
    private String verifyPhone;

    /**
     * 审核备注
     */
    private String verifyRemark;

    /**
     * 审核ip
     */
    private String verifyIp;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public Integer getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(Integer borrowId) {
        this.borrowId = borrowId;
    }

    public BigDecimal getFangkuanMoney() {
        return fangkuanMoney;
    }

    public void setFangkuanMoney(BigDecimal fangkuanMoney) {
        this.fangkuanMoney = fangkuanMoney;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    public String getVerifyAdmin() {
        return verifyAdmin;
    }

    public void setVerifyAdmin(String verifyAdmin) {
        this.verifyAdmin = verifyAdmin;
    }

    public String getVerifyPhone() {
        return verifyPhone;
    }

    public void setVerifyPhone(String verifyPhone) {
        this.verifyPhone = verifyPhone;
    }

    public String getVerifyRemark() {
        return verifyRemark;
    }

    public void setVerifyRemark(String verifyRemark) {
        this.verifyRemark = verifyRemark;
    }

    public String getVerifyIp() {
        return verifyIp;
    }

    public void setVerifyIp(String verifyIp) {
        this.verifyIp = verifyIp;
    }
}