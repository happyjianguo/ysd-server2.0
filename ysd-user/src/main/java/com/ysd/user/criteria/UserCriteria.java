package com.ysd.user.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCriteria() {
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

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNull() {
            addCriterion("member_type is null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNotNull() {
            addCriterion("member_type is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeEqualTo(Integer value) {
            addCriterion("member_type =", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotEqualTo(Integer value) {
            addCriterion("member_type <>", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThan(Integer value) {
            addCriterion("member_type >", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_type >=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThan(Integer value) {
            addCriterion("member_type <", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThanOrEqualTo(Integer value) {
            addCriterion("member_type <=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIn(List<Integer> values) {
            addCriterion("member_type in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotIn(List<Integer> values) {
            addCriterion("member_type not in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeBetween(Integer value1, Integer value2) {
            addCriterion("member_type between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("member_type not between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
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

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("card_id like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("card_id not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
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

        public Criteria andCardTypeIsNull() {
            addCriterion("card_type is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("card_type is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(String value) {
            addCriterion("card_type =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(String value) {
            addCriterion("card_type <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(String value) {
            addCriterion("card_type >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("card_type >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(String value) {
            addCriterion("card_type <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(String value) {
            addCriterion("card_type <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLike(String value) {
            addCriterion("card_type like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotLike(String value) {
            addCriterion("card_type not like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<String> values) {
            addCriterion("card_type in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<String> values) {
            addCriterion("card_type not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(String value1, String value2) {
            addCriterion("card_type between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(String value1, String value2) {
            addCriterion("card_type not between", value1, value2, "cardType");
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

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailCertificationKeyIsNull() {
            addCriterion("email_certification_key is null");
            return (Criteria) this;
        }

        public Criteria andEmailCertificationKeyIsNotNull() {
            addCriterion("email_certification_key is not null");
            return (Criteria) this;
        }

        public Criteria andEmailCertificationKeyEqualTo(String value) {
            addCriterion("email_certification_key =", value, "emailCertificationKey");
            return (Criteria) this;
        }

        public Criteria andEmailCertificationKeyNotEqualTo(String value) {
            addCriterion("email_certification_key <>", value, "emailCertificationKey");
            return (Criteria) this;
        }

        public Criteria andEmailCertificationKeyGreaterThan(String value) {
            addCriterion("email_certification_key >", value, "emailCertificationKey");
            return (Criteria) this;
        }

        public Criteria andEmailCertificationKeyGreaterThanOrEqualTo(String value) {
            addCriterion("email_certification_key >=", value, "emailCertificationKey");
            return (Criteria) this;
        }

        public Criteria andEmailCertificationKeyLessThan(String value) {
            addCriterion("email_certification_key <", value, "emailCertificationKey");
            return (Criteria) this;
        }

        public Criteria andEmailCertificationKeyLessThanOrEqualTo(String value) {
            addCriterion("email_certification_key <=", value, "emailCertificationKey");
            return (Criteria) this;
        }

        public Criteria andEmailCertificationKeyLike(String value) {
            addCriterion("email_certification_key like", value, "emailCertificationKey");
            return (Criteria) this;
        }

        public Criteria andEmailCertificationKeyNotLike(String value) {
            addCriterion("email_certification_key not like", value, "emailCertificationKey");
            return (Criteria) this;
        }

        public Criteria andEmailCertificationKeyIn(List<String> values) {
            addCriterion("email_certification_key in", values, "emailCertificationKey");
            return (Criteria) this;
        }

        public Criteria andEmailCertificationKeyNotIn(List<String> values) {
            addCriterion("email_certification_key not in", values, "emailCertificationKey");
            return (Criteria) this;
        }

        public Criteria andEmailCertificationKeyBetween(String value1, String value2) {
            addCriterion("email_certification_key between", value1, value2, "emailCertificationKey");
            return (Criteria) this;
        }

        public Criteria andEmailCertificationKeyNotBetween(String value1, String value2) {
            addCriterion("email_certification_key not between", value1, value2, "emailCertificationKey");
            return (Criteria) this;
        }

        public Criteria andEmailStatusIsNull() {
            addCriterion("email_status is null");
            return (Criteria) this;
        }

        public Criteria andEmailStatusIsNotNull() {
            addCriterion("email_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmailStatusEqualTo(Integer value) {
            addCriterion("email_status =", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotEqualTo(Integer value) {
            addCriterion("email_status <>", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusGreaterThan(Integer value) {
            addCriterion("email_status >", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("email_status >=", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusLessThan(Integer value) {
            addCriterion("email_status <", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusLessThanOrEqualTo(Integer value) {
            addCriterion("email_status <=", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusIn(List<Integer> values) {
            addCriterion("email_status in", values, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotIn(List<Integer> values) {
            addCriterion("email_status not in", values, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusBetween(Integer value1, Integer value2) {
            addCriterion("email_status between", value1, value2, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("email_status not between", value1, value2, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyIsNull() {
            addCriterion("invite_money is null");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyIsNotNull() {
            addCriterion("invite_money is not null");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyEqualTo(BigDecimal value) {
            addCriterion("invite_money =", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyNotEqualTo(BigDecimal value) {
            addCriterion("invite_money <>", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyGreaterThan(BigDecimal value) {
            addCriterion("invite_money >", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("invite_money >=", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyLessThan(BigDecimal value) {
            addCriterion("invite_money <", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("invite_money <=", value, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyIn(List<BigDecimal> values) {
            addCriterion("invite_money in", values, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyNotIn(List<BigDecimal> values) {
            addCriterion("invite_money not in", values, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invite_money between", value1, value2, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("invite_money not between", value1, value2, "inviteMoney");
            return (Criteria) this;
        }

        public Criteria andInviteUseridIsNull() {
            addCriterion("invite_userid is null");
            return (Criteria) this;
        }

        public Criteria andInviteUseridIsNotNull() {
            addCriterion("invite_userid is not null");
            return (Criteria) this;
        }

        public Criteria andInviteUseridEqualTo(Integer value) {
            addCriterion("invite_userid =", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridNotEqualTo(Integer value) {
            addCriterion("invite_userid <>", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridGreaterThan(Integer value) {
            addCriterion("invite_userid >", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("invite_userid >=", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridLessThan(Integer value) {
            addCriterion("invite_userid <", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridLessThanOrEqualTo(Integer value) {
            addCriterion("invite_userid <=", value, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridIn(List<Integer> values) {
            addCriterion("invite_userid in", values, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridNotIn(List<Integer> values) {
            addCriterion("invite_userid not in", values, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridBetween(Integer value1, Integer value2) {
            addCriterion("invite_userid between", value1, value2, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andInviteUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("invite_userid not between", value1, value2, "inviteUserid");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNull() {
            addCriterion("is_enabled is null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIsNotNull() {
            addCriterion("is_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnabledEqualTo(Boolean value) {
            addCriterion("is_enabled =", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotEqualTo(Boolean value) {
            addCriterion("is_enabled <>", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThan(Boolean value) {
            addCriterion("is_enabled >", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_enabled >=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThan(Boolean value) {
            addCriterion("is_enabled <", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledLessThanOrEqualTo(Boolean value) {
            addCriterion("is_enabled <=", value, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledIn(List<Boolean> values) {
            addCriterion("is_enabled in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotIn(List<Boolean> values) {
            addCriterion("is_enabled not in", values, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledBetween(Boolean value1, Boolean value2) {
            addCriterion("is_enabled between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsEnabledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_enabled not between", value1, value2, "isEnabled");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNull() {
            addCriterion("is_lock is null");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNotNull() {
            addCriterion("is_lock is not null");
            return (Criteria) this;
        }

        public Criteria andIsLockEqualTo(Boolean value) {
            addCriterion("is_lock =", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotEqualTo(Boolean value) {
            addCriterion("is_lock <>", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThan(Boolean value) {
            addCriterion("is_lock >", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_lock >=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThan(Boolean value) {
            addCriterion("is_lock <", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThanOrEqualTo(Boolean value) {
            addCriterion("is_lock <=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockIn(List<Boolean> values) {
            addCriterion("is_lock in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotIn(List<Boolean> values) {
            addCriterion("is_lock not in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockBetween(Boolean value1, Boolean value2) {
            addCriterion("is_lock between", value1, value2, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_lock not between", value1, value2, "isLock");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountIsNull() {
            addCriterion("login_failure_count is null");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountIsNotNull() {
            addCriterion("login_failure_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountEqualTo(Integer value) {
            addCriterion("login_failure_count =", value, "loginFailureCount");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountNotEqualTo(Integer value) {
            addCriterion("login_failure_count <>", value, "loginFailureCount");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountGreaterThan(Integer value) {
            addCriterion("login_failure_count >", value, "loginFailureCount");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_failure_count >=", value, "loginFailureCount");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountLessThan(Integer value) {
            addCriterion("login_failure_count <", value, "loginFailureCount");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountLessThanOrEqualTo(Integer value) {
            addCriterion("login_failure_count <=", value, "loginFailureCount");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountIn(List<Integer> values) {
            addCriterion("login_failure_count in", values, "loginFailureCount");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountNotIn(List<Integer> values) {
            addCriterion("login_failure_count not in", values, "loginFailureCount");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountBetween(Integer value1, Integer value2) {
            addCriterion("login_failure_count between", value1, value2, "loginFailureCount");
            return (Criteria) this;
        }

        public Criteria andLoginFailureCountNotBetween(Integer value1, Integer value2) {
            addCriterion("login_failure_count not between", value1, value2, "loginFailureCount");
            return (Criteria) this;
        }

        public Criteria andLockedDateIsNull() {
            addCriterion("locked_date is null");
            return (Criteria) this;
        }

        public Criteria andLockedDateIsNotNull() {
            addCriterion("locked_date is not null");
            return (Criteria) this;
        }

        public Criteria andLockedDateEqualTo(Date value) {
            addCriterion("locked_date =", value, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateNotEqualTo(Date value) {
            addCriterion("locked_date <>", value, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateGreaterThan(Date value) {
            addCriterion("locked_date >", value, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("locked_date >=", value, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateLessThan(Date value) {
            addCriterion("locked_date <", value, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateLessThanOrEqualTo(Date value) {
            addCriterion("locked_date <=", value, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateIn(List<Date> values) {
            addCriterion("locked_date in", values, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateNotIn(List<Date> values) {
            addCriterion("locked_date not in", values, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateBetween(Date value1, Date value2) {
            addCriterion("locked_date between", value1, value2, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLockedDateNotBetween(Date value1, Date value2) {
            addCriterion("locked_date not between", value1, value2, "lockedDate");
            return (Criteria) this;
        }

        public Criteria andLastIpIsNull() {
            addCriterion("last_ip is null");
            return (Criteria) this;
        }

        public Criteria andLastIpIsNotNull() {
            addCriterion("last_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLastIpEqualTo(String value) {
            addCriterion("last_ip =", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotEqualTo(String value) {
            addCriterion("last_ip <>", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpGreaterThan(String value) {
            addCriterion("last_ip >", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpGreaterThanOrEqualTo(String value) {
            addCriterion("last_ip >=", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLessThan(String value) {
            addCriterion("last_ip <", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLessThanOrEqualTo(String value) {
            addCriterion("last_ip <=", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLike(String value) {
            addCriterion("last_ip like", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotLike(String value) {
            addCriterion("last_ip not like", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpIn(List<String> values) {
            addCriterion("last_ip in", values, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotIn(List<String> values) {
            addCriterion("last_ip not in", values, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpBetween(String value1, String value2) {
            addCriterion("last_ip between", value1, value2, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotBetween(String value1, String value2) {
            addCriterion("last_ip not between", value1, value2, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNull() {
            addCriterion("last_time is null");
            return (Criteria) this;
        }

        public Criteria andLastTimeIsNotNull() {
            addCriterion("last_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastTimeEqualTo(Date value) {
            addCriterion("last_time =", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotEqualTo(Date value) {
            addCriterion("last_time <>", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThan(Date value) {
            addCriterion("last_time >", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_time >=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThan(Date value) {
            addCriterion("last_time <", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_time <=", value, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeIn(List<Date> values) {
            addCriterion("last_time in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotIn(List<Date> values) {
            addCriterion("last_time not in", values, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeBetween(Date value1, Date value2) {
            addCriterion("last_time between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_time not between", value1, value2, "lastTime");
            return (Criteria) this;
        }

        public Criteria andLitpicIsNull() {
            addCriterion("litpic is null");
            return (Criteria) this;
        }

        public Criteria andLitpicIsNotNull() {
            addCriterion("litpic is not null");
            return (Criteria) this;
        }

        public Criteria andLitpicEqualTo(String value) {
            addCriterion("litpic =", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicNotEqualTo(String value) {
            addCriterion("litpic <>", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicGreaterThan(String value) {
            addCriterion("litpic >", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicGreaterThanOrEqualTo(String value) {
            addCriterion("litpic >=", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicLessThan(String value) {
            addCriterion("litpic <", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicLessThanOrEqualTo(String value) {
            addCriterion("litpic <=", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicLike(String value) {
            addCriterion("litpic like", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicNotLike(String value) {
            addCriterion("litpic not like", value, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicIn(List<String> values) {
            addCriterion("litpic in", values, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicNotIn(List<String> values) {
            addCriterion("litpic not in", values, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicBetween(String value1, String value2) {
            addCriterion("litpic between", value1, value2, "litpic");
            return (Criteria) this;
        }

        public Criteria andLitpicNotBetween(String value1, String value2) {
            addCriterion("litpic not between", value1, value2, "litpic");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Integer value) {
            addCriterion("login_time =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Integer value) {
            addCriterion("login_time <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Integer value) {
            addCriterion("login_time >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_time >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Integer value) {
            addCriterion("login_time <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Integer value) {
            addCriterion("login_time <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Integer> values) {
            addCriterion("login_time in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Integer> values) {
            addCriterion("login_time not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Integer value1, Integer value2) {
            addCriterion("login_time between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("login_time not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyIsNull() {
            addCriterion("password_recover_key is null");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyIsNotNull() {
            addCriterion("password_recover_key is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyEqualTo(String value) {
            addCriterion("password_recover_key =", value, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyNotEqualTo(String value) {
            addCriterion("password_recover_key <>", value, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyGreaterThan(String value) {
            addCriterion("password_recover_key >", value, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyGreaterThanOrEqualTo(String value) {
            addCriterion("password_recover_key >=", value, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyLessThan(String value) {
            addCriterion("password_recover_key <", value, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyLessThanOrEqualTo(String value) {
            addCriterion("password_recover_key <=", value, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyLike(String value) {
            addCriterion("password_recover_key like", value, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyNotLike(String value) {
            addCriterion("password_recover_key not like", value, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyIn(List<String> values) {
            addCriterion("password_recover_key in", values, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyNotIn(List<String> values) {
            addCriterion("password_recover_key not in", values, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyBetween(String value1, String value2) {
            addCriterion("password_recover_key between", value1, value2, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPasswordRecoverKeyNotBetween(String value1, String value2) {
            addCriterion("password_recover_key not between", value1, value2, "passwordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIsNull() {
            addCriterion("pay_password is null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIsNotNull() {
            addCriterion("pay_password is not null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordEqualTo(String value) {
            addCriterion("pay_password =", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotEqualTo(String value) {
            addCriterion("pay_password <>", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThan(String value) {
            addCriterion("pay_password >", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("pay_password >=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThan(String value) {
            addCriterion("pay_password <", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThanOrEqualTo(String value) {
            addCriterion("pay_password <=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLike(String value) {
            addCriterion("pay_password like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotLike(String value) {
            addCriterion("pay_password not like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIn(List<String> values) {
            addCriterion("pay_password in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotIn(List<String> values) {
            addCriterion("pay_password not in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordBetween(String value1, String value2) {
            addCriterion("pay_password between", value1, value2, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotBetween(String value1, String value2) {
            addCriterion("pay_password not between", value1, value2, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordRecoverKeyIsNull() {
            addCriterion("pay_password_recover_key is null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordRecoverKeyIsNotNull() {
            addCriterion("pay_password_recover_key is not null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordRecoverKeyEqualTo(String value) {
            addCriterion("pay_password_recover_key =", value, "payPasswordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPayPasswordRecoverKeyNotEqualTo(String value) {
            addCriterion("pay_password_recover_key <>", value, "payPasswordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPayPasswordRecoverKeyGreaterThan(String value) {
            addCriterion("pay_password_recover_key >", value, "payPasswordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPayPasswordRecoverKeyGreaterThanOrEqualTo(String value) {
            addCriterion("pay_password_recover_key >=", value, "payPasswordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPayPasswordRecoverKeyLessThan(String value) {
            addCriterion("pay_password_recover_key <", value, "payPasswordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPayPasswordRecoverKeyLessThanOrEqualTo(String value) {
            addCriterion("pay_password_recover_key <=", value, "payPasswordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPayPasswordRecoverKeyLike(String value) {
            addCriterion("pay_password_recover_key like", value, "payPasswordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPayPasswordRecoverKeyNotLike(String value) {
            addCriterion("pay_password_recover_key not like", value, "payPasswordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPayPasswordRecoverKeyIn(List<String> values) {
            addCriterion("pay_password_recover_key in", values, "payPasswordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPayPasswordRecoverKeyNotIn(List<String> values) {
            addCriterion("pay_password_recover_key not in", values, "payPasswordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPayPasswordRecoverKeyBetween(String value1, String value2) {
            addCriterion("pay_password_recover_key between", value1, value2, "payPasswordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPayPasswordRecoverKeyNotBetween(String value1, String value2) {
            addCriterion("pay_password_recover_key not between", value1, value2, "payPasswordRecoverKey");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusIsNull() {
            addCriterion("phone_status is null");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusIsNotNull() {
            addCriterion("phone_status is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusEqualTo(Integer value) {
            addCriterion("phone_status =", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusNotEqualTo(Integer value) {
            addCriterion("phone_status <>", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusGreaterThan(Integer value) {
            addCriterion("phone_status >", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("phone_status >=", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusLessThan(Integer value) {
            addCriterion("phone_status <", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusLessThanOrEqualTo(Integer value) {
            addCriterion("phone_status <=", value, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusIn(List<Integer> values) {
            addCriterion("phone_status in", values, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusNotIn(List<Integer> values) {
            addCriterion("phone_status not in", values, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusBetween(Integer value1, Integer value2) {
            addCriterion("phone_status between", value1, value2, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andPhoneStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("phone_status not between", value1, value2, "phoneStatus");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealStatusIsNull() {
            addCriterion("real_status is null");
            return (Criteria) this;
        }

        public Criteria andRealStatusIsNotNull() {
            addCriterion("real_status is not null");
            return (Criteria) this;
        }

        public Criteria andRealStatusEqualTo(Integer value) {
            addCriterion("real_status =", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusNotEqualTo(Integer value) {
            addCriterion("real_status <>", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusGreaterThan(Integer value) {
            addCriterion("real_status >", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("real_status >=", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusLessThan(Integer value) {
            addCriterion("real_status <", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusLessThanOrEqualTo(Integer value) {
            addCriterion("real_status <=", value, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusIn(List<Integer> values) {
            addCriterion("real_status in", values, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusNotIn(List<Integer> values) {
            addCriterion("real_status not in", values, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusBetween(Integer value1, Integer value2) {
            addCriterion("real_status between", value1, value2, "realStatus");
            return (Criteria) this;
        }

        public Criteria andRealStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("real_status not between", value1, value2, "realStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusIsNull() {
            addCriterion("scene_status is null");
            return (Criteria) this;
        }

        public Criteria andSceneStatusIsNotNull() {
            addCriterion("scene_status is not null");
            return (Criteria) this;
        }

        public Criteria andSceneStatusEqualTo(Integer value) {
            addCriterion("scene_status =", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusNotEqualTo(Integer value) {
            addCriterion("scene_status <>", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusGreaterThan(Integer value) {
            addCriterion("scene_status >", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("scene_status >=", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusLessThan(Integer value) {
            addCriterion("scene_status <", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusLessThanOrEqualTo(Integer value) {
            addCriterion("scene_status <=", value, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusIn(List<Integer> values) {
            addCriterion("scene_status in", values, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusNotIn(List<Integer> values) {
            addCriterion("scene_status not in", values, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusBetween(Integer value1, Integer value2) {
            addCriterion("scene_status between", value1, value2, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSceneStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("scene_status not between", value1, value2, "sceneStatus");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
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

        public Criteria andRandomNumIsNull() {
            addCriterion("random_num is null");
            return (Criteria) this;
        }

        public Criteria andRandomNumIsNotNull() {
            addCriterion("random_num is not null");
            return (Criteria) this;
        }

        public Criteria andRandomNumEqualTo(String value) {
            addCriterion("random_num =", value, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumNotEqualTo(String value) {
            addCriterion("random_num <>", value, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumGreaterThan(String value) {
            addCriterion("random_num >", value, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumGreaterThanOrEqualTo(String value) {
            addCriterion("random_num >=", value, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumLessThan(String value) {
            addCriterion("random_num <", value, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumLessThanOrEqualTo(String value) {
            addCriterion("random_num <=", value, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumLike(String value) {
            addCriterion("random_num like", value, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumNotLike(String value) {
            addCriterion("random_num not like", value, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumIn(List<String> values) {
            addCriterion("random_num in", values, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumNotIn(List<String> values) {
            addCriterion("random_num not in", values, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumBetween(String value1, String value2) {
            addCriterion("random_num between", value1, value2, "randomNum");
            return (Criteria) this;
        }

        public Criteria andRandomNumNotBetween(String value1, String value2) {
            addCriterion("random_num not between", value1, value2, "randomNum");
            return (Criteria) this;
        }

        public Criteria andAutoTenderStatusIsNull() {
            addCriterion("auto_tender_status is null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderStatusIsNotNull() {
            addCriterion("auto_tender_status is not null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderStatusEqualTo(Integer value) {
            addCriterion("auto_tender_status =", value, "autoTenderStatus");
            return (Criteria) this;
        }

        public Criteria andAutoTenderStatusNotEqualTo(Integer value) {
            addCriterion("auto_tender_status <>", value, "autoTenderStatus");
            return (Criteria) this;
        }

        public Criteria andAutoTenderStatusGreaterThan(Integer value) {
            addCriterion("auto_tender_status >", value, "autoTenderStatus");
            return (Criteria) this;
        }

        public Criteria andAutoTenderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("auto_tender_status >=", value, "autoTenderStatus");
            return (Criteria) this;
        }

        public Criteria andAutoTenderStatusLessThan(Integer value) {
            addCriterion("auto_tender_status <", value, "autoTenderStatus");
            return (Criteria) this;
        }

        public Criteria andAutoTenderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("auto_tender_status <=", value, "autoTenderStatus");
            return (Criteria) this;
        }

        public Criteria andAutoTenderStatusIn(List<Integer> values) {
            addCriterion("auto_tender_status in", values, "autoTenderStatus");
            return (Criteria) this;
        }

        public Criteria andAutoTenderStatusNotIn(List<Integer> values) {
            addCriterion("auto_tender_status not in", values, "autoTenderStatus");
            return (Criteria) this;
        }

        public Criteria andAutoTenderStatusBetween(Integer value1, Integer value2) {
            addCriterion("auto_tender_status between", value1, value2, "autoTenderStatus");
            return (Criteria) this;
        }

        public Criteria andAutoTenderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("auto_tender_status not between", value1, value2, "autoTenderStatus");
            return (Criteria) this;
        }

        public Criteria andAutoTenderDateIsNull() {
            addCriterion("auto_tender_date is null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderDateIsNotNull() {
            addCriterion("auto_tender_date is not null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderDateEqualTo(Date value) {
            addCriterion("auto_tender_date =", value, "autoTenderDate");
            return (Criteria) this;
        }

        public Criteria andAutoTenderDateNotEqualTo(Date value) {
            addCriterion("auto_tender_date <>", value, "autoTenderDate");
            return (Criteria) this;
        }

        public Criteria andAutoTenderDateGreaterThan(Date value) {
            addCriterion("auto_tender_date >", value, "autoTenderDate");
            return (Criteria) this;
        }

        public Criteria andAutoTenderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("auto_tender_date >=", value, "autoTenderDate");
            return (Criteria) this;
        }

        public Criteria andAutoTenderDateLessThan(Date value) {
            addCriterion("auto_tender_date <", value, "autoTenderDate");
            return (Criteria) this;
        }

        public Criteria andAutoTenderDateLessThanOrEqualTo(Date value) {
            addCriterion("auto_tender_date <=", value, "autoTenderDate");
            return (Criteria) this;
        }

        public Criteria andAutoTenderDateIn(List<Date> values) {
            addCriterion("auto_tender_date in", values, "autoTenderDate");
            return (Criteria) this;
        }

        public Criteria andAutoTenderDateNotIn(List<Date> values) {
            addCriterion("auto_tender_date not in", values, "autoTenderDate");
            return (Criteria) this;
        }

        public Criteria andAutoTenderDateBetween(Date value1, Date value2) {
            addCriterion("auto_tender_date between", value1, value2, "autoTenderDate");
            return (Criteria) this;
        }

        public Criteria andAutoTenderDateNotBetween(Date value1, Date value2) {
            addCriterion("auto_tender_date not between", value1, value2, "autoTenderDate");
            return (Criteria) this;
        }

        public Criteria andAutoTenderTimesIsNull() {
            addCriterion("auto_tender_times is null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderTimesIsNotNull() {
            addCriterion("auto_tender_times is not null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderTimesEqualTo(Integer value) {
            addCriterion("auto_tender_times =", value, "autoTenderTimes");
            return (Criteria) this;
        }

        public Criteria andAutoTenderTimesNotEqualTo(Integer value) {
            addCriterion("auto_tender_times <>", value, "autoTenderTimes");
            return (Criteria) this;
        }

        public Criteria andAutoTenderTimesGreaterThan(Integer value) {
            addCriterion("auto_tender_times >", value, "autoTenderTimes");
            return (Criteria) this;
        }

        public Criteria andAutoTenderTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("auto_tender_times >=", value, "autoTenderTimes");
            return (Criteria) this;
        }

        public Criteria andAutoTenderTimesLessThan(Integer value) {
            addCriterion("auto_tender_times <", value, "autoTenderTimes");
            return (Criteria) this;
        }

        public Criteria andAutoTenderTimesLessThanOrEqualTo(Integer value) {
            addCriterion("auto_tender_times <=", value, "autoTenderTimes");
            return (Criteria) this;
        }

        public Criteria andAutoTenderTimesIn(List<Integer> values) {
            addCriterion("auto_tender_times in", values, "autoTenderTimes");
            return (Criteria) this;
        }

        public Criteria andAutoTenderTimesNotIn(List<Integer> values) {
            addCriterion("auto_tender_times not in", values, "autoTenderTimes");
            return (Criteria) this;
        }

        public Criteria andAutoTenderTimesBetween(Integer value1, Integer value2) {
            addCriterion("auto_tender_times between", value1, value2, "autoTenderTimes");
            return (Criteria) this;
        }

        public Criteria andAutoTenderTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("auto_tender_times not between", value1, value2, "autoTenderTimes");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRuleIsNull() {
            addCriterion("auto_tender_rule is null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRuleIsNotNull() {
            addCriterion("auto_tender_rule is not null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRuleEqualTo(Integer value) {
            addCriterion("auto_tender_rule =", value, "autoTenderRule");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRuleNotEqualTo(Integer value) {
            addCriterion("auto_tender_rule <>", value, "autoTenderRule");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRuleGreaterThan(Integer value) {
            addCriterion("auto_tender_rule >", value, "autoTenderRule");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRuleGreaterThanOrEqualTo(Integer value) {
            addCriterion("auto_tender_rule >=", value, "autoTenderRule");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRuleLessThan(Integer value) {
            addCriterion("auto_tender_rule <", value, "autoTenderRule");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRuleLessThanOrEqualTo(Integer value) {
            addCriterion("auto_tender_rule <=", value, "autoTenderRule");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRuleIn(List<Integer> values) {
            addCriterion("auto_tender_rule in", values, "autoTenderRule");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRuleNotIn(List<Integer> values) {
            addCriterion("auto_tender_rule not in", values, "autoTenderRule");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRuleBetween(Integer value1, Integer value2) {
            addCriterion("auto_tender_rule between", value1, value2, "autoTenderRule");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRuleNotBetween(Integer value1, Integer value2) {
            addCriterion("auto_tender_rule not between", value1, value2, "autoTenderRule");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyTopIsNull() {
            addCriterion("auto_tender_money_top is null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyTopIsNotNull() {
            addCriterion("auto_tender_money_top is not null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyTopEqualTo(BigDecimal value) {
            addCriterion("auto_tender_money_top =", value, "autoTenderMoneyTop");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyTopNotEqualTo(BigDecimal value) {
            addCriterion("auto_tender_money_top <>", value, "autoTenderMoneyTop");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyTopGreaterThan(BigDecimal value) {
            addCriterion("auto_tender_money_top >", value, "autoTenderMoneyTop");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyTopGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("auto_tender_money_top >=", value, "autoTenderMoneyTop");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyTopLessThan(BigDecimal value) {
            addCriterion("auto_tender_money_top <", value, "autoTenderMoneyTop");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyTopLessThanOrEqualTo(BigDecimal value) {
            addCriterion("auto_tender_money_top <=", value, "autoTenderMoneyTop");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyTopIn(List<BigDecimal> values) {
            addCriterion("auto_tender_money_top in", values, "autoTenderMoneyTop");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyTopNotIn(List<BigDecimal> values) {
            addCriterion("auto_tender_money_top not in", values, "autoTenderMoneyTop");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyTopBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auto_tender_money_top between", value1, value2, "autoTenderMoneyTop");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyTopNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auto_tender_money_top not between", value1, value2, "autoTenderMoneyTop");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyLeaveIsNull() {
            addCriterion("auto_tender_money_leave is null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyLeaveIsNotNull() {
            addCriterion("auto_tender_money_leave is not null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyLeaveEqualTo(BigDecimal value) {
            addCriterion("auto_tender_money_leave =", value, "autoTenderMoneyLeave");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyLeaveNotEqualTo(BigDecimal value) {
            addCriterion("auto_tender_money_leave <>", value, "autoTenderMoneyLeave");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyLeaveGreaterThan(BigDecimal value) {
            addCriterion("auto_tender_money_leave >", value, "autoTenderMoneyLeave");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyLeaveGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("auto_tender_money_leave >=", value, "autoTenderMoneyLeave");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyLeaveLessThan(BigDecimal value) {
            addCriterion("auto_tender_money_leave <", value, "autoTenderMoneyLeave");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyLeaveLessThanOrEqualTo(BigDecimal value) {
            addCriterion("auto_tender_money_leave <=", value, "autoTenderMoneyLeave");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyLeaveIn(List<BigDecimal> values) {
            addCriterion("auto_tender_money_leave in", values, "autoTenderMoneyLeave");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyLeaveNotIn(List<BigDecimal> values) {
            addCriterion("auto_tender_money_leave not in", values, "autoTenderMoneyLeave");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyLeaveBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auto_tender_money_leave between", value1, value2, "autoTenderMoneyLeave");
            return (Criteria) this;
        }

        public Criteria andAutoTenderMoneyLeaveNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auto_tender_money_leave not between", value1, value2, "autoTenderMoneyLeave");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateBeginIsNull() {
            addCriterion("auto_tender_rate_begin is null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateBeginIsNotNull() {
            addCriterion("auto_tender_rate_begin is not null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateBeginEqualTo(BigDecimal value) {
            addCriterion("auto_tender_rate_begin =", value, "autoTenderRateBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateBeginNotEqualTo(BigDecimal value) {
            addCriterion("auto_tender_rate_begin <>", value, "autoTenderRateBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateBeginGreaterThan(BigDecimal value) {
            addCriterion("auto_tender_rate_begin >", value, "autoTenderRateBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateBeginGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("auto_tender_rate_begin >=", value, "autoTenderRateBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateBeginLessThan(BigDecimal value) {
            addCriterion("auto_tender_rate_begin <", value, "autoTenderRateBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateBeginLessThanOrEqualTo(BigDecimal value) {
            addCriterion("auto_tender_rate_begin <=", value, "autoTenderRateBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateBeginIn(List<BigDecimal> values) {
            addCriterion("auto_tender_rate_begin in", values, "autoTenderRateBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateBeginNotIn(List<BigDecimal> values) {
            addCriterion("auto_tender_rate_begin not in", values, "autoTenderRateBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateBeginBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auto_tender_rate_begin between", value1, value2, "autoTenderRateBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateBeginNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auto_tender_rate_begin not between", value1, value2, "autoTenderRateBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateEndIsNull() {
            addCriterion("auto_tender_rate_end is null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateEndIsNotNull() {
            addCriterion("auto_tender_rate_end is not null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateEndEqualTo(BigDecimal value) {
            addCriterion("auto_tender_rate_end =", value, "autoTenderRateEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateEndNotEqualTo(BigDecimal value) {
            addCriterion("auto_tender_rate_end <>", value, "autoTenderRateEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateEndGreaterThan(BigDecimal value) {
            addCriterion("auto_tender_rate_end >", value, "autoTenderRateEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateEndGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("auto_tender_rate_end >=", value, "autoTenderRateEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateEndLessThan(BigDecimal value) {
            addCriterion("auto_tender_rate_end <", value, "autoTenderRateEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateEndLessThanOrEqualTo(BigDecimal value) {
            addCriterion("auto_tender_rate_end <=", value, "autoTenderRateEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateEndIn(List<BigDecimal> values) {
            addCriterion("auto_tender_rate_end in", values, "autoTenderRateEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateEndNotIn(List<BigDecimal> values) {
            addCriterion("auto_tender_rate_end not in", values, "autoTenderRateEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateEndBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auto_tender_rate_end between", value1, value2, "autoTenderRateEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRateEndNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auto_tender_rate_end not between", value1, value2, "autoTenderRateEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardBeginIsNull() {
            addCriterion("auto_tender_reward_begin is null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardBeginIsNotNull() {
            addCriterion("auto_tender_reward_begin is not null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardBeginEqualTo(BigDecimal value) {
            addCriterion("auto_tender_reward_begin =", value, "autoTenderRewardBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardBeginNotEqualTo(BigDecimal value) {
            addCriterion("auto_tender_reward_begin <>", value, "autoTenderRewardBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardBeginGreaterThan(BigDecimal value) {
            addCriterion("auto_tender_reward_begin >", value, "autoTenderRewardBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardBeginGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("auto_tender_reward_begin >=", value, "autoTenderRewardBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardBeginLessThan(BigDecimal value) {
            addCriterion("auto_tender_reward_begin <", value, "autoTenderRewardBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardBeginLessThanOrEqualTo(BigDecimal value) {
            addCriterion("auto_tender_reward_begin <=", value, "autoTenderRewardBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardBeginIn(List<BigDecimal> values) {
            addCriterion("auto_tender_reward_begin in", values, "autoTenderRewardBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardBeginNotIn(List<BigDecimal> values) {
            addCriterion("auto_tender_reward_begin not in", values, "autoTenderRewardBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardBeginBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auto_tender_reward_begin between", value1, value2, "autoTenderRewardBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardBeginNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auto_tender_reward_begin not between", value1, value2, "autoTenderRewardBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardEndIsNull() {
            addCriterion("auto_tender_reward_end is null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardEndIsNotNull() {
            addCriterion("auto_tender_reward_end is not null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardEndEqualTo(BigDecimal value) {
            addCriterion("auto_tender_reward_end =", value, "autoTenderRewardEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardEndNotEqualTo(BigDecimal value) {
            addCriterion("auto_tender_reward_end <>", value, "autoTenderRewardEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardEndGreaterThan(BigDecimal value) {
            addCriterion("auto_tender_reward_end >", value, "autoTenderRewardEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardEndGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("auto_tender_reward_end >=", value, "autoTenderRewardEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardEndLessThan(BigDecimal value) {
            addCriterion("auto_tender_reward_end <", value, "autoTenderRewardEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardEndLessThanOrEqualTo(BigDecimal value) {
            addCriterion("auto_tender_reward_end <=", value, "autoTenderRewardEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardEndIn(List<BigDecimal> values) {
            addCriterion("auto_tender_reward_end in", values, "autoTenderRewardEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardEndNotIn(List<BigDecimal> values) {
            addCriterion("auto_tender_reward_end not in", values, "autoTenderRewardEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardEndBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auto_tender_reward_end between", value1, value2, "autoTenderRewardEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRewardEndNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("auto_tender_reward_end not between", value1, value2, "autoTenderRewardEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitBeginIsNull() {
            addCriterion("auto_tender_limit_begin is null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitBeginIsNotNull() {
            addCriterion("auto_tender_limit_begin is not null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitBeginEqualTo(Integer value) {
            addCriterion("auto_tender_limit_begin =", value, "autoTenderLimitBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitBeginNotEqualTo(Integer value) {
            addCriterion("auto_tender_limit_begin <>", value, "autoTenderLimitBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitBeginGreaterThan(Integer value) {
            addCriterion("auto_tender_limit_begin >", value, "autoTenderLimitBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitBeginGreaterThanOrEqualTo(Integer value) {
            addCriterion("auto_tender_limit_begin >=", value, "autoTenderLimitBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitBeginLessThan(Integer value) {
            addCriterion("auto_tender_limit_begin <", value, "autoTenderLimitBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitBeginLessThanOrEqualTo(Integer value) {
            addCriterion("auto_tender_limit_begin <=", value, "autoTenderLimitBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitBeginIn(List<Integer> values) {
            addCriterion("auto_tender_limit_begin in", values, "autoTenderLimitBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitBeginNotIn(List<Integer> values) {
            addCriterion("auto_tender_limit_begin not in", values, "autoTenderLimitBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitBeginBetween(Integer value1, Integer value2) {
            addCriterion("auto_tender_limit_begin between", value1, value2, "autoTenderLimitBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitBeginNotBetween(Integer value1, Integer value2) {
            addCriterion("auto_tender_limit_begin not between", value1, value2, "autoTenderLimitBegin");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitEndIsNull() {
            addCriterion("auto_tender_limit_end is null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitEndIsNotNull() {
            addCriterion("auto_tender_limit_end is not null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitEndEqualTo(Integer value) {
            addCriterion("auto_tender_limit_end =", value, "autoTenderLimitEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitEndNotEqualTo(Integer value) {
            addCriterion("auto_tender_limit_end <>", value, "autoTenderLimitEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitEndGreaterThan(Integer value) {
            addCriterion("auto_tender_limit_end >", value, "autoTenderLimitEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitEndGreaterThanOrEqualTo(Integer value) {
            addCriterion("auto_tender_limit_end >=", value, "autoTenderLimitEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitEndLessThan(Integer value) {
            addCriterion("auto_tender_limit_end <", value, "autoTenderLimitEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitEndLessThanOrEqualTo(Integer value) {
            addCriterion("auto_tender_limit_end <=", value, "autoTenderLimitEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitEndIn(List<Integer> values) {
            addCriterion("auto_tender_limit_end in", values, "autoTenderLimitEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitEndNotIn(List<Integer> values) {
            addCriterion("auto_tender_limit_end not in", values, "autoTenderLimitEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitEndBetween(Integer value1, Integer value2) {
            addCriterion("auto_tender_limit_end between", value1, value2, "autoTenderLimitEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderLimitEndNotBetween(Integer value1, Integer value2) {
            addCriterion("auto_tender_limit_end not between", value1, value2, "autoTenderLimitEnd");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayIsNull() {
            addCriterion("auto_tender_repay_way is null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayIsNotNull() {
            addCriterion("auto_tender_repay_way is not null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayEqualTo(String value) {
            addCriterion("auto_tender_repay_way =", value, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayNotEqualTo(String value) {
            addCriterion("auto_tender_repay_way <>", value, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayGreaterThan(String value) {
            addCriterion("auto_tender_repay_way >", value, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayGreaterThanOrEqualTo(String value) {
            addCriterion("auto_tender_repay_way >=", value, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayLessThan(String value) {
            addCriterion("auto_tender_repay_way <", value, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayLessThanOrEqualTo(String value) {
            addCriterion("auto_tender_repay_way <=", value, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayLike(String value) {
            addCriterion("auto_tender_repay_way like", value, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayNotLike(String value) {
            addCriterion("auto_tender_repay_way not like", value, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayIn(List<String> values) {
            addCriterion("auto_tender_repay_way in", values, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayNotIn(List<String> values) {
            addCriterion("auto_tender_repay_way not in", values, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayBetween(String value1, String value2) {
            addCriterion("auto_tender_repay_way between", value1, value2, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayNotBetween(String value1, String value2) {
            addCriterion("auto_tender_repay_way not between", value1, value2, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andAutoTenderModifyDateIsNull() {
            addCriterion("auto_tender_modify_date is null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderModifyDateIsNotNull() {
            addCriterion("auto_tender_modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderModifyDateEqualTo(Date value) {
            addCriterion("auto_tender_modify_date =", value, "autoTenderModifyDate");
            return (Criteria) this;
        }

        public Criteria andAutoTenderModifyDateNotEqualTo(Date value) {
            addCriterion("auto_tender_modify_date <>", value, "autoTenderModifyDate");
            return (Criteria) this;
        }

        public Criteria andAutoTenderModifyDateGreaterThan(Date value) {
            addCriterion("auto_tender_modify_date >", value, "autoTenderModifyDate");
            return (Criteria) this;
        }

        public Criteria andAutoTenderModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("auto_tender_modify_date >=", value, "autoTenderModifyDate");
            return (Criteria) this;
        }

        public Criteria andAutoTenderModifyDateLessThan(Date value) {
            addCriterion("auto_tender_modify_date <", value, "autoTenderModifyDate");
            return (Criteria) this;
        }

        public Criteria andAutoTenderModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("auto_tender_modify_date <=", value, "autoTenderModifyDate");
            return (Criteria) this;
        }

        public Criteria andAutoTenderModifyDateIn(List<Date> values) {
            addCriterion("auto_tender_modify_date in", values, "autoTenderModifyDate");
            return (Criteria) this;
        }

        public Criteria andAutoTenderModifyDateNotIn(List<Date> values) {
            addCriterion("auto_tender_modify_date not in", values, "autoTenderModifyDate");
            return (Criteria) this;
        }

        public Criteria andAutoTenderModifyDateBetween(Date value1, Date value2) {
            addCriterion("auto_tender_modify_date between", value1, value2, "autoTenderModifyDate");
            return (Criteria) this;
        }

        public Criteria andAutoTenderModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("auto_tender_modify_date not between", value1, value2, "autoTenderModifyDate");
            return (Criteria) this;
        }

        public Criteria andTgNoIsNull() {
            addCriterion("tg_no is null");
            return (Criteria) this;
        }

        public Criteria andTgNoIsNotNull() {
            addCriterion("tg_no is not null");
            return (Criteria) this;
        }

        public Criteria andTgNoEqualTo(String value) {
            addCriterion("tg_no =", value, "tgNo");
            return (Criteria) this;
        }

        public Criteria andTgNoNotEqualTo(String value) {
            addCriterion("tg_no <>", value, "tgNo");
            return (Criteria) this;
        }

        public Criteria andTgNoGreaterThan(String value) {
            addCriterion("tg_no >", value, "tgNo");
            return (Criteria) this;
        }

        public Criteria andTgNoGreaterThanOrEqualTo(String value) {
            addCriterion("tg_no >=", value, "tgNo");
            return (Criteria) this;
        }

        public Criteria andTgNoLessThan(String value) {
            addCriterion("tg_no <", value, "tgNo");
            return (Criteria) this;
        }

        public Criteria andTgNoLessThanOrEqualTo(String value) {
            addCriterion("tg_no <=", value, "tgNo");
            return (Criteria) this;
        }

        public Criteria andTgNoLike(String value) {
            addCriterion("tg_no like", value, "tgNo");
            return (Criteria) this;
        }

        public Criteria andTgNoNotLike(String value) {
            addCriterion("tg_no not like", value, "tgNo");
            return (Criteria) this;
        }

        public Criteria andTgNoIn(List<String> values) {
            addCriterion("tg_no in", values, "tgNo");
            return (Criteria) this;
        }

        public Criteria andTgNoNotIn(List<String> values) {
            addCriterion("tg_no not in", values, "tgNo");
            return (Criteria) this;
        }

        public Criteria andTgNoBetween(String value1, String value2) {
            addCriterion("tg_no between", value1, value2, "tgNo");
            return (Criteria) this;
        }

        public Criteria andTgNoNotBetween(String value1, String value2) {
            addCriterion("tg_no not between", value1, value2, "tgNo");
            return (Criteria) this;
        }

        public Criteria andTgOneLevelUserIdIsNull() {
            addCriterion("tg_one_level_user_id is null");
            return (Criteria) this;
        }

        public Criteria andTgOneLevelUserIdIsNotNull() {
            addCriterion("tg_one_level_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andTgOneLevelUserIdEqualTo(Long value) {
            addCriterion("tg_one_level_user_id =", value, "tgOneLevelUserId");
            return (Criteria) this;
        }

        public Criteria andTgOneLevelUserIdNotEqualTo(Long value) {
            addCriterion("tg_one_level_user_id <>", value, "tgOneLevelUserId");
            return (Criteria) this;
        }

        public Criteria andTgOneLevelUserIdGreaterThan(Long value) {
            addCriterion("tg_one_level_user_id >", value, "tgOneLevelUserId");
            return (Criteria) this;
        }

        public Criteria andTgOneLevelUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tg_one_level_user_id >=", value, "tgOneLevelUserId");
            return (Criteria) this;
        }

        public Criteria andTgOneLevelUserIdLessThan(Long value) {
            addCriterion("tg_one_level_user_id <", value, "tgOneLevelUserId");
            return (Criteria) this;
        }

        public Criteria andTgOneLevelUserIdLessThanOrEqualTo(Long value) {
            addCriterion("tg_one_level_user_id <=", value, "tgOneLevelUserId");
            return (Criteria) this;
        }

        public Criteria andTgOneLevelUserIdIn(List<Long> values) {
            addCriterion("tg_one_level_user_id in", values, "tgOneLevelUserId");
            return (Criteria) this;
        }

        public Criteria andTgOneLevelUserIdNotIn(List<Long> values) {
            addCriterion("tg_one_level_user_id not in", values, "tgOneLevelUserId");
            return (Criteria) this;
        }

        public Criteria andTgOneLevelUserIdBetween(Long value1, Long value2) {
            addCriterion("tg_one_level_user_id between", value1, value2, "tgOneLevelUserId");
            return (Criteria) this;
        }

        public Criteria andTgOneLevelUserIdNotBetween(Long value1, Long value2) {
            addCriterion("tg_one_level_user_id not between", value1, value2, "tgOneLevelUserId");
            return (Criteria) this;
        }

        public Criteria andPlaceChilderIdIsNull() {
            addCriterion("place_childer_id is null");
            return (Criteria) this;
        }

        public Criteria andPlaceChilderIdIsNotNull() {
            addCriterion("place_childer_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceChilderIdEqualTo(Long value) {
            addCriterion("place_childer_id =", value, "placeChilderId");
            return (Criteria) this;
        }

        public Criteria andPlaceChilderIdNotEqualTo(Long value) {
            addCriterion("place_childer_id <>", value, "placeChilderId");
            return (Criteria) this;
        }

        public Criteria andPlaceChilderIdGreaterThan(Long value) {
            addCriterion("place_childer_id >", value, "placeChilderId");
            return (Criteria) this;
        }

        public Criteria andPlaceChilderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("place_childer_id >=", value, "placeChilderId");
            return (Criteria) this;
        }

        public Criteria andPlaceChilderIdLessThan(Long value) {
            addCriterion("place_childer_id <", value, "placeChilderId");
            return (Criteria) this;
        }

        public Criteria andPlaceChilderIdLessThanOrEqualTo(Long value) {
            addCriterion("place_childer_id <=", value, "placeChilderId");
            return (Criteria) this;
        }

        public Criteria andPlaceChilderIdIn(List<Long> values) {
            addCriterion("place_childer_id in", values, "placeChilderId");
            return (Criteria) this;
        }

        public Criteria andPlaceChilderIdNotIn(List<Long> values) {
            addCriterion("place_childer_id not in", values, "placeChilderId");
            return (Criteria) this;
        }

        public Criteria andPlaceChilderIdBetween(Long value1, Long value2) {
            addCriterion("place_childer_id between", value1, value2, "placeChilderId");
            return (Criteria) this;
        }

        public Criteria andPlaceChilderIdNotBetween(Long value1, Long value2) {
            addCriterion("place_childer_id not between", value1, value2, "placeChilderId");
            return (Criteria) this;
        }

        public Criteria andTgStatusIsNull() {
            addCriterion("tg_status is null");
            return (Criteria) this;
        }

        public Criteria andTgStatusIsNotNull() {
            addCriterion("tg_status is not null");
            return (Criteria) this;
        }

        public Criteria andTgStatusEqualTo(Integer value) {
            addCriterion("tg_status =", value, "tgStatus");
            return (Criteria) this;
        }

        public Criteria andTgStatusNotEqualTo(Integer value) {
            addCriterion("tg_status <>", value, "tgStatus");
            return (Criteria) this;
        }

        public Criteria andTgStatusGreaterThan(Integer value) {
            addCriterion("tg_status >", value, "tgStatus");
            return (Criteria) this;
        }

        public Criteria andTgStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("tg_status >=", value, "tgStatus");
            return (Criteria) this;
        }

        public Criteria andTgStatusLessThan(Integer value) {
            addCriterion("tg_status <", value, "tgStatus");
            return (Criteria) this;
        }

        public Criteria andTgStatusLessThanOrEqualTo(Integer value) {
            addCriterion("tg_status <=", value, "tgStatus");
            return (Criteria) this;
        }

        public Criteria andTgStatusIn(List<Integer> values) {
            addCriterion("tg_status in", values, "tgStatus");
            return (Criteria) this;
        }

        public Criteria andTgStatusNotIn(List<Integer> values) {
            addCriterion("tg_status not in", values, "tgStatus");
            return (Criteria) this;
        }

        public Criteria andTgStatusBetween(Integer value1, Integer value2) {
            addCriterion("tg_status between", value1, value2, "tgStatus");
            return (Criteria) this;
        }

        public Criteria andTgStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("tg_status not between", value1, value2, "tgStatus");
            return (Criteria) this;
        }

        public Criteria andSumTenderMoneyIsNull() {
            addCriterion("sum_tender_money is null");
            return (Criteria) this;
        }

        public Criteria andSumTenderMoneyIsNotNull() {
            addCriterion("sum_tender_money is not null");
            return (Criteria) this;
        }

        public Criteria andSumTenderMoneyEqualTo(BigDecimal value) {
            addCriterion("sum_tender_money =", value, "sumTenderMoney");
            return (Criteria) this;
        }

        public Criteria andSumTenderMoneyNotEqualTo(BigDecimal value) {
            addCriterion("sum_tender_money <>", value, "sumTenderMoney");
            return (Criteria) this;
        }

        public Criteria andSumTenderMoneyGreaterThan(BigDecimal value) {
            addCriterion("sum_tender_money >", value, "sumTenderMoney");
            return (Criteria) this;
        }

        public Criteria andSumTenderMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_tender_money >=", value, "sumTenderMoney");
            return (Criteria) this;
        }

        public Criteria andSumTenderMoneyLessThan(BigDecimal value) {
            addCriterion("sum_tender_money <", value, "sumTenderMoney");
            return (Criteria) this;
        }

        public Criteria andSumTenderMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_tender_money <=", value, "sumTenderMoney");
            return (Criteria) this;
        }

        public Criteria andSumTenderMoneyIn(List<BigDecimal> values) {
            addCriterion("sum_tender_money in", values, "sumTenderMoney");
            return (Criteria) this;
        }

        public Criteria andSumTenderMoneyNotIn(List<BigDecimal> values) {
            addCriterion("sum_tender_money not in", values, "sumTenderMoney");
            return (Criteria) this;
        }

        public Criteria andSumTenderMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_tender_money between", value1, value2, "sumTenderMoney");
            return (Criteria) this;
        }

        public Criteria andSumTenderMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_tender_money not between", value1, value2, "sumTenderMoney");
            return (Criteria) this;
        }

        public Criteria andEmailFreqIsNull() {
            addCriterion("email_freq is null");
            return (Criteria) this;
        }

        public Criteria andEmailFreqIsNotNull() {
            addCriterion("email_freq is not null");
            return (Criteria) this;
        }

        public Criteria andEmailFreqEqualTo(Integer value) {
            addCriterion("email_freq =", value, "emailFreq");
            return (Criteria) this;
        }

        public Criteria andEmailFreqNotEqualTo(Integer value) {
            addCriterion("email_freq <>", value, "emailFreq");
            return (Criteria) this;
        }

        public Criteria andEmailFreqGreaterThan(Integer value) {
            addCriterion("email_freq >", value, "emailFreq");
            return (Criteria) this;
        }

        public Criteria andEmailFreqGreaterThanOrEqualTo(Integer value) {
            addCriterion("email_freq >=", value, "emailFreq");
            return (Criteria) this;
        }

        public Criteria andEmailFreqLessThan(Integer value) {
            addCriterion("email_freq <", value, "emailFreq");
            return (Criteria) this;
        }

        public Criteria andEmailFreqLessThanOrEqualTo(Integer value) {
            addCriterion("email_freq <=", value, "emailFreq");
            return (Criteria) this;
        }

        public Criteria andEmailFreqIn(List<Integer> values) {
            addCriterion("email_freq in", values, "emailFreq");
            return (Criteria) this;
        }

        public Criteria andEmailFreqNotIn(List<Integer> values) {
            addCriterion("email_freq not in", values, "emailFreq");
            return (Criteria) this;
        }

        public Criteria andEmailFreqBetween(Integer value1, Integer value2) {
            addCriterion("email_freq between", value1, value2, "emailFreq");
            return (Criteria) this;
        }

        public Criteria andEmailFreqNotBetween(Integer value1, Integer value2) {
            addCriterion("email_freq not between", value1, value2, "emailFreq");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeIsNull() {
            addCriterion("phone_code is null");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeIsNotNull() {
            addCriterion("phone_code is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeEqualTo(String value) {
            addCriterion("phone_code =", value, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeNotEqualTo(String value) {
            addCriterion("phone_code <>", value, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeGreaterThan(String value) {
            addCriterion("phone_code >", value, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeGreaterThanOrEqualTo(String value) {
            addCriterion("phone_code >=", value, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeLessThan(String value) {
            addCriterion("phone_code <", value, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeLessThanOrEqualTo(String value) {
            addCriterion("phone_code <=", value, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeLike(String value) {
            addCriterion("phone_code like", value, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeNotLike(String value) {
            addCriterion("phone_code not like", value, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeIn(List<String> values) {
            addCriterion("phone_code in", values, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeNotIn(List<String> values) {
            addCriterion("phone_code not in", values, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeBetween(String value1, String value2) {
            addCriterion("phone_code between", value1, value2, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andPhoneCodeNotBetween(String value1, String value2) {
            addCriterion("phone_code not between", value1, value2, "phoneCode");
            return (Criteria) this;
        }

        public Criteria andAgencyidIsNull() {
            addCriterion("agencyid is null");
            return (Criteria) this;
        }

        public Criteria andAgencyidIsNotNull() {
            addCriterion("agencyid is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyidEqualTo(Integer value) {
            addCriterion("agencyid =", value, "agencyid");
            return (Criteria) this;
        }

        public Criteria andAgencyidNotEqualTo(Integer value) {
            addCriterion("agencyid <>", value, "agencyid");
            return (Criteria) this;
        }

        public Criteria andAgencyidGreaterThan(Integer value) {
            addCriterion("agencyid >", value, "agencyid");
            return (Criteria) this;
        }

        public Criteria andAgencyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("agencyid >=", value, "agencyid");
            return (Criteria) this;
        }

        public Criteria andAgencyidLessThan(Integer value) {
            addCriterion("agencyid <", value, "agencyid");
            return (Criteria) this;
        }

        public Criteria andAgencyidLessThanOrEqualTo(Integer value) {
            addCriterion("agencyid <=", value, "agencyid");
            return (Criteria) this;
        }

        public Criteria andAgencyidIn(List<Integer> values) {
            addCriterion("agencyid in", values, "agencyid");
            return (Criteria) this;
        }

        public Criteria andAgencyidNotIn(List<Integer> values) {
            addCriterion("agencyid not in", values, "agencyid");
            return (Criteria) this;
        }

        public Criteria andAgencyidBetween(Integer value1, Integer value2) {
            addCriterion("agencyid between", value1, value2, "agencyid");
            return (Criteria) this;
        }

        public Criteria andAgencyidNotBetween(Integer value1, Integer value2) {
            addCriterion("agencyid not between", value1, value2, "agencyid");
            return (Criteria) this;
        }

        public Criteria andAgencytypeIsNull() {
            addCriterion("agencytype is null");
            return (Criteria) this;
        }

        public Criteria andAgencytypeIsNotNull() {
            addCriterion("agencytype is not null");
            return (Criteria) this;
        }

        public Criteria andAgencytypeEqualTo(Integer value) {
            addCriterion("agencytype =", value, "agencytype");
            return (Criteria) this;
        }

        public Criteria andAgencytypeNotEqualTo(Integer value) {
            addCriterion("agencytype <>", value, "agencytype");
            return (Criteria) this;
        }

        public Criteria andAgencytypeGreaterThan(Integer value) {
            addCriterion("agencytype >", value, "agencytype");
            return (Criteria) this;
        }

        public Criteria andAgencytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("agencytype >=", value, "agencytype");
            return (Criteria) this;
        }

        public Criteria andAgencytypeLessThan(Integer value) {
            addCriterion("agencytype <", value, "agencytype");
            return (Criteria) this;
        }

        public Criteria andAgencytypeLessThanOrEqualTo(Integer value) {
            addCriterion("agencytype <=", value, "agencytype");
            return (Criteria) this;
        }

        public Criteria andAgencytypeIn(List<Integer> values) {
            addCriterion("agencytype in", values, "agencytype");
            return (Criteria) this;
        }

        public Criteria andAgencytypeNotIn(List<Integer> values) {
            addCriterion("agencytype not in", values, "agencytype");
            return (Criteria) this;
        }

        public Criteria andAgencytypeBetween(Integer value1, Integer value2) {
            addCriterion("agencytype between", value1, value2, "agencytype");
            return (Criteria) this;
        }

        public Criteria andAgencytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("agencytype not between", value1, value2, "agencytype");
            return (Criteria) this;
        }

        public Criteria andTasteFlagIsNull() {
            addCriterion("taste_flag is null");
            return (Criteria) this;
        }

        public Criteria andTasteFlagIsNotNull() {
            addCriterion("taste_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTasteFlagEqualTo(Integer value) {
            addCriterion("taste_flag =", value, "tasteFlag");
            return (Criteria) this;
        }

        public Criteria andTasteFlagNotEqualTo(Integer value) {
            addCriterion("taste_flag <>", value, "tasteFlag");
            return (Criteria) this;
        }

        public Criteria andTasteFlagGreaterThan(Integer value) {
            addCriterion("taste_flag >", value, "tasteFlag");
            return (Criteria) this;
        }

        public Criteria andTasteFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("taste_flag >=", value, "tasteFlag");
            return (Criteria) this;
        }

        public Criteria andTasteFlagLessThan(Integer value) {
            addCriterion("taste_flag <", value, "tasteFlag");
            return (Criteria) this;
        }

        public Criteria andTasteFlagLessThanOrEqualTo(Integer value) {
            addCriterion("taste_flag <=", value, "tasteFlag");
            return (Criteria) this;
        }

        public Criteria andTasteFlagIn(List<Integer> values) {
            addCriterion("taste_flag in", values, "tasteFlag");
            return (Criteria) this;
        }

        public Criteria andTasteFlagNotIn(List<Integer> values) {
            addCriterion("taste_flag not in", values, "tasteFlag");
            return (Criteria) this;
        }

        public Criteria andTasteFlagBetween(Integer value1, Integer value2) {
            addCriterion("taste_flag between", value1, value2, "tasteFlag");
            return (Criteria) this;
        }

        public Criteria andTasteFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("taste_flag not between", value1, value2, "tasteFlag");
            return (Criteria) this;
        }

        public Criteria andSourceFromIsNull() {
            addCriterion("source_from is null");
            return (Criteria) this;
        }

        public Criteria andSourceFromIsNotNull() {
            addCriterion("source_from is not null");
            return (Criteria) this;
        }

        public Criteria andSourceFromEqualTo(Integer value) {
            addCriterion("source_from =", value, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromNotEqualTo(Integer value) {
            addCriterion("source_from <>", value, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromGreaterThan(Integer value) {
            addCriterion("source_from >", value, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_from >=", value, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromLessThan(Integer value) {
            addCriterion("source_from <", value, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromLessThanOrEqualTo(Integer value) {
            addCriterion("source_from <=", value, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromIn(List<Integer> values) {
            addCriterion("source_from in", values, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromNotIn(List<Integer> values) {
            addCriterion("source_from not in", values, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromBetween(Integer value1, Integer value2) {
            addCriterion("source_from between", value1, value2, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromNotBetween(Integer value1, Integer value2) {
            addCriterion("source_from not between", value1, value2, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andGestureIsNull() {
            addCriterion("gesture is null");
            return (Criteria) this;
        }

        public Criteria andGestureIsNotNull() {
            addCriterion("gesture is not null");
            return (Criteria) this;
        }

        public Criteria andGestureEqualTo(String value) {
            addCriterion("gesture =", value, "gesture");
            return (Criteria) this;
        }

        public Criteria andGestureNotEqualTo(String value) {
            addCriterion("gesture <>", value, "gesture");
            return (Criteria) this;
        }

        public Criteria andGestureGreaterThan(String value) {
            addCriterion("gesture >", value, "gesture");
            return (Criteria) this;
        }

        public Criteria andGestureGreaterThanOrEqualTo(String value) {
            addCriterion("gesture >=", value, "gesture");
            return (Criteria) this;
        }

        public Criteria andGestureLessThan(String value) {
            addCriterion("gesture <", value, "gesture");
            return (Criteria) this;
        }

        public Criteria andGestureLessThanOrEqualTo(String value) {
            addCriterion("gesture <=", value, "gesture");
            return (Criteria) this;
        }

        public Criteria andGestureLike(String value) {
            addCriterion("gesture like", value, "gesture");
            return (Criteria) this;
        }

        public Criteria andGestureNotLike(String value) {
            addCriterion("gesture not like", value, "gesture");
            return (Criteria) this;
        }

        public Criteria andGestureIn(List<String> values) {
            addCriterion("gesture in", values, "gesture");
            return (Criteria) this;
        }

        public Criteria andGestureNotIn(List<String> values) {
            addCriterion("gesture not in", values, "gesture");
            return (Criteria) this;
        }

        public Criteria andGestureBetween(String value1, String value2) {
            addCriterion("gesture between", value1, value2, "gesture");
            return (Criteria) this;
        }

        public Criteria andGestureNotBetween(String value1, String value2) {
            addCriterion("gesture not between", value1, value2, "gesture");
            return (Criteria) this;
        }

        public Criteria andAutoTenderBorrowTypeIsNull() {
            addCriterion("auto_tender_borrow_type is null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderBorrowTypeIsNotNull() {
            addCriterion("auto_tender_borrow_type is not null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderBorrowTypeEqualTo(String value) {
            addCriterion("auto_tender_borrow_type =", value, "autoTenderBorrowType");
            return (Criteria) this;
        }

        public Criteria andAutoTenderBorrowTypeNotEqualTo(String value) {
            addCriterion("auto_tender_borrow_type <>", value, "autoTenderBorrowType");
            return (Criteria) this;
        }

        public Criteria andAutoTenderBorrowTypeGreaterThan(String value) {
            addCriterion("auto_tender_borrow_type >", value, "autoTenderBorrowType");
            return (Criteria) this;
        }

        public Criteria andAutoTenderBorrowTypeGreaterThanOrEqualTo(String value) {
            addCriterion("auto_tender_borrow_type >=", value, "autoTenderBorrowType");
            return (Criteria) this;
        }

        public Criteria andAutoTenderBorrowTypeLessThan(String value) {
            addCriterion("auto_tender_borrow_type <", value, "autoTenderBorrowType");
            return (Criteria) this;
        }

        public Criteria andAutoTenderBorrowTypeLessThanOrEqualTo(String value) {
            addCriterion("auto_tender_borrow_type <=", value, "autoTenderBorrowType");
            return (Criteria) this;
        }

        public Criteria andAutoTenderBorrowTypeLike(String value) {
            addCriterion("auto_tender_borrow_type like", value, "autoTenderBorrowType");
            return (Criteria) this;
        }

        public Criteria andAutoTenderBorrowTypeNotLike(String value) {
            addCriterion("auto_tender_borrow_type not like", value, "autoTenderBorrowType");
            return (Criteria) this;
        }

        public Criteria andAutoTenderBorrowTypeIn(List<String> values) {
            addCriterion("auto_tender_borrow_type in", values, "autoTenderBorrowType");
            return (Criteria) this;
        }

        public Criteria andAutoTenderBorrowTypeNotIn(List<String> values) {
            addCriterion("auto_tender_borrow_type not in", values, "autoTenderBorrowType");
            return (Criteria) this;
        }

        public Criteria andAutoTenderBorrowTypeBetween(String value1, String value2) {
            addCriterion("auto_tender_borrow_type between", value1, value2, "autoTenderBorrowType");
            return (Criteria) this;
        }

        public Criteria andAutoTenderBorrowTypeNotBetween(String value1, String value2) {
            addCriterion("auto_tender_borrow_type not between", value1, value2, "autoTenderBorrowType");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenIsNull() {
            addCriterion("device_token is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenIsNotNull() {
            addCriterion("device_token is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenEqualTo(String value) {
            addCriterion("device_token =", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotEqualTo(String value) {
            addCriterion("device_token <>", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenGreaterThan(String value) {
            addCriterion("device_token >", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenGreaterThanOrEqualTo(String value) {
            addCriterion("device_token >=", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenLessThan(String value) {
            addCriterion("device_token <", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenLessThanOrEqualTo(String value) {
            addCriterion("device_token <=", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenLike(String value) {
            addCriterion("device_token like", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotLike(String value) {
            addCriterion("device_token not like", value, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenIn(List<String> values) {
            addCriterion("device_token in", values, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotIn(List<String> values) {
            addCriterion("device_token not in", values, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenBetween(String value1, String value2) {
            addCriterion("device_token between", value1, value2, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andDeviceTokenNotBetween(String value1, String value2) {
            addCriterion("device_token not between", value1, value2, "deviceToken");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andBankCustNoIsNull() {
            addCriterion("bank_cust_no is null");
            return (Criteria) this;
        }

        public Criteria andBankCustNoIsNotNull() {
            addCriterion("bank_cust_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankCustNoEqualTo(String value) {
            addCriterion("bank_cust_no =", value, "bankCustNo");
            return (Criteria) this;
        }

        public Criteria andBankCustNoNotEqualTo(String value) {
            addCriterion("bank_cust_no <>", value, "bankCustNo");
            return (Criteria) this;
        }

        public Criteria andBankCustNoGreaterThan(String value) {
            addCriterion("bank_cust_no >", value, "bankCustNo");
            return (Criteria) this;
        }

        public Criteria andBankCustNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_cust_no >=", value, "bankCustNo");
            return (Criteria) this;
        }

        public Criteria andBankCustNoLessThan(String value) {
            addCriterion("bank_cust_no <", value, "bankCustNo");
            return (Criteria) this;
        }

        public Criteria andBankCustNoLessThanOrEqualTo(String value) {
            addCriterion("bank_cust_no <=", value, "bankCustNo");
            return (Criteria) this;
        }

        public Criteria andBankCustNoLike(String value) {
            addCriterion("bank_cust_no like", value, "bankCustNo");
            return (Criteria) this;
        }

        public Criteria andBankCustNoNotLike(String value) {
            addCriterion("bank_cust_no not like", value, "bankCustNo");
            return (Criteria) this;
        }

        public Criteria andBankCustNoIn(List<String> values) {
            addCriterion("bank_cust_no in", values, "bankCustNo");
            return (Criteria) this;
        }

        public Criteria andBankCustNoNotIn(List<String> values) {
            addCriterion("bank_cust_no not in", values, "bankCustNo");
            return (Criteria) this;
        }

        public Criteria andBankCustNoBetween(String value1, String value2) {
            addCriterion("bank_cust_no between", value1, value2, "bankCustNo");
            return (Criteria) this;
        }

        public Criteria andBankCustNoNotBetween(String value1, String value2) {
            addCriterion("bank_cust_no not between", value1, value2, "bankCustNo");
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