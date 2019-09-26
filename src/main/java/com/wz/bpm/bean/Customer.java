package com.wz.bpm.bean;

public class Customer {
    private Integer id;

    private String customerNum;

    private String companyFullname;

    private String companyShortname;

    private String brandName;

    private Integer industryFirst;

    private Integer industrySecond;

    private Integer regionId;

    private String address;

    private Boolean customerFrom;

    private String selfWebsiteUrl;

    private String selfWebsiteDesc;

    private String customerBackgroud;

    private Integer creator;

    private String createTime;

    private String companyWebsite;

    private String companyEmail;

    private String companyPhone;

    private String companyPostcode;

    private Boolean isSelfWebsite;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum == null ? null : customerNum.trim();
    }

    public String getCompanyFullname() {
        return companyFullname;
    }

    public void setCompanyFullname(String companyFullname) {
        this.companyFullname = companyFullname == null ? null : companyFullname.trim();
    }

    public String getCompanyShortname() {
        return companyShortname;
    }

    public void setCompanyShortname(String companyShortname) {
        this.companyShortname = companyShortname == null ? null : companyShortname.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public Integer getIndustryFirst() {
        return industryFirst;
    }

    public void setIndustryFirst(Integer industryFirst) {
        this.industryFirst = industryFirst;
    }

    public Integer getIndustrySecond() {
        return industrySecond;
    }

    public void setIndustrySecond(Integer industrySecond) {
        this.industrySecond = industrySecond;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Boolean getCustomerFrom() {
        return customerFrom;
    }

    public void setCustomerFrom(Boolean customerFrom) {
        this.customerFrom = customerFrom;
    }

    public String getSelfWebsiteUrl() {
        return selfWebsiteUrl;
    }

    public void setSelfWebsiteUrl(String selfWebsiteUrl) {
        this.selfWebsiteUrl = selfWebsiteUrl == null ? null : selfWebsiteUrl.trim();
    }

    public String getSelfWebsiteDesc() {
        return selfWebsiteDesc;
    }

    public void setSelfWebsiteDesc(String selfWebsiteDesc) {
        this.selfWebsiteDesc = selfWebsiteDesc == null ? null : selfWebsiteDesc.trim();
    }

    public String getCustomerBackgroud() {
        return customerBackgroud;
    }

    public void setCustomerBackgroud(String customerBackgroud) {
        this.customerBackgroud = customerBackgroud == null ? null : customerBackgroud.trim();
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getCompanyWebsite() {
        return companyWebsite;
    }

    public void setCompanyWebsite(String companyWebsite) {
        this.companyWebsite = companyWebsite == null ? null : companyWebsite.trim();
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail == null ? null : companyEmail.trim();
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone == null ? null : companyPhone.trim();
    }

    public String getCompanyPostcode() {
        return companyPostcode;
    }

    public void setCompanyPostcode(String companyPostcode) {
        this.companyPostcode = companyPostcode == null ? null : companyPostcode.trim();
    }

    public Boolean getIsSelfWebsite() {
        return isSelfWebsite;
    }

    public void setIsSelfWebsite(Boolean isSelfWebsite) {
        this.isSelfWebsite = isSelfWebsite;
    }
}