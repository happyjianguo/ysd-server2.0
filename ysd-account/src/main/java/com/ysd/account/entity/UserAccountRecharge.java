package com.ysd.account.entity;

import com.ysd.base.entity.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 表名:fy_user_account_recharge
 * 
 */
public class UserAccountRecharge extends BaseEntity {
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
     * 充值时间
     */
    private Date rechargeDate;

    /**
     * 订单号
     */
    private String tradeNo;

    /**
     * 充值人
     */
    private Integer userId;

    /**
     * 状态【0:失败;1:成功;2:后台审核失败】
     */
    private Integer status;

    /**
     * 类型【0:线下充值 ;1:线上充值】
     */
    private String type;

    /**
     * 根据不同接口返回状态描述【状态码:描述】
     */
    private String portData;

    /**
     * 比较后状态【0:失败;1:成功】
     */
    private Integer compareStatus;

    /**
     * 充值金额
     */
    private BigDecimal money;

    /**
     *  银行名称
     */
    private String bankName;

    /**
     * 充值接口【国付宝，支付宝.为0的表示后台充值】
     */
    private Integer rechargeInterfaceId;

    /**
     * 备注
     */
    private String remark;

    /**
     * 费用
     */
    private BigDecimal fee;

    /**
     * 奖励
     */
    private BigDecimal reward;

    /**
     * 操作人
     */
    private Integer adminOperatorId;

    /**
     * 核审人
     */
    private Integer adminVerifyId;

    /**
     * 核审人备注
     */
    private String verifyRemark;

    /**
     * 用户充值IP地址
     */
    private String ipUser;

    /**
     * 作操人IP
     */
    private String ipOperator;

    /**
     * 核审人IP
     */
    private String ipVerify;

    /**
     * 线下充值账号ID
     */
    private Integer offLineAccountId;

    /**
     * 返回值【充值银行返回值】
     */
    private String returned;

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

    public Date getRechargeDate() {
        return rechargeDate;
    }

    public void setRechargeDate(Date rechargeDate) {
        this.rechargeDate = rechargeDate;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPortData() {
        return portData;
    }

    public void setPortData(String portData) {
        this.portData = portData;
    }

    public Integer getCompareStatus() {
        return compareStatus;
    }

    public void setCompareStatus(Integer compareStatus) {
        this.compareStatus = compareStatus;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Integer getRechargeInterfaceId() {
        return rechargeInterfaceId;
    }

    public void setRechargeInterfaceId(Integer rechargeInterfaceId) {
        this.rechargeInterfaceId = rechargeInterfaceId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getReward() {
        return reward;
    }

    public void setReward(BigDecimal reward) {
        this.reward = reward;
    }

    public Integer getAdminOperatorId() {
        return adminOperatorId;
    }

    public void setAdminOperatorId(Integer adminOperatorId) {
        this.adminOperatorId = adminOperatorId;
    }

    public Integer getAdminVerifyId() {
        return adminVerifyId;
    }

    public void setAdminVerifyId(Integer adminVerifyId) {
        this.adminVerifyId = adminVerifyId;
    }

    public String getVerifyRemark() {
        return verifyRemark;
    }

    public void setVerifyRemark(String verifyRemark) {
        this.verifyRemark = verifyRemark;
    }

    public String getIpUser() {
        return ipUser;
    }

    public void setIpUser(String ipUser) {
        this.ipUser = ipUser;
    }

    public String getIpOperator() {
        return ipOperator;
    }

    public void setIpOperator(String ipOperator) {
        this.ipOperator = ipOperator;
    }

    public String getIpVerify() {
        return ipVerify;
    }

    public void setIpVerify(String ipVerify) {
        this.ipVerify = ipVerify;
    }

    public Integer getOffLineAccountId() {
        return offLineAccountId;
    }

    public void setOffLineAccountId(Integer offLineAccountId) {
        this.offLineAccountId = offLineAccountId;
    }

    public String getReturned() {
        return returned;
    }

    public void setReturned(String returned) {
        this.returned = returned;
    }
}