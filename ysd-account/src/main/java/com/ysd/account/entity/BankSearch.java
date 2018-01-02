package com.ysd.account.entity;

import com.ysd.base.entity.BaseEntity;
import java.util.Date;

/**
 * 表名:fy_bank_search
 * 
 */
public class BankSearch extends BaseEntity {
    private Long id;

    /**
     * 1充值 2提现
     */
    private String searchType;

    /**
     * 充值表or提现表id
     */
    private Long orderId;

    /**
     * 提交到银行的orderid
     */
    private String bankOrderId;

    /**
     * 重试次数，重试3次不再重试
     */
    private Byte retryNum;

    /**
     * 0初始状态，1成功 ， 2失败
     */
    private String status;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 更新时间
     */
    private Date modifyDate;

    /**
     * 通联的购买申请标记(相当于是充值);0:否;1:是
     */
    private String mtpBuyProduct;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getBankOrderId() {
        return bankOrderId;
    }

    public void setBankOrderId(String bankOrderId) {
        this.bankOrderId = bankOrderId;
    }

    public Byte getRetryNum() {
        return retryNum;
    }

    public void setRetryNum(Byte retryNum) {
        this.retryNum = retryNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
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

    public String getMtpBuyProduct() {
        return mtpBuyProduct;
    }

    public void setMtpBuyProduct(String mtpBuyProduct) {
        this.mtpBuyProduct = mtpBuyProduct;
    }
}