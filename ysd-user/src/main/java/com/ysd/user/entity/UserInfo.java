package com.ysd.user.entity;

import com.ysd.base.entity.BaseEntity;
import java.util.Date;

/**
 * 表名:fy_user_info
 * 
 */
public class UserInfo extends BaseEntity {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 添加时间
     */
    private Date createDate;

    /**
     * 修改时间
     */
    private Date modifyDate;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 企业名称
     */
    private String privateName;

    /**
     * 营业执照
     */
    private String privateCharterImg;

    /**
     * 税务登记证
     */
    private String privateTaxImg;

    /**
     * 组织机构代码证
     */
    private String privateOrganizationImg;

    /**
     * 税务登记号
     */
    private String taxRegistration;

    /**
     * 企业登记号
     */
    private String registration;

    /**
     * 企业联系人电话
     */
    private String privatePhone;

    /**
     * 联系人
     */
    private String linkman;

    /**
     * 注册资金
     */
    private String registeredCapital;

    /**
     * 组织机构号
     */
    private String organization;

    /**
     * 地址
     */
    private String address;

    /**
     * 其它说明-个人介绍
     */
    private String others;

    /**
     * 添加IP
     */
    private String addIp;

    /**
     * 成立时间
     */
    private Date clsj;

    /**
     * 营业期限-开始
     */
    private Date yyqxStart;

    /**
     * 营业期限-结束
     */
    private Date yyqxEnd;

    /**
     * 婚姻状况
     */
    private String marry;

    /**
     * 工作单位
     */
    private String companyName;

    /**
     * 担任职位
     */
    private String companyOffice;

    /**
     * 文化程度
     */
    private String educationRecord;

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

    public String getPrivateName() {
        return privateName;
    }

    public void setPrivateName(String privateName) {
        this.privateName = privateName;
    }

    public String getPrivateCharterImg() {
        return privateCharterImg;
    }

    public void setPrivateCharterImg(String privateCharterImg) {
        this.privateCharterImg = privateCharterImg;
    }

    public String getPrivateTaxImg() {
        return privateTaxImg;
    }

    public void setPrivateTaxImg(String privateTaxImg) {
        this.privateTaxImg = privateTaxImg;
    }

    public String getPrivateOrganizationImg() {
        return privateOrganizationImg;
    }

    public void setPrivateOrganizationImg(String privateOrganizationImg) {
        this.privateOrganizationImg = privateOrganizationImg;
    }

    public String getTaxRegistration() {
        return taxRegistration;
    }

    public void setTaxRegistration(String taxRegistration) {
        this.taxRegistration = taxRegistration;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getPrivatePhone() {
        return privatePhone;
    }

    public void setPrivatePhone(String privatePhone) {
        this.privatePhone = privatePhone;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getAddIp() {
        return addIp;
    }

    public void setAddIp(String addIp) {
        this.addIp = addIp;
    }

    public Date getClsj() {
        return clsj;
    }

    public void setClsj(Date clsj) {
        this.clsj = clsj;
    }

    public Date getYyqxStart() {
        return yyqxStart;
    }

    public void setYyqxStart(Date yyqxStart) {
        this.yyqxStart = yyqxStart;
    }

    public Date getYyqxEnd() {
        return yyqxEnd;
    }

    public void setYyqxEnd(Date yyqxEnd) {
        this.yyqxEnd = yyqxEnd;
    }

    public String getMarry() {
        return marry;
    }

    public void setMarry(String marry) {
        this.marry = marry;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyOffice() {
        return companyOffice;
    }

    public void setCompanyOffice(String companyOffice) {
        this.companyOffice = companyOffice;
    }

    public String getEducationRecord() {
        return educationRecord;
    }

    public void setEducationRecord(String educationRecord) {
        this.educationRecord = educationRecord;
    }
}