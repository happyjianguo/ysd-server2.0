package com.ysd.user.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AgencyCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AgencyCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("linkman is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("linkman =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("linkman <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("linkman >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("linkman >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("linkman <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("linkman <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("linkman like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("linkman not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("linkman in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("linkman not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("linkman between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("linkman not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileIsNull() {
            addCriterion("linkman_mobile is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileIsNotNull() {
            addCriterion("linkman_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileEqualTo(String value) {
            addCriterion("linkman_mobile =", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileNotEqualTo(String value) {
            addCriterion("linkman_mobile <>", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileGreaterThan(String value) {
            addCriterion("linkman_mobile >", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_mobile >=", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileLessThan(String value) {
            addCriterion("linkman_mobile <", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileLessThanOrEqualTo(String value) {
            addCriterion("linkman_mobile <=", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileLike(String value) {
            addCriterion("linkman_mobile like", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileNotLike(String value) {
            addCriterion("linkman_mobile not like", value, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileIn(List<String> values) {
            addCriterion("linkman_mobile in", values, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileNotIn(List<String> values) {
            addCriterion("linkman_mobile not in", values, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileBetween(String value1, String value2) {
            addCriterion("linkman_mobile between", value1, value2, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andLinkmanMobileNotBetween(String value1, String value2) {
            addCriterion("linkman_mobile not between", value1, value2, "linkmanMobile");
            return (Criteria) this;
        }

        public Criteria andServicePromiseIsNull() {
            addCriterion("service_promise is null");
            return (Criteria) this;
        }

        public Criteria andServicePromiseIsNotNull() {
            addCriterion("service_promise is not null");
            return (Criteria) this;
        }

        public Criteria andServicePromiseEqualTo(String value) {
            addCriterion("service_promise =", value, "servicePromise");
            return (Criteria) this;
        }

        public Criteria andServicePromiseNotEqualTo(String value) {
            addCriterion("service_promise <>", value, "servicePromise");
            return (Criteria) this;
        }

        public Criteria andServicePromiseGreaterThan(String value) {
            addCriterion("service_promise >", value, "servicePromise");
            return (Criteria) this;
        }

        public Criteria andServicePromiseGreaterThanOrEqualTo(String value) {
            addCriterion("service_promise >=", value, "servicePromise");
            return (Criteria) this;
        }

        public Criteria andServicePromiseLessThan(String value) {
            addCriterion("service_promise <", value, "servicePromise");
            return (Criteria) this;
        }

        public Criteria andServicePromiseLessThanOrEqualTo(String value) {
            addCriterion("service_promise <=", value, "servicePromise");
            return (Criteria) this;
        }

        public Criteria andServicePromiseLike(String value) {
            addCriterion("service_promise like", value, "servicePromise");
            return (Criteria) this;
        }

        public Criteria andServicePromiseNotLike(String value) {
            addCriterion("service_promise not like", value, "servicePromise");
            return (Criteria) this;
        }

        public Criteria andServicePromiseIn(List<String> values) {
            addCriterion("service_promise in", values, "servicePromise");
            return (Criteria) this;
        }

        public Criteria andServicePromiseNotIn(List<String> values) {
            addCriterion("service_promise not in", values, "servicePromise");
            return (Criteria) this;
        }

        public Criteria andServicePromiseBetween(String value1, String value2) {
            addCriterion("service_promise between", value1, value2, "servicePromise");
            return (Criteria) this;
        }

        public Criteria andServicePromiseNotBetween(String value1, String value2) {
            addCriterion("service_promise not between", value1, value2, "servicePromise");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterIsNull() {
            addCriterion("private_charter is null");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterIsNotNull() {
            addCriterion("private_charter is not null");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterEqualTo(String value) {
            addCriterion("private_charter =", value, "privateCharter");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterNotEqualTo(String value) {
            addCriterion("private_charter <>", value, "privateCharter");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterGreaterThan(String value) {
            addCriterion("private_charter >", value, "privateCharter");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterGreaterThanOrEqualTo(String value) {
            addCriterion("private_charter >=", value, "privateCharter");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterLessThan(String value) {
            addCriterion("private_charter <", value, "privateCharter");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterLessThanOrEqualTo(String value) {
            addCriterion("private_charter <=", value, "privateCharter");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterLike(String value) {
            addCriterion("private_charter like", value, "privateCharter");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterNotLike(String value) {
            addCriterion("private_charter not like", value, "privateCharter");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterIn(List<String> values) {
            addCriterion("private_charter in", values, "privateCharter");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterNotIn(List<String> values) {
            addCriterion("private_charter not in", values, "privateCharter");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterBetween(String value1, String value2) {
            addCriterion("private_charter between", value1, value2, "privateCharter");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterNotBetween(String value1, String value2) {
            addCriterion("private_charter not between", value1, value2, "privateCharter");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterImgIsNull() {
            addCriterion("private_charter_img is null");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterImgIsNotNull() {
            addCriterion("private_charter_img is not null");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterImgEqualTo(String value) {
            addCriterion("private_charter_img =", value, "privateCharterImg");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterImgNotEqualTo(String value) {
            addCriterion("private_charter_img <>", value, "privateCharterImg");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterImgGreaterThan(String value) {
            addCriterion("private_charter_img >", value, "privateCharterImg");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterImgGreaterThanOrEqualTo(String value) {
            addCriterion("private_charter_img >=", value, "privateCharterImg");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterImgLessThan(String value) {
            addCriterion("private_charter_img <", value, "privateCharterImg");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterImgLessThanOrEqualTo(String value) {
            addCriterion("private_charter_img <=", value, "privateCharterImg");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterImgLike(String value) {
            addCriterion("private_charter_img like", value, "privateCharterImg");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterImgNotLike(String value) {
            addCriterion("private_charter_img not like", value, "privateCharterImg");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterImgIn(List<String> values) {
            addCriterion("private_charter_img in", values, "privateCharterImg");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterImgNotIn(List<String> values) {
            addCriterion("private_charter_img not in", values, "privateCharterImg");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterImgBetween(String value1, String value2) {
            addCriterion("private_charter_img between", value1, value2, "privateCharterImg");
            return (Criteria) this;
        }

        public Criteria andPrivateCharterImgNotBetween(String value1, String value2) {
            addCriterion("private_charter_img not between", value1, value2, "privateCharterImg");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationIsNull() {
            addCriterion("tax_registration is null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationIsNotNull() {
            addCriterion("tax_registration is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationEqualTo(String value) {
            addCriterion("tax_registration =", value, "taxRegistration");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNotEqualTo(String value) {
            addCriterion("tax_registration <>", value, "taxRegistration");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationGreaterThan(String value) {
            addCriterion("tax_registration >", value, "taxRegistration");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationGreaterThanOrEqualTo(String value) {
            addCriterion("tax_registration >=", value, "taxRegistration");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationLessThan(String value) {
            addCriterion("tax_registration <", value, "taxRegistration");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationLessThanOrEqualTo(String value) {
            addCriterion("tax_registration <=", value, "taxRegistration");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationLike(String value) {
            addCriterion("tax_registration like", value, "taxRegistration");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNotLike(String value) {
            addCriterion("tax_registration not like", value, "taxRegistration");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationIn(List<String> values) {
            addCriterion("tax_registration in", values, "taxRegistration");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNotIn(List<String> values) {
            addCriterion("tax_registration not in", values, "taxRegistration");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationBetween(String value1, String value2) {
            addCriterion("tax_registration between", value1, value2, "taxRegistration");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNotBetween(String value1, String value2) {
            addCriterion("tax_registration not between", value1, value2, "taxRegistration");
            return (Criteria) this;
        }

        public Criteria andPrivateTaxImgIsNull() {
            addCriterion("private_tax_img is null");
            return (Criteria) this;
        }

        public Criteria andPrivateTaxImgIsNotNull() {
            addCriterion("private_tax_img is not null");
            return (Criteria) this;
        }

        public Criteria andPrivateTaxImgEqualTo(String value) {
            addCriterion("private_tax_img =", value, "privateTaxImg");
            return (Criteria) this;
        }

        public Criteria andPrivateTaxImgNotEqualTo(String value) {
            addCriterion("private_tax_img <>", value, "privateTaxImg");
            return (Criteria) this;
        }

        public Criteria andPrivateTaxImgGreaterThan(String value) {
            addCriterion("private_tax_img >", value, "privateTaxImg");
            return (Criteria) this;
        }

        public Criteria andPrivateTaxImgGreaterThanOrEqualTo(String value) {
            addCriterion("private_tax_img >=", value, "privateTaxImg");
            return (Criteria) this;
        }

        public Criteria andPrivateTaxImgLessThan(String value) {
            addCriterion("private_tax_img <", value, "privateTaxImg");
            return (Criteria) this;
        }

        public Criteria andPrivateTaxImgLessThanOrEqualTo(String value) {
            addCriterion("private_tax_img <=", value, "privateTaxImg");
            return (Criteria) this;
        }

        public Criteria andPrivateTaxImgLike(String value) {
            addCriterion("private_tax_img like", value, "privateTaxImg");
            return (Criteria) this;
        }

        public Criteria andPrivateTaxImgNotLike(String value) {
            addCriterion("private_tax_img not like", value, "privateTaxImg");
            return (Criteria) this;
        }

        public Criteria andPrivateTaxImgIn(List<String> values) {
            addCriterion("private_tax_img in", values, "privateTaxImg");
            return (Criteria) this;
        }

        public Criteria andPrivateTaxImgNotIn(List<String> values) {
            addCriterion("private_tax_img not in", values, "privateTaxImg");
            return (Criteria) this;
        }

        public Criteria andPrivateTaxImgBetween(String value1, String value2) {
            addCriterion("private_tax_img between", value1, value2, "privateTaxImg");
            return (Criteria) this;
        }

        public Criteria andPrivateTaxImgNotBetween(String value1, String value2) {
            addCriterion("private_tax_img not between", value1, value2, "privateTaxImg");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNull() {
            addCriterion("organization is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNotNull() {
            addCriterion("organization is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationEqualTo(String value) {
            addCriterion("organization =", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotEqualTo(String value) {
            addCriterion("organization <>", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThan(String value) {
            addCriterion("organization >", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("organization >=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThan(String value) {
            addCriterion("organization <", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThanOrEqualTo(String value) {
            addCriterion("organization <=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLike(String value) {
            addCriterion("organization like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotLike(String value) {
            addCriterion("organization not like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationIn(List<String> values) {
            addCriterion("organization in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotIn(List<String> values) {
            addCriterion("organization not in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationBetween(String value1, String value2) {
            addCriterion("organization between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotBetween(String value1, String value2) {
            addCriterion("organization not between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andPrivateOrganizationImgIsNull() {
            addCriterion("private_organization_img is null");
            return (Criteria) this;
        }

        public Criteria andPrivateOrganizationImgIsNotNull() {
            addCriterion("private_organization_img is not null");
            return (Criteria) this;
        }

        public Criteria andPrivateOrganizationImgEqualTo(String value) {
            addCriterion("private_organization_img =", value, "privateOrganizationImg");
            return (Criteria) this;
        }

        public Criteria andPrivateOrganizationImgNotEqualTo(String value) {
            addCriterion("private_organization_img <>", value, "privateOrganizationImg");
            return (Criteria) this;
        }

        public Criteria andPrivateOrganizationImgGreaterThan(String value) {
            addCriterion("private_organization_img >", value, "privateOrganizationImg");
            return (Criteria) this;
        }

        public Criteria andPrivateOrganizationImgGreaterThanOrEqualTo(String value) {
            addCriterion("private_organization_img >=", value, "privateOrganizationImg");
            return (Criteria) this;
        }

        public Criteria andPrivateOrganizationImgLessThan(String value) {
            addCriterion("private_organization_img <", value, "privateOrganizationImg");
            return (Criteria) this;
        }

        public Criteria andPrivateOrganizationImgLessThanOrEqualTo(String value) {
            addCriterion("private_organization_img <=", value, "privateOrganizationImg");
            return (Criteria) this;
        }

        public Criteria andPrivateOrganizationImgLike(String value) {
            addCriterion("private_organization_img like", value, "privateOrganizationImg");
            return (Criteria) this;
        }

        public Criteria andPrivateOrganizationImgNotLike(String value) {
            addCriterion("private_organization_img not like", value, "privateOrganizationImg");
            return (Criteria) this;
        }

        public Criteria andPrivateOrganizationImgIn(List<String> values) {
            addCriterion("private_organization_img in", values, "privateOrganizationImg");
            return (Criteria) this;
        }

        public Criteria andPrivateOrganizationImgNotIn(List<String> values) {
            addCriterion("private_organization_img not in", values, "privateOrganizationImg");
            return (Criteria) this;
        }

        public Criteria andPrivateOrganizationImgBetween(String value1, String value2) {
            addCriterion("private_organization_img between", value1, value2, "privateOrganizationImg");
            return (Criteria) this;
        }

        public Criteria andPrivateOrganizationImgNotBetween(String value1, String value2) {
            addCriterion("private_organization_img not between", value1, value2, "privateOrganizationImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceImgIsNull() {
            addCriterion("account_licence_img is null");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceImgIsNotNull() {
            addCriterion("account_licence_img is not null");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceImgEqualTo(String value) {
            addCriterion("account_licence_img =", value, "accountLicenceImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceImgNotEqualTo(String value) {
            addCriterion("account_licence_img <>", value, "accountLicenceImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceImgGreaterThan(String value) {
            addCriterion("account_licence_img >", value, "accountLicenceImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceImgGreaterThanOrEqualTo(String value) {
            addCriterion("account_licence_img >=", value, "accountLicenceImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceImgLessThan(String value) {
            addCriterion("account_licence_img <", value, "accountLicenceImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceImgLessThanOrEqualTo(String value) {
            addCriterion("account_licence_img <=", value, "accountLicenceImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceImgLike(String value) {
            addCriterion("account_licence_img like", value, "accountLicenceImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceImgNotLike(String value) {
            addCriterion("account_licence_img not like", value, "accountLicenceImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceImgIn(List<String> values) {
            addCriterion("account_licence_img in", values, "accountLicenceImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceImgNotIn(List<String> values) {
            addCriterion("account_licence_img not in", values, "accountLicenceImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceImgBetween(String value1, String value2) {
            addCriterion("account_licence_img between", value1, value2, "accountLicenceImg");
            return (Criteria) this;
        }

        public Criteria andAccountLicenceImgNotBetween(String value1, String value2) {
            addCriterion("account_licence_img not between", value1, value2, "accountLicenceImg");
            return (Criteria) this;
        }

        public Criteria andEstablishDateIsNull() {
            addCriterion("establish_date is null");
            return (Criteria) this;
        }

        public Criteria andEstablishDateIsNotNull() {
            addCriterion("establish_date is not null");
            return (Criteria) this;
        }

        public Criteria andEstablishDateEqualTo(Date value) {
            addCriterion("establish_date =", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotEqualTo(Date value) {
            addCriterion("establish_date <>", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateGreaterThan(Date value) {
            addCriterion("establish_date >", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("establish_date >=", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateLessThan(Date value) {
            addCriterion("establish_date <", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateLessThanOrEqualTo(Date value) {
            addCriterion("establish_date <=", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateIn(List<Date> values) {
            addCriterion("establish_date in", values, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotIn(List<Date> values) {
            addCriterion("establish_date not in", values, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateBetween(Date value1, Date value2) {
            addCriterion("establish_date between", value1, value2, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotBetween(Date value1, Date value2) {
            addCriterion("establish_date not between", value1, value2, "establishDate");
            return (Criteria) this;
        }

        public Criteria andBusinessStartIsNull() {
            addCriterion("business_start is null");
            return (Criteria) this;
        }

        public Criteria andBusinessStartIsNotNull() {
            addCriterion("business_start is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessStartEqualTo(Date value) {
            addCriterion("business_start =", value, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartNotEqualTo(Date value) {
            addCriterion("business_start <>", value, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartGreaterThan(Date value) {
            addCriterion("business_start >", value, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartGreaterThanOrEqualTo(Date value) {
            addCriterion("business_start >=", value, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartLessThan(Date value) {
            addCriterion("business_start <", value, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartLessThanOrEqualTo(Date value) {
            addCriterion("business_start <=", value, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartIn(List<Date> values) {
            addCriterion("business_start in", values, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartNotIn(List<Date> values) {
            addCriterion("business_start not in", values, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartBetween(Date value1, Date value2) {
            addCriterion("business_start between", value1, value2, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessStartNotBetween(Date value1, Date value2) {
            addCriterion("business_start not between", value1, value2, "businessStart");
            return (Criteria) this;
        }

        public Criteria andBusinessEndIsNull() {
            addCriterion("business_end is null");
            return (Criteria) this;
        }

        public Criteria andBusinessEndIsNotNull() {
            addCriterion("business_end is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessEndEqualTo(Date value) {
            addCriterion("business_end =", value, "businessEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessEndNotEqualTo(Date value) {
            addCriterion("business_end <>", value, "businessEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessEndGreaterThan(Date value) {
            addCriterion("business_end >", value, "businessEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessEndGreaterThanOrEqualTo(Date value) {
            addCriterion("business_end >=", value, "businessEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessEndLessThan(Date value) {
            addCriterion("business_end <", value, "businessEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessEndLessThanOrEqualTo(Date value) {
            addCriterion("business_end <=", value, "businessEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessEndIn(List<Date> values) {
            addCriterion("business_end in", values, "businessEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessEndNotIn(List<Date> values) {
            addCriterion("business_end not in", values, "businessEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessEndBetween(Date value1, Date value2) {
            addCriterion("business_end between", value1, value2, "businessEnd");
            return (Criteria) this;
        }

        public Criteria andBusinessEndNotBetween(Date value1, Date value2) {
            addCriterion("business_end not between", value1, value2, "businessEnd");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNull() {
            addCriterion("capital is null");
            return (Criteria) this;
        }

        public Criteria andCapitalIsNotNull() {
            addCriterion("capital is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalEqualTo(BigDecimal value) {
            addCriterion("capital =", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotEqualTo(BigDecimal value) {
            addCriterion("capital <>", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThan(BigDecimal value) {
            addCriterion("capital >", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("capital >=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThan(BigDecimal value) {
            addCriterion("capital <", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("capital <=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalIn(List<BigDecimal> values) {
            addCriterion("capital in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotIn(List<BigDecimal> values) {
            addCriterion("capital not in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("capital between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("capital not between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogo1IsNull() {
            addCriterion("logo1 is null");
            return (Criteria) this;
        }

        public Criteria andLogo1IsNotNull() {
            addCriterion("logo1 is not null");
            return (Criteria) this;
        }

        public Criteria andLogo1EqualTo(String value) {
            addCriterion("logo1 =", value, "logo1");
            return (Criteria) this;
        }

        public Criteria andLogo1NotEqualTo(String value) {
            addCriterion("logo1 <>", value, "logo1");
            return (Criteria) this;
        }

        public Criteria andLogo1GreaterThan(String value) {
            addCriterion("logo1 >", value, "logo1");
            return (Criteria) this;
        }

        public Criteria andLogo1GreaterThanOrEqualTo(String value) {
            addCriterion("logo1 >=", value, "logo1");
            return (Criteria) this;
        }

        public Criteria andLogo1LessThan(String value) {
            addCriterion("logo1 <", value, "logo1");
            return (Criteria) this;
        }

        public Criteria andLogo1LessThanOrEqualTo(String value) {
            addCriterion("logo1 <=", value, "logo1");
            return (Criteria) this;
        }

        public Criteria andLogo1Like(String value) {
            addCriterion("logo1 like", value, "logo1");
            return (Criteria) this;
        }

        public Criteria andLogo1NotLike(String value) {
            addCriterion("logo1 not like", value, "logo1");
            return (Criteria) this;
        }

        public Criteria andLogo1In(List<String> values) {
            addCriterion("logo1 in", values, "logo1");
            return (Criteria) this;
        }

        public Criteria andLogo1NotIn(List<String> values) {
            addCriterion("logo1 not in", values, "logo1");
            return (Criteria) this;
        }

        public Criteria andLogo1Between(String value1, String value2) {
            addCriterion("logo1 between", value1, value2, "logo1");
            return (Criteria) this;
        }

        public Criteria andLogo1NotBetween(String value1, String value2) {
            addCriterion("logo1 not between", value1, value2, "logo1");
            return (Criteria) this;
        }

        public Criteria andLogo2IsNull() {
            addCriterion("logo2 is null");
            return (Criteria) this;
        }

        public Criteria andLogo2IsNotNull() {
            addCriterion("logo2 is not null");
            return (Criteria) this;
        }

        public Criteria andLogo2EqualTo(String value) {
            addCriterion("logo2 =", value, "logo2");
            return (Criteria) this;
        }

        public Criteria andLogo2NotEqualTo(String value) {
            addCriterion("logo2 <>", value, "logo2");
            return (Criteria) this;
        }

        public Criteria andLogo2GreaterThan(String value) {
            addCriterion("logo2 >", value, "logo2");
            return (Criteria) this;
        }

        public Criteria andLogo2GreaterThanOrEqualTo(String value) {
            addCriterion("logo2 >=", value, "logo2");
            return (Criteria) this;
        }

        public Criteria andLogo2LessThan(String value) {
            addCriterion("logo2 <", value, "logo2");
            return (Criteria) this;
        }

        public Criteria andLogo2LessThanOrEqualTo(String value) {
            addCriterion("logo2 <=", value, "logo2");
            return (Criteria) this;
        }

        public Criteria andLogo2Like(String value) {
            addCriterion("logo2 like", value, "logo2");
            return (Criteria) this;
        }

        public Criteria andLogo2NotLike(String value) {
            addCriterion("logo2 not like", value, "logo2");
            return (Criteria) this;
        }

        public Criteria andLogo2In(List<String> values) {
            addCriterion("logo2 in", values, "logo2");
            return (Criteria) this;
        }

        public Criteria andLogo2NotIn(List<String> values) {
            addCriterion("logo2 not in", values, "logo2");
            return (Criteria) this;
        }

        public Criteria andLogo2Between(String value1, String value2) {
            addCriterion("logo2 between", value1, value2, "logo2");
            return (Criteria) this;
        }

        public Criteria andLogo2NotBetween(String value1, String value2) {
            addCriterion("logo2 not between", value1, value2, "logo2");
            return (Criteria) this;
        }

        public Criteria andSubpagePhoneIsNull() {
            addCriterion("subpage_phone is null");
            return (Criteria) this;
        }

        public Criteria andSubpagePhoneIsNotNull() {
            addCriterion("subpage_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSubpagePhoneEqualTo(String value) {
            addCriterion("subpage_phone =", value, "subpagePhone");
            return (Criteria) this;
        }

        public Criteria andSubpagePhoneNotEqualTo(String value) {
            addCriterion("subpage_phone <>", value, "subpagePhone");
            return (Criteria) this;
        }

        public Criteria andSubpagePhoneGreaterThan(String value) {
            addCriterion("subpage_phone >", value, "subpagePhone");
            return (Criteria) this;
        }

        public Criteria andSubpagePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("subpage_phone >=", value, "subpagePhone");
            return (Criteria) this;
        }

        public Criteria andSubpagePhoneLessThan(String value) {
            addCriterion("subpage_phone <", value, "subpagePhone");
            return (Criteria) this;
        }

        public Criteria andSubpagePhoneLessThanOrEqualTo(String value) {
            addCriterion("subpage_phone <=", value, "subpagePhone");
            return (Criteria) this;
        }

        public Criteria andSubpagePhoneLike(String value) {
            addCriterion("subpage_phone like", value, "subpagePhone");
            return (Criteria) this;
        }

        public Criteria andSubpagePhoneNotLike(String value) {
            addCriterion("subpage_phone not like", value, "subpagePhone");
            return (Criteria) this;
        }

        public Criteria andSubpagePhoneIn(List<String> values) {
            addCriterion("subpage_phone in", values, "subpagePhone");
            return (Criteria) this;
        }

        public Criteria andSubpagePhoneNotIn(List<String> values) {
            addCriterion("subpage_phone not in", values, "subpagePhone");
            return (Criteria) this;
        }

        public Criteria andSubpagePhoneBetween(String value1, String value2) {
            addCriterion("subpage_phone between", value1, value2, "subpagePhone");
            return (Criteria) this;
        }

        public Criteria andSubpagePhoneNotBetween(String value1, String value2) {
            addCriterion("subpage_phone not between", value1, value2, "subpagePhone");
            return (Criteria) this;
        }

        public Criteria andSubpageAddressIsNull() {
            addCriterion("subpage_address is null");
            return (Criteria) this;
        }

        public Criteria andSubpageAddressIsNotNull() {
            addCriterion("subpage_address is not null");
            return (Criteria) this;
        }

        public Criteria andSubpageAddressEqualTo(String value) {
            addCriterion("subpage_address =", value, "subpageAddress");
            return (Criteria) this;
        }

        public Criteria andSubpageAddressNotEqualTo(String value) {
            addCriterion("subpage_address <>", value, "subpageAddress");
            return (Criteria) this;
        }

        public Criteria andSubpageAddressGreaterThan(String value) {
            addCriterion("subpage_address >", value, "subpageAddress");
            return (Criteria) this;
        }

        public Criteria andSubpageAddressGreaterThanOrEqualTo(String value) {
            addCriterion("subpage_address >=", value, "subpageAddress");
            return (Criteria) this;
        }

        public Criteria andSubpageAddressLessThan(String value) {
            addCriterion("subpage_address <", value, "subpageAddress");
            return (Criteria) this;
        }

        public Criteria andSubpageAddressLessThanOrEqualTo(String value) {
            addCriterion("subpage_address <=", value, "subpageAddress");
            return (Criteria) this;
        }

        public Criteria andSubpageAddressLike(String value) {
            addCriterion("subpage_address like", value, "subpageAddress");
            return (Criteria) this;
        }

        public Criteria andSubpageAddressNotLike(String value) {
            addCriterion("subpage_address not like", value, "subpageAddress");
            return (Criteria) this;
        }

        public Criteria andSubpageAddressIn(List<String> values) {
            addCriterion("subpage_address in", values, "subpageAddress");
            return (Criteria) this;
        }

        public Criteria andSubpageAddressNotIn(List<String> values) {
            addCriterion("subpage_address not in", values, "subpageAddress");
            return (Criteria) this;
        }

        public Criteria andSubpageAddressBetween(String value1, String value2) {
            addCriterion("subpage_address between", value1, value2, "subpageAddress");
            return (Criteria) this;
        }

        public Criteria andSubpageAddressNotBetween(String value1, String value2) {
            addCriterion("subpage_address not between", value1, value2, "subpageAddress");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andOrderListIsNull() {
            addCriterion("order_list is null");
            return (Criteria) this;
        }

        public Criteria andOrderListIsNotNull() {
            addCriterion("order_list is not null");
            return (Criteria) this;
        }

        public Criteria andOrderListEqualTo(Integer value) {
            addCriterion("order_list =", value, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListNotEqualTo(Integer value) {
            addCriterion("order_list <>", value, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListGreaterThan(Integer value) {
            addCriterion("order_list >", value, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_list >=", value, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListLessThan(Integer value) {
            addCriterion("order_list <", value, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListLessThanOrEqualTo(Integer value) {
            addCriterion("order_list <=", value, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListIn(List<Integer> values) {
            addCriterion("order_list in", values, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListNotIn(List<Integer> values) {
            addCriterion("order_list not in", values, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListBetween(Integer value1, Integer value2) {
            addCriterion("order_list between", value1, value2, "orderList");
            return (Criteria) this;
        }

        public Criteria andOrderListNotBetween(Integer value1, Integer value2) {
            addCriterion("order_list not between", value1, value2, "orderList");
            return (Criteria) this;
        }

        public Criteria andAgencydbidIsNull() {
            addCriterion("agencydbid is null");
            return (Criteria) this;
        }

        public Criteria andAgencydbidIsNotNull() {
            addCriterion("agencydbid is not null");
            return (Criteria) this;
        }

        public Criteria andAgencydbidEqualTo(Long value) {
            addCriterion("agencydbid =", value, "agencydbid");
            return (Criteria) this;
        }

        public Criteria andAgencydbidNotEqualTo(Long value) {
            addCriterion("agencydbid <>", value, "agencydbid");
            return (Criteria) this;
        }

        public Criteria andAgencydbidGreaterThan(Long value) {
            addCriterion("agencydbid >", value, "agencydbid");
            return (Criteria) this;
        }

        public Criteria andAgencydbidGreaterThanOrEqualTo(Long value) {
            addCriterion("agencydbid >=", value, "agencydbid");
            return (Criteria) this;
        }

        public Criteria andAgencydbidLessThan(Long value) {
            addCriterion("agencydbid <", value, "agencydbid");
            return (Criteria) this;
        }

        public Criteria andAgencydbidLessThanOrEqualTo(Long value) {
            addCriterion("agencydbid <=", value, "agencydbid");
            return (Criteria) this;
        }

        public Criteria andAgencydbidIn(List<Long> values) {
            addCriterion("agencydbid in", values, "agencydbid");
            return (Criteria) this;
        }

        public Criteria andAgencydbidNotIn(List<Long> values) {
            addCriterion("agencydbid not in", values, "agencydbid");
            return (Criteria) this;
        }

        public Criteria andAgencydbidBetween(Long value1, Long value2) {
            addCriterion("agencydbid between", value1, value2, "agencydbid");
            return (Criteria) this;
        }

        public Criteria andAgencydbidNotBetween(Long value1, Long value2) {
            addCriterion("agencydbid not between", value1, value2, "agencydbid");
            return (Criteria) this;
        }

        public Criteria andTasteRuleIsNull() {
            addCriterion("taste_rule is null");
            return (Criteria) this;
        }

        public Criteria andTasteRuleIsNotNull() {
            addCriterion("taste_rule is not null");
            return (Criteria) this;
        }

        public Criteria andTasteRuleEqualTo(Integer value) {
            addCriterion("taste_rule =", value, "tasteRule");
            return (Criteria) this;
        }

        public Criteria andTasteRuleNotEqualTo(Integer value) {
            addCriterion("taste_rule <>", value, "tasteRule");
            return (Criteria) this;
        }

        public Criteria andTasteRuleGreaterThan(Integer value) {
            addCriterion("taste_rule >", value, "tasteRule");
            return (Criteria) this;
        }

        public Criteria andTasteRuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("taste_rule >=", value, "tasteRule");
            return (Criteria) this;
        }

        public Criteria andTasteRuleLessThan(Integer value) {
            addCriterion("taste_rule <", value, "tasteRule");
            return (Criteria) this;
        }

        public Criteria andTasteRuleLessThanOrEqualTo(Integer value) {
            addCriterion("taste_rule <=", value, "tasteRule");
            return (Criteria) this;
        }

        public Criteria andTasteRuleIn(List<Integer> values) {
            addCriterion("taste_rule in", values, "tasteRule");
            return (Criteria) this;
        }

        public Criteria andTasteRuleNotIn(List<Integer> values) {
            addCriterion("taste_rule not in", values, "tasteRule");
            return (Criteria) this;
        }

        public Criteria andTasteRuleBetween(Integer value1, Integer value2) {
            addCriterion("taste_rule between", value1, value2, "tasteRule");
            return (Criteria) this;
        }

        public Criteria andTasteRuleNotBetween(Integer value1, Integer value2) {
            addCriterion("taste_rule not between", value1, value2, "tasteRule");
            return (Criteria) this;
        }

        public Criteria andFlowRuleIsNull() {
            addCriterion("flow_rule is null");
            return (Criteria) this;
        }

        public Criteria andFlowRuleIsNotNull() {
            addCriterion("flow_rule is not null");
            return (Criteria) this;
        }

        public Criteria andFlowRuleEqualTo(Integer value) {
            addCriterion("flow_rule =", value, "flowRule");
            return (Criteria) this;
        }

        public Criteria andFlowRuleNotEqualTo(Integer value) {
            addCriterion("flow_rule <>", value, "flowRule");
            return (Criteria) this;
        }

        public Criteria andFlowRuleGreaterThan(Integer value) {
            addCriterion("flow_rule >", value, "flowRule");
            return (Criteria) this;
        }

        public Criteria andFlowRuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow_rule >=", value, "flowRule");
            return (Criteria) this;
        }

        public Criteria andFlowRuleLessThan(Integer value) {
            addCriterion("flow_rule <", value, "flowRule");
            return (Criteria) this;
        }

        public Criteria andFlowRuleLessThanOrEqualTo(Integer value) {
            addCriterion("flow_rule <=", value, "flowRule");
            return (Criteria) this;
        }

        public Criteria andFlowRuleIn(List<Integer> values) {
            addCriterion("flow_rule in", values, "flowRule");
            return (Criteria) this;
        }

        public Criteria andFlowRuleNotIn(List<Integer> values) {
            addCriterion("flow_rule not in", values, "flowRule");
            return (Criteria) this;
        }

        public Criteria andFlowRuleBetween(Integer value1, Integer value2) {
            addCriterion("flow_rule between", value1, value2, "flowRule");
            return (Criteria) this;
        }

        public Criteria andFlowRuleNotBetween(Integer value1, Integer value2) {
            addCriterion("flow_rule not between", value1, value2, "flowRule");
            return (Criteria) this;
        }

        public Criteria andCreditRuleIsNull() {
            addCriterion("credit_rule is null");
            return (Criteria) this;
        }

        public Criteria andCreditRuleIsNotNull() {
            addCriterion("credit_rule is not null");
            return (Criteria) this;
        }

        public Criteria andCreditRuleEqualTo(Integer value) {
            addCriterion("credit_rule =", value, "creditRule");
            return (Criteria) this;
        }

        public Criteria andCreditRuleNotEqualTo(Integer value) {
            addCriterion("credit_rule <>", value, "creditRule");
            return (Criteria) this;
        }

        public Criteria andCreditRuleGreaterThan(Integer value) {
            addCriterion("credit_rule >", value, "creditRule");
            return (Criteria) this;
        }

        public Criteria andCreditRuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("credit_rule >=", value, "creditRule");
            return (Criteria) this;
        }

        public Criteria andCreditRuleLessThan(Integer value) {
            addCriterion("credit_rule <", value, "creditRule");
            return (Criteria) this;
        }

        public Criteria andCreditRuleLessThanOrEqualTo(Integer value) {
            addCriterion("credit_rule <=", value, "creditRule");
            return (Criteria) this;
        }

        public Criteria andCreditRuleIn(List<Integer> values) {
            addCriterion("credit_rule in", values, "creditRule");
            return (Criteria) this;
        }

        public Criteria andCreditRuleNotIn(List<Integer> values) {
            addCriterion("credit_rule not in", values, "creditRule");
            return (Criteria) this;
        }

        public Criteria andCreditRuleBetween(Integer value1, Integer value2) {
            addCriterion("credit_rule between", value1, value2, "creditRule");
            return (Criteria) this;
        }

        public Criteria andCreditRuleNotBetween(Integer value1, Integer value2) {
            addCriterion("credit_rule not between", value1, value2, "creditRule");
            return (Criteria) this;
        }

        public Criteria andPledgeRuleIsNull() {
            addCriterion("pledge_rule is null");
            return (Criteria) this;
        }

        public Criteria andPledgeRuleIsNotNull() {
            addCriterion("pledge_rule is not null");
            return (Criteria) this;
        }

        public Criteria andPledgeRuleEqualTo(Integer value) {
            addCriterion("pledge_rule =", value, "pledgeRule");
            return (Criteria) this;
        }

        public Criteria andPledgeRuleNotEqualTo(Integer value) {
            addCriterion("pledge_rule <>", value, "pledgeRule");
            return (Criteria) this;
        }

        public Criteria andPledgeRuleGreaterThan(Integer value) {
            addCriterion("pledge_rule >", value, "pledgeRule");
            return (Criteria) this;
        }

        public Criteria andPledgeRuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("pledge_rule >=", value, "pledgeRule");
            return (Criteria) this;
        }

        public Criteria andPledgeRuleLessThan(Integer value) {
            addCriterion("pledge_rule <", value, "pledgeRule");
            return (Criteria) this;
        }

        public Criteria andPledgeRuleLessThanOrEqualTo(Integer value) {
            addCriterion("pledge_rule <=", value, "pledgeRule");
            return (Criteria) this;
        }

        public Criteria andPledgeRuleIn(List<Integer> values) {
            addCriterion("pledge_rule in", values, "pledgeRule");
            return (Criteria) this;
        }

        public Criteria andPledgeRuleNotIn(List<Integer> values) {
            addCriterion("pledge_rule not in", values, "pledgeRule");
            return (Criteria) this;
        }

        public Criteria andPledgeRuleBetween(Integer value1, Integer value2) {
            addCriterion("pledge_rule between", value1, value2, "pledgeRule");
            return (Criteria) this;
        }

        public Criteria andPledgeRuleNotBetween(Integer value1, Integer value2) {
            addCriterion("pledge_rule not between", value1, value2, "pledgeRule");
            return (Criteria) this;
        }

        public Criteria andSignImageIsNull() {
            addCriterion("sign_image is null");
            return (Criteria) this;
        }

        public Criteria andSignImageIsNotNull() {
            addCriterion("sign_image is not null");
            return (Criteria) this;
        }

        public Criteria andSignImageEqualTo(String value) {
            addCriterion("sign_image =", value, "signImage");
            return (Criteria) this;
        }

        public Criteria andSignImageNotEqualTo(String value) {
            addCriterion("sign_image <>", value, "signImage");
            return (Criteria) this;
        }

        public Criteria andSignImageGreaterThan(String value) {
            addCriterion("sign_image >", value, "signImage");
            return (Criteria) this;
        }

        public Criteria andSignImageGreaterThanOrEqualTo(String value) {
            addCriterion("sign_image >=", value, "signImage");
            return (Criteria) this;
        }

        public Criteria andSignImageLessThan(String value) {
            addCriterion("sign_image <", value, "signImage");
            return (Criteria) this;
        }

        public Criteria andSignImageLessThanOrEqualTo(String value) {
            addCriterion("sign_image <=", value, "signImage");
            return (Criteria) this;
        }

        public Criteria andSignImageLike(String value) {
            addCriterion("sign_image like", value, "signImage");
            return (Criteria) this;
        }

        public Criteria andSignImageNotLike(String value) {
            addCriterion("sign_image not like", value, "signImage");
            return (Criteria) this;
        }

        public Criteria andSignImageIn(List<String> values) {
            addCriterion("sign_image in", values, "signImage");
            return (Criteria) this;
        }

        public Criteria andSignImageNotIn(List<String> values) {
            addCriterion("sign_image not in", values, "signImage");
            return (Criteria) this;
        }

        public Criteria andSignImageBetween(String value1, String value2) {
            addCriterion("sign_image between", value1, value2, "signImage");
            return (Criteria) this;
        }

        public Criteria andSignImageNotBetween(String value1, String value2) {
            addCriterion("sign_image not between", value1, value2, "signImage");
            return (Criteria) this;
        }

        public Criteria andTasteMoneyIsNull() {
            addCriterion("taste_money is null");
            return (Criteria) this;
        }

        public Criteria andTasteMoneyIsNotNull() {
            addCriterion("taste_money is not null");
            return (Criteria) this;
        }

        public Criteria andTasteMoneyEqualTo(BigDecimal value) {
            addCriterion("taste_money =", value, "tasteMoney");
            return (Criteria) this;
        }

        public Criteria andTasteMoneyNotEqualTo(BigDecimal value) {
            addCriterion("taste_money <>", value, "tasteMoney");
            return (Criteria) this;
        }

        public Criteria andTasteMoneyGreaterThan(BigDecimal value) {
            addCriterion("taste_money >", value, "tasteMoney");
            return (Criteria) this;
        }

        public Criteria andTasteMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("taste_money >=", value, "tasteMoney");
            return (Criteria) this;
        }

        public Criteria andTasteMoneyLessThan(BigDecimal value) {
            addCriterion("taste_money <", value, "tasteMoney");
            return (Criteria) this;
        }

        public Criteria andTasteMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("taste_money <=", value, "tasteMoney");
            return (Criteria) this;
        }

        public Criteria andTasteMoneyIn(List<BigDecimal> values) {
            addCriterion("taste_money in", values, "tasteMoney");
            return (Criteria) this;
        }

        public Criteria andTasteMoneyNotIn(List<BigDecimal> values) {
            addCriterion("taste_money not in", values, "tasteMoney");
            return (Criteria) this;
        }

        public Criteria andTasteMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taste_money between", value1, value2, "tasteMoney");
            return (Criteria) this;
        }

        public Criteria andTasteMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("taste_money not between", value1, value2, "tasteMoney");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}