package com.ysd.user.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AgencyReadyCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AgencyReadyCriteria() {
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

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaStoreIsNull() {
            addCriterion("area_store is null");
            return (Criteria) this;
        }

        public Criteria andAreaStoreIsNotNull() {
            addCriterion("area_store is not null");
            return (Criteria) this;
        }

        public Criteria andAreaStoreEqualTo(String value) {
            addCriterion("area_store =", value, "areaStore");
            return (Criteria) this;
        }

        public Criteria andAreaStoreNotEqualTo(String value) {
            addCriterion("area_store <>", value, "areaStore");
            return (Criteria) this;
        }

        public Criteria andAreaStoreGreaterThan(String value) {
            addCriterion("area_store >", value, "areaStore");
            return (Criteria) this;
        }

        public Criteria andAreaStoreGreaterThanOrEqualTo(String value) {
            addCriterion("area_store >=", value, "areaStore");
            return (Criteria) this;
        }

        public Criteria andAreaStoreLessThan(String value) {
            addCriterion("area_store <", value, "areaStore");
            return (Criteria) this;
        }

        public Criteria andAreaStoreLessThanOrEqualTo(String value) {
            addCriterion("area_store <=", value, "areaStore");
            return (Criteria) this;
        }

        public Criteria andAreaStoreLike(String value) {
            addCriterion("area_store like", value, "areaStore");
            return (Criteria) this;
        }

        public Criteria andAreaStoreNotLike(String value) {
            addCriterion("area_store not like", value, "areaStore");
            return (Criteria) this;
        }

        public Criteria andAreaStoreIn(List<String> values) {
            addCriterion("area_store in", values, "areaStore");
            return (Criteria) this;
        }

        public Criteria andAreaStoreNotIn(List<String> values) {
            addCriterion("area_store not in", values, "areaStore");
            return (Criteria) this;
        }

        public Criteria andAreaStoreBetween(String value1, String value2) {
            addCriterion("area_store between", value1, value2, "areaStore");
            return (Criteria) this;
        }

        public Criteria andAreaStoreNotBetween(String value1, String value2) {
            addCriterion("area_store not between", value1, value2, "areaStore");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNull() {
            addCriterion("contact_address is null");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNotNull() {
            addCriterion("contact_address is not null");
            return (Criteria) this;
        }

        public Criteria andContactAddressEqualTo(String value) {
            addCriterion("contact_address =", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotEqualTo(String value) {
            addCriterion("contact_address <>", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThan(String value) {
            addCriterion("contact_address >", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThanOrEqualTo(String value) {
            addCriterion("contact_address >=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThan(String value) {
            addCriterion("contact_address <", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThanOrEqualTo(String value) {
            addCriterion("contact_address <=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLike(String value) {
            addCriterion("contact_address like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotLike(String value) {
            addCriterion("contact_address not like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressIn(List<String> values) {
            addCriterion("contact_address in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotIn(List<String> values) {
            addCriterion("contact_address not in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressBetween(String value1, String value2) {
            addCriterion("contact_address between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotBetween(String value1, String value2) {
            addCriterion("contact_address not between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andUemailIsNull() {
            addCriterion("uemail is null");
            return (Criteria) this;
        }

        public Criteria andUemailIsNotNull() {
            addCriterion("uemail is not null");
            return (Criteria) this;
        }

        public Criteria andUemailEqualTo(String value) {
            addCriterion("uemail =", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotEqualTo(String value) {
            addCriterion("uemail <>", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThan(String value) {
            addCriterion("uemail >", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThanOrEqualTo(String value) {
            addCriterion("uemail >=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThan(String value) {
            addCriterion("uemail <", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThanOrEqualTo(String value) {
            addCriterion("uemail <=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLike(String value) {
            addCriterion("uemail like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotLike(String value) {
            addCriterion("uemail not like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailIn(List<String> values) {
            addCriterion("uemail in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotIn(List<String> values) {
            addCriterion("uemail not in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailBetween(String value1, String value2) {
            addCriterion("uemail between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotBetween(String value1, String value2) {
            addCriterion("uemail not between", value1, value2, "uemail");
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

        public Criteria andMainBusinessIsNull() {
            addCriterion("main_business is null");
            return (Criteria) this;
        }

        public Criteria andMainBusinessIsNotNull() {
            addCriterion("main_business is not null");
            return (Criteria) this;
        }

        public Criteria andMainBusinessEqualTo(String value) {
            addCriterion("main_business =", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotEqualTo(String value) {
            addCriterion("main_business <>", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessGreaterThan(String value) {
            addCriterion("main_business >", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("main_business >=", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessLessThan(String value) {
            addCriterion("main_business <", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessLessThanOrEqualTo(String value) {
            addCriterion("main_business <=", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessLike(String value) {
            addCriterion("main_business like", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotLike(String value) {
            addCriterion("main_business not like", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessIn(List<String> values) {
            addCriterion("main_business in", values, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotIn(List<String> values) {
            addCriterion("main_business not in", values, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessBetween(String value1, String value2) {
            addCriterion("main_business between", value1, value2, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotBetween(String value1, String value2) {
            addCriterion("main_business not between", value1, value2, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andUrealnameIsNull() {
            addCriterion("urealname is null");
            return (Criteria) this;
        }

        public Criteria andUrealnameIsNotNull() {
            addCriterion("urealname is not null");
            return (Criteria) this;
        }

        public Criteria andUrealnameEqualTo(String value) {
            addCriterion("urealname =", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameNotEqualTo(String value) {
            addCriterion("urealname <>", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameGreaterThan(String value) {
            addCriterion("urealname >", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameGreaterThanOrEqualTo(String value) {
            addCriterion("urealname >=", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameLessThan(String value) {
            addCriterion("urealname <", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameLessThanOrEqualTo(String value) {
            addCriterion("urealname <=", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameLike(String value) {
            addCriterion("urealname like", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameNotLike(String value) {
            addCriterion("urealname not like", value, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameIn(List<String> values) {
            addCriterion("urealname in", values, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameNotIn(List<String> values) {
            addCriterion("urealname not in", values, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameBetween(String value1, String value2) {
            addCriterion("urealname between", value1, value2, "urealname");
            return (Criteria) this;
        }

        public Criteria andUrealnameNotBetween(String value1, String value2) {
            addCriterion("urealname not between", value1, value2, "urealname");
            return (Criteria) this;
        }

        public Criteria andCardPic1IsNull() {
            addCriterion("card_pic1 is null");
            return (Criteria) this;
        }

        public Criteria andCardPic1IsNotNull() {
            addCriterion("card_pic1 is not null");
            return (Criteria) this;
        }

        public Criteria andCardPic1EqualTo(String value) {
            addCriterion("card_pic1 =", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1NotEqualTo(String value) {
            addCriterion("card_pic1 <>", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1GreaterThan(String value) {
            addCriterion("card_pic1 >", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1GreaterThanOrEqualTo(String value) {
            addCriterion("card_pic1 >=", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1LessThan(String value) {
            addCriterion("card_pic1 <", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1LessThanOrEqualTo(String value) {
            addCriterion("card_pic1 <=", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1Like(String value) {
            addCriterion("card_pic1 like", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1NotLike(String value) {
            addCriterion("card_pic1 not like", value, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1In(List<String> values) {
            addCriterion("card_pic1 in", values, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1NotIn(List<String> values) {
            addCriterion("card_pic1 not in", values, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1Between(String value1, String value2) {
            addCriterion("card_pic1 between", value1, value2, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic1NotBetween(String value1, String value2) {
            addCriterion("card_pic1 not between", value1, value2, "cardPic1");
            return (Criteria) this;
        }

        public Criteria andCardPic2IsNull() {
            addCriterion("card_pic2 is null");
            return (Criteria) this;
        }

        public Criteria andCardPic2IsNotNull() {
            addCriterion("card_pic2 is not null");
            return (Criteria) this;
        }

        public Criteria andCardPic2EqualTo(String value) {
            addCriterion("card_pic2 =", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2NotEqualTo(String value) {
            addCriterion("card_pic2 <>", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2GreaterThan(String value) {
            addCriterion("card_pic2 >", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2GreaterThanOrEqualTo(String value) {
            addCriterion("card_pic2 >=", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2LessThan(String value) {
            addCriterion("card_pic2 <", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2LessThanOrEqualTo(String value) {
            addCriterion("card_pic2 <=", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2Like(String value) {
            addCriterion("card_pic2 like", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2NotLike(String value) {
            addCriterion("card_pic2 not like", value, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2In(List<String> values) {
            addCriterion("card_pic2 in", values, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2NotIn(List<String> values) {
            addCriterion("card_pic2 not in", values, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2Between(String value1, String value2) {
            addCriterion("card_pic2 between", value1, value2, "cardPic2");
            return (Criteria) this;
        }

        public Criteria andCardPic2NotBetween(String value1, String value2) {
            addCriterion("card_pic2 not between", value1, value2, "cardPic2");
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

        public Criteria andScopeIsNull() {
            addCriterion("scope is null");
            return (Criteria) this;
        }

        public Criteria andScopeIsNotNull() {
            addCriterion("scope is not null");
            return (Criteria) this;
        }

        public Criteria andScopeEqualTo(String value) {
            addCriterion("scope =", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotEqualTo(String value) {
            addCriterion("scope <>", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThan(String value) {
            addCriterion("scope >", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeGreaterThanOrEqualTo(String value) {
            addCriterion("scope >=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThan(String value) {
            addCriterion("scope <", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLessThanOrEqualTo(String value) {
            addCriterion("scope <=", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeLike(String value) {
            addCriterion("scope like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotLike(String value) {
            addCriterion("scope not like", value, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeIn(List<String> values) {
            addCriterion("scope in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotIn(List<String> values) {
            addCriterion("scope not in", values, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeBetween(String value1, String value2) {
            addCriterion("scope between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andScopeNotBetween(String value1, String value2) {
            addCriterion("scope not between", value1, value2, "scope");
            return (Criteria) this;
        }

        public Criteria andUusernameIsNull() {
            addCriterion("uusername is null");
            return (Criteria) this;
        }

        public Criteria andUusernameIsNotNull() {
            addCriterion("uusername is not null");
            return (Criteria) this;
        }

        public Criteria andUusernameEqualTo(String value) {
            addCriterion("uusername =", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameNotEqualTo(String value) {
            addCriterion("uusername <>", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameGreaterThan(String value) {
            addCriterion("uusername >", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameGreaterThanOrEqualTo(String value) {
            addCriterion("uusername >=", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameLessThan(String value) {
            addCriterion("uusername <", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameLessThanOrEqualTo(String value) {
            addCriterion("uusername <=", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameLike(String value) {
            addCriterion("uusername like", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameNotLike(String value) {
            addCriterion("uusername not like", value, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameIn(List<String> values) {
            addCriterion("uusername in", values, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameNotIn(List<String> values) {
            addCriterion("uusername not in", values, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameBetween(String value1, String value2) {
            addCriterion("uusername between", value1, value2, "uusername");
            return (Criteria) this;
        }

        public Criteria andUusernameNotBetween(String value1, String value2) {
            addCriterion("uusername not between", value1, value2, "uusername");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNull() {
            addCriterion("upassword is null");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNotNull() {
            addCriterion("upassword is not null");
            return (Criteria) this;
        }

        public Criteria andUpasswordEqualTo(String value) {
            addCriterion("upassword =", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotEqualTo(String value) {
            addCriterion("upassword <>", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThan(String value) {
            addCriterion("upassword >", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("upassword >=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThan(String value) {
            addCriterion("upassword <", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThanOrEqualTo(String value) {
            addCriterion("upassword <=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLike(String value) {
            addCriterion("upassword like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotLike(String value) {
            addCriterion("upassword not like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordIn(List<String> values) {
            addCriterion("upassword in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotIn(List<String> values) {
            addCriterion("upassword not in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordBetween(String value1, String value2) {
            addCriterion("upassword between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotBetween(String value1, String value2) {
            addCriterion("upassword not between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpaypasswordIsNull() {
            addCriterion("upaypassword is null");
            return (Criteria) this;
        }

        public Criteria andUpaypasswordIsNotNull() {
            addCriterion("upaypassword is not null");
            return (Criteria) this;
        }

        public Criteria andUpaypasswordEqualTo(String value) {
            addCriterion("upaypassword =", value, "upaypassword");
            return (Criteria) this;
        }

        public Criteria andUpaypasswordNotEqualTo(String value) {
            addCriterion("upaypassword <>", value, "upaypassword");
            return (Criteria) this;
        }

        public Criteria andUpaypasswordGreaterThan(String value) {
            addCriterion("upaypassword >", value, "upaypassword");
            return (Criteria) this;
        }

        public Criteria andUpaypasswordGreaterThanOrEqualTo(String value) {
            addCriterion("upaypassword >=", value, "upaypassword");
            return (Criteria) this;
        }

        public Criteria andUpaypasswordLessThan(String value) {
            addCriterion("upaypassword <", value, "upaypassword");
            return (Criteria) this;
        }

        public Criteria andUpaypasswordLessThanOrEqualTo(String value) {
            addCriterion("upaypassword <=", value, "upaypassword");
            return (Criteria) this;
        }

        public Criteria andUpaypasswordLike(String value) {
            addCriterion("upaypassword like", value, "upaypassword");
            return (Criteria) this;
        }

        public Criteria andUpaypasswordNotLike(String value) {
            addCriterion("upaypassword not like", value, "upaypassword");
            return (Criteria) this;
        }

        public Criteria andUpaypasswordIn(List<String> values) {
            addCriterion("upaypassword in", values, "upaypassword");
            return (Criteria) this;
        }

        public Criteria andUpaypasswordNotIn(List<String> values) {
            addCriterion("upaypassword not in", values, "upaypassword");
            return (Criteria) this;
        }

        public Criteria andUpaypasswordBetween(String value1, String value2) {
            addCriterion("upaypassword between", value1, value2, "upaypassword");
            return (Criteria) this;
        }

        public Criteria andUpaypasswordNotBetween(String value1, String value2) {
            addCriterion("upaypassword not between", value1, value2, "upaypassword");
            return (Criteria) this;
        }

        public Criteria andUrandomIsNull() {
            addCriterion("urandom is null");
            return (Criteria) this;
        }

        public Criteria andUrandomIsNotNull() {
            addCriterion("urandom is not null");
            return (Criteria) this;
        }

        public Criteria andUrandomEqualTo(String value) {
            addCriterion("urandom =", value, "urandom");
            return (Criteria) this;
        }

        public Criteria andUrandomNotEqualTo(String value) {
            addCriterion("urandom <>", value, "urandom");
            return (Criteria) this;
        }

        public Criteria andUrandomGreaterThan(String value) {
            addCriterion("urandom >", value, "urandom");
            return (Criteria) this;
        }

        public Criteria andUrandomGreaterThanOrEqualTo(String value) {
            addCriterion("urandom >=", value, "urandom");
            return (Criteria) this;
        }

        public Criteria andUrandomLessThan(String value) {
            addCriterion("urandom <", value, "urandom");
            return (Criteria) this;
        }

        public Criteria andUrandomLessThanOrEqualTo(String value) {
            addCriterion("urandom <=", value, "urandom");
            return (Criteria) this;
        }

        public Criteria andUrandomLike(String value) {
            addCriterion("urandom like", value, "urandom");
            return (Criteria) this;
        }

        public Criteria andUrandomNotLike(String value) {
            addCriterion("urandom not like", value, "urandom");
            return (Criteria) this;
        }

        public Criteria andUrandomIn(List<String> values) {
            addCriterion("urandom in", values, "urandom");
            return (Criteria) this;
        }

        public Criteria andUrandomNotIn(List<String> values) {
            addCriterion("urandom not in", values, "urandom");
            return (Criteria) this;
        }

        public Criteria andUrandomBetween(String value1, String value2) {
            addCriterion("urandom between", value1, value2, "urandom");
            return (Criteria) this;
        }

        public Criteria andUrandomNotBetween(String value1, String value2) {
            addCriterion("urandom not between", value1, value2, "urandom");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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