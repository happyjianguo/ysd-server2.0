package com.ysd.user.entity;

import com.ysd.base.entity.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 表名:fy_agency_ready
 * 
 */
public class AgencyReady extends BaseEntity {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    /**
     * 公司名称【服务商名称】
     */
    private String companyName;

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
     * 所在地区
     */
    private String areaStore;

    /**
     * 联系电话【基本信息】
     */
    private String contactPhone;

    /**
     * 联系地址【基本信息】
     */
    private String contactAddress;

    /**
     * 邮箱
     */
    private String uemail;

    /**
     * 联系人
     */
    private String linkman;

    /**
     * 联系人手机
     */
    private String linkmanMobile;

    /**
     * 服务承诺(checkbox)
     */
    private String servicePromise;

    /**
     * 主营业务
     */
    private String mainBusiness;

    /**
     * 备注
     */
    private String remark;

    /**
     * 法人姓名
     */
    private String urealname;

    /**
     * 身份证正面图片
     */
    private String cardPic1;

    /**
     * 身份证反面图片
     */
    private String cardPic2;

    /**
     * 营业执照号码
     */
    private String privateCharter;

    /**
     * 营业执照
     */
    private String privateCharterImg;

    /**
     * 税务登记号
     */
    private String taxRegistration;

    /**
     * 税务登记证
     */
    private String privateTaxImg;

    /**
     * 机构代码证号
     */
    private String organization;

    /**
     * 机构代码证
     */
    private String privateOrganizationImg;

    /**
     * 开户许可证
     */
    private String accountLicenceImg;

    /**
     * 成立日期
     */
    private Date establishDate;

    /**
     * 营业期限开始
     */
    private Date businessStart;

    /**
     * 营业期限结束
     */
    private Date businessEnd;

    /**
     * 注册地址
     */
    private String address;

    /**
     * 注册资本
     */
    private BigDecimal capital;

    /**
     * 经营范围
     */
    private String scope;

    /**
     * 用户名
     */
    private String uusername;

    /**
     * 密码
     */
    private String upassword;

    /**
     * 安全密码
     */
    private String upaypassword;

    /**
     * 随机号
     */
    private String urandom;

    /**
     * 状态【0：失败；1：成功；2：审核中】
     */
    private Integer status;

    /**
     * 担保服务商ID
     */
    private Long agencydbid;

    /**
     * 体验 1可用
     */
    private Integer tasteRule;

    /**
     * 债权流转标
     */
    private Integer flowRule;

    /**
     * 信用标
     */
    private Integer creditRule;

    /**
     * 质押抵押标
     */
    private Integer pledgeRule;

    /**
     * 签章（合同）
     */
    private String signImage;

    /**
     * 注册赠送体验金
     */
    private BigDecimal tasteMoney;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getLinkmanMobile() {
        return linkmanMobile;
    }

    public void setLinkmanMobile(String linkmanMobile) {
        this.linkmanMobile = linkmanMobile;
    }

    public String getServicePromise() {
        return servicePromise;
    }

    public void setServicePromise(String servicePromise) {
        this.servicePromise = servicePromise;
    }

    public String getMainBusiness() {
        return mainBusiness;
    }

    public void setMainBusiness(String mainBusiness) {
        this.mainBusiness = mainBusiness;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUrealname() {
        return urealname;
    }

    public void setUrealname(String urealname) {
        this.urealname = urealname;
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

    public String getPrivateCharter() {
        return privateCharter;
    }

    public void setPrivateCharter(String privateCharter) {
        this.privateCharter = privateCharter;
    }

    public String getPrivateCharterImg() {
        return privateCharterImg;
    }

    public void setPrivateCharterImg(String privateCharterImg) {
        this.privateCharterImg = privateCharterImg;
    }

    public String getTaxRegistration() {
        return taxRegistration;
    }

    public void setTaxRegistration(String taxRegistration) {
        this.taxRegistration = taxRegistration;
    }

    public String getPrivateTaxImg() {
        return privateTaxImg;
    }

    public void setPrivateTaxImg(String privateTaxImg) {
        this.privateTaxImg = privateTaxImg;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getPrivateOrganizationImg() {
        return privateOrganizationImg;
    }

    public void setPrivateOrganizationImg(String privateOrganizationImg) {
        this.privateOrganizationImg = privateOrganizationImg;
    }

    public String getAccountLicenceImg() {
        return accountLicenceImg;
    }

    public void setAccountLicenceImg(String accountLicenceImg) {
        this.accountLicenceImg = accountLicenceImg;
    }

    public Date getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(Date establishDate) {
        this.establishDate = establishDate;
    }

    public Date getBusinessStart() {
        return businessStart;
    }

    public void setBusinessStart(Date businessStart) {
        this.businessStart = businessStart;
    }

    public Date getBusinessEnd() {
        return businessEnd;
    }

    public void setBusinessEnd(Date businessEnd) {
        this.businessEnd = businessEnd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getCapital() {
        return capital;
    }

    public void setCapital(BigDecimal capital) {
        this.capital = capital;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getUusername() {
        return uusername;
    }

    public void setUusername(String uusername) {
        this.uusername = uusername;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public String getUpaypassword() {
        return upaypassword;
    }

    public void setUpaypassword(String upaypassword) {
        this.upaypassword = upaypassword;
    }

    public String getUrandom() {
        return urandom;
    }

    public void setUrandom(String urandom) {
        this.urandom = urandom;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getAgencydbid() {
        return agencydbid;
    }

    public void setAgencydbid(Long agencydbid) {
        this.agencydbid = agencydbid;
    }

    public Integer getTasteRule() {
        return tasteRule;
    }

    public void setTasteRule(Integer tasteRule) {
        this.tasteRule = tasteRule;
    }

    public Integer getFlowRule() {
        return flowRule;
    }

    public void setFlowRule(Integer flowRule) {
        this.flowRule = flowRule;
    }

    public Integer getCreditRule() {
        return creditRule;
    }

    public void setCreditRule(Integer creditRule) {
        this.creditRule = creditRule;
    }

    public Integer getPledgeRule() {
        return pledgeRule;
    }

    public void setPledgeRule(Integer pledgeRule) {
        this.pledgeRule = pledgeRule;
    }

    public String getSignImage() {
        return signImage;
    }

    public void setSignImage(String signImage) {
        this.signImage = signImage;
    }

    public BigDecimal getTasteMoney() {
        return tasteMoney;
    }

    public void setTasteMoney(BigDecimal tasteMoney) {
        this.tasteMoney = tasteMoney;
    }
}