package com.ysd.user.entity;

import com.ysd.base.entity.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 表名:fy_user
 * 
 */
public class User extends BaseEntity {
    private Integer id;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 改修时间
     */
    private Date modifyDate;

    /**
     * 【0:投资者;1:借贷者;2:申请成为借贷者中;3:服务商】
     */
    private Integer typeId;

    /**
     * 会员类型【0:个人;1:企业】
     */
    private Integer memberType;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 注册IP
     */
    private String addIp;

    /**
     * 注册时间
     */
    private Date addTime;

    /**
     * 地址
     */
    private String address;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 证件号
     */
    private String cardId;

    /**
     * 身份证正面图片
     */
    private String cardPic1;

    /**
     * 身份证背面图片
     */
    private String cardPic2;

    /**
     * 证件类型
     */
    private String cardType;

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
     * 省市区中文
     */
    private String areaStore;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 邮件注册认证key【 通过后清空】
     */
    private String emailCertificationKey;

    /**
     * 邮件认证状态
     */
    private Integer emailStatus;

    /**
     * 邀请注册提成
     */
    private BigDecimal inviteMoney;

    /**
     * 邀请者
     */
    private Integer inviteUserid;

    /**
     * 账号是否启用【0:不启用；1：正常】
     */
    private Boolean isEnabled;

    /**
     * 账号是否锁定【1:锁定；0：正常】
     */
    private Boolean isLock;

    /**
     * 连续登录失败的次数
     */
    private Integer loginFailureCount;

    /**
     * 账号锁定日期
     */
    private Date lockedDate;

    /**
     * 最后登录ip
     */
    private String lastIp;

    /**
     * 最后登录时间
     */
    private Date lastTime;

    /**
     * 像头
     */
    private String litpic;

    /**
     * 登录次数
     */
    private Integer loginTime;

    /**
     * 登录密码找回Key【 找回后清空】
     */
    private String passwordRecoverKey;

    /**
     * 支付密码
     */
    private String payPassword;

    /**
     * 支付密码找回Key【 找回后清空】
     */
    private String payPasswordRecoverKey;

    /**
     * 手机
     */
    private String phone;

    /**
     * 手机认证状态
     */
    private Integer phoneStatus;

    /**
     * 实真姓名
     */
    private String realName;

    /**
     * 实名认证状态
     */
    private Integer realStatus;

    /**
     * 认证：0无认证1-3 认证失败次数，11自动认证通过，12手动认证通过
     */
    private Integer sceneStatus;

    /**
     * 性别
     */
    private String sex;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 随机8位数
     */
    private String randomNum;

    /**
     * 自投状态1启用0关闭
     */
    private Integer autoTenderStatus;

    /**
     * 自投修改日期
     */
    private Date autoTenderDate;

    /**
     * 自投次数
     */
    private Integer autoTenderTimes;

    /**
     * 自投规则0全投，1设置
     */
    private Integer autoTenderRule;

    /**
     * 自投上限金额
     */
    private BigDecimal autoTenderMoneyTop;

    /**
     * 自投保留金额
     */
    private BigDecimal autoTenderMoneyLeave;

    /**
     * 自投利率开始
     */
    private BigDecimal autoTenderRateBegin;

    /**
     * 自投利率结束
     */
    private BigDecimal autoTenderRateEnd;

    /**
     * 自投奖励开始
     */
    private BigDecimal autoTenderRewardBegin;

    /**
     * 自投奖励结束
     */
    private BigDecimal autoTenderRewardEnd;

    /**
     * 自投期限开始
     */
    private Integer autoTenderLimitBegin;

    /**
     * 自投期限结束
     */
    private Integer autoTenderLimitEnd;

    /**
     * 自投标还款方式
     */
    private String autoTenderRepayWay;

    /**
     * 自投修改时间
     */
    private Date autoTenderModifyDate;

    /**
     * 推广编号
     */
    private String tgNo;

    /**
     * 一级推广人用户ID
     */
    private Long tgOneLevelUserId;

    /**
     * 渠道活动ID
     */
    private Long placeChilderId;

    /**
     * 推广奖励发送状态【0：没发放（默认），1：已发放】
     */
    private Integer tgStatus;

    /**
     *  注册奖励——投资资金合计（注册奖励发送就不合计）
     */
    private BigDecimal sumTenderMoney;

    /**
     * 邮箱认证次数
     */
    private Integer emailFreq;

    /**
     * 信短验证码
     */
    private String phoneCode;

    /**
     * 服务商ID
     */
    private Integer agencyid;

    /**
     * 1：对接服务商
     */
    private Integer agencytype;

    /**
     * 体验金是否领取【0：未领取；1：已领取；2：不能领取】
     */
    private Integer tasteFlag;

    /**
     * 注册来源【0：PC；1：微信；2：Android；3：IOS】
     */
    private Integer sourceFrom;

    /**
     * 手势密码
     */
    private String gesture;

    /**
     * 自投标标类型
     */
    private String autoTenderBorrowType;

