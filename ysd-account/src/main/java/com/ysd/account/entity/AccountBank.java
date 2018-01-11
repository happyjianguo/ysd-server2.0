package com.ysd.account.entity;

import com.ysd.base.entity.BaseEntity;
import java.util.Date;

/**
 * 表名:fy_account_bank
 * 
 */
public class AccountBank extends BaseEntity {
    /**
     * 编号
     */
    private Integer id;

    private Date createDate;

    private Date modifyDate;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 账号
     */
    private String account;

    /**
     * 所属银行编号
     */
    private String bankId;

    /**
     * 支行名称
     */
    private String branch;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String area;

    /**
     * 添加IP
     */
    private String addIp;

    /**
     * 0:签约中1：签约成功
     */
    private Integer status;

    /**
     * 签约充值订单号
     */
    private String tradeNo;

    /**
     * 对接服务商ID（仅用于对接服务商添加提现银行账户时）
     */
    private Long agencyId;

    /**
     * 绑定成功返回银行卡唯一绑定号
     */
    private String bindId;

    /**
     * 持卡人手机号
     */
    private String phone;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddIp() {
        return addIp;
    }

    public void setAddIp(String addIp) {
        this.addIp = addIp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Long getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
    }

    public String getBindId() {
        return bindId;
    }

    public void setBindId(String bindId) {
        this.bindId = bindId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}