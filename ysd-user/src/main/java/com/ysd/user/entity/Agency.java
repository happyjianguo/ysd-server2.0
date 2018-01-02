package com.ysd.user.entity;

import com.ysd.base.entity.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 表名:fy_agency
 * 
 */
public class Agency extends BaseEntity {
    private Long id;

    private Date createDate;

    private Date modifyDate;

    /**
     * 【服务商名称】
     */
    private String companyName;

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
     * 公司LOGO
     */
    private String logo;

    /**
     * 顶部广告图
     */
    private String logo1;

    /**
     * 地址图片
     */
    private String logo2;

    /**
     * 联系电话【子页面管理】
     */
    private String subpagePhone;

    /**
     * 联系地址【子页面管理】
     */
    private String subpageAddress;

    /**
     * 用户ID
     */
    private Long userid;

    /**
     * 排序
     */
    private Integer orderList;

    /**
     * 担保服务商ID
     */
    private Long agencydbid;

    /**
     * 体验
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

    /**
     * 主营业务
     */
    private String mainBusiness;

    /**
     * 备注
     */
    private String remark;

    /**
     * 经营范围
     */
    private String scope;

    /**
     * 实景图片
     */
    private String logo3;

    /**
     * 批量上传图片
     */
    private String img;

    /**
     * 公司介绍
     */
    private String introduction;

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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogo1() {
        return logo1;
    }

    public void setLogo1(String logo1) {
        this.logo1 = logo1;
    }

    public String getLogo2() {
        return logo2;
    }

    public void setLogo2(String logo2) {
        this.logo2 = logo2;
    }

    public String getSubpagePhone() {
        return subpagePhone;
    }

    public void setSubpagePhone(String subpagePhone) {
        this.subpagePhone = subpagePhone;
    }

    public String getSubpageAddress() {
        return subpageAddress;
    }

    public void setSubpageAddress(String subpageAddress) {
        this.subpageAddress = subpageAddress;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Integer getOrderList() {
        return orderList;
    }

    public void setOrderList(Integer orderList) {
        this.orderList = orderList;
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

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getLogo3() {
        return logo3;
    }

    public void setLogo3(String logo3) {
        this.logo3 = logo3;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}