    /**
     * 消息推送对设备的唯一标识【Android是44位；IOS是64位】
     */
    private String deviceToken;

    /**
     * 验证登录token
     */
    private String token;

    /**
     * 注册后渤海银行返回的客户号
     */
    private String bankCustNo;


    /**
     * 联的金融接口，交易日期
     */
    private String mtpTransDate;

    /**
     * 通联的金融接口，交易时间
     */
    private String mtpTransTime;

    /**
     * 通联的金融接口，会员号
     */
    private String mtpSignNum;

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

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getMemberType() {
        return memberType;
    }

    public void setMemberType(Integer memberType) {
        this.memberType = memberType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddIp() {
        return addIp;
    }

    public void setAddIp(String addIp) {
        this.addIp = addIp;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardPic1() {
        return cardPic1;
    }

    public void setCardPic1(String cardPic1) {
        this.cardPic1 = cardPic1;
    }

    public String getCardPic2() {
        return cardPic2;
    }

    public void setCardPic2(String cardPic2) {
        this.cardPic2 = cardPic2;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
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

    public String getAreaStore() {
        return areaStore;
    }

    public void setAreaStore(String areaStore) {
        this.areaStore = areaStore;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailCertificationKey() {
        return emailCertificationKey;
    }

    public void setEmailCertificationKey(String emailCertificationKey) {
        this.emailCertificationKey = emailCertificationKey;
    }

    public Integer getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(Integer emailStatus) {
        this.emailStatus = emailStatus;
    }

    public BigDecimal getInviteMoney() {
        return inviteMoney;
    }

    public void setInviteMoney(BigDecimal inviteMoney) {
        this.inviteMoney = inviteMoney;
    }

    public Integer getInviteUserid() {
        return inviteUserid;
    }

    public void setInviteUserid(Integer inviteUserid) {
        this.inviteUserid = inviteUserid;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Boolean getIsLock() {
        return isLock;
    }

    public void setIsLock(Boolean isLock) {
        this.isLock = isLock;
    }

    public Integer getLoginFailureCount() {
        return loginFailureCount;
    }

    public void setLoginFailureCount(Integer loginFailureCount) {
        this.loginFailureCount = loginFailureCount;
    }

    public Date getLockedDate() {
        return lockedDate;
    }

    public void setLockedDate(Date lockedDate) {
        this.lockedDate = lockedDate;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public String getLitpic() {
        return litpic;
    }

    public void setLitpic(String litpic) {
        this.litpic = litpic;
    }

    public Integer getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Integer loginTime) {
        this.loginTime = loginTime;
    }

    public String getPasswordRecoverKey() {
        return passwordRecoverKey;
    }

    public void setPasswordRecoverKey(String passwordRecoverKey) {
        this.passwordRecoverKey = passwordRecoverKey;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword;
    }

    public String getPayPasswordRecoverKey() {
        return payPasswordRecoverKey;
    }

    public void setPayPasswordRecoverKey(String payPasswordRecoverKey) {
        this.payPasswordRecoverKey = payPasswordRecoverKey;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getPhoneStatus() {
        return phoneStatus;
    }

    public void setPhoneStatus(Integer phoneStatus) {
        this.phoneStatus = phoneStatus;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getRealStatus() {
        return realStatus;
    }

    public void setRealStatus(Integer realStatus) {
        this.realStatus = realStatus;
    }

    public Integer getSceneStatus() {
        return sceneStatus;
    }

    public void setSceneStatus(Integer sceneStatus) {
        this.sceneStatus = sceneStatus;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(String randomNum) {
        this.randomNum = randomNum;
    }

    public Integer getAutoTenderStatus() {
        return autoTenderStatus;
    }

    public void setAutoTenderStatus(Integer autoTenderStatus) {
        this.autoTenderStatus = autoTenderStatus;
    }

    public Date getAutoTenderDate() {
        return autoTenderDate;
    }

    public void setAutoTenderDate(Date autoTenderDate) {
        this.autoTenderDate = autoTenderDate;
    }

    public Integer getAutoTenderTimes() {
        return autoTenderTimes;
    }

    public void setAutoTenderTimes(Integer autoTenderTimes) {
        this.autoTenderTimes = autoTenderTimes;
    }

    public Integer getAutoTenderRule() {
        return autoTenderRule;
    }

    public void setAutoTenderRule(Integer autoTenderRule) {
        this.autoTenderRule = autoTenderRule;
    }

    public BigDecimal getAutoTenderMoneyTop() {
        return autoTenderMoneyTop;
    }

    public void setAutoTenderMoneyTop(BigDecimal autoTenderMoneyTop) {
        this.autoTenderMoneyTop = autoTenderMoneyTop;
    }

    public BigDecimal getAutoTenderMoneyLeave() {
        return autoTenderMoneyLeave;
    }

    public void setAutoTenderMoneyLeave(BigDecimal autoTenderMoneyLeave) {
        this.autoTenderMoneyLeave = autoTenderMoneyLeave;
    }

    public BigDecimal getAutoTenderRateBegin() {
        return autoTenderRateBegin;
    }

    public void setAutoTenderRateBegin(BigDecimal autoTenderRateBegin) {
        this.autoTenderRateBegin = autoTenderRateBegin;
    }

    public BigDecimal getAutoTenderRateEnd() {
        return autoTenderRateEnd;
    }

    public void setAutoTenderRateEnd(BigDecimal autoTenderRateEnd) {
        this.autoTenderRateEnd = autoTenderRateEnd;
    }

    public BigDecimal getAutoTenderRewardBegin() {
        return autoTenderRewardBegin;
    }

    public void setAutoTenderRewardBegin(BigDecimal autoTenderRewardBegin) {
        this.autoTenderRewardBegin = autoTenderRewardBegin;
    }

    public BigDecimal getAutoTenderRewardEnd() {
        return autoTenderRewardEnd;
    }

    public void setAutoTenderRewardEnd(BigDecimal autoTenderRewardEnd) {
        this.autoTenderRewardEnd = autoTenderRewardEnd;
    }

    public Integer getAutoTenderLimitBegin() {
        return autoTenderLimitBegin;
    }

    public void setAutoTenderLimitBegin(Integer autoTenderLimitBegin) {
        this.autoTenderLimitBegin = autoTenderLimitBegin;
    }

    public Integer getAutoTenderLimitEnd() {
        return autoTenderLimitEnd;
    }

    public void setAutoTenderLimitEnd(Integer autoTenderLimitEnd) {
        this.autoTenderLimitEnd = autoTenderLimitEnd;
    }

    public String getAutoTenderRepayWay() {
        return autoTenderRepayWay;
    }

    public void setAutoTenderRepayWay(String autoTenderRepayWay) {
        this.autoTenderRepayWay = autoTenderRepayWay;
    }

    public Date getAutoTenderModifyDate() {
        return autoTenderModifyDate;
    }

    public void setAutoTenderModifyDate(Date autoTenderModifyDate) {
        this.autoTenderModifyDate = autoTenderModifyDate;
    }

    public String getTgNo() {
        return tgNo;
    }

    public void setTgNo(String tgNo) {
        this.tgNo = tgNo;
    }

    public Long getTgOneLevelUserId() {
        return tgOneLevelUserId;
    }

    public void setTgOneLevelUserId(Long tgOneLevelUserId) {
        this.tgOneLevelUserId = tgOneLevelUserId;
    }

    public Long getPlaceChilderId() {
        return placeChilderId;
    }

    public void setPlaceChilderId(Long placeChilderId) {
        this.placeChilderId = placeChilderId;
    }

    public Integer getTgStatus() {
        return tgStatus;
    }

    public void setTgStatus(Integer tgStatus) {
        this.tgStatus = tgStatus;
    }

    public BigDecimal getSumTenderMoney() {
        return sumTenderMoney;
    }

    public void setSumTenderMoney(BigDecimal sumTenderMoney) {
        this.sumTenderMoney = sumTenderMoney;
    }

    public Integer getEmailFreq() {
        return emailFreq;
    }

    public void setEmailFreq(Integer emailFreq) {
        this.emailFreq = emailFreq;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public Integer getAgencyid() {
        return agencyid;
    }

    public void setAgencyid(Integer agencyid) {
        this.agencyid = agencyid;
    }

    public Integer getAgencytype() {
        return agencytype;
    }

    public void setAgencytype(Integer agencytype) {
        this.agencytype = agencytype;
    }

    public Integer getTasteFlag() {
        return tasteFlag;
    }

    public void setTasteFlag(Integer tasteFlag) {
        this.tasteFlag = tasteFlag;
    }

    public Integer getSourceFrom() {
        return sourceFrom;
    }

    public void setSourceFrom(Integer sourceFrom) {
        this.sourceFrom = sourceFrom;
    }

    public String getGesture() {
        return gesture;
    }

    public void setGesture(String gesture) {
        this.gesture = gesture;
    }

    public String getAutoTenderBorrowType() {
        return autoTenderBorrowType;
    }

    public void setAutoTenderBorrowType(String autoTenderBorrowType) {
        this.autoTenderBorrowType = autoTenderBorrowType;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBankCustNo() {
        return bankCustNo;
    }

    public void setBankCustNo(String bankCustNo) {
        this.bankCustNo = bankCustNo;
    }

    public String getMtpTransDate() {
        return mtpTransDate;
    }

    public void setMtpTransDate(String mtpTransDate) {
        this.mtpTransDate = mtpTransDate;
    }

    public String getMtpTransTime() {
        return mtpTransTime;
    }

    public void setMtpTransTime(String mtpTransTime) {
        this.mtpTransTime = mtpTransTime;
    }

    public String getMtpSignNum() {
        return mtpSignNum;
    }

    public void setMtpSignNum(String mtpSignNum) {
        this.mtpSignNum = mtpSignNum;
    }
}