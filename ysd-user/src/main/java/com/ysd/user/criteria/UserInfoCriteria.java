package com.ysd.user.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoCriteria() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPrivateNameIsNull() {
            addCriterion("private_name is null");
            return (Criteria) this;
        }

        public Criteria andPrivateNameIsNotNull() {
            addCriterion("private_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrivateNameEqualTo(String value) {
            addCriterion("private_name =", value, "privateName");
            return (Criteria) this;
        }

        public Criteria andPrivateNameNotEqualTo(String value) {
            addCriterion("private_name <>", value, "privateName");
            return (Criteria) this;
        }

        public Criteria andPrivateNameGreaterThan(String value) {
            addCriterion("private_name >", value, "privateName");
            return (Criteria) this;
        }

        public Criteria andPrivateNameGreaterThanOrEqualTo(String value) {
            addCriterion("private_name >=", value, "privateName");
            return (Criteria) this;
        }

        public Criteria andPrivateNameLessThan(String value) {
            addCriterion("private_name <", value, "privateName");
            return (Criteria) this;
        }

        public Criteria andPrivateNameLessThanOrEqualTo(String value) {
            addCriterion("private_name <=", value, "privateName");
            return (Criteria) this;
        }

        public Criteria andPrivateNameLike(String value) {
            addCriterion("private_name like", value, "privateName");
            return (Criteria) this;
        }

        public Criteria andPrivateNameNotLike(String value) {
            addCriterion("private_name not like", value, "privateName");
            return (Criteria) this;
        }

        public Criteria andPrivateNameIn(List<String> values) {
            addCriterion("private_name in", values, "privateName");
            return (Criteria) this;
        }

        public Criteria andPrivateNameNotIn(List<String> values) {
            addCriterion("private_name not in", values, "privateName");
            return (Criteria) this;
        }

        public Criteria andPrivateNameBetween(String value1, String value2) {
            addCriterion("private_name between", value1, value2, "privateName");
            return (Criteria) this;
        }

        public Criteria andPrivateNameNotBetween(String value1, String value2) {
            addCriterion("private_name not between", value1, value2, "privateName");
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

        public Criteria andRegistrationIsNull() {
            addCriterion("registration is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationIsNotNull() {
            addCriterion("registration is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationEqualTo(String value) {
            addCriterion("registration =", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationNotEqualTo(String value) {
            addCriterion("registration <>", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationGreaterThan(String value) {
            addCriterion("registration >", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationGreaterThanOrEqualTo(String value) {
            addCriterion("registration >=", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationLessThan(String value) {
            addCriterion("registration <", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationLessThanOrEqualTo(String value) {
            addCriterion("registration <=", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationLike(String value) {
            addCriterion("registration like", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationNotLike(String value) {
            addCriterion("registration not like", value, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationIn(List<String> values) {
            addCriterion("registration in", values, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationNotIn(List<String> values) {
            addCriterion("registration not in", values, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationBetween(String value1, String value2) {
            addCriterion("registration between", value1, value2, "registration");
            return (Criteria) this;
        }

        public Criteria andRegistrationNotBetween(String value1, String value2) {
            addCriterion("registration not between", value1, value2, "registration");
            return (Criteria) this;
        }

        public Criteria andPrivatePhoneIsNull() {
            addCriterion("private_phone is null");
            return (Criteria) this;
        }

        public Criteria andPrivatePhoneIsNotNull() {
            addCriterion("private_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPrivatePhoneEqualTo(String value) {
            addCriterion("private_phone =", value, "privatePhone");
            return (Criteria) this;
        }

        public Criteria andPrivatePhoneNotEqualTo(String value) {
            addCriterion("private_phone <>", value, "privatePhone");
            return (Criteria) this;
        }

        public Criteria andPrivatePhoneGreaterThan(String value) {
            addCriterion("private_phone >", value, "privatePhone");
            return (Criteria) this;
        }

        public Criteria andPrivatePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("private_phone >=", value, "privatePhone");
            return (Criteria) this;
        }

        public Criteria andPrivatePhoneLessThan(String value) {
            addCriterion("private_phone <", value, "privatePhone");
            return (Criteria) this;
        }

        public Criteria andPrivatePhoneLessThanOrEqualTo(String value) {
            addCriterion("private_phone <=", value, "privatePhone");
            return (Criteria) this;
        }

        public Criteria andPrivatePhoneLike(String value) {
            addCriterion("private_phone like", value, "privatePhone");
            return (Criteria) this;
        }

        public Criteria andPrivatePhoneNotLike(String value) {
            addCriterion("private_phone not like", value, "privatePhone");
            return (Criteria) this;
        }

        public Criteria andPrivatePhoneIn(List<String> values) {
            addCriterion("private_phone in", values, "privatePhone");
            return (Criteria) this;
        }

        public Criteria andPrivatePhoneNotIn(List<String> values) {
            addCriterion("private_phone not in", values, "privatePhone");
            return (Criteria) this;
        }

        public Criteria andPrivatePhoneBetween(String value1, String value2) {
            addCriterion("private_phone between", value1, value2, "privatePhone");
            return (Criteria) this;
        }

        public Criteria andPrivatePhoneNotBetween(String value1, String value2) {
            addCriterion("private_phone not between", value1, value2, "privatePhone");
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

        public Criteria andRegisteredCapitalIsNull() {
            addCriterion("registered_capital is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIsNotNull() {
            addCriterion("registered_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalEqualTo(String value) {
            addCriterion("registered_capital =", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotEqualTo(String value) {
            addCriterion("registered_capital <>", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThan(String value) {
            addCriterion("registered_capital >", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("registered_capital >=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThan(String value) {
            addCriterion("registered_capital <", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLessThanOrEqualTo(String value) {
            addCriterion("registered_capital <=", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalLike(String value) {
            addCriterion("registered_capital like", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotLike(String value) {
            addCriterion("registered_capital not like", value, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalIn(List<String> values) {
            addCriterion("registered_capital in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotIn(List<String> values) {
            addCriterion("registered_capital not in", values, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalBetween(String value1, String value2) {
            addCriterion("registered_capital between", value1, value2, "registeredCapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredCapitalNotBetween(String value1, String value2) {
            addCriterion("registered_capital not between", value1, value2, "registeredCapital");
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

        public Criteria andOthersIsNull() {
            addCriterion("others is null");
            return (Criteria) this;
        }

        public Criteria andOthersIsNotNull() {
            addCriterion("others is not null");
            return (Criteria) this;
        }

        public Criteria andOthersEqualTo(String value) {
            addCriterion("others =", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotEqualTo(String value) {
            addCriterion("others <>", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThan(String value) {
            addCriterion("others >", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThanOrEqualTo(String value) {
            addCriterion("others >=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThan(String value) {
            addCriterion("others <", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThanOrEqualTo(String value) {
            addCriterion("others <=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLike(String value) {
            addCriterion("others like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotLike(String value) {
            addCriterion("others not like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersIn(List<String> values) {
            addCriterion("others in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotIn(List<String> values) {
            addCriterion("others not in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersBetween(String value1, String value2) {
            addCriterion("others between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotBetween(String value1, String value2) {
            addCriterion("others not between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andAddIpIsNull() {
            addCriterion("add_ip is null");
            return (Criteria) this;
        }

        public Criteria andAddIpIsNotNull() {
            addCriterion("add_ip is not null");
            return (Criteria) this;
        }

        public Criteria andAddIpEqualTo(String value) {
            addCriterion("add_ip =", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpNotEqualTo(String value) {
            addCriterion("add_ip <>", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpGreaterThan(String value) {
            addCriterion("add_ip >", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpGreaterThanOrEqualTo(String value) {
            addCriterion("add_ip >=", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpLessThan(String value) {
            addCriterion("add_ip <", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpLessThanOrEqualTo(String value) {
            addCriterion("add_ip <=", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpLike(String value) {
            addCriterion("add_ip like", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpNotLike(String value) {
            addCriterion("add_ip not like", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpIn(List<String> values) {
            addCriterion("add_ip in", values, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpNotIn(List<String> values) {
            addCriterion("add_ip not in", values, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpBetween(String value1, String value2) {
            addCriterion("add_ip between", value1, value2, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpNotBetween(String value1, String value2) {
            addCriterion("add_ip not between", value1, value2, "addIp");
            return (Criteria) this;
        }

        public Criteria andClsjIsNull() {
            addCriterion("clsj is null");
            return (Criteria) this;
        }

        public Criteria andClsjIsNotNull() {
            addCriterion("clsj is not null");
            return (Criteria) this;
        }

        public Criteria andClsjEqualTo(Date value) {
            addCriterion("clsj =", value, "clsj");
            return (Criteria) this;
        }

        public Criteria andClsjNotEqualTo(Date value) {
            addCriterion("clsj <>", value, "clsj");
            return (Criteria) this;
        }

        public Criteria andClsjGreaterThan(Date value) {
            addCriterion("clsj >", value, "clsj");
            return (Criteria) this;
        }

        public Criteria andClsjGreaterThanOrEqualTo(Date value) {
            addCriterion("clsj >=", value, "clsj");
            return (Criteria) this;
        }

        public Criteria andClsjLessThan(Date value) {
            addCriterion("clsj <", value, "clsj");
            return (Criteria) this;
        }

        public Criteria andClsjLessThanOrEqualTo(Date value) {
            addCriterion("clsj <=", value, "clsj");
            return (Criteria) this;
        }

        public Criteria andClsjIn(List<Date> values) {
            addCriterion("clsj in", values, "clsj");
            return (Criteria) this;
        }

        public Criteria andClsjNotIn(List<Date> values) {
            addCriterion("clsj not in", values, "clsj");
            return (Criteria) this;
        }

        public Criteria andClsjBetween(Date value1, Date value2) {
            addCriterion("clsj between", value1, value2, "clsj");
            return (Criteria) this;
        }

        public Criteria andClsjNotBetween(Date value1, Date value2) {
            addCriterion("clsj not between", value1, value2, "clsj");
            return (Criteria) this;
        }

        public Criteria andYyqxStartIsNull() {
            addCriterion("yyqx_start is null");
            return (Criteria) this;
        }

        public Criteria andYyqxStartIsNotNull() {
            addCriterion("yyqx_start is not null");
            return (Criteria) this;
        }

        public Criteria andYyqxStartEqualTo(Date value) {
            addCriterion("yyqx_start =", value, "yyqxStart");
            return (Criteria) this;
        }

        public Criteria andYyqxStartNotEqualTo(Date value) {
            addCriterion("yyqx_start <>", value, "yyqxStart");
            return (Criteria) this;
        }

        public Criteria andYyqxStartGreaterThan(Date value) {
            addCriterion("yyqx_start >", value, "yyqxStart");
            return (Criteria) this;
        }

        public Criteria andYyqxStartGreaterThanOrEqualTo(Date value) {
            addCriterion("yyqx_start >=", value, "yyqxStart");
            return (Criteria) this;
        }

        public Criteria andYyqxStartLessThan(Date value) {
            addCriterion("yyqx_start <", value, "yyqxStart");
            return (Criteria) this;
        }

        public Criteria andYyqxStartLessThanOrEqualTo(Date value) {
            addCriterion("yyqx_start <=", value, "yyqxStart");
            return (Criteria) this;
        }

        public Criteria andYyqxStartIn(List<Date> values) {
            addCriterion("yyqx_start in", values, "yyqxStart");
            return (Criteria) this;
        }

        public Criteria andYyqxStartNotIn(List<Date> values) {
            addCriterion("yyqx_start not in", values, "yyqxStart");
            return (Criteria) this;
        }

        public Criteria andYyqxStartBetween(Date value1, Date value2) {
            addCriterion("yyqx_start between", value1, value2, "yyqxStart");
            return (Criteria) this;
        }

        public Criteria andYyqxStartNotBetween(Date value1, Date value2) {
            addCriterion("yyqx_start not between", value1, value2, "yyqxStart");
            return (Criteria) this;
        }

        public Criteria andYyqxEndIsNull() {
            addCriterion("yyqx_end is null");
            return (Criteria) this;
        }

        public Criteria andYyqxEndIsNotNull() {
            addCriterion("yyqx_end is not null");
            return (Criteria) this;
        }

        public Criteria andYyqxEndEqualTo(Date value) {
            addCriterion("yyqx_end =", value, "yyqxEnd");
            return (Criteria) this;
        }

        public Criteria andYyqxEndNotEqualTo(Date value) {
            addCriterion("yyqx_end <>", value, "yyqxEnd");
            return (Criteria) this;
        }

        public Criteria andYyqxEndGreaterThan(Date value) {
            addCriterion("yyqx_end >", value, "yyqxEnd");
            return (Criteria) this;
        }

        public Criteria andYyqxEndGreaterThanOrEqualTo(Date value) {
            addCriterion("yyqx_end >=", value, "yyqxEnd");
            return (Criteria) this;
        }

        public Criteria andYyqxEndLessThan(Date value) {
            addCriterion("yyqx_end <", value, "yyqxEnd");
            return (Criteria) this;
        }

        public Criteria andYyqxEndLessThanOrEqualTo(Date value) {
            addCriterion("yyqx_end <=", value, "yyqxEnd");
            return (Criteria) this;
        }

        public Criteria andYyqxEndIn(List<Date> values) {
            addCriterion("yyqx_end in", values, "yyqxEnd");
            return (Criteria) this;
        }

        public Criteria andYyqxEndNotIn(List<Date> values) {
            addCriterion("yyqx_end not in", values, "yyqxEnd");
            return (Criteria) this;
        }

        public Criteria andYyqxEndBetween(Date value1, Date value2) {
            addCriterion("yyqx_end between", value1, value2, "yyqxEnd");
            return (Criteria) this;
        }

        public Criteria andYyqxEndNotBetween(Date value1, Date value2) {
            addCriterion("yyqx_end not between", value1, value2, "yyqxEnd");
            return (Criteria) this;
        }

        public Criteria andMarryIsNull() {
            addCriterion("marry is null");
            return (Criteria) this;
        }

        public Criteria andMarryIsNotNull() {
            addCriterion("marry is not null");
            return (Criteria) this;
        }

        public Criteria andMarryEqualTo(String value) {
            addCriterion("marry =", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotEqualTo(String value) {
            addCriterion("marry <>", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryGreaterThan(String value) {
            addCriterion("marry >", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryGreaterThanOrEqualTo(String value) {
            addCriterion("marry >=", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLessThan(String value) {
            addCriterion("marry <", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLessThanOrEqualTo(String value) {
            addCriterion("marry <=", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryLike(String value) {
            addCriterion("marry like", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotLike(String value) {
            addCriterion("marry not like", value, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryIn(List<String> values) {
            addCriterion("marry in", values, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotIn(List<String> values) {
            addCriterion("marry not in", values, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryBetween(String value1, String value2) {
            addCriterion("marry between", value1, value2, "marry");
            return (Criteria) this;
        }

        public Criteria andMarryNotBetween(String value1, String value2) {
            addCriterion("marry not between", value1, value2, "marry");
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

        public Criteria andCompanyOfficeIsNull() {
            addCriterion("company_office is null");
            return (Criteria) this;
        }

        public Criteria andCompanyOfficeIsNotNull() {
            addCriterion("company_office is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyOfficeEqualTo(String value) {
            addCriterion("company_office =", value, "companyOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyOfficeNotEqualTo(String value) {
            addCriterion("company_office <>", value, "companyOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyOfficeGreaterThan(String value) {
            addCriterion("company_office >", value, "companyOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyOfficeGreaterThanOrEqualTo(String value) {
            addCriterion("company_office >=", value, "companyOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyOfficeLessThan(String value) {
            addCriterion("company_office <", value, "companyOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyOfficeLessThanOrEqualTo(String value) {
            addCriterion("company_office <=", value, "companyOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyOfficeLike(String value) {
            addCriterion("company_office like", value, "companyOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyOfficeNotLike(String value) {
            addCriterion("company_office not like", value, "companyOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyOfficeIn(List<String> values) {
            addCriterion("company_office in", values, "companyOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyOfficeNotIn(List<String> values) {
            addCriterion("company_office not in", values, "companyOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyOfficeBetween(String value1, String value2) {
            addCriterion("company_office between", value1, value2, "companyOffice");
            return (Criteria) this;
        }

        public Criteria andCompanyOfficeNotBetween(String value1, String value2) {
            addCriterion("company_office not between", value1, value2, "companyOffice");
            return (Criteria) this;
        }

        public Criteria andEducationRecordIsNull() {
            addCriterion("education_record is null");
            return (Criteria) this;
        }

        public Criteria andEducationRecordIsNotNull() {
            addCriterion("education_record is not null");
            return (Criteria) this;
        }

        public Criteria andEducationRecordEqualTo(String value) {
            addCriterion("education_record =", value, "educationRecord");
            return (Criteria) this;
        }

        public Criteria andEducationRecordNotEqualTo(String value) {
            addCriterion("education_record <>", value, "educationRecord");
            return (Criteria) this;
        }

        public Criteria andEducationRecordGreaterThan(String value) {
            addCriterion("education_record >", value, "educationRecord");
            return (Criteria) this;
        }

        public Criteria andEducationRecordGreaterThanOrEqualTo(String value) {
            addCriterion("education_record >=", value, "educationRecord");
            return (Criteria) this;
        }

        public Criteria andEducationRecordLessThan(String value) {
            addCriterion("education_record <", value, "educationRecord");
            return (Criteria) this;
        }

        public Criteria andEducationRecordLessThanOrEqualTo(String value) {
            addCriterion("education_record <=", value, "educationRecord");
            return (Criteria) this;
        }

        public Criteria andEducationRecordLike(String value) {
            addCriterion("education_record like", value, "educationRecord");
            return (Criteria) this;
        }

        public Criteria andEducationRecordNotLike(String value) {
            addCriterion("education_record not like", value, "educationRecord");
            return (Criteria) this;
        }

        public Criteria andEducationRecordIn(List<String> values) {
            addCriterion("education_record in", values, "educationRecord");
            return (Criteria) this;
        }

        public Criteria andEducationRecordNotIn(List<String> values) {
            addCriterion("education_record not in", values, "educationRecord");
            return (Criteria) this;
        }

        public Criteria andEducationRecordBetween(String value1, String value2) {
            addCriterion("education_record between", value1, value2, "educationRecord");
            return (Criteria) this;
        }

        public Criteria andEducationRecordNotBetween(String value1, String value2) {
            addCriterion("education_record not between", value1, value2, "educationRecord");
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