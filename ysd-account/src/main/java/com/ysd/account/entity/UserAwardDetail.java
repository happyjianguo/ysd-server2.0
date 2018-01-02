package com.ysd.account.entity;

import com.ysd.base.entity.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 表名:fy_user_award_detail
 * 
 */
public class UserAwardDetail extends BaseEntity {
    /**
     * 系统ID
     */
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 类型（同资金记录）
     */
    private String type;

    /**
     * 操作金额
     */
    private BigDecimal money;

    /**
     * 1收入 -1支出
     */
    private Integer signFlg;

    /**
     * 奖励账户
     */
    private BigDecimal awardMoney;

    /**
     * 资金记录ID
     */
    private Integer userAccountDetailId;

    /**
     * 相关id
     */
    private Integer relateTo;

    /**
     * 相关项目
     */
    private String relateKey;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date modifyDate;

    /**
     * 是否查看
     */
    private Integer isLook;

    /**
     * 备注
     */
    private String remark;

    /**
     * 后备字段
     */
    private String reserve1;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getSignFlg() {
        return signFlg;
    }

    public void setSignFlg(Integer signFlg) {
        this.signFlg = signFlg;
    }

    public BigDecimal getAwardMoney() {
        return awardMoney;
    }

    public void setAwardMoney(BigDecimal awardMoney) {
        this.awardMoney = awardMoney;
    }

    public Integer getUserAccountDetailId() {
        return userAccountDetailId;
    }

    public void setUserAccountDetailId(Integer userAccountDetailId) {
        this.userAccountDetailId = userAccountDetailId;
    }

    public Integer getRelateTo() {
        return relateTo;
    }

    public void setRelateTo(Integer relateTo) {
        this.relateTo = relateTo;
    }

    public String getRelateKey() {
        return relateKey;
    }

    public void setRelateKey(String relateKey) {
        this.relateKey = relateKey;
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

    public Integer getIsLook() {
        return isLook;
    }

    public void setIsLook(Integer isLook) {
        this.isLook = isLook;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }
}