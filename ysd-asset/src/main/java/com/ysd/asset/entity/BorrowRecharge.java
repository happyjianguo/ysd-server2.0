package com.ysd.asset.entity;

import com.ysd.base.entity.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 表名:fy_borrow_recharge
 * 还款充值
 */
public class BorrowRecharge extends BaseEntity {
    /**
     * id
     */
    private Integer id;

    /**
     * 类型1还款充值2退保证金
     */
    private Integer type;

    /**
     * 会员id
     */
    private Integer userId;

    /**
     * 服务商id
     */
    private Integer agencyId;

    /**
     * 项目id
     */
    private Integer borrowId;

    /**
     * 项目还款id
     */
    private Integer borrowRepaymentId;

    /**
     * 还款充值后续1最后0非最后
     */
    private Integer endFlg;

    /**
     * 金额
     */
    private BigDecimal money;

    /**
     * 充值账户名
     */
    private String rechargeName;

    /**
     * 充值时间
     */
    private Date rechargeDate;

    /**
     * 充值类型
     */
    private Integer rechargeType;

    /**
     * 充值卡号
     */
    private String rechargeAccount;

    /**
     * 充值银行
     */
    private String rechargeBank;

    /**
     * 充值凭证
     */
    private String rechargeFile;

    /**
     * 审核人
     */
    private String verifyAdmin;

    /**
     * 审核人手机
     */
    private String verifyPhone;

    /**
     * 审核时间
     */
    private Date verifyTime;

    /**
     * 状态0未1完2待审3拒绝4撤回
     */
    private Integer status;

    /**
     * 创建日期
     */
    private Date createDate;

    /**
     * 修改日期
     */
    private Date modifyDate;

    /**
     * 审核备注
     */
    private String verifyRemark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }

    public Integer getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(Integer borrowId) {
        this.borrowId = borrowId;
    }

    public Integer getBorrowRepaymentId() {
        return borrowRepaymentId;
    }

    public void setBorrowRepaymentId(Integer borrowRepaymentId) {
        this.borrowRepaymentId = borrowRepaymentId;
    }

    public Integer getEndFlg() {
        return endFlg;
    }

    public void setEndFlg(Integer endFlg) {
        this.endFlg = endFlg;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getRechargeName() {
        return rechargeName;
    }

    public void setRechargeName(String rechargeName) {
        this.rechargeName = rechargeName;
    }

    public Date getRechargeDate() {
        return rechargeDate;
    }

    public void setRechargeDate(Date rechargeDate) {
        this.rechargeDate = rechargeDate;
    }

    public Integer getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(Integer rechargeType) {
        this.rechargeType = rechargeType;
    }

    public String getRechargeAccount() {
        return rechargeAccount;
    }

    public void setRechargeAccount(String rechargeAccount) {
        this.rechargeAccount = rechargeAccount;
    }

    public String getRechargeBank() {
        return rechargeBank;
    }

    public void setRechargeBank(String rechargeBank) {
        this.rechargeBank = rechargeBank;
    }

    public String getRechargeFile() {
        return rechargeFile;
    }

    public void setRechargeFile(String rechargeFile) {
        this.rechargeFile = rechargeFile;
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

    public Date getVerifyTime() {
        return verifyTime;
    }

    public void setVerifyTime(Date verifyTime) {
        this.verifyTime = verifyTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getVerifyRemark() {
        return verifyRemark;
    }

    public void setVerifyRemark(String verifyRemark) {
        this.verifyRemark = verifyRemark;
    }
}