package com.ysd.asset.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BorrowCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowCriteria() {
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

        public Criteria andMaxborrowIdIsNull() {
            addCriterion("maxborrow_id is null");
            return (Criteria) this;
        }

        public Criteria andMaxborrowIdIsNotNull() {
            addCriterion("maxborrow_id is not null");
            return (Criteria) this;
        }

        public Criteria andMaxborrowIdEqualTo(Integer value) {
            addCriterion("maxborrow_id =", value, "maxborrowId");
            return (Criteria) this;
        }

        public Criteria andMaxborrowIdNotEqualTo(Integer value) {
            addCriterion("maxborrow_id <>", value, "maxborrowId");
            return (Criteria) this;
        }

        public Criteria andMaxborrowIdGreaterThan(Integer value) {
            addCriterion("maxborrow_id >", value, "maxborrowId");
            return (Criteria) this;
        }

        public Criteria andMaxborrowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxborrow_id >=", value, "maxborrowId");
            return (Criteria) this;
        }

        public Criteria andMaxborrowIdLessThan(Integer value) {
            addCriterion("maxborrow_id <", value, "maxborrowId");
            return (Criteria) this;
        }

        public Criteria andMaxborrowIdLessThanOrEqualTo(Integer value) {
            addCriterion("maxborrow_id <=", value, "maxborrowId");
            return (Criteria) this;
        }

        public Criteria andMaxborrowIdIn(List<Integer> values) {
            addCriterion("maxborrow_id in", values, "maxborrowId");
            return (Criteria) this;
        }

        public Criteria andMaxborrowIdNotIn(List<Integer> values) {
            addCriterion("maxborrow_id not in", values, "maxborrowId");
            return (Criteria) this;
        }

        public Criteria andMaxborrowIdBetween(Integer value1, Integer value2) {
            addCriterion("maxborrow_id between", value1, value2, "maxborrowId");
            return (Criteria) this;
        }

        public Criteria andMaxborrowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("maxborrow_id not between", value1, value2, "maxborrowId");
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

        public Criteria andAgencyIdIsNull() {
            addCriterion("agency_id is null");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIsNotNull() {
            addCriterion("agency_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyIdEqualTo(Integer value) {
            addCriterion("agency_id =", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotEqualTo(Integer value) {
            addCriterion("agency_id <>", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdGreaterThan(Integer value) {
            addCriterion("agency_id >", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agency_id >=", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLessThan(Integer value) {
            addCriterion("agency_id <", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLessThanOrEqualTo(Integer value) {
            addCriterion("agency_id <=", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIn(List<Integer> values) {
            addCriterion("agency_id in", values, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotIn(List<Integer> values) {
            addCriterion("agency_id not in", values, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdBetween(Integer value1, Integer value2) {
            addCriterion("agency_id between", value1, value2, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agency_id not between", value1, value2, "agencyId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Integer value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Integer value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Integer value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Integer value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Integer> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Integer> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andDividesIsNull() {
            addCriterion("divides is null");
            return (Criteria) this;
        }

        public Criteria andDividesIsNotNull() {
            addCriterion("divides is not null");
            return (Criteria) this;
        }

        public Criteria andDividesEqualTo(Integer value) {
            addCriterion("divides =", value, "divides");
            return (Criteria) this;
        }

        public Criteria andDividesNotEqualTo(Integer value) {
            addCriterion("divides <>", value, "divides");
            return (Criteria) this;
        }

        public Criteria andDividesGreaterThan(Integer value) {
            addCriterion("divides >", value, "divides");
            return (Criteria) this;
        }

        public Criteria andDividesGreaterThanOrEqualTo(Integer value) {
            addCriterion("divides >=", value, "divides");
            return (Criteria) this;
        }

        public Criteria andDividesLessThan(Integer value) {
            addCriterion("divides <", value, "divides");
            return (Criteria) this;
        }

        public Criteria andDividesLessThanOrEqualTo(Integer value) {
            addCriterion("divides <=", value, "divides");
            return (Criteria) this;
        }

        public Criteria andDividesIn(List<Integer> values) {
            addCriterion("divides in", values, "divides");
            return (Criteria) this;
        }

        public Criteria andDividesNotIn(List<Integer> values) {
            addCriterion("divides not in", values, "divides");
            return (Criteria) this;
        }

        public Criteria andDividesBetween(Integer value1, Integer value2) {
            addCriterion("divides between", value1, value2, "divides");
            return (Criteria) this;
        }

        public Criteria andDividesNotBetween(Integer value1, Integer value2) {
            addCriterion("divides not between", value1, value2, "divides");
            return (Criteria) this;
        }

        public Criteria andHitsIsNull() {
            addCriterion("hits is null");
            return (Criteria) this;
        }

        public Criteria andHitsIsNotNull() {
            addCriterion("hits is not null");
            return (Criteria) this;
        }

        public Criteria andHitsEqualTo(Integer value) {
            addCriterion("hits =", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotEqualTo(Integer value) {
            addCriterion("hits <>", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThan(Integer value) {
            addCriterion("hits >", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("hits >=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThan(Integer value) {
            addCriterion("hits <", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThanOrEqualTo(Integer value) {
            addCriterion("hits <=", value, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsIn(List<Integer> values) {
            addCriterion("hits in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotIn(List<Integer> values) {
            addCriterion("hits not in", values, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsBetween(Integer value1, Integer value2) {
            addCriterion("hits between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotBetween(Integer value1, Integer value2) {
            addCriterion("hits not between", value1, value2, "hits");
            return (Criteria) this;
        }

        public Criteria andIsVouchIsNull() {
            addCriterion("is_vouch is null");
            return (Criteria) this;
        }

        public Criteria andIsVouchIsNotNull() {
            addCriterion("is_vouch is not null");
            return (Criteria) this;
        }

        public Criteria andIsVouchEqualTo(String value) {
            addCriterion("is_vouch =", value, "isVouch");
            return (Criteria) this;
        }

        public Criteria andIsVouchNotEqualTo(String value) {
            addCriterion("is_vouch <>", value, "isVouch");
            return (Criteria) this;
        }

        public Criteria andIsVouchGreaterThan(String value) {
            addCriterion("is_vouch >", value, "isVouch");
            return (Criteria) this;
        }

        public Criteria andIsVouchGreaterThanOrEqualTo(String value) {
            addCriterion("is_vouch >=", value, "isVouch");
            return (Criteria) this;
        }

        public Criteria andIsVouchLessThan(String value) {
            addCriterion("is_vouch <", value, "isVouch");
            return (Criteria) this;
        }

        public Criteria andIsVouchLessThanOrEqualTo(String value) {
            addCriterion("is_vouch <=", value, "isVouch");
            return (Criteria) this;
        }

        public Criteria andIsVouchLike(String value) {
            addCriterion("is_vouch like", value, "isVouch");
            return (Criteria) this;
        }

        public Criteria andIsVouchNotLike(String value) {
            addCriterion("is_vouch not like", value, "isVouch");
            return (Criteria) this;
        }

        public Criteria andIsVouchIn(List<String> values) {
            addCriterion("is_vouch in", values, "isVouch");
            return (Criteria) this;
        }

        public Criteria andIsVouchNotIn(List<String> values) {
            addCriterion("is_vouch not in", values, "isVouch");
            return (Criteria) this;
        }

        public Criteria andIsVouchBetween(String value1, String value2) {
            addCriterion("is_vouch between", value1, value2, "isVouch");
            return (Criteria) this;
        }

        public Criteria andIsVouchNotBetween(String value1, String value2) {
            addCriterion("is_vouch not between", value1, value2, "isVouch");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andVerifyUserIsNull() {
            addCriterion("verify_user is null");
            return (Criteria) this;
        }

        public Criteria andVerifyUserIsNotNull() {
            addCriterion("verify_user is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyUserEqualTo(String value) {
            addCriterion("verify_user =", value, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNotEqualTo(String value) {
            addCriterion("verify_user <>", value, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyUserGreaterThan(String value) {
            addCriterion("verify_user >", value, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyUserGreaterThanOrEqualTo(String value) {
            addCriterion("verify_user >=", value, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyUserLessThan(String value) {
            addCriterion("verify_user <", value, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyUserLessThanOrEqualTo(String value) {
            addCriterion("verify_user <=", value, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyUserLike(String value) {
            addCriterion("verify_user like", value, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNotLike(String value) {
            addCriterion("verify_user not like", value, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyUserIn(List<String> values) {
            addCriterion("verify_user in", values, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNotIn(List<String> values) {
            addCriterion("verify_user not in", values, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyUserBetween(String value1, String value2) {
            addCriterion("verify_user between", value1, value2, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyUserNotBetween(String value1, String value2) {
            addCriterion("verify_user not between", value1, value2, "verifyUser");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNull() {
            addCriterion("verify_time is null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNotNull() {
            addCriterion("verify_time is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeEqualTo(Date value) {
            addCriterion("verify_time =", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotEqualTo(Date value) {
            addCriterion("verify_time <>", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThan(Date value) {
            addCriterion("verify_time >", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("verify_time >=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThan(Date value) {
            addCriterion("verify_time <", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("verify_time <=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIn(List<Date> values) {
            addCriterion("verify_time in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotIn(List<Date> values) {
            addCriterion("verify_time not in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeBetween(Date value1, Date value2) {
            addCriterion("verify_time between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("verify_time not between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkIsNull() {
            addCriterion("verify_remark is null");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkIsNotNull() {
            addCriterion("verify_remark is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkEqualTo(String value) {
            addCriterion("verify_remark =", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkNotEqualTo(String value) {
            addCriterion("verify_remark <>", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkGreaterThan(String value) {
            addCriterion("verify_remark >", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("verify_remark >=", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkLessThan(String value) {
            addCriterion("verify_remark <", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkLessThanOrEqualTo(String value) {
            addCriterion("verify_remark <=", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkLike(String value) {
            addCriterion("verify_remark like", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkNotLike(String value) {
            addCriterion("verify_remark not like", value, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkIn(List<String> values) {
            addCriterion("verify_remark in", values, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkNotIn(List<String> values) {
            addCriterion("verify_remark not in", values, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkBetween(String value1, String value2) {
            addCriterion("verify_remark between", value1, value2, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andVerifyRemarkNotBetween(String value1, String value2) {
            addCriterion("verify_remark not between", value1, value2, "verifyRemark");
            return (Criteria) this;
        }

        public Criteria andRepaymentUserIsNull() {
            addCriterion("repayment_user is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentUserIsNotNull() {
            addCriterion("repayment_user is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentUserEqualTo(Integer value) {
            addCriterion("repayment_user =", value, "repaymentUser");
            return (Criteria) this;
        }

        public Criteria andRepaymentUserNotEqualTo(Integer value) {
            addCriterion("repayment_user <>", value, "repaymentUser");
            return (Criteria) this;
        }

        public Criteria andRepaymentUserGreaterThan(Integer value) {
            addCriterion("repayment_user >", value, "repaymentUser");
            return (Criteria) this;
        }

        public Criteria andRepaymentUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("repayment_user >=", value, "repaymentUser");
            return (Criteria) this;
        }

        public Criteria andRepaymentUserLessThan(Integer value) {
            addCriterion("repayment_user <", value, "repaymentUser");
            return (Criteria) this;
        }

        public Criteria andRepaymentUserLessThanOrEqualTo(Integer value) {
            addCriterion("repayment_user <=", value, "repaymentUser");
            return (Criteria) this;
        }

        public Criteria andRepaymentUserIn(List<Integer> values) {
            addCriterion("repayment_user in", values, "repaymentUser");
            return (Criteria) this;
        }

        public Criteria andRepaymentUserNotIn(List<Integer> values) {
            addCriterion("repayment_user not in", values, "repaymentUser");
            return (Criteria) this;
        }

        public Criteria andRepaymentUserBetween(Integer value1, Integer value2) {
            addCriterion("repayment_user between", value1, value2, "repaymentUser");
            return (Criteria) this;
        }

        public Criteria andRepaymentUserNotBetween(Integer value1, Integer value2) {
            addCriterion("repayment_user not between", value1, value2, "repaymentUser");
            return (Criteria) this;
        }

        public Criteria andForstAccountIsNull() {
            addCriterion("forst_account is null");
            return (Criteria) this;
        }

        public Criteria andForstAccountIsNotNull() {
            addCriterion("forst_account is not null");
            return (Criteria) this;
        }

        public Criteria andForstAccountEqualTo(String value) {
            addCriterion("forst_account =", value, "forstAccount");
            return (Criteria) this;
        }

        public Criteria andForstAccountNotEqualTo(String value) {
            addCriterion("forst_account <>", value, "forstAccount");
            return (Criteria) this;
        }

        public Criteria andForstAccountGreaterThan(String value) {
            addCriterion("forst_account >", value, "forstAccount");
            return (Criteria) this;
        }

        public Criteria andForstAccountGreaterThanOrEqualTo(String value) {
            addCriterion("forst_account >=", value, "forstAccount");
            return (Criteria) this;
        }

        public Criteria andForstAccountLessThan(String value) {
            addCriterion("forst_account <", value, "forstAccount");
            return (Criteria) this;
        }

        public Criteria andForstAccountLessThanOrEqualTo(String value) {
            addCriterion("forst_account <=", value, "forstAccount");
            return (Criteria) this;
        }

        public Criteria andForstAccountLike(String value) {
            addCriterion("forst_account like", value, "forstAccount");
            return (Criteria) this;
        }

        public Criteria andForstAccountNotLike(String value) {
            addCriterion("forst_account not like", value, "forstAccount");
            return (Criteria) this;
        }

        public Criteria andForstAccountIn(List<String> values) {
            addCriterion("forst_account in", values, "forstAccount");
            return (Criteria) this;
        }

        public Criteria andForstAccountNotIn(List<String> values) {
            addCriterion("forst_account not in", values, "forstAccount");
            return (Criteria) this;
        }

        public Criteria andForstAccountBetween(String value1, String value2) {
            addCriterion("forst_account between", value1, value2, "forstAccount");
            return (Criteria) this;
        }

        public Criteria andForstAccountNotBetween(String value1, String value2) {
            addCriterion("forst_account not between", value1, value2, "forstAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountIsNull() {
            addCriterion("repayment_account is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountIsNotNull() {
            addCriterion("repayment_account is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountEqualTo(String value) {
            addCriterion("repayment_account =", value, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountNotEqualTo(String value) {
            addCriterion("repayment_account <>", value, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountGreaterThan(String value) {
            addCriterion("repayment_account >", value, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_account >=", value, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountLessThan(String value) {
            addCriterion("repayment_account <", value, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountLessThanOrEqualTo(String value) {
            addCriterion("repayment_account <=", value, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountLike(String value) {
            addCriterion("repayment_account like", value, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountNotLike(String value) {
            addCriterion("repayment_account not like", value, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountIn(List<String> values) {
            addCriterion("repayment_account in", values, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountNotIn(List<String> values) {
            addCriterion("repayment_account not in", values, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountBetween(String value1, String value2) {
            addCriterion("repayment_account between", value1, value2, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentAccountNotBetween(String value1, String value2) {
            addCriterion("repayment_account not between", value1, value2, "repaymentAccount");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentIsNull() {
            addCriterion("monthly_repayment is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentIsNotNull() {
            addCriterion("monthly_repayment is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentEqualTo(String value) {
            addCriterion("monthly_repayment =", value, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentNotEqualTo(String value) {
            addCriterion("monthly_repayment <>", value, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentGreaterThan(String value) {
            addCriterion("monthly_repayment >", value, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentGreaterThanOrEqualTo(String value) {
            addCriterion("monthly_repayment >=", value, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentLessThan(String value) {
            addCriterion("monthly_repayment <", value, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentLessThanOrEqualTo(String value) {
            addCriterion("monthly_repayment <=", value, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentLike(String value) {
            addCriterion("monthly_repayment like", value, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentNotLike(String value) {
            addCriterion("monthly_repayment not like", value, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentIn(List<String> values) {
            addCriterion("monthly_repayment in", values, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentNotIn(List<String> values) {
            addCriterion("monthly_repayment not in", values, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentBetween(String value1, String value2) {
            addCriterion("monthly_repayment between", value1, value2, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andMonthlyRepaymentNotBetween(String value1, String value2) {
            addCriterion("monthly_repayment not between", value1, value2, "monthlyRepayment");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountIsNull() {
            addCriterion("repayment_yesaccount is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountIsNotNull() {
            addCriterion("repayment_yesaccount is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountEqualTo(String value) {
            addCriterion("repayment_yesaccount =", value, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountNotEqualTo(String value) {
            addCriterion("repayment_yesaccount <>", value, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountGreaterThan(String value) {
            addCriterion("repayment_yesaccount >", value, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_yesaccount >=", value, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountLessThan(String value) {
            addCriterion("repayment_yesaccount <", value, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountLessThanOrEqualTo(String value) {
            addCriterion("repayment_yesaccount <=", value, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountLike(String value) {
            addCriterion("repayment_yesaccount like", value, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountNotLike(String value) {
            addCriterion("repayment_yesaccount not like", value, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountIn(List<String> values) {
            addCriterion("repayment_yesaccount in", values, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountNotIn(List<String> values) {
            addCriterion("repayment_yesaccount not in", values, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountBetween(String value1, String value2) {
            addCriterion("repayment_yesaccount between", value1, value2, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesaccountNotBetween(String value1, String value2) {
            addCriterion("repayment_yesaccount not between", value1, value2, "repaymentYesaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeIsNull() {
            addCriterion("repayment_time is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeIsNotNull() {
            addCriterion("repayment_time is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeEqualTo(Date value) {
            addCriterion("repayment_time =", value, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeNotEqualTo(Date value) {
            addCriterion("repayment_time <>", value, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeGreaterThan(Date value) {
            addCriterion("repayment_time >", value, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("repayment_time >=", value, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeLessThan(Date value) {
            addCriterion("repayment_time <", value, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeLessThanOrEqualTo(Date value) {
            addCriterion("repayment_time <=", value, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeIn(List<Date> values) {
            addCriterion("repayment_time in", values, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeNotIn(List<Date> values) {
            addCriterion("repayment_time not in", values, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeBetween(Date value1, Date value2) {
            addCriterion("repayment_time between", value1, value2, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepaymentTimeNotBetween(Date value1, Date value2) {
            addCriterion("repayment_time not between", value1, value2, "repaymentTime");
            return (Criteria) this;
        }

        public Criteria andRepamyentRemarkIsNull() {
            addCriterion("repamyent_remark is null");
            return (Criteria) this;
        }

        public Criteria andRepamyentRemarkIsNotNull() {
            addCriterion("repamyent_remark is not null");
            return (Criteria) this;
        }

        public Criteria andRepamyentRemarkEqualTo(String value) {
            addCriterion("repamyent_remark =", value, "repamyentRemark");
            return (Criteria) this;
        }

        public Criteria andRepamyentRemarkNotEqualTo(String value) {
            addCriterion("repamyent_remark <>", value, "repamyentRemark");
            return (Criteria) this;
        }

        public Criteria andRepamyentRemarkGreaterThan(String value) {
            addCriterion("repamyent_remark >", value, "repamyentRemark");
            return (Criteria) this;
        }

        public Criteria andRepamyentRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("repamyent_remark >=", value, "repamyentRemark");
            return (Criteria) this;
        }

        public Criteria andRepamyentRemarkLessThan(String value) {
            addCriterion("repamyent_remark <", value, "repamyentRemark");
            return (Criteria) this;
        }

        public Criteria andRepamyentRemarkLessThanOrEqualTo(String value) {
            addCriterion("repamyent_remark <=", value, "repamyentRemark");
            return (Criteria) this;
        }

        public Criteria andRepamyentRemarkLike(String value) {
            addCriterion("repamyent_remark like", value, "repamyentRemark");
            return (Criteria) this;
        }

        public Criteria andRepamyentRemarkNotLike(String value) {
            addCriterion("repamyent_remark not like", value, "repamyentRemark");
            return (Criteria) this;
        }

        public Criteria andRepamyentRemarkIn(List<String> values) {
            addCriterion("repamyent_remark in", values, "repamyentRemark");
            return (Criteria) this;
        }

        public Criteria andRepamyentRemarkNotIn(List<String> values) {
            addCriterion("repamyent_remark not in", values, "repamyentRemark");
            return (Criteria) this;
        }

        public Criteria andRepamyentRemarkBetween(String value1, String value2) {
            addCriterion("repamyent_remark between", value1, value2, "repamyentRemark");
            return (Criteria) this;
        }

        public Criteria andRepamyentRemarkNotBetween(String value1, String value2) {
            addCriterion("repamyent_remark not between", value1, value2, "repamyentRemark");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIsNull() {
            addCriterion("success_time is null");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIsNotNull() {
            addCriterion("success_time is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeEqualTo(Date value) {
            addCriterion("success_time =", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotEqualTo(Date value) {
            addCriterion("success_time <>", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeGreaterThan(Date value) {
            addCriterion("success_time >", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("success_time >=", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeLessThan(Date value) {
            addCriterion("success_time <", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeLessThanOrEqualTo(Date value) {
            addCriterion("success_time <=", value, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeIn(List<Date> values) {
            addCriterion("success_time in", values, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotIn(List<Date> values) {
            addCriterion("success_time not in", values, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeBetween(Date value1, Date value2) {
            addCriterion("success_time between", value1, value2, "successTime");
            return (Criteria) this;
        }

        public Criteria andSuccessTimeNotBetween(Date value1, Date value2) {
            addCriterion("success_time not between", value1, value2, "successTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountIsNull() {
            addCriterion("payment_account is null");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountIsNotNull() {
            addCriterion("payment_account is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountEqualTo(String value) {
            addCriterion("payment_account =", value, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNotEqualTo(String value) {
            addCriterion("payment_account <>", value, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountGreaterThan(String value) {
            addCriterion("payment_account >", value, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountGreaterThanOrEqualTo(String value) {
            addCriterion("payment_account >=", value, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountLessThan(String value) {
            addCriterion("payment_account <", value, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountLessThanOrEqualTo(String value) {
            addCriterion("payment_account <=", value, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountLike(String value) {
            addCriterion("payment_account like", value, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNotLike(String value) {
            addCriterion("payment_account not like", value, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountIn(List<String> values) {
            addCriterion("payment_account in", values, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNotIn(List<String> values) {
            addCriterion("payment_account not in", values, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountBetween(String value1, String value2) {
            addCriterion("payment_account between", value1, value2, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andPaymentAccountNotBetween(String value1, String value2) {
            addCriterion("payment_account not between", value1, value2, "paymentAccount");
            return (Criteria) this;
        }

        public Criteria andEachTimeIsNull() {
            addCriterion("each_time is null");
            return (Criteria) this;
        }

        public Criteria andEachTimeIsNotNull() {
            addCriterion("each_time is not null");
            return (Criteria) this;
        }

        public Criteria andEachTimeEqualTo(String value) {
            addCriterion("each_time =", value, "eachTime");
            return (Criteria) this;
        }

        public Criteria andEachTimeNotEqualTo(String value) {
            addCriterion("each_time <>", value, "eachTime");
            return (Criteria) this;
        }

        public Criteria andEachTimeGreaterThan(String value) {
            addCriterion("each_time >", value, "eachTime");
            return (Criteria) this;
        }

        public Criteria andEachTimeGreaterThanOrEqualTo(String value) {
            addCriterion("each_time >=", value, "eachTime");
            return (Criteria) this;
        }

        public Criteria andEachTimeLessThan(String value) {
            addCriterion("each_time <", value, "eachTime");
            return (Criteria) this;
        }

        public Criteria andEachTimeLessThanOrEqualTo(String value) {
            addCriterion("each_time <=", value, "eachTime");
            return (Criteria) this;
        }

        public Criteria andEachTimeLike(String value) {
            addCriterion("each_time like", value, "eachTime");
            return (Criteria) this;
        }

        public Criteria andEachTimeNotLike(String value) {
            addCriterion("each_time not like", value, "eachTime");
            return (Criteria) this;
        }

        public Criteria andEachTimeIn(List<String> values) {
            addCriterion("each_time in", values, "eachTime");
            return (Criteria) this;
        }

        public Criteria andEachTimeNotIn(List<String> values) {
            addCriterion("each_time not in", values, "eachTime");
            return (Criteria) this;
        }

        public Criteria andEachTimeBetween(String value1, String value2) {
            addCriterion("each_time between", value1, value2, "eachTime");
            return (Criteria) this;
        }

        public Criteria andEachTimeNotBetween(String value1, String value2) {
            addCriterion("each_time not between", value1, value2, "eachTime");
            return (Criteria) this;
        }

        public Criteria andUseReasonIsNull() {
            addCriterion("use_reason is null");
            return (Criteria) this;
        }

        public Criteria andUseReasonIsNotNull() {
            addCriterion("use_reason is not null");
            return (Criteria) this;
        }

        public Criteria andUseReasonEqualTo(String value) {
            addCriterion("use_reason =", value, "useReason");
            return (Criteria) this;
        }

        public Criteria andUseReasonNotEqualTo(String value) {
            addCriterion("use_reason <>", value, "useReason");
            return (Criteria) this;
        }

        public Criteria andUseReasonGreaterThan(String value) {
            addCriterion("use_reason >", value, "useReason");
            return (Criteria) this;
        }

        public Criteria andUseReasonGreaterThanOrEqualTo(String value) {
            addCriterion("use_reason >=", value, "useReason");
            return (Criteria) this;
        }

        public Criteria andUseReasonLessThan(String value) {
            addCriterion("use_reason <", value, "useReason");
            return (Criteria) this;
        }

        public Criteria andUseReasonLessThanOrEqualTo(String value) {
            addCriterion("use_reason <=", value, "useReason");
            return (Criteria) this;
        }

        public Criteria andUseReasonLike(String value) {
            addCriterion("use_reason like", value, "useReason");
            return (Criteria) this;
        }

        public Criteria andUseReasonNotLike(String value) {
            addCriterion("use_reason not like", value, "useReason");
            return (Criteria) this;
        }

        public Criteria andUseReasonIn(List<String> values) {
            addCriterion("use_reason in", values, "useReason");
            return (Criteria) this;
        }

        public Criteria andUseReasonNotIn(List<String> values) {
            addCriterion("use_reason not in", values, "useReason");
            return (Criteria) this;
        }

        public Criteria andUseReasonBetween(String value1, String value2) {
            addCriterion("use_reason between", value1, value2, "useReason");
            return (Criteria) this;
        }

        public Criteria andUseReasonNotBetween(String value1, String value2) {
            addCriterion("use_reason not between", value1, value2, "useReason");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNull() {
            addCriterion("time_limit is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNotNull() {
            addCriterion("time_limit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEqualTo(String value) {
            addCriterion("time_limit =", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotEqualTo(String value) {
            addCriterion("time_limit <>", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThan(String value) {
            addCriterion("time_limit >", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThanOrEqualTo(String value) {
            addCriterion("time_limit >=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThan(String value) {
            addCriterion("time_limit <", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThanOrEqualTo(String value) {
            addCriterion("time_limit <=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLike(String value) {
            addCriterion("time_limit like", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotLike(String value) {
            addCriterion("time_limit not like", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIn(List<String> values) {
            addCriterion("time_limit in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotIn(List<String> values) {
            addCriterion("time_limit not in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitBetween(String value1, String value2) {
            addCriterion("time_limit between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotBetween(String value1, String value2) {
            addCriterion("time_limit not between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andStyleIsNull() {
            addCriterion("style is null");
            return (Criteria) this;
        }

        public Criteria andStyleIsNotNull() {
            addCriterion("style is not null");
            return (Criteria) this;
        }

        public Criteria andStyleEqualTo(String value) {
            addCriterion("style =", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotEqualTo(String value) {
            addCriterion("style <>", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThan(String value) {
            addCriterion("style >", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThanOrEqualTo(String value) {
            addCriterion("style >=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThan(String value) {
            addCriterion("style <", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThanOrEqualTo(String value) {
            addCriterion("style <=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLike(String value) {
            addCriterion("style like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotLike(String value) {
            addCriterion("style not like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleIn(List<String> values) {
            addCriterion("style in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotIn(List<String> values) {
            addCriterion("style not in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleBetween(String value1, String value2) {
            addCriterion("style between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotBetween(String value1, String value2) {
            addCriterion("style not between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodIsNull() {
            addCriterion("repayment_period is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodIsNotNull() {
            addCriterion("repayment_period is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodEqualTo(Integer value) {
            addCriterion("repayment_period =", value, "repaymentPeriod");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodNotEqualTo(Integer value) {
            addCriterion("repayment_period <>", value, "repaymentPeriod");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodGreaterThan(Integer value) {
            addCriterion("repayment_period >", value, "repaymentPeriod");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("repayment_period >=", value, "repaymentPeriod");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodLessThan(Integer value) {
            addCriterion("repayment_period <", value, "repaymentPeriod");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("repayment_period <=", value, "repaymentPeriod");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodIn(List<Integer> values) {
            addCriterion("repayment_period in", values, "repaymentPeriod");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodNotIn(List<Integer> values) {
            addCriterion("repayment_period not in", values, "repaymentPeriod");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodBetween(Integer value1, Integer value2) {
            addCriterion("repayment_period between", value1, value2, "repaymentPeriod");
            return (Criteria) this;
        }

        public Criteria andRepaymentPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("repayment_period not between", value1, value2, "repaymentPeriod");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountYesIsNull() {
            addCriterion("account_yes is null");
            return (Criteria) this;
        }

        public Criteria andAccountYesIsNotNull() {
            addCriterion("account_yes is not null");
            return (Criteria) this;
        }

        public Criteria andAccountYesEqualTo(String value) {
            addCriterion("account_yes =", value, "accountYes");
            return (Criteria) this;
        }

        public Criteria andAccountYesNotEqualTo(String value) {
            addCriterion("account_yes <>", value, "accountYes");
            return (Criteria) this;
        }

        public Criteria andAccountYesGreaterThan(String value) {
            addCriterion("account_yes >", value, "accountYes");
            return (Criteria) this;
        }

        public Criteria andAccountYesGreaterThanOrEqualTo(String value) {
            addCriterion("account_yes >=", value, "accountYes");
            return (Criteria) this;
        }

        public Criteria andAccountYesLessThan(String value) {
            addCriterion("account_yes <", value, "accountYes");
            return (Criteria) this;
        }

        public Criteria andAccountYesLessThanOrEqualTo(String value) {
            addCriterion("account_yes <=", value, "accountYes");
            return (Criteria) this;
        }

        public Criteria andAccountYesLike(String value) {
            addCriterion("account_yes like", value, "accountYes");
            return (Criteria) this;
        }

        public Criteria andAccountYesNotLike(String value) {
            addCriterion("account_yes not like", value, "accountYes");
            return (Criteria) this;
        }

        public Criteria andAccountYesIn(List<String> values) {
            addCriterion("account_yes in", values, "accountYes");
            return (Criteria) this;
        }

        public Criteria andAccountYesNotIn(List<String> values) {
            addCriterion("account_yes not in", values, "accountYes");
            return (Criteria) this;
        }

        public Criteria andAccountYesBetween(String value1, String value2) {
            addCriterion("account_yes between", value1, value2, "accountYes");
            return (Criteria) this;
        }

        public Criteria andAccountYesNotBetween(String value1, String value2) {
            addCriterion("account_yes not between", value1, value2, "accountYes");
            return (Criteria) this;
        }

        public Criteria andTenderTimesIsNull() {
            addCriterion("tender_times is null");
            return (Criteria) this;
        }

        public Criteria andTenderTimesIsNotNull() {
            addCriterion("tender_times is not null");
            return (Criteria) this;
        }

        public Criteria andTenderTimesEqualTo(String value) {
            addCriterion("tender_times =", value, "tenderTimes");
            return (Criteria) this;
        }

        public Criteria andTenderTimesNotEqualTo(String value) {
            addCriterion("tender_times <>", value, "tenderTimes");
            return (Criteria) this;
        }

        public Criteria andTenderTimesGreaterThan(String value) {
            addCriterion("tender_times >", value, "tenderTimes");
            return (Criteria) this;
        }

        public Criteria andTenderTimesGreaterThanOrEqualTo(String value) {
            addCriterion("tender_times >=", value, "tenderTimes");
            return (Criteria) this;
        }

        public Criteria andTenderTimesLessThan(String value) {
            addCriterion("tender_times <", value, "tenderTimes");
            return (Criteria) this;
        }

        public Criteria andTenderTimesLessThanOrEqualTo(String value) {
            addCriterion("tender_times <=", value, "tenderTimes");
            return (Criteria) this;
        }

        public Criteria andTenderTimesLike(String value) {
            addCriterion("tender_times like", value, "tenderTimes");
            return (Criteria) this;
        }

        public Criteria andTenderTimesNotLike(String value) {
            addCriterion("tender_times not like", value, "tenderTimes");
            return (Criteria) this;
        }

        public Criteria andTenderTimesIn(List<String> values) {
            addCriterion("tender_times in", values, "tenderTimes");
            return (Criteria) this;
        }

        public Criteria andTenderTimesNotIn(List<String> values) {
            addCriterion("tender_times not in", values, "tenderTimes");
            return (Criteria) this;
        }

        public Criteria andTenderTimesBetween(String value1, String value2) {
            addCriterion("tender_times between", value1, value2, "tenderTimes");
            return (Criteria) this;
        }

        public Criteria andTenderTimesNotBetween(String value1, String value2) {
            addCriterion("tender_times not between", value1, value2, "tenderTimes");
            return (Criteria) this;
        }

        public Criteria andAprIsNull() {
            addCriterion("apr is null");
            return (Criteria) this;
        }

        public Criteria andAprIsNotNull() {
            addCriterion("apr is not null");
            return (Criteria) this;
        }

        public Criteria andAprEqualTo(BigDecimal value) {
            addCriterion("apr =", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprNotEqualTo(BigDecimal value) {
            addCriterion("apr <>", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprGreaterThan(BigDecimal value) {
            addCriterion("apr >", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("apr >=", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprLessThan(BigDecimal value) {
            addCriterion("apr <", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprLessThanOrEqualTo(BigDecimal value) {
            addCriterion("apr <=", value, "apr");
            return (Criteria) this;
        }

        public Criteria andAprIn(List<BigDecimal> values) {
            addCriterion("apr in", values, "apr");
            return (Criteria) this;
        }

        public Criteria andAprNotIn(List<BigDecimal> values) {
            addCriterion("apr not in", values, "apr");
            return (Criteria) this;
        }

        public Criteria andAprBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apr between", value1, value2, "apr");
            return (Criteria) this;
        }

        public Criteria andAprNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apr not between", value1, value2, "apr");
            return (Criteria) this;
        }

        public Criteria andLowestAccountIsNull() {
            addCriterion("lowest_account is null");
            return (Criteria) this;
        }

        public Criteria andLowestAccountIsNotNull() {
            addCriterion("lowest_account is not null");
            return (Criteria) this;
        }

        public Criteria andLowestAccountEqualTo(String value) {
            addCriterion("lowest_account =", value, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andLowestAccountNotEqualTo(String value) {
            addCriterion("lowest_account <>", value, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andLowestAccountGreaterThan(String value) {
            addCriterion("lowest_account >", value, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andLowestAccountGreaterThanOrEqualTo(String value) {
            addCriterion("lowest_account >=", value, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andLowestAccountLessThan(String value) {
            addCriterion("lowest_account <", value, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andLowestAccountLessThanOrEqualTo(String value) {
            addCriterion("lowest_account <=", value, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andLowestAccountLike(String value) {
            addCriterion("lowest_account like", value, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andLowestAccountNotLike(String value) {
            addCriterion("lowest_account not like", value, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andLowestAccountIn(List<String> values) {
            addCriterion("lowest_account in", values, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andLowestAccountNotIn(List<String> values) {
            addCriterion("lowest_account not in", values, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andLowestAccountBetween(String value1, String value2) {
            addCriterion("lowest_account between", value1, value2, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andLowestAccountNotBetween(String value1, String value2) {
            addCriterion("lowest_account not between", value1, value2, "lowestAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountIsNull() {
            addCriterion("most_account is null");
            return (Criteria) this;
        }

        public Criteria andMostAccountIsNotNull() {
            addCriterion("most_account is not null");
            return (Criteria) this;
        }

        public Criteria andMostAccountEqualTo(String value) {
            addCriterion("most_account =", value, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountNotEqualTo(String value) {
            addCriterion("most_account <>", value, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountGreaterThan(String value) {
            addCriterion("most_account >", value, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountGreaterThanOrEqualTo(String value) {
            addCriterion("most_account >=", value, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountLessThan(String value) {
            addCriterion("most_account <", value, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountLessThanOrEqualTo(String value) {
            addCriterion("most_account <=", value, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountLike(String value) {
            addCriterion("most_account like", value, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountNotLike(String value) {
            addCriterion("most_account not like", value, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountIn(List<String> values) {
            addCriterion("most_account in", values, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountNotIn(List<String> values) {
            addCriterion("most_account not in", values, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountBetween(String value1, String value2) {
            addCriterion("most_account between", value1, value2, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andMostAccountNotBetween(String value1, String value2) {
            addCriterion("most_account not between", value1, value2, "mostAccount");
            return (Criteria) this;
        }

        public Criteria andValidTimeIsNull() {
            addCriterion("valid_time is null");
            return (Criteria) this;
        }

        public Criteria andValidTimeIsNotNull() {
            addCriterion("valid_time is not null");
            return (Criteria) this;
        }

        public Criteria andValidTimeEqualTo(String value) {
            addCriterion("valid_time =", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotEqualTo(String value) {
            addCriterion("valid_time <>", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeGreaterThan(String value) {
            addCriterion("valid_time >", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeGreaterThanOrEqualTo(String value) {
            addCriterion("valid_time >=", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeLessThan(String value) {
            addCriterion("valid_time <", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeLessThanOrEqualTo(String value) {
            addCriterion("valid_time <=", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeLike(String value) {
            addCriterion("valid_time like", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotLike(String value) {
            addCriterion("valid_time not like", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeIn(List<String> values) {
            addCriterion("valid_time in", values, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotIn(List<String> values) {
            addCriterion("valid_time not in", values, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeBetween(String value1, String value2) {
            addCriterion("valid_time between", value1, value2, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotBetween(String value1, String value2) {
            addCriterion("valid_time not between", value1, value2, "validTime");
            return (Criteria) this;
        }

        public Criteria andAwardIsNull() {
            addCriterion("award is null");
            return (Criteria) this;
        }

        public Criteria andAwardIsNotNull() {
            addCriterion("award is not null");
            return (Criteria) this;
        }

        public Criteria andAwardEqualTo(String value) {
            addCriterion("award =", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardNotEqualTo(String value) {
            addCriterion("award <>", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardGreaterThan(String value) {
            addCriterion("award >", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardGreaterThanOrEqualTo(String value) {
            addCriterion("award >=", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardLessThan(String value) {
            addCriterion("award <", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardLessThanOrEqualTo(String value) {
            addCriterion("award <=", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardLike(String value) {
            addCriterion("award like", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardNotLike(String value) {
            addCriterion("award not like", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardIn(List<String> values) {
            addCriterion("award in", values, "award");
            return (Criteria) this;
        }

        public Criteria andAwardNotIn(List<String> values) {
            addCriterion("award not in", values, "award");
            return (Criteria) this;
        }

        public Criteria andAwardBetween(String value1, String value2) {
            addCriterion("award between", value1, value2, "award");
            return (Criteria) this;
        }

        public Criteria andAwardNotBetween(String value1, String value2) {
            addCriterion("award not between", value1, value2, "award");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyIsNull() {
            addCriterion("deposit_money is null");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyIsNotNull() {
            addCriterion("deposit_money is not null");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyEqualTo(BigDecimal value) {
            addCriterion("deposit_money =", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyNotEqualTo(BigDecimal value) {
            addCriterion("deposit_money <>", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyGreaterThan(BigDecimal value) {
            addCriterion("deposit_money >", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_money >=", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyLessThan(BigDecimal value) {
            addCriterion("deposit_money <", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_money <=", value, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyIn(List<BigDecimal> values) {
            addCriterion("deposit_money in", values, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyNotIn(List<BigDecimal> values) {
            addCriterion("deposit_money not in", values, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_money between", value1, value2, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andDepositMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_money not between", value1, value2, "depositMoney");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIsNull() {
            addCriterion("fee_type is null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIsNotNull() {
            addCriterion("fee_type is not null");
            return (Criteria) this;
        }

        public Criteria andFeeTypeEqualTo(Integer value) {
            addCriterion("fee_type =", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotEqualTo(Integer value) {
            addCriterion("fee_type <>", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThan(Integer value) {
            addCriterion("fee_type >", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fee_type >=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThan(Integer value) {
            addCriterion("fee_type <", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("fee_type <=", value, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeIn(List<Integer> values) {
            addCriterion("fee_type in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotIn(List<Integer> values) {
            addCriterion("fee_type not in", values, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeBetween(Integer value1, Integer value2) {
            addCriterion("fee_type between", value1, value2, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("fee_type not between", value1, value2, "feeType");
            return (Criteria) this;
        }

        public Criteria andFeeMoneyIsNull() {
            addCriterion("fee_money is null");
            return (Criteria) this;
        }

        public Criteria andFeeMoneyIsNotNull() {
            addCriterion("fee_money is not null");
            return (Criteria) this;
        }

        public Criteria andFeeMoneyEqualTo(BigDecimal value) {
            addCriterion("fee_money =", value, "feeMoney");
            return (Criteria) this;
        }

        public Criteria andFeeMoneyNotEqualTo(BigDecimal value) {
            addCriterion("fee_money <>", value, "feeMoney");
            return (Criteria) this;
        }

        public Criteria andFeeMoneyGreaterThan(BigDecimal value) {
            addCriterion("fee_money >", value, "feeMoney");
            return (Criteria) this;
        }

        public Criteria andFeeMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_money >=", value, "feeMoney");
            return (Criteria) this;
        }

        public Criteria andFeeMoneyLessThan(BigDecimal value) {
            addCriterion("fee_money <", value, "feeMoney");
            return (Criteria) this;
        }

        public Criteria andFeeMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_money <=", value, "feeMoney");
            return (Criteria) this;
        }

        public Criteria andFeeMoneyIn(List<BigDecimal> values) {
            addCriterion("fee_money in", values, "feeMoney");
            return (Criteria) this;
        }

        public Criteria andFeeMoneyNotIn(List<BigDecimal> values) {
            addCriterion("fee_money not in", values, "feeMoney");
            return (Criteria) this;
        }

        public Criteria andFeeMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_money between", value1, value2, "feeMoney");
            return (Criteria) this;
        }

        public Criteria andFeeMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_money not between", value1, value2, "feeMoney");
            return (Criteria) this;
        }

        public Criteria andPartAccountIsNull() {
            addCriterion("part_account is null");
            return (Criteria) this;
        }

        public Criteria andPartAccountIsNotNull() {
            addCriterion("part_account is not null");
            return (Criteria) this;
        }

        public Criteria andPartAccountEqualTo(String value) {
            addCriterion("part_account =", value, "partAccount");
            return (Criteria) this;
        }

        public Criteria andPartAccountNotEqualTo(String value) {
            addCriterion("part_account <>", value, "partAccount");
            return (Criteria) this;
        }

        public Criteria andPartAccountGreaterThan(String value) {
            addCriterion("part_account >", value, "partAccount");
            return (Criteria) this;
        }

        public Criteria andPartAccountGreaterThanOrEqualTo(String value) {
            addCriterion("part_account >=", value, "partAccount");
            return (Criteria) this;
        }

        public Criteria andPartAccountLessThan(String value) {
            addCriterion("part_account <", value, "partAccount");
            return (Criteria) this;
        }

        public Criteria andPartAccountLessThanOrEqualTo(String value) {
            addCriterion("part_account <=", value, "partAccount");
            return (Criteria) this;
        }

        public Criteria andPartAccountLike(String value) {
            addCriterion("part_account like", value, "partAccount");
            return (Criteria) this;
        }

        public Criteria andPartAccountNotLike(String value) {
            addCriterion("part_account not like", value, "partAccount");
            return (Criteria) this;
        }

        public Criteria andPartAccountIn(List<String> values) {
            addCriterion("part_account in", values, "partAccount");
            return (Criteria) this;
        }

        public Criteria andPartAccountNotIn(List<String> values) {
            addCriterion("part_account not in", values, "partAccount");
            return (Criteria) this;
        }

        public Criteria andPartAccountBetween(String value1, String value2) {
            addCriterion("part_account between", value1, value2, "partAccount");
            return (Criteria) this;
        }

        public Criteria andPartAccountNotBetween(String value1, String value2) {
            addCriterion("part_account not between", value1, value2, "partAccount");
            return (Criteria) this;
        }

        public Criteria andFundsIsNull() {
            addCriterion("funds is null");
            return (Criteria) this;
        }

        public Criteria andFundsIsNotNull() {
            addCriterion("funds is not null");
            return (Criteria) this;
        }

        public Criteria andFundsEqualTo(String value) {
            addCriterion("funds =", value, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsNotEqualTo(String value) {
            addCriterion("funds <>", value, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsGreaterThan(String value) {
            addCriterion("funds >", value, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsGreaterThanOrEqualTo(String value) {
            addCriterion("funds >=", value, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsLessThan(String value) {
            addCriterion("funds <", value, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsLessThanOrEqualTo(String value) {
            addCriterion("funds <=", value, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsLike(String value) {
            addCriterion("funds like", value, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsNotLike(String value) {
            addCriterion("funds not like", value, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsIn(List<String> values) {
            addCriterion("funds in", values, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsNotIn(List<String> values) {
            addCriterion("funds not in", values, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsBetween(String value1, String value2) {
            addCriterion("funds between", value1, value2, "funds");
            return (Criteria) this;
        }

        public Criteria andFundsNotBetween(String value1, String value2) {
            addCriterion("funds not between", value1, value2, "funds");
            return (Criteria) this;
        }

        public Criteria andIsFalseIsNull() {
            addCriterion("is_false is null");
            return (Criteria) this;
        }

        public Criteria andIsFalseIsNotNull() {
            addCriterion("is_false is not null");
            return (Criteria) this;
        }

        public Criteria andIsFalseEqualTo(String value) {
            addCriterion("is_false =", value, "isFalse");
            return (Criteria) this;
        }

        public Criteria andIsFalseNotEqualTo(String value) {
            addCriterion("is_false <>", value, "isFalse");
            return (Criteria) this;
        }

        public Criteria andIsFalseGreaterThan(String value) {
            addCriterion("is_false >", value, "isFalse");
            return (Criteria) this;
        }

        public Criteria andIsFalseGreaterThanOrEqualTo(String value) {
            addCriterion("is_false >=", value, "isFalse");
            return (Criteria) this;
        }

        public Criteria andIsFalseLessThan(String value) {
            addCriterion("is_false <", value, "isFalse");
            return (Criteria) this;
        }

        public Criteria andIsFalseLessThanOrEqualTo(String value) {
            addCriterion("is_false <=", value, "isFalse");
            return (Criteria) this;
        }

        public Criteria andIsFalseLike(String value) {
            addCriterion("is_false like", value, "isFalse");
            return (Criteria) this;
        }

        public Criteria andIsFalseNotLike(String value) {
            addCriterion("is_false not like", value, "isFalse");
            return (Criteria) this;
        }

        public Criteria andIsFalseIn(List<String> values) {
            addCriterion("is_false in", values, "isFalse");
            return (Criteria) this;
        }

        public Criteria andIsFalseNotIn(List<String> values) {
            addCriterion("is_false not in", values, "isFalse");
            return (Criteria) this;
        }

        public Criteria andIsFalseBetween(String value1, String value2) {
            addCriterion("is_false between", value1, value2, "isFalse");
            return (Criteria) this;
        }

        public Criteria andIsFalseNotBetween(String value1, String value2) {
            addCriterion("is_false not between", value1, value2, "isFalse");
            return (Criteria) this;
        }

        public Criteria andOpenAccountIsNull() {
            addCriterion("open_account is null");
            return (Criteria) this;
        }

        public Criteria andOpenAccountIsNotNull() {
            addCriterion("open_account is not null");
            return (Criteria) this;
        }

        public Criteria andOpenAccountEqualTo(String value) {
            addCriterion("open_account =", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountNotEqualTo(String value) {
            addCriterion("open_account <>", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountGreaterThan(String value) {
            addCriterion("open_account >", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountGreaterThanOrEqualTo(String value) {
            addCriterion("open_account >=", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountLessThan(String value) {
            addCriterion("open_account <", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountLessThanOrEqualTo(String value) {
            addCriterion("open_account <=", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountLike(String value) {
            addCriterion("open_account like", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountNotLike(String value) {
            addCriterion("open_account not like", value, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountIn(List<String> values) {
            addCriterion("open_account in", values, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountNotIn(List<String> values) {
            addCriterion("open_account not in", values, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountBetween(String value1, String value2) {
            addCriterion("open_account between", value1, value2, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenAccountNotBetween(String value1, String value2) {
            addCriterion("open_account not between", value1, value2, "openAccount");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowIsNull() {
            addCriterion("open_borrow is null");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowIsNotNull() {
            addCriterion("open_borrow is not null");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowEqualTo(String value) {
            addCriterion("open_borrow =", value, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowNotEqualTo(String value) {
            addCriterion("open_borrow <>", value, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowGreaterThan(String value) {
            addCriterion("open_borrow >", value, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowGreaterThanOrEqualTo(String value) {
            addCriterion("open_borrow >=", value, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowLessThan(String value) {
            addCriterion("open_borrow <", value, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowLessThanOrEqualTo(String value) {
            addCriterion("open_borrow <=", value, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowLike(String value) {
            addCriterion("open_borrow like", value, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowNotLike(String value) {
            addCriterion("open_borrow not like", value, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowIn(List<String> values) {
            addCriterion("open_borrow in", values, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowNotIn(List<String> values) {
            addCriterion("open_borrow not in", values, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowBetween(String value1, String value2) {
            addCriterion("open_borrow between", value1, value2, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenBorrowNotBetween(String value1, String value2) {
            addCriterion("open_borrow not between", value1, value2, "openBorrow");
            return (Criteria) this;
        }

        public Criteria andOpenTenderIsNull() {
            addCriterion("open_tender is null");
            return (Criteria) this;
        }

        public Criteria andOpenTenderIsNotNull() {
            addCriterion("open_tender is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTenderEqualTo(String value) {
            addCriterion("open_tender =", value, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderNotEqualTo(String value) {
            addCriterion("open_tender <>", value, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderGreaterThan(String value) {
            addCriterion("open_tender >", value, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderGreaterThanOrEqualTo(String value) {
            addCriterion("open_tender >=", value, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderLessThan(String value) {
            addCriterion("open_tender <", value, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderLessThanOrEqualTo(String value) {
            addCriterion("open_tender <=", value, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderLike(String value) {
            addCriterion("open_tender like", value, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderNotLike(String value) {
            addCriterion("open_tender not like", value, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderIn(List<String> values) {
            addCriterion("open_tender in", values, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderNotIn(List<String> values) {
            addCriterion("open_tender not in", values, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderBetween(String value1, String value2) {
            addCriterion("open_tender between", value1, value2, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenTenderNotBetween(String value1, String value2) {
            addCriterion("open_tender not between", value1, value2, "openTender");
            return (Criteria) this;
        }

        public Criteria andOpenCreditIsNull() {
            addCriterion("open_credit is null");
            return (Criteria) this;
        }

        public Criteria andOpenCreditIsNotNull() {
            addCriterion("open_credit is not null");
            return (Criteria) this;
        }

        public Criteria andOpenCreditEqualTo(String value) {
            addCriterion("open_credit =", value, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditNotEqualTo(String value) {
            addCriterion("open_credit <>", value, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditGreaterThan(String value) {
            addCriterion("open_credit >", value, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditGreaterThanOrEqualTo(String value) {
            addCriterion("open_credit >=", value, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditLessThan(String value) {
            addCriterion("open_credit <", value, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditLessThanOrEqualTo(String value) {
            addCriterion("open_credit <=", value, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditLike(String value) {
            addCriterion("open_credit like", value, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditNotLike(String value) {
            addCriterion("open_credit not like", value, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditIn(List<String> values) {
            addCriterion("open_credit in", values, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditNotIn(List<String> values) {
            addCriterion("open_credit not in", values, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditBetween(String value1, String value2) {
            addCriterion("open_credit between", value1, value2, "openCredit");
            return (Criteria) this;
        }

        public Criteria andOpenCreditNotBetween(String value1, String value2) {
            addCriterion("open_credit not between", value1, value2, "openCredit");
            return (Criteria) this;
        }

        public Criteria andIsDoIsNull() {
            addCriterion("is_do is null");
            return (Criteria) this;
        }

        public Criteria andIsDoIsNotNull() {
            addCriterion("is_do is not null");
            return (Criteria) this;
        }

        public Criteria andIsDoEqualTo(String value) {
            addCriterion("is_do =", value, "isDo");
            return (Criteria) this;
        }

        public Criteria andIsDoNotEqualTo(String value) {
            addCriterion("is_do <>", value, "isDo");
            return (Criteria) this;
        }

        public Criteria andIsDoGreaterThan(String value) {
            addCriterion("is_do >", value, "isDo");
            return (Criteria) this;
        }

        public Criteria andIsDoGreaterThanOrEqualTo(String value) {
            addCriterion("is_do >=", value, "isDo");
            return (Criteria) this;
        }

        public Criteria andIsDoLessThan(String value) {
            addCriterion("is_do <", value, "isDo");
            return (Criteria) this;
        }

        public Criteria andIsDoLessThanOrEqualTo(String value) {
            addCriterion("is_do <=", value, "isDo");
            return (Criteria) this;
        }

        public Criteria andIsDoLike(String value) {
            addCriterion("is_do like", value, "isDo");
            return (Criteria) this;
        }

        public Criteria andIsDoNotLike(String value) {
            addCriterion("is_do not like", value, "isDo");
            return (Criteria) this;
        }

        public Criteria andIsDoIn(List<String> values) {
            addCriterion("is_do in", values, "isDo");
            return (Criteria) this;
        }

        public Criteria andIsDoNotIn(List<String> values) {
            addCriterion("is_do not in", values, "isDo");
            return (Criteria) this;
        }

        public Criteria andIsDoBetween(String value1, String value2) {
            addCriterion("is_do between", value1, value2, "isDo");
            return (Criteria) this;
        }

        public Criteria andIsDoNotBetween(String value1, String value2) {
            addCriterion("is_do not between", value1, value2, "isDo");
            return (Criteria) this;
        }

        public Criteria andIsMbIsNull() {
            addCriterion("is_mb is null");
            return (Criteria) this;
        }

        public Criteria andIsMbIsNotNull() {
            addCriterion("is_mb is not null");
            return (Criteria) this;
        }

        public Criteria andIsMbEqualTo(String value) {
            addCriterion("is_mb =", value, "isMb");
            return (Criteria) this;
        }

        public Criteria andIsMbNotEqualTo(String value) {
            addCriterion("is_mb <>", value, "isMb");
            return (Criteria) this;
        }

        public Criteria andIsMbGreaterThan(String value) {
            addCriterion("is_mb >", value, "isMb");
            return (Criteria) this;
        }

        public Criteria andIsMbGreaterThanOrEqualTo(String value) {
            addCriterion("is_mb >=", value, "isMb");
            return (Criteria) this;
        }

        public Criteria andIsMbLessThan(String value) {
            addCriterion("is_mb <", value, "isMb");
            return (Criteria) this;
        }

        public Criteria andIsMbLessThanOrEqualTo(String value) {
            addCriterion("is_mb <=", value, "isMb");
            return (Criteria) this;
        }

        public Criteria andIsMbLike(String value) {
            addCriterion("is_mb like", value, "isMb");
            return (Criteria) this;
        }

        public Criteria andIsMbNotLike(String value) {
            addCriterion("is_mb not like", value, "isMb");
            return (Criteria) this;
        }

        public Criteria andIsMbIn(List<String> values) {
            addCriterion("is_mb in", values, "isMb");
            return (Criteria) this;
        }

        public Criteria andIsMbNotIn(List<String> values) {
            addCriterion("is_mb not in", values, "isMb");
            return (Criteria) this;
        }

        public Criteria andIsMbBetween(String value1, String value2) {
            addCriterion("is_mb between", value1, value2, "isMb");
            return (Criteria) this;
        }

        public Criteria andIsMbNotBetween(String value1, String value2) {
            addCriterion("is_mb not between", value1, value2, "isMb");
            return (Criteria) this;
        }

        public Criteria andIsFastIsNull() {
            addCriterion("is_fast is null");
            return (Criteria) this;
        }

        public Criteria andIsFastIsNotNull() {
            addCriterion("is_fast is not null");
            return (Criteria) this;
        }

        public Criteria andIsFastEqualTo(String value) {
            addCriterion("is_fast =", value, "isFast");
            return (Criteria) this;
        }

        public Criteria andIsFastNotEqualTo(String value) {
            addCriterion("is_fast <>", value, "isFast");
            return (Criteria) this;
        }

        public Criteria andIsFastGreaterThan(String value) {
            addCriterion("is_fast >", value, "isFast");
            return (Criteria) this;
        }

        public Criteria andIsFastGreaterThanOrEqualTo(String value) {
            addCriterion("is_fast >=", value, "isFast");
            return (Criteria) this;
        }

        public Criteria andIsFastLessThan(String value) {
            addCriterion("is_fast <", value, "isFast");
            return (Criteria) this;
        }

        public Criteria andIsFastLessThanOrEqualTo(String value) {
            addCriterion("is_fast <=", value, "isFast");
            return (Criteria) this;
        }

        public Criteria andIsFastLike(String value) {
            addCriterion("is_fast like", value, "isFast");
            return (Criteria) this;
        }

        public Criteria andIsFastNotLike(String value) {
            addCriterion("is_fast not like", value, "isFast");
            return (Criteria) this;
        }

        public Criteria andIsFastIn(List<String> values) {
            addCriterion("is_fast in", values, "isFast");
            return (Criteria) this;
        }

        public Criteria andIsFastNotIn(List<String> values) {
            addCriterion("is_fast not in", values, "isFast");
            return (Criteria) this;
        }

        public Criteria andIsFastBetween(String value1, String value2) {
            addCriterion("is_fast between", value1, value2, "isFast");
            return (Criteria) this;
        }

        public Criteria andIsFastNotBetween(String value1, String value2) {
            addCriterion("is_fast not between", value1, value2, "isFast");
            return (Criteria) this;
        }

        public Criteria andIsDxbIsNull() {
            addCriterion("is_dxb is null");
            return (Criteria) this;
        }

        public Criteria andIsDxbIsNotNull() {
            addCriterion("is_dxb is not null");
            return (Criteria) this;
        }

        public Criteria andIsDxbEqualTo(String value) {
            addCriterion("is_dxb =", value, "isDxb");
            return (Criteria) this;
        }

        public Criteria andIsDxbNotEqualTo(String value) {
            addCriterion("is_dxb <>", value, "isDxb");
            return (Criteria) this;
        }

        public Criteria andIsDxbGreaterThan(String value) {
            addCriterion("is_dxb >", value, "isDxb");
            return (Criteria) this;
        }

        public Criteria andIsDxbGreaterThanOrEqualTo(String value) {
            addCriterion("is_dxb >=", value, "isDxb");
            return (Criteria) this;
        }

        public Criteria andIsDxbLessThan(String value) {
            addCriterion("is_dxb <", value, "isDxb");
            return (Criteria) this;
        }

        public Criteria andIsDxbLessThanOrEqualTo(String value) {
            addCriterion("is_dxb <=", value, "isDxb");
            return (Criteria) this;
        }

        public Criteria andIsDxbLike(String value) {
            addCriterion("is_dxb like", value, "isDxb");
            return (Criteria) this;
        }

        public Criteria andIsDxbNotLike(String value) {
            addCriterion("is_dxb not like", value, "isDxb");
            return (Criteria) this;
        }

        public Criteria andIsDxbIn(List<String> values) {
            addCriterion("is_dxb in", values, "isDxb");
            return (Criteria) this;
        }

        public Criteria andIsDxbNotIn(List<String> values) {
            addCriterion("is_dxb not in", values, "isDxb");
            return (Criteria) this;
        }

        public Criteria andIsDxbBetween(String value1, String value2) {
            addCriterion("is_dxb between", value1, value2, "isDxb");
            return (Criteria) this;
        }

        public Criteria andIsDxbNotBetween(String value1, String value2) {
            addCriterion("is_dxb not between", value1, value2, "isDxb");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andIsdayIsNull() {
            addCriterion("isday is null");
            return (Criteria) this;
        }

        public Criteria andIsdayIsNotNull() {
            addCriterion("isday is not null");
            return (Criteria) this;
        }

        public Criteria andIsdayEqualTo(String value) {
            addCriterion("isday =", value, "isday");
            return (Criteria) this;
        }

        public Criteria andIsdayNotEqualTo(String value) {
            addCriterion("isday <>", value, "isday");
            return (Criteria) this;
        }

        public Criteria andIsdayGreaterThan(String value) {
            addCriterion("isday >", value, "isday");
            return (Criteria) this;
        }

        public Criteria andIsdayGreaterThanOrEqualTo(String value) {
            addCriterion("isday >=", value, "isday");
            return (Criteria) this;
        }

        public Criteria andIsdayLessThan(String value) {
            addCriterion("isday <", value, "isday");
            return (Criteria) this;
        }

        public Criteria andIsdayLessThanOrEqualTo(String value) {
            addCriterion("isday <=", value, "isday");
            return (Criteria) this;
        }

        public Criteria andIsdayLike(String value) {
            addCriterion("isday like", value, "isday");
            return (Criteria) this;
        }

        public Criteria andIsdayNotLike(String value) {
            addCriterion("isday not like", value, "isday");
            return (Criteria) this;
        }

        public Criteria andIsdayIn(List<String> values) {
            addCriterion("isday in", values, "isday");
            return (Criteria) this;
        }

        public Criteria andIsdayNotIn(List<String> values) {
            addCriterion("isday not in", values, "isday");
            return (Criteria) this;
        }

        public Criteria andIsdayBetween(String value1, String value2) {
            addCriterion("isday between", value1, value2, "isday");
            return (Criteria) this;
        }

        public Criteria andIsdayNotBetween(String value1, String value2) {
            addCriterion("isday not between", value1, value2, "isday");
            return (Criteria) this;
        }

        public Criteria andTimeLimitDayIsNull() {
            addCriterion("time_limit_day is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitDayIsNotNull() {
            addCriterion("time_limit_day is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitDayEqualTo(String value) {
            addCriterion("time_limit_day =", value, "timeLimitDay");
            return (Criteria) this;
        }

        public Criteria andTimeLimitDayNotEqualTo(String value) {
            addCriterion("time_limit_day <>", value, "timeLimitDay");
            return (Criteria) this;
        }

        public Criteria andTimeLimitDayGreaterThan(String value) {
            addCriterion("time_limit_day >", value, "timeLimitDay");
            return (Criteria) this;
        }

        public Criteria andTimeLimitDayGreaterThanOrEqualTo(String value) {
            addCriterion("time_limit_day >=", value, "timeLimitDay");
            return (Criteria) this;
        }

        public Criteria andTimeLimitDayLessThan(String value) {
            addCriterion("time_limit_day <", value, "timeLimitDay");
            return (Criteria) this;
        }

        public Criteria andTimeLimitDayLessThanOrEqualTo(String value) {
            addCriterion("time_limit_day <=", value, "timeLimitDay");
            return (Criteria) this;
        }

        public Criteria andTimeLimitDayLike(String value) {
            addCriterion("time_limit_day like", value, "timeLimitDay");
            return (Criteria) this;
        }

        public Criteria andTimeLimitDayNotLike(String value) {
            addCriterion("time_limit_day not like", value, "timeLimitDay");
            return (Criteria) this;
        }

        public Criteria andTimeLimitDayIn(List<String> values) {
            addCriterion("time_limit_day in", values, "timeLimitDay");
            return (Criteria) this;
        }

        public Criteria andTimeLimitDayNotIn(List<String> values) {
            addCriterion("time_limit_day not in", values, "timeLimitDay");
            return (Criteria) this;
        }

        public Criteria andTimeLimitDayBetween(String value1, String value2) {
            addCriterion("time_limit_day between", value1, value2, "timeLimitDay");
            return (Criteria) this;
        }

        public Criteria andTimeLimitDayNotBetween(String value1, String value2) {
            addCriterion("time_limit_day not between", value1, value2, "timeLimitDay");
            return (Criteria) this;
        }

        public Criteria andAddPersionIsNull() {
            addCriterion("add_persion is null");
            return (Criteria) this;
        }

        public Criteria andAddPersionIsNotNull() {
            addCriterion("add_persion is not null");
            return (Criteria) this;
        }

        public Criteria andAddPersionEqualTo(String value) {
            addCriterion("add_persion =", value, "addPersion");
            return (Criteria) this;
        }

        public Criteria andAddPersionNotEqualTo(String value) {
            addCriterion("add_persion <>", value, "addPersion");
            return (Criteria) this;
        }

        public Criteria andAddPersionGreaterThan(String value) {
            addCriterion("add_persion >", value, "addPersion");
            return (Criteria) this;
        }

        public Criteria andAddPersionGreaterThanOrEqualTo(String value) {
            addCriterion("add_persion >=", value, "addPersion");
            return (Criteria) this;
        }

        public Criteria andAddPersionLessThan(String value) {
            addCriterion("add_persion <", value, "addPersion");
            return (Criteria) this;
        }

        public Criteria andAddPersionLessThanOrEqualTo(String value) {
            addCriterion("add_persion <=", value, "addPersion");
            return (Criteria) this;
        }

        public Criteria andAddPersionLike(String value) {
            addCriterion("add_persion like", value, "addPersion");
            return (Criteria) this;
        }

        public Criteria andAddPersionNotLike(String value) {
            addCriterion("add_persion not like", value, "addPersion");
            return (Criteria) this;
        }

        public Criteria andAddPersionIn(List<String> values) {
            addCriterion("add_persion in", values, "addPersion");
            return (Criteria) this;
        }

        public Criteria andAddPersionNotIn(List<String> values) {
            addCriterion("add_persion not in", values, "addPersion");
            return (Criteria) this;
        }

        public Criteria andAddPersionBetween(String value1, String value2) {
            addCriterion("add_persion between", value1, value2, "addPersion");
            return (Criteria) this;
        }

        public Criteria andAddPersionNotBetween(String value1, String value2) {
            addCriterion("add_persion not between", value1, value2, "addPersion");
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

        public Criteria andUpdatePersionIsNull() {
            addCriterion("update_persion is null");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionIsNotNull() {
            addCriterion("update_persion is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionEqualTo(String value) {
            addCriterion("update_persion =", value, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionNotEqualTo(String value) {
            addCriterion("update_persion <>", value, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionGreaterThan(String value) {
            addCriterion("update_persion >", value, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionGreaterThanOrEqualTo(String value) {
            addCriterion("update_persion >=", value, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionLessThan(String value) {
            addCriterion("update_persion <", value, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionLessThanOrEqualTo(String value) {
            addCriterion("update_persion <=", value, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionLike(String value) {
            addCriterion("update_persion like", value, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionNotLike(String value) {
            addCriterion("update_persion not like", value, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionIn(List<String> values) {
            addCriterion("update_persion in", values, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionNotIn(List<String> values) {
            addCriterion("update_persion not in", values, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionBetween(String value1, String value2) {
            addCriterion("update_persion between", value1, value2, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdatePersionNotBetween(String value1, String value2) {
            addCriterion("update_persion not between", value1, value2, "updatePersion");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andOperatorIpIsNull() {
            addCriterion("operator_ip is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIpIsNotNull() {
            addCriterion("operator_ip is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIpEqualTo(String value) {
            addCriterion("operator_ip =", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpNotEqualTo(String value) {
            addCriterion("operator_ip <>", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpGreaterThan(String value) {
            addCriterion("operator_ip >", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpGreaterThanOrEqualTo(String value) {
            addCriterion("operator_ip >=", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpLessThan(String value) {
            addCriterion("operator_ip <", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpLessThanOrEqualTo(String value) {
            addCriterion("operator_ip <=", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpLike(String value) {
            addCriterion("operator_ip like", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpNotLike(String value) {
            addCriterion("operator_ip not like", value, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpIn(List<String> values) {
            addCriterion("operator_ip in", values, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpNotIn(List<String> values) {
            addCriterion("operator_ip not in", values, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpBetween(String value1, String value2) {
            addCriterion("operator_ip between", value1, value2, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andOperatorIpNotBetween(String value1, String value2) {
            addCriterion("operator_ip not between", value1, value2, "operatorIp");
            return (Criteria) this;
        }

        public Criteria andScheduleIsNull() {
            addCriterion("schedule is null");
            return (Criteria) this;
        }

        public Criteria andScheduleIsNotNull() {
            addCriterion("schedule is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleEqualTo(String value) {
            addCriterion("schedule =", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotEqualTo(String value) {
            addCriterion("schedule <>", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleGreaterThan(String value) {
            addCriterion("schedule >", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleGreaterThanOrEqualTo(String value) {
            addCriterion("schedule >=", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleLessThan(String value) {
            addCriterion("schedule <", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleLessThanOrEqualTo(String value) {
            addCriterion("schedule <=", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleLike(String value) {
            addCriterion("schedule like", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotLike(String value) {
            addCriterion("schedule not like", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleIn(List<String> values) {
            addCriterion("schedule in", values, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotIn(List<String> values) {
            addCriterion("schedule not in", values, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleBetween(String value1, String value2) {
            addCriterion("schedule between", value1, value2, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotBetween(String value1, String value2) {
            addCriterion("schedule not between", value1, value2, "schedule");
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

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(String value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(String value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(String value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(String value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(String value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(String value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLike(String value) {
            addCriterion("balance like", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotLike(String value) {
            addCriterion("balance not like", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<String> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<String> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(String value1, String value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(String value1, String value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBorImageFirstIsNull() {
            addCriterion("bor_image_first is null");
            return (Criteria) this;
        }

        public Criteria andBorImageFirstIsNotNull() {
            addCriterion("bor_image_first is not null");
            return (Criteria) this;
        }

        public Criteria andBorImageFirstEqualTo(String value) {
            addCriterion("bor_image_first =", value, "borImageFirst");
            return (Criteria) this;
        }

        public Criteria andBorImageFirstNotEqualTo(String value) {
            addCriterion("bor_image_first <>", value, "borImageFirst");
            return (Criteria) this;
        }

        public Criteria andBorImageFirstGreaterThan(String value) {
            addCriterion("bor_image_first >", value, "borImageFirst");
            return (Criteria) this;
        }

        public Criteria andBorImageFirstGreaterThanOrEqualTo(String value) {
            addCriterion("bor_image_first >=", value, "borImageFirst");
            return (Criteria) this;
        }

        public Criteria andBorImageFirstLessThan(String value) {
            addCriterion("bor_image_first <", value, "borImageFirst");
            return (Criteria) this;
        }

        public Criteria andBorImageFirstLessThanOrEqualTo(String value) {
            addCriterion("bor_image_first <=", value, "borImageFirst");
            return (Criteria) this;
        }

        public Criteria andBorImageFirstLike(String value) {
            addCriterion("bor_image_first like", value, "borImageFirst");
            return (Criteria) this;
        }

        public Criteria andBorImageFirstNotLike(String value) {
            addCriterion("bor_image_first not like", value, "borImageFirst");
            return (Criteria) this;
        }

        public Criteria andBorImageFirstIn(List<String> values) {
            addCriterion("bor_image_first in", values, "borImageFirst");
            return (Criteria) this;
        }

        public Criteria andBorImageFirstNotIn(List<String> values) {
            addCriterion("bor_image_first not in", values, "borImageFirst");
            return (Criteria) this;
        }

        public Criteria andBorImageFirstBetween(String value1, String value2) {
            addCriterion("bor_image_first between", value1, value2, "borImageFirst");
            return (Criteria) this;
        }

        public Criteria andBorImageFirstNotBetween(String value1, String value2) {
            addCriterion("bor_image_first not between", value1, value2, "borImageFirst");
            return (Criteria) this;
        }

        public Criteria andBorStagesIsNull() {
            addCriterion("bor_stages is null");
            return (Criteria) this;
        }

        public Criteria andBorStagesIsNotNull() {
            addCriterion("bor_stages is not null");
            return (Criteria) this;
        }

        public Criteria andBorStagesEqualTo(String value) {
            addCriterion("bor_stages =", value, "borStages");
            return (Criteria) this;
        }

        public Criteria andBorStagesNotEqualTo(String value) {
            addCriterion("bor_stages <>", value, "borStages");
            return (Criteria) this;
        }

        public Criteria andBorStagesGreaterThan(String value) {
            addCriterion("bor_stages >", value, "borStages");
            return (Criteria) this;
        }

        public Criteria andBorStagesGreaterThanOrEqualTo(String value) {
            addCriterion("bor_stages >=", value, "borStages");
            return (Criteria) this;
        }

        public Criteria andBorStagesLessThan(String value) {
            addCriterion("bor_stages <", value, "borStages");
            return (Criteria) this;
        }

        public Criteria andBorStagesLessThanOrEqualTo(String value) {
            addCriterion("bor_stages <=", value, "borStages");
            return (Criteria) this;
        }

        public Criteria andBorStagesLike(String value) {
            addCriterion("bor_stages like", value, "borStages");
            return (Criteria) this;
        }

        public Criteria andBorStagesNotLike(String value) {
            addCriterion("bor_stages not like", value, "borStages");
            return (Criteria) this;
        }

        public Criteria andBorStagesIn(List<String> values) {
            addCriterion("bor_stages in", values, "borStages");
            return (Criteria) this;
        }

        public Criteria andBorStagesNotIn(List<String> values) {
            addCriterion("bor_stages not in", values, "borStages");
            return (Criteria) this;
        }

        public Criteria andBorStagesBetween(String value1, String value2) {
            addCriterion("bor_stages between", value1, value2, "borStages");
            return (Criteria) this;
        }

        public Criteria andBorStagesNotBetween(String value1, String value2) {
            addCriterion("bor_stages not between", value1, value2, "borStages");
            return (Criteria) this;
        }

        public Criteria andWanderTenderTimesIsNull() {
            addCriterion("wander_tender_times is null");
            return (Criteria) this;
        }

        public Criteria andWanderTenderTimesIsNotNull() {
            addCriterion("wander_tender_times is not null");
            return (Criteria) this;
        }

        public Criteria andWanderTenderTimesEqualTo(Integer value) {
            addCriterion("wander_tender_times =", value, "wanderTenderTimes");
            return (Criteria) this;
        }

        public Criteria andWanderTenderTimesNotEqualTo(Integer value) {
            addCriterion("wander_tender_times <>", value, "wanderTenderTimes");
            return (Criteria) this;
        }

        public Criteria andWanderTenderTimesGreaterThan(Integer value) {
            addCriterion("wander_tender_times >", value, "wanderTenderTimes");
            return (Criteria) this;
        }

        public Criteria andWanderTenderTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("wander_tender_times >=", value, "wanderTenderTimes");
            return (Criteria) this;
        }

        public Criteria andWanderTenderTimesLessThan(Integer value) {
            addCriterion("wander_tender_times <", value, "wanderTenderTimes");
            return (Criteria) this;
        }

        public Criteria andWanderTenderTimesLessThanOrEqualTo(Integer value) {
            addCriterion("wander_tender_times <=", value, "wanderTenderTimes");
            return (Criteria) this;
        }

        public Criteria andWanderTenderTimesIn(List<Integer> values) {
            addCriterion("wander_tender_times in", values, "wanderTenderTimes");
            return (Criteria) this;
        }

        public Criteria andWanderTenderTimesNotIn(List<Integer> values) {
            addCriterion("wander_tender_times not in", values, "wanderTenderTimes");
            return (Criteria) this;
        }

        public Criteria andWanderTenderTimesBetween(Integer value1, Integer value2) {
            addCriterion("wander_tender_times between", value1, value2, "wanderTenderTimes");
            return (Criteria) this;
        }

        public Criteria andWanderTenderTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("wander_tender_times not between", value1, value2, "wanderTenderTimes");
            return (Criteria) this;
        }

        public Criteria andWanderPieceSizeIsNull() {
            addCriterion("wander_piece_size is null");
            return (Criteria) this;
        }

        public Criteria andWanderPieceSizeIsNotNull() {
            addCriterion("wander_piece_size is not null");
            return (Criteria) this;
        }

        public Criteria andWanderPieceSizeEqualTo(Integer value) {
            addCriterion("wander_piece_size =", value, "wanderPieceSize");
            return (Criteria) this;
        }

        public Criteria andWanderPieceSizeNotEqualTo(Integer value) {
            addCriterion("wander_piece_size <>", value, "wanderPieceSize");
            return (Criteria) this;
        }

        public Criteria andWanderPieceSizeGreaterThan(Integer value) {
            addCriterion("wander_piece_size >", value, "wanderPieceSize");
            return (Criteria) this;
        }

        public Criteria andWanderPieceSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("wander_piece_size >=", value, "wanderPieceSize");
            return (Criteria) this;
        }

        public Criteria andWanderPieceSizeLessThan(Integer value) {
            addCriterion("wander_piece_size <", value, "wanderPieceSize");
            return (Criteria) this;
        }

        public Criteria andWanderPieceSizeLessThanOrEqualTo(Integer value) {
            addCriterion("wander_piece_size <=", value, "wanderPieceSize");
            return (Criteria) this;
        }

        public Criteria andWanderPieceSizeIn(List<Integer> values) {
            addCriterion("wander_piece_size in", values, "wanderPieceSize");
            return (Criteria) this;
        }

        public Criteria andWanderPieceSizeNotIn(List<Integer> values) {
            addCriterion("wander_piece_size not in", values, "wanderPieceSize");
            return (Criteria) this;
        }

        public Criteria andWanderPieceSizeBetween(Integer value1, Integer value2) {
            addCriterion("wander_piece_size between", value1, value2, "wanderPieceSize");
            return (Criteria) this;
        }

        public Criteria andWanderPieceSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("wander_piece_size not between", value1, value2, "wanderPieceSize");
            return (Criteria) this;
        }

        public Criteria andWanderPieceMoneyIsNull() {
            addCriterion("wander_piece_money is null");
            return (Criteria) this;
        }

        public Criteria andWanderPieceMoneyIsNotNull() {
            addCriterion("wander_piece_money is not null");
            return (Criteria) this;
        }

        public Criteria andWanderPieceMoneyEqualTo(BigDecimal value) {
            addCriterion("wander_piece_money =", value, "wanderPieceMoney");
            return (Criteria) this;
        }

        public Criteria andWanderPieceMoneyNotEqualTo(BigDecimal value) {
            addCriterion("wander_piece_money <>", value, "wanderPieceMoney");
            return (Criteria) this;
        }

        public Criteria andWanderPieceMoneyGreaterThan(BigDecimal value) {
            addCriterion("wander_piece_money >", value, "wanderPieceMoney");
            return (Criteria) this;
        }

        public Criteria andWanderPieceMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wander_piece_money >=", value, "wanderPieceMoney");
            return (Criteria) this;
        }

        public Criteria andWanderPieceMoneyLessThan(BigDecimal value) {
            addCriterion("wander_piece_money <", value, "wanderPieceMoney");
            return (Criteria) this;
        }

        public Criteria andWanderPieceMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wander_piece_money <=", value, "wanderPieceMoney");
            return (Criteria) this;
        }

        public Criteria andWanderPieceMoneyIn(List<BigDecimal> values) {
            addCriterion("wander_piece_money in", values, "wanderPieceMoney");
            return (Criteria) this;
        }

        public Criteria andWanderPieceMoneyNotIn(List<BigDecimal> values) {
            addCriterion("wander_piece_money not in", values, "wanderPieceMoney");
            return (Criteria) this;
        }

        public Criteria andWanderPieceMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wander_piece_money between", value1, value2, "wanderPieceMoney");
            return (Criteria) this;
        }

        public Criteria andWanderPieceMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wander_piece_money not between", value1, value2, "wanderPieceMoney");
            return (Criteria) this;
        }

        public Criteria andWanderRedeemTimesIsNull() {
            addCriterion("wander_redeem_times is null");
            return (Criteria) this;
        }

        public Criteria andWanderRedeemTimesIsNotNull() {
            addCriterion("wander_redeem_times is not null");
            return (Criteria) this;
        }

        public Criteria andWanderRedeemTimesEqualTo(Integer value) {
            addCriterion("wander_redeem_times =", value, "wanderRedeemTimes");
            return (Criteria) this;
        }

        public Criteria andWanderRedeemTimesNotEqualTo(Integer value) {
            addCriterion("wander_redeem_times <>", value, "wanderRedeemTimes");
            return (Criteria) this;
        }

        public Criteria andWanderRedeemTimesGreaterThan(Integer value) {
            addCriterion("wander_redeem_times >", value, "wanderRedeemTimes");
            return (Criteria) this;
        }

        public Criteria andWanderRedeemTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("wander_redeem_times >=", value, "wanderRedeemTimes");
            return (Criteria) this;
        }

        public Criteria andWanderRedeemTimesLessThan(Integer value) {
            addCriterion("wander_redeem_times <", value, "wanderRedeemTimes");
            return (Criteria) this;
        }

        public Criteria andWanderRedeemTimesLessThanOrEqualTo(Integer value) {
            addCriterion("wander_redeem_times <=", value, "wanderRedeemTimes");
            return (Criteria) this;
        }

        public Criteria andWanderRedeemTimesIn(List<Integer> values) {
            addCriterion("wander_redeem_times in", values, "wanderRedeemTimes");
            return (Criteria) this;
        }

        public Criteria andWanderRedeemTimesNotIn(List<Integer> values) {
            addCriterion("wander_redeem_times not in", values, "wanderRedeemTimes");
            return (Criteria) this;
        }

        public Criteria andWanderRedeemTimesBetween(Integer value1, Integer value2) {
            addCriterion("wander_redeem_times between", value1, value2, "wanderRedeemTimes");
            return (Criteria) this;
        }

        public Criteria andWanderRedeemTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("wander_redeem_times not between", value1, value2, "wanderRedeemTimes");
            return (Criteria) this;
        }

        public Criteria andFinalRepayDateIsNull() {
            addCriterion("final_repay_date is null");
            return (Criteria) this;
        }

        public Criteria andFinalRepayDateIsNotNull() {
            addCriterion("final_repay_date is not null");
            return (Criteria) this;
        }

        public Criteria andFinalRepayDateEqualTo(Date value) {
            addCriterion("final_repay_date =", value, "finalRepayDate");
            return (Criteria) this;
        }

        public Criteria andFinalRepayDateNotEqualTo(Date value) {
            addCriterion("final_repay_date <>", value, "finalRepayDate");
            return (Criteria) this;
        }

        public Criteria andFinalRepayDateGreaterThan(Date value) {
            addCriterion("final_repay_date >", value, "finalRepayDate");
            return (Criteria) this;
        }

        public Criteria andFinalRepayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("final_repay_date >=", value, "finalRepayDate");
            return (Criteria) this;
        }

        public Criteria andFinalRepayDateLessThan(Date value) {
            addCriterion("final_repay_date <", value, "finalRepayDate");
            return (Criteria) this;
        }

        public Criteria andFinalRepayDateLessThanOrEqualTo(Date value) {
            addCriterion("final_repay_date <=", value, "finalRepayDate");
            return (Criteria) this;
        }

        public Criteria andFinalRepayDateIn(List<Date> values) {
            addCriterion("final_repay_date in", values, "finalRepayDate");
            return (Criteria) this;
        }

        public Criteria andFinalRepayDateNotIn(List<Date> values) {
            addCriterion("final_repay_date not in", values, "finalRepayDate");
            return (Criteria) this;
        }

        public Criteria andFinalRepayDateBetween(Date value1, Date value2) {
            addCriterion("final_repay_date between", value1, value2, "finalRepayDate");
            return (Criteria) this;
        }

        public Criteria andFinalRepayDateNotBetween(Date value1, Date value2) {
            addCriterion("final_repay_date not between", value1, value2, "finalRepayDate");
            return (Criteria) this;
        }

        public Criteria andNextRepayDateIsNull() {
            addCriterion("next_repay_date is null");
            return (Criteria) this;
        }

        public Criteria andNextRepayDateIsNotNull() {
            addCriterion("next_repay_date is not null");
            return (Criteria) this;
        }

        public Criteria andNextRepayDateEqualTo(Date value) {
            addCriterion("next_repay_date =", value, "nextRepayDate");
            return (Criteria) this;
        }

        public Criteria andNextRepayDateNotEqualTo(Date value) {
            addCriterion("next_repay_date <>", value, "nextRepayDate");
            return (Criteria) this;
        }

        public Criteria andNextRepayDateGreaterThan(Date value) {
            addCriterion("next_repay_date >", value, "nextRepayDate");
            return (Criteria) this;
        }

        public Criteria andNextRepayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("next_repay_date >=", value, "nextRepayDate");
            return (Criteria) this;
        }

        public Criteria andNextRepayDateLessThan(Date value) {
            addCriterion("next_repay_date <", value, "nextRepayDate");
            return (Criteria) this;
        }

        public Criteria andNextRepayDateLessThanOrEqualTo(Date value) {
            addCriterion("next_repay_date <=", value, "nextRepayDate");
            return (Criteria) this;
        }

        public Criteria andNextRepayDateIn(List<Date> values) {
            addCriterion("next_repay_date in", values, "nextRepayDate");
            return (Criteria) this;
        }

        public Criteria andNextRepayDateNotIn(List<Date> values) {
            addCriterion("next_repay_date not in", values, "nextRepayDate");
            return (Criteria) this;
        }

        public Criteria andNextRepayDateBetween(Date value1, Date value2) {
            addCriterion("next_repay_date between", value1, value2, "nextRepayDate");
            return (Criteria) this;
        }

        public Criteria andNextRepayDateNotBetween(Date value1, Date value2) {
            addCriterion("next_repay_date not between", value1, value2, "nextRepayDate");
            return (Criteria) this;
        }

        public Criteria andBonusIsNull() {
            addCriterion("bonus is null");
            return (Criteria) this;
        }

        public Criteria andBonusIsNotNull() {
            addCriterion("bonus is not null");
            return (Criteria) this;
        }

        public Criteria andBonusEqualTo(BigDecimal value) {
            addCriterion("bonus =", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotEqualTo(BigDecimal value) {
            addCriterion("bonus <>", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThan(BigDecimal value) {
            addCriterion("bonus >", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bonus >=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThan(BigDecimal value) {
            addCriterion("bonus <", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bonus <=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusIn(List<BigDecimal> values) {
            addCriterion("bonus in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotIn(List<BigDecimal> values) {
            addCriterion("bonus not in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonus between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonus not between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andInterestTotalIsNull() {
            addCriterion("interest_total is null");
            return (Criteria) this;
        }

        public Criteria andInterestTotalIsNotNull() {
            addCriterion("interest_total is not null");
            return (Criteria) this;
        }

        public Criteria andInterestTotalEqualTo(BigDecimal value) {
            addCriterion("interest_total =", value, "interestTotal");
            return (Criteria) this;
        }

        public Criteria andInterestTotalNotEqualTo(BigDecimal value) {
            addCriterion("interest_total <>", value, "interestTotal");
            return (Criteria) this;
        }

        public Criteria andInterestTotalGreaterThan(BigDecimal value) {
            addCriterion("interest_total >", value, "interestTotal");
            return (Criteria) this;
        }

        public Criteria andInterestTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_total >=", value, "interestTotal");
            return (Criteria) this;
        }

        public Criteria andInterestTotalLessThan(BigDecimal value) {
            addCriterion("interest_total <", value, "interestTotal");
            return (Criteria) this;
        }

        public Criteria andInterestTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest_total <=", value, "interestTotal");
            return (Criteria) this;
        }

        public Criteria andInterestTotalIn(List<BigDecimal> values) {
            addCriterion("interest_total in", values, "interestTotal");
            return (Criteria) this;
        }

        public Criteria andInterestTotalNotIn(List<BigDecimal> values) {
            addCriterion("interest_total not in", values, "interestTotal");
            return (Criteria) this;
        }

        public Criteria andInterestTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_total between", value1, value2, "interestTotal");
            return (Criteria) this;
        }

        public Criteria andInterestTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest_total not between", value1, value2, "interestTotal");
            return (Criteria) this;
        }

        public Criteria andRepayCapitalIsNull() {
            addCriterion("repay_capital is null");
            return (Criteria) this;
        }

        public Criteria andRepayCapitalIsNotNull() {
            addCriterion("repay_capital is not null");
            return (Criteria) this;
        }

        public Criteria andRepayCapitalEqualTo(BigDecimal value) {
            addCriterion("repay_capital =", value, "repayCapital");
            return (Criteria) this;
        }

        public Criteria andRepayCapitalNotEqualTo(BigDecimal value) {
            addCriterion("repay_capital <>", value, "repayCapital");
            return (Criteria) this;
        }

        public Criteria andRepayCapitalGreaterThan(BigDecimal value) {
            addCriterion("repay_capital >", value, "repayCapital");
            return (Criteria) this;
        }

        public Criteria andRepayCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_capital >=", value, "repayCapital");
            return (Criteria) this;
        }

        public Criteria andRepayCapitalLessThan(BigDecimal value) {
            addCriterion("repay_capital <", value, "repayCapital");
            return (Criteria) this;
        }

        public Criteria andRepayCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_capital <=", value, "repayCapital");
            return (Criteria) this;
        }

        public Criteria andRepayCapitalIn(List<BigDecimal> values) {
            addCriterion("repay_capital in", values, "repayCapital");
            return (Criteria) this;
        }

        public Criteria andRepayCapitalNotIn(List<BigDecimal> values) {
            addCriterion("repay_capital not in", values, "repayCapital");
            return (Criteria) this;
        }

        public Criteria andRepayCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_capital between", value1, value2, "repayCapital");
            return (Criteria) this;
        }

        public Criteria andRepayCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_capital not between", value1, value2, "repayCapital");
            return (Criteria) this;
        }

        public Criteria andRepayInterestIsNull() {
            addCriterion("repay_interest is null");
            return (Criteria) this;
        }

        public Criteria andRepayInterestIsNotNull() {
            addCriterion("repay_interest is not null");
            return (Criteria) this;
        }

        public Criteria andRepayInterestEqualTo(BigDecimal value) {
            addCriterion("repay_interest =", value, "repayInterest");
            return (Criteria) this;
        }

        public Criteria andRepayInterestNotEqualTo(BigDecimal value) {
            addCriterion("repay_interest <>", value, "repayInterest");
            return (Criteria) this;
        }

        public Criteria andRepayInterestGreaterThan(BigDecimal value) {
            addCriterion("repay_interest >", value, "repayInterest");
            return (Criteria) this;
        }

        public Criteria andRepayInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_interest >=", value, "repayInterest");
            return (Criteria) this;
        }

        public Criteria andRepayInterestLessThan(BigDecimal value) {
            addCriterion("repay_interest <", value, "repayInterest");
            return (Criteria) this;
        }

        public Criteria andRepayInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repay_interest <=", value, "repayInterest");
            return (Criteria) this;
        }

        public Criteria andRepayInterestIn(List<BigDecimal> values) {
            addCriterion("repay_interest in", values, "repayInterest");
            return (Criteria) this;
        }

        public Criteria andRepayInterestNotIn(List<BigDecimal> values) {
            addCriterion("repay_interest not in", values, "repayInterest");
            return (Criteria) this;
        }

        public Criteria andRepayInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_interest between", value1, value2, "repayInterest");
            return (Criteria) this;
        }

        public Criteria andRepayInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repay_interest not between", value1, value2, "repayInterest");
            return (Criteria) this;
        }

        public Criteria andPayedCapitalIsNull() {
            addCriterion("payed_capital is null");
            return (Criteria) this;
        }

        public Criteria andPayedCapitalIsNotNull() {
            addCriterion("payed_capital is not null");
            return (Criteria) this;
        }

        public Criteria andPayedCapitalEqualTo(BigDecimal value) {
            addCriterion("payed_capital =", value, "payedCapital");
            return (Criteria) this;
        }

        public Criteria andPayedCapitalNotEqualTo(BigDecimal value) {
            addCriterion("payed_capital <>", value, "payedCapital");
            return (Criteria) this;
        }

        public Criteria andPayedCapitalGreaterThan(BigDecimal value) {
            addCriterion("payed_capital >", value, "payedCapital");
            return (Criteria) this;
        }

        public Criteria andPayedCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payed_capital >=", value, "payedCapital");
            return (Criteria) this;
        }

        public Criteria andPayedCapitalLessThan(BigDecimal value) {
            addCriterion("payed_capital <", value, "payedCapital");
            return (Criteria) this;
        }

        public Criteria andPayedCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payed_capital <=", value, "payedCapital");
            return (Criteria) this;
        }

        public Criteria andPayedCapitalIn(List<BigDecimal> values) {
            addCriterion("payed_capital in", values, "payedCapital");
            return (Criteria) this;
        }

        public Criteria andPayedCapitalNotIn(List<BigDecimal> values) {
            addCriterion("payed_capital not in", values, "payedCapital");
            return (Criteria) this;
        }

        public Criteria andPayedCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payed_capital between", value1, value2, "payedCapital");
            return (Criteria) this;
        }

        public Criteria andPayedCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payed_capital not between", value1, value2, "payedCapital");
            return (Criteria) this;
        }

        public Criteria andPayedInterestIsNull() {
            addCriterion("payed_interest is null");
            return (Criteria) this;
        }

        public Criteria andPayedInterestIsNotNull() {
            addCriterion("payed_interest is not null");
            return (Criteria) this;
        }

        public Criteria andPayedInterestEqualTo(BigDecimal value) {
            addCriterion("payed_interest =", value, "payedInterest");
            return (Criteria) this;
        }

        public Criteria andPayedInterestNotEqualTo(BigDecimal value) {
            addCriterion("payed_interest <>", value, "payedInterest");
            return (Criteria) this;
        }

        public Criteria andPayedInterestGreaterThan(BigDecimal value) {
            addCriterion("payed_interest >", value, "payedInterest");
            return (Criteria) this;
        }

        public Criteria andPayedInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payed_interest >=", value, "payedInterest");
            return (Criteria) this;
        }

        public Criteria andPayedInterestLessThan(BigDecimal value) {
            addCriterion("payed_interest <", value, "payedInterest");
            return (Criteria) this;
        }

        public Criteria andPayedInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payed_interest <=", value, "payedInterest");
            return (Criteria) this;
        }

        public Criteria andPayedInterestIn(List<BigDecimal> values) {
            addCriterion("payed_interest in", values, "payedInterest");
            return (Criteria) this;
        }

        public Criteria andPayedInterestNotIn(List<BigDecimal> values) {
            addCriterion("payed_interest not in", values, "payedInterest");
            return (Criteria) this;
        }

        public Criteria andPayedInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payed_interest between", value1, value2, "payedInterest");
            return (Criteria) this;
        }

        public Criteria andPayedInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payed_interest not between", value1, value2, "payedInterest");
            return (Criteria) this;
        }

        public Criteria andShowTopIsNull() {
            addCriterion("show_top is null");
            return (Criteria) this;
        }

        public Criteria andShowTopIsNotNull() {
            addCriterion("show_top is not null");
            return (Criteria) this;
        }

        public Criteria andShowTopEqualTo(Integer value) {
            addCriterion("show_top =", value, "showTop");
            return (Criteria) this;
        }

        public Criteria andShowTopNotEqualTo(Integer value) {
            addCriterion("show_top <>", value, "showTop");
            return (Criteria) this;
        }

        public Criteria andShowTopGreaterThan(Integer value) {
            addCriterion("show_top >", value, "showTop");
            return (Criteria) this;
        }

        public Criteria andShowTopGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_top >=", value, "showTop");
            return (Criteria) this;
        }

        public Criteria andShowTopLessThan(Integer value) {
            addCriterion("show_top <", value, "showTop");
            return (Criteria) this;
        }

        public Criteria andShowTopLessThanOrEqualTo(Integer value) {
            addCriterion("show_top <=", value, "showTop");
            return (Criteria) this;
        }

        public Criteria andShowTopIn(List<Integer> values) {
            addCriterion("show_top in", values, "showTop");
            return (Criteria) this;
        }

        public Criteria andShowTopNotIn(List<Integer> values) {
            addCriterion("show_top not in", values, "showTop");
            return (Criteria) this;
        }

        public Criteria andShowTopBetween(Integer value1, Integer value2) {
            addCriterion("show_top between", value1, value2, "showTop");
            return (Criteria) this;
        }

        public Criteria andShowTopNotBetween(Integer value1, Integer value2) {
            addCriterion("show_top not between", value1, value2, "showTop");
            return (Criteria) this;
        }

        public Criteria andShowSortIsNull() {
            addCriterion("show_sort is null");
            return (Criteria) this;
        }

        public Criteria andShowSortIsNotNull() {
            addCriterion("show_sort is not null");
            return (Criteria) this;
        }

        public Criteria andShowSortEqualTo(Integer value) {
            addCriterion("show_sort =", value, "showSort");
            return (Criteria) this;
        }

        public Criteria andShowSortNotEqualTo(Integer value) {
            addCriterion("show_sort <>", value, "showSort");
            return (Criteria) this;
        }

        public Criteria andShowSortGreaterThan(Integer value) {
            addCriterion("show_sort >", value, "showSort");
            return (Criteria) this;
        }

        public Criteria andShowSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("show_sort >=", value, "showSort");
            return (Criteria) this;
        }

        public Criteria andShowSortLessThan(Integer value) {
            addCriterion("show_sort <", value, "showSort");
            return (Criteria) this;
        }

        public Criteria andShowSortLessThanOrEqualTo(Integer value) {
            addCriterion("show_sort <=", value, "showSort");
            return (Criteria) this;
        }

        public Criteria andShowSortIn(List<Integer> values) {
            addCriterion("show_sort in", values, "showSort");
            return (Criteria) this;
        }

        public Criteria andShowSortNotIn(List<Integer> values) {
            addCriterion("show_sort not in", values, "showSort");
            return (Criteria) this;
        }

        public Criteria andShowSortBetween(Integer value1, Integer value2) {
            addCriterion("show_sort between", value1, value2, "showSort");
            return (Criteria) this;
        }

        public Criteria andShowSortNotBetween(Integer value1, Integer value2) {
            addCriterion("show_sort not between", value1, value2, "showSort");
            return (Criteria) this;
        }

        public Criteria andFinalRateYearIsNull() {
            addCriterion("final_rate_year is null");
            return (Criteria) this;
        }

        public Criteria andFinalRateYearIsNotNull() {
            addCriterion("final_rate_year is not null");
            return (Criteria) this;
        }

        public Criteria andFinalRateYearEqualTo(BigDecimal value) {
            addCriterion("final_rate_year =", value, "finalRateYear");
            return (Criteria) this;
        }

        public Criteria andFinalRateYearNotEqualTo(BigDecimal value) {
            addCriterion("final_rate_year <>", value, "finalRateYear");
            return (Criteria) this;
        }

        public Criteria andFinalRateYearGreaterThan(BigDecimal value) {
            addCriterion("final_rate_year >", value, "finalRateYear");
            return (Criteria) this;
        }

        public Criteria andFinalRateYearGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("final_rate_year >=", value, "finalRateYear");
            return (Criteria) this;
        }

        public Criteria andFinalRateYearLessThan(BigDecimal value) {
            addCriterion("final_rate_year <", value, "finalRateYear");
            return (Criteria) this;
        }

        public Criteria andFinalRateYearLessThanOrEqualTo(BigDecimal value) {
            addCriterion("final_rate_year <=", value, "finalRateYear");
            return (Criteria) this;
        }

        public Criteria andFinalRateYearIn(List<BigDecimal> values) {
            addCriterion("final_rate_year in", values, "finalRateYear");
            return (Criteria) this;
        }

        public Criteria andFinalRateYearNotIn(List<BigDecimal> values) {
            addCriterion("final_rate_year not in", values, "finalRateYear");
            return (Criteria) this;
        }

        public Criteria andFinalRateYearBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("final_rate_year between", value1, value2, "finalRateYear");
            return (Criteria) this;
        }

        public Criteria andFinalRateYearNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("final_rate_year not between", value1, value2, "finalRateYear");
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

        public Criteria andAutoTenderRepayWayIsNull() {
            addCriterion("auto_tender_repay_way is null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayIsNotNull() {
            addCriterion("auto_tender_repay_way is not null");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayEqualTo(Integer value) {
            addCriterion("auto_tender_repay_way =", value, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayNotEqualTo(Integer value) {
            addCriterion("auto_tender_repay_way <>", value, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayGreaterThan(Integer value) {
            addCriterion("auto_tender_repay_way >", value, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("auto_tender_repay_way >=", value, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayLessThan(Integer value) {
            addCriterion("auto_tender_repay_way <", value, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayLessThanOrEqualTo(Integer value) {
            addCriterion("auto_tender_repay_way <=", value, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayIn(List<Integer> values) {
            addCriterion("auto_tender_repay_way in", values, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayNotIn(List<Integer> values) {
            addCriterion("auto_tender_repay_way not in", values, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayBetween(Integer value1, Integer value2) {
            addCriterion("auto_tender_repay_way between", value1, value2, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andAutoTenderRepayWayNotBetween(Integer value1, Integer value2) {
            addCriterion("auto_tender_repay_way not between", value1, value2, "autoTenderRepayWay");
            return (Criteria) this;
        }

        public Criteria andContinueAwardRateIsNull() {
            addCriterion("continue_award_rate is null");
            return (Criteria) this;
        }

        public Criteria andContinueAwardRateIsNotNull() {
            addCriterion("continue_award_rate is not null");
            return (Criteria) this;
        }

        public Criteria andContinueAwardRateEqualTo(BigDecimal value) {
            addCriterion("continue_award_rate =", value, "continueAwardRate");
            return (Criteria) this;
        }

        public Criteria andContinueAwardRateNotEqualTo(BigDecimal value) {
            addCriterion("continue_award_rate <>", value, "continueAwardRate");
            return (Criteria) this;
        }

        public Criteria andContinueAwardRateGreaterThan(BigDecimal value) {
            addCriterion("continue_award_rate >", value, "continueAwardRate");
            return (Criteria) this;
        }

        public Criteria andContinueAwardRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("continue_award_rate >=", value, "continueAwardRate");
            return (Criteria) this;
        }

        public Criteria andContinueAwardRateLessThan(BigDecimal value) {
            addCriterion("continue_award_rate <", value, "continueAwardRate");
            return (Criteria) this;
        }

        public Criteria andContinueAwardRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("continue_award_rate <=", value, "continueAwardRate");
            return (Criteria) this;
        }

        public Criteria andContinueAwardRateIn(List<BigDecimal> values) {
            addCriterion("continue_award_rate in", values, "continueAwardRate");
            return (Criteria) this;
        }

        public Criteria andContinueAwardRateNotIn(List<BigDecimal> values) {
            addCriterion("continue_award_rate not in", values, "continueAwardRate");
            return (Criteria) this;
        }

        public Criteria andContinueAwardRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continue_award_rate between", value1, value2, "continueAwardRate");
            return (Criteria) this;
        }

        public Criteria andContinueAwardRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continue_award_rate not between", value1, value2, "continueAwardRate");
            return (Criteria) this;
        }

        public Criteria andVaryYearRateIsNull() {
            addCriterion("vary_year_rate is null");
            return (Criteria) this;
        }

        public Criteria andVaryYearRateIsNotNull() {
            addCriterion("vary_year_rate is not null");
            return (Criteria) this;
        }

        public Criteria andVaryYearRateEqualTo(BigDecimal value) {
            addCriterion("vary_year_rate =", value, "varyYearRate");
            return (Criteria) this;
        }

        public Criteria andVaryYearRateNotEqualTo(BigDecimal value) {
            addCriterion("vary_year_rate <>", value, "varyYearRate");
            return (Criteria) this;
        }

        public Criteria andVaryYearRateGreaterThan(BigDecimal value) {
            addCriterion("vary_year_rate >", value, "varyYearRate");
            return (Criteria) this;
        }

        public Criteria andVaryYearRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vary_year_rate >=", value, "varyYearRate");
            return (Criteria) this;
        }

        public Criteria andVaryYearRateLessThan(BigDecimal value) {
            addCriterion("vary_year_rate <", value, "varyYearRate");
            return (Criteria) this;
        }

        public Criteria andVaryYearRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vary_year_rate <=", value, "varyYearRate");
            return (Criteria) this;
        }

        public Criteria andVaryYearRateIn(List<BigDecimal> values) {
            addCriterion("vary_year_rate in", values, "varyYearRate");
            return (Criteria) this;
        }

        public Criteria andVaryYearRateNotIn(List<BigDecimal> values) {
            addCriterion("vary_year_rate not in", values, "varyYearRate");
            return (Criteria) this;
        }

        public Criteria andVaryYearRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vary_year_rate between", value1, value2, "varyYearRate");
            return (Criteria) this;
        }

        public Criteria andVaryYearRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vary_year_rate not between", value1, value2, "varyYearRate");
            return (Criteria) this;
        }

        public Criteria andVaryMonthLimitIsNull() {
            addCriterion("vary_month_limit is null");
            return (Criteria) this;
        }

        public Criteria andVaryMonthLimitIsNotNull() {
            addCriterion("vary_month_limit is not null");
            return (Criteria) this;
        }

        public Criteria andVaryMonthLimitEqualTo(BigDecimal value) {
            addCriterion("vary_month_limit =", value, "varyMonthLimit");
            return (Criteria) this;
        }

        public Criteria andVaryMonthLimitNotEqualTo(BigDecimal value) {
            addCriterion("vary_month_limit <>", value, "varyMonthLimit");
            return (Criteria) this;
        }

        public Criteria andVaryMonthLimitGreaterThan(BigDecimal value) {
            addCriterion("vary_month_limit >", value, "varyMonthLimit");
            return (Criteria) this;
        }

        public Criteria andVaryMonthLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vary_month_limit >=", value, "varyMonthLimit");
            return (Criteria) this;
        }

        public Criteria andVaryMonthLimitLessThan(BigDecimal value) {
            addCriterion("vary_month_limit <", value, "varyMonthLimit");
            return (Criteria) this;
        }

        public Criteria andVaryMonthLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vary_month_limit <=", value, "varyMonthLimit");
            return (Criteria) this;
        }

        public Criteria andVaryMonthLimitIn(List<BigDecimal> values) {
            addCriterion("vary_month_limit in", values, "varyMonthLimit");
            return (Criteria) this;
        }

        public Criteria andVaryMonthLimitNotIn(List<BigDecimal> values) {
            addCriterion("vary_month_limit not in", values, "varyMonthLimit");
            return (Criteria) this;
        }

        public Criteria andVaryMonthLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vary_month_limit between", value1, value2, "varyMonthLimit");
            return (Criteria) this;
        }

        public Criteria andVaryMonthLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vary_month_limit not between", value1, value2, "varyMonthLimit");
            return (Criteria) this;
        }

        public Criteria andParentFlgIsNull() {
            addCriterion("parent_flg is null");
            return (Criteria) this;
        }

        public Criteria andParentFlgIsNotNull() {
            addCriterion("parent_flg is not null");
            return (Criteria) this;
        }

        public Criteria andParentFlgEqualTo(Integer value) {
            addCriterion("parent_flg =", value, "parentFlg");
            return (Criteria) this;
        }

        public Criteria andParentFlgNotEqualTo(Integer value) {
            addCriterion("parent_flg <>", value, "parentFlg");
            return (Criteria) this;
        }

        public Criteria andParentFlgGreaterThan(Integer value) {
            addCriterion("parent_flg >", value, "parentFlg");
            return (Criteria) this;
        }

        public Criteria andParentFlgGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_flg >=", value, "parentFlg");
            return (Criteria) this;
        }

        public Criteria andParentFlgLessThan(Integer value) {
            addCriterion("parent_flg <", value, "parentFlg");
            return (Criteria) this;
        }

        public Criteria andParentFlgLessThanOrEqualTo(Integer value) {
            addCriterion("parent_flg <=", value, "parentFlg");
            return (Criteria) this;
        }

        public Criteria andParentFlgIn(List<Integer> values) {
            addCriterion("parent_flg in", values, "parentFlg");
            return (Criteria) this;
        }

        public Criteria andParentFlgNotIn(List<Integer> values) {
            addCriterion("parent_flg not in", values, "parentFlg");
            return (Criteria) this;
        }

        public Criteria andParentFlgBetween(Integer value1, Integer value2) {
            addCriterion("parent_flg between", value1, value2, "parentFlg");
            return (Criteria) this;
        }

        public Criteria andParentFlgNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_flg not between", value1, value2, "parentFlg");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentMoneyIsNull() {
            addCriterion("parent_money is null");
            return (Criteria) this;
        }

        public Criteria andParentMoneyIsNotNull() {
            addCriterion("parent_money is not null");
            return (Criteria) this;
        }

        public Criteria andParentMoneyEqualTo(Integer value) {
            addCriterion("parent_money =", value, "parentMoney");
            return (Criteria) this;
        }

        public Criteria andParentMoneyNotEqualTo(Integer value) {
            addCriterion("parent_money <>", value, "parentMoney");
            return (Criteria) this;
        }

        public Criteria andParentMoneyGreaterThan(Integer value) {
            addCriterion("parent_money >", value, "parentMoney");
            return (Criteria) this;
        }

        public Criteria andParentMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_money >=", value, "parentMoney");
            return (Criteria) this;
        }

        public Criteria andParentMoneyLessThan(Integer value) {
            addCriterion("parent_money <", value, "parentMoney");
            return (Criteria) this;
        }

        public Criteria andParentMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("parent_money <=", value, "parentMoney");
            return (Criteria) this;
        }

        public Criteria andParentMoneyIn(List<Integer> values) {
            addCriterion("parent_money in", values, "parentMoney");
            return (Criteria) this;
        }

        public Criteria andParentMoneyNotIn(List<Integer> values) {
            addCriterion("parent_money not in", values, "parentMoney");
            return (Criteria) this;
        }

        public Criteria andParentMoneyBetween(Integer value1, Integer value2) {
            addCriterion("parent_money between", value1, value2, "parentMoney");
            return (Criteria) this;
        }

        public Criteria andParentMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_money not between", value1, value2, "parentMoney");
            return (Criteria) this;
        }

        public Criteria andParentAccountIsNull() {
            addCriterion("parent_account is null");
            return (Criteria) this;
        }

        public Criteria andParentAccountIsNotNull() {
            addCriterion("parent_account is not null");
            return (Criteria) this;
        }

        public Criteria andParentAccountEqualTo(Integer value) {
            addCriterion("parent_account =", value, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andParentAccountNotEqualTo(Integer value) {
            addCriterion("parent_account <>", value, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andParentAccountGreaterThan(Integer value) {
            addCriterion("parent_account >", value, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andParentAccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_account >=", value, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andParentAccountLessThan(Integer value) {
            addCriterion("parent_account <", value, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andParentAccountLessThanOrEqualTo(Integer value) {
            addCriterion("parent_account <=", value, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andParentAccountIn(List<Integer> values) {
            addCriterion("parent_account in", values, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andParentAccountNotIn(List<Integer> values) {
            addCriterion("parent_account not in", values, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andParentAccountBetween(Integer value1, Integer value2) {
            addCriterion("parent_account between", value1, value2, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andParentAccountNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_account not between", value1, value2, "parentAccount");
            return (Criteria) this;
        }

        public Criteria andParentStatusIsNull() {
            addCriterion("parent_status is null");
            return (Criteria) this;
        }

        public Criteria andParentStatusIsNotNull() {
            addCriterion("parent_status is not null");
            return (Criteria) this;
        }

        public Criteria andParentStatusEqualTo(Integer value) {
            addCriterion("parent_status =", value, "parentStatus");
            return (Criteria) this;
        }

        public Criteria andParentStatusNotEqualTo(Integer value) {
            addCriterion("parent_status <>", value, "parentStatus");
            return (Criteria) this;
        }

        public Criteria andParentStatusGreaterThan(Integer value) {
            addCriterion("parent_status >", value, "parentStatus");
            return (Criteria) this;
        }

        public Criteria andParentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_status >=", value, "parentStatus");
            return (Criteria) this;
        }

        public Criteria andParentStatusLessThan(Integer value) {
            addCriterion("parent_status <", value, "parentStatus");
            return (Criteria) this;
        }

        public Criteria andParentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("parent_status <=", value, "parentStatus");
            return (Criteria) this;
        }

        public Criteria andParentStatusIn(List<Integer> values) {
            addCriterion("parent_status in", values, "parentStatus");
            return (Criteria) this;
        }

        public Criteria andParentStatusNotIn(List<Integer> values) {
            addCriterion("parent_status not in", values, "parentStatus");
            return (Criteria) this;
        }

        public Criteria andParentStatusBetween(Integer value1, Integer value2) {
            addCriterion("parent_status between", value1, value2, "parentStatus");
            return (Criteria) this;
        }

        public Criteria andParentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_status not between", value1, value2, "parentStatus");
            return (Criteria) this;
        }

        public Criteria andAwardTypeIsNull() {
            addCriterion("award_type is null");
            return (Criteria) this;
        }

        public Criteria andAwardTypeIsNotNull() {
            addCriterion("award_type is not null");
            return (Criteria) this;
        }

        public Criteria andAwardTypeEqualTo(Integer value) {
            addCriterion("award_type =", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeNotEqualTo(Integer value) {
            addCriterion("award_type <>", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeGreaterThan(Integer value) {
            addCriterion("award_type >", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("award_type >=", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeLessThan(Integer value) {
            addCriterion("award_type <", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeLessThanOrEqualTo(Integer value) {
            addCriterion("award_type <=", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeIn(List<Integer> values) {
            addCriterion("award_type in", values, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeNotIn(List<Integer> values) {
            addCriterion("award_type not in", values, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeBetween(Integer value1, Integer value2) {
            addCriterion("award_type between", value1, value2, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("award_type not between", value1, value2, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardFundsIsNull() {
            addCriterion("award_funds is null");
            return (Criteria) this;
        }

        public Criteria andAwardFundsIsNotNull() {
            addCriterion("award_funds is not null");
            return (Criteria) this;
        }

        public Criteria andAwardFundsEqualTo(String value) {
            addCriterion("award_funds =", value, "awardFunds");
            return (Criteria) this;
        }

        public Criteria andAwardFundsNotEqualTo(String value) {
            addCriterion("award_funds <>", value, "awardFunds");
            return (Criteria) this;
        }

        public Criteria andAwardFundsGreaterThan(String value) {
            addCriterion("award_funds >", value, "awardFunds");
            return (Criteria) this;
        }

        public Criteria andAwardFundsGreaterThanOrEqualTo(String value) {
            addCriterion("award_funds >=", value, "awardFunds");
            return (Criteria) this;
        }

        public Criteria andAwardFundsLessThan(String value) {
            addCriterion("award_funds <", value, "awardFunds");
            return (Criteria) this;
        }

        public Criteria andAwardFundsLessThanOrEqualTo(String value) {
            addCriterion("award_funds <=", value, "awardFunds");
            return (Criteria) this;
        }

        public Criteria andAwardFundsLike(String value) {
            addCriterion("award_funds like", value, "awardFunds");
            return (Criteria) this;
        }

        public Criteria andAwardFundsNotLike(String value) {
            addCriterion("award_funds not like", value, "awardFunds");
            return (Criteria) this;
        }

        public Criteria andAwardFundsIn(List<String> values) {
            addCriterion("award_funds in", values, "awardFunds");
            return (Criteria) this;
        }

        public Criteria andAwardFundsNotIn(List<String> values) {
            addCriterion("award_funds not in", values, "awardFunds");
            return (Criteria) this;
        }

        public Criteria andAwardFundsBetween(String value1, String value2) {
            addCriterion("award_funds between", value1, value2, "awardFunds");
            return (Criteria) this;
        }

        public Criteria andAwardFundsNotBetween(String value1, String value2) {
            addCriterion("award_funds not between", value1, value2, "awardFunds");
            return (Criteria) this;
        }

        public Criteria andOverDateIsNull() {
            addCriterion("over_date is null");
            return (Criteria) this;
        }

        public Criteria andOverDateIsNotNull() {
            addCriterion("over_date is not null");
            return (Criteria) this;
        }

        public Criteria andOverDateEqualTo(Date value) {
            addCriterion("over_date =", value, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateNotEqualTo(Date value) {
            addCriterion("over_date <>", value, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateGreaterThan(Date value) {
            addCriterion("over_date >", value, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateGreaterThanOrEqualTo(Date value) {
            addCriterion("over_date >=", value, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateLessThan(Date value) {
            addCriterion("over_date <", value, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateLessThanOrEqualTo(Date value) {
            addCriterion("over_date <=", value, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateIn(List<Date> values) {
            addCriterion("over_date in", values, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateNotIn(List<Date> values) {
            addCriterion("over_date not in", values, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateBetween(Date value1, Date value2) {
            addCriterion("over_date between", value1, value2, "overDate");
            return (Criteria) this;
        }

        public Criteria andOverDateNotBetween(Date value1, Date value2) {
            addCriterion("over_date not between", value1, value2, "overDate");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIsNull() {
            addCriterion("business_code is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIsNotNull() {
            addCriterion("business_code is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeEqualTo(String value) {
            addCriterion("business_code =", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotEqualTo(String value) {
            addCriterion("business_code <>", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeGreaterThan(String value) {
            addCriterion("business_code >", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeGreaterThanOrEqualTo(String value) {
            addCriterion("business_code >=", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLessThan(String value) {
            addCriterion("business_code <", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLessThanOrEqualTo(String value) {
            addCriterion("business_code <=", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLike(String value) {
            addCriterion("business_code like", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotLike(String value) {
            addCriterion("business_code not like", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIn(List<String> values) {
            addCriterion("business_code in", values, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotIn(List<String> values) {
            addCriterion("business_code not in", values, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeBetween(String value1, String value2) {
            addCriterion("business_code between", value1, value2, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotBetween(String value1, String value2) {
            addCriterion("business_code not between", value1, value2, "businessCode");
            return (Criteria) this;
        }

        public Criteria andAwardScaleIsNull() {
            addCriterion("award_scale is null");
            return (Criteria) this;
        }

        public Criteria andAwardScaleIsNotNull() {
            addCriterion("award_scale is not null");
            return (Criteria) this;
        }

        public Criteria andAwardScaleEqualTo(BigDecimal value) {
            addCriterion("award_scale =", value, "awardScale");
            return (Criteria) this;
        }

        public Criteria andAwardScaleNotEqualTo(BigDecimal value) {
            addCriterion("award_scale <>", value, "awardScale");
            return (Criteria) this;
        }

        public Criteria andAwardScaleGreaterThan(BigDecimal value) {
            addCriterion("award_scale >", value, "awardScale");
            return (Criteria) this;
        }

        public Criteria andAwardScaleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("award_scale >=", value, "awardScale");
            return (Criteria) this;
        }

        public Criteria andAwardScaleLessThan(BigDecimal value) {
            addCriterion("award_scale <", value, "awardScale");
            return (Criteria) this;
        }

        public Criteria andAwardScaleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("award_scale <=", value, "awardScale");
            return (Criteria) this;
        }

        public Criteria andAwardScaleIn(List<BigDecimal> values) {
            addCriterion("award_scale in", values, "awardScale");
            return (Criteria) this;
        }

        public Criteria andAwardScaleNotIn(List<BigDecimal> values) {
            addCriterion("award_scale not in", values, "awardScale");
            return (Criteria) this;
        }

        public Criteria andAwardScaleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("award_scale between", value1, value2, "awardScale");
            return (Criteria) this;
        }

        public Criteria andAwardScaleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("award_scale not between", value1, value2, "awardScale");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyIsNull() {
            addCriterion("borrow_money is null");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyIsNotNull() {
            addCriterion("borrow_money is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyEqualTo(BigDecimal value) {
            addCriterion("borrow_money =", value, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyNotEqualTo(BigDecimal value) {
            addCriterion("borrow_money <>", value, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyGreaterThan(BigDecimal value) {
            addCriterion("borrow_money >", value, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_money >=", value, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyLessThan(BigDecimal value) {
            addCriterion("borrow_money <", value, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_money <=", value, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyIn(List<BigDecimal> values) {
            addCriterion("borrow_money in", values, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyNotIn(List<BigDecimal> values) {
            addCriterion("borrow_money not in", values, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_money between", value1, value2, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andBorrowMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_money not between", value1, value2, "borrowMoney");
            return (Criteria) this;
        }

        public Criteria andFangkuanStatusIsNull() {
            addCriterion("fangkuan_status is null");
            return (Criteria) this;
        }

        public Criteria andFangkuanStatusIsNotNull() {
            addCriterion("fangkuan_status is not null");
            return (Criteria) this;
        }

        public Criteria andFangkuanStatusEqualTo(Integer value) {
            addCriterion("fangkuan_status =", value, "fangkuanStatus");
            return (Criteria) this;
        }

        public Criteria andFangkuanStatusNotEqualTo(Integer value) {
            addCriterion("fangkuan_status <>", value, "fangkuanStatus");
            return (Criteria) this;
        }

        public Criteria andFangkuanStatusGreaterThan(Integer value) {
            addCriterion("fangkuan_status >", value, "fangkuanStatus");
            return (Criteria) this;
        }

        public Criteria andFangkuanStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("fangkuan_status >=", value, "fangkuanStatus");
            return (Criteria) this;
        }

        public Criteria andFangkuanStatusLessThan(Integer value) {
            addCriterion("fangkuan_status <", value, "fangkuanStatus");
            return (Criteria) this;
        }

        public Criteria andFangkuanStatusLessThanOrEqualTo(Integer value) {
            addCriterion("fangkuan_status <=", value, "fangkuanStatus");
            return (Criteria) this;
        }

        public Criteria andFangkuanStatusIn(List<Integer> values) {
            addCriterion("fangkuan_status in", values, "fangkuanStatus");
            return (Criteria) this;
        }

        public Criteria andFangkuanStatusNotIn(List<Integer> values) {
            addCriterion("fangkuan_status not in", values, "fangkuanStatus");
            return (Criteria) this;
        }

        public Criteria andFangkuanStatusBetween(Integer value1, Integer value2) {
            addCriterion("fangkuan_status between", value1, value2, "fangkuanStatus");
            return (Criteria) this;
        }

        public Criteria andFangkuanStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("fangkuan_status not between", value1, value2, "fangkuanStatus");
            return (Criteria) this;
        }

        public Criteria andRongXunFlgIsNull() {
            addCriterion("rong_xun_flg is null");
            return (Criteria) this;
        }

        public Criteria andRongXunFlgIsNotNull() {
            addCriterion("rong_xun_flg is not null");
            return (Criteria) this;
        }

        public Criteria andRongXunFlgEqualTo(Integer value) {
            addCriterion("rong_xun_flg =", value, "rongXunFlg");
            return (Criteria) this;
        }

        public Criteria andRongXunFlgNotEqualTo(Integer value) {
            addCriterion("rong_xun_flg <>", value, "rongXunFlg");
            return (Criteria) this;
        }

        public Criteria andRongXunFlgGreaterThan(Integer value) {
            addCriterion("rong_xun_flg >", value, "rongXunFlg");
            return (Criteria) this;
        }

        public Criteria andRongXunFlgGreaterThanOrEqualTo(Integer value) {
            addCriterion("rong_xun_flg >=", value, "rongXunFlg");
            return (Criteria) this;
        }

        public Criteria andRongXunFlgLessThan(Integer value) {
            addCriterion("rong_xun_flg <", value, "rongXunFlg");
            return (Criteria) this;
        }

        public Criteria andRongXunFlgLessThanOrEqualTo(Integer value) {
            addCriterion("rong_xun_flg <=", value, "rongXunFlg");
            return (Criteria) this;
        }

        public Criteria andRongXunFlgIn(List<Integer> values) {
            addCriterion("rong_xun_flg in", values, "rongXunFlg");
            return (Criteria) this;
        }

        public Criteria andRongXunFlgNotIn(List<Integer> values) {
            addCriterion("rong_xun_flg not in", values, "rongXunFlg");
            return (Criteria) this;
        }

        public Criteria andRongXunFlgBetween(Integer value1, Integer value2) {
            addCriterion("rong_xun_flg between", value1, value2, "rongXunFlg");
            return (Criteria) this;
        }

        public Criteria andRongXunFlgNotBetween(Integer value1, Integer value2) {
            addCriterion("rong_xun_flg not between", value1, value2, "rongXunFlg");
            return (Criteria) this;
        }

        public Criteria andTzxfIsNull() {
            addCriterion("tzxf is null");
            return (Criteria) this;
        }

        public Criteria andTzxfIsNotNull() {
            addCriterion("tzxf is not null");
            return (Criteria) this;
        }

        public Criteria andTzxfEqualTo(BigDecimal value) {
            addCriterion("tzxf =", value, "tzxf");
            return (Criteria) this;
        }

        public Criteria andTzxfNotEqualTo(BigDecimal value) {
            addCriterion("tzxf <>", value, "tzxf");
            return (Criteria) this;
        }

        public Criteria andTzxfGreaterThan(BigDecimal value) {
            addCriterion("tzxf >", value, "tzxf");
            return (Criteria) this;
        }

        public Criteria andTzxfGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tzxf >=", value, "tzxf");
            return (Criteria) this;
        }

        public Criteria andTzxfLessThan(BigDecimal value) {
            addCriterion("tzxf <", value, "tzxf");
            return (Criteria) this;
        }

        public Criteria andTzxfLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tzxf <=", value, "tzxf");
            return (Criteria) this;
        }

        public Criteria andTzxfIn(List<BigDecimal> values) {
            addCriterion("tzxf in", values, "tzxf");
            return (Criteria) this;
        }

        public Criteria andTzxfNotIn(List<BigDecimal> values) {
            addCriterion("tzxf not in", values, "tzxf");
            return (Criteria) this;
        }

        public Criteria andTzxfBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tzxf between", value1, value2, "tzxf");
            return (Criteria) this;
        }

        public Criteria andTzxfNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tzxf not between", value1, value2, "tzxf");
            return (Criteria) this;
        }

        public Criteria andTzthIsNull() {
            addCriterion("tzth is null");
            return (Criteria) this;
        }

        public Criteria andTzthIsNotNull() {
            addCriterion("tzth is not null");
            return (Criteria) this;
        }

        public Criteria andTzthEqualTo(BigDecimal value) {
            addCriterion("tzth =", value, "tzth");
            return (Criteria) this;
        }

        public Criteria andTzthNotEqualTo(BigDecimal value) {
            addCriterion("tzth <>", value, "tzth");
            return (Criteria) this;
        }

        public Criteria andTzthGreaterThan(BigDecimal value) {
            addCriterion("tzth >", value, "tzth");
            return (Criteria) this;
        }

        public Criteria andTzthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tzth >=", value, "tzth");
            return (Criteria) this;
        }

        public Criteria andTzthLessThan(BigDecimal value) {
            addCriterion("tzth <", value, "tzth");
            return (Criteria) this;
        }

        public Criteria andTzthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tzth <=", value, "tzth");
            return (Criteria) this;
        }

        public Criteria andTzthIn(List<BigDecimal> values) {
            addCriterion("tzth in", values, "tzth");
            return (Criteria) this;
        }

        public Criteria andTzthNotIn(List<BigDecimal> values) {
            addCriterion("tzth not in", values, "tzth");
            return (Criteria) this;
        }

        public Criteria andTzthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tzth between", value1, value2, "tzth");
            return (Criteria) this;
        }

        public Criteria andTzthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tzth not between", value1, value2, "tzth");
            return (Criteria) this;
        }

        public Criteria andSgdgIsNull() {
            addCriterion("sgdg is null");
            return (Criteria) this;
        }

        public Criteria andSgdgIsNotNull() {
            addCriterion("sgdg is not null");
            return (Criteria) this;
        }

        public Criteria andSgdgEqualTo(BigDecimal value) {
            addCriterion("sgdg =", value, "sgdg");
            return (Criteria) this;
        }

        public Criteria andSgdgNotEqualTo(BigDecimal value) {
            addCriterion("sgdg <>", value, "sgdg");
            return (Criteria) this;
        }

        public Criteria andSgdgGreaterThan(BigDecimal value) {
            addCriterion("sgdg >", value, "sgdg");
            return (Criteria) this;
        }

        public Criteria andSgdgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sgdg >=", value, "sgdg");
            return (Criteria) this;
        }

        public Criteria andSgdgLessThan(BigDecimal value) {
            addCriterion("sgdg <", value, "sgdg");
            return (Criteria) this;
        }

        public Criteria andSgdgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sgdg <=", value, "sgdg");
            return (Criteria) this;
        }

        public Criteria andSgdgIn(List<BigDecimal> values) {
            addCriterion("sgdg in", values, "sgdg");
            return (Criteria) this;
        }

        public Criteria andSgdgNotIn(List<BigDecimal> values) {
            addCriterion("sgdg not in", values, "sgdg");
            return (Criteria) this;
        }

        public Criteria andSgdgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sgdg between", value1, value2, "sgdg");
            return (Criteria) this;
        }

        public Criteria andSgdgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sgdg not between", value1, value2, "sgdg");
            return (Criteria) this;
        }

        public Criteria andBaseAprIsNull() {
            addCriterion("base_apr is null");
            return (Criteria) this;
        }

        public Criteria andBaseAprIsNotNull() {
            addCriterion("base_apr is not null");
            return (Criteria) this;
        }

        public Criteria andBaseAprEqualTo(BigDecimal value) {
            addCriterion("base_apr =", value, "baseApr");
            return (Criteria) this;
        }

        public Criteria andBaseAprNotEqualTo(BigDecimal value) {
            addCriterion("base_apr <>", value, "baseApr");
            return (Criteria) this;
        }

        public Criteria andBaseAprGreaterThan(BigDecimal value) {
            addCriterion("base_apr >", value, "baseApr");
            return (Criteria) this;
        }

        public Criteria andBaseAprGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("base_apr >=", value, "baseApr");
            return (Criteria) this;
        }

        public Criteria andBaseAprLessThan(BigDecimal value) {
            addCriterion("base_apr <", value, "baseApr");
            return (Criteria) this;
        }

        public Criteria andBaseAprLessThanOrEqualTo(BigDecimal value) {
            addCriterion("base_apr <=", value, "baseApr");
            return (Criteria) this;
        }

        public Criteria andBaseAprIn(List<BigDecimal> values) {
            addCriterion("base_apr in", values, "baseApr");
            return (Criteria) this;
        }

        public Criteria andBaseAprNotIn(List<BigDecimal> values) {
            addCriterion("base_apr not in", values, "baseApr");
            return (Criteria) this;
        }

        public Criteria andBaseAprBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_apr between", value1, value2, "baseApr");
            return (Criteria) this;
        }

        public Criteria andBaseAprNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("base_apr not between", value1, value2, "baseApr");
            return (Criteria) this;
        }

        public Criteria andAwardAprIsNull() {
            addCriterion("award_apr is null");
            return (Criteria) this;
        }

        public Criteria andAwardAprIsNotNull() {
            addCriterion("award_apr is not null");
            return (Criteria) this;
        }

        public Criteria andAwardAprEqualTo(BigDecimal value) {
            addCriterion("award_apr =", value, "awardApr");
            return (Criteria) this;
        }

        public Criteria andAwardAprNotEqualTo(BigDecimal value) {
            addCriterion("award_apr <>", value, "awardApr");
            return (Criteria) this;
        }

        public Criteria andAwardAprGreaterThan(BigDecimal value) {
            addCriterion("award_apr >", value, "awardApr");
            return (Criteria) this;
        }

        public Criteria andAwardAprGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("award_apr >=", value, "awardApr");
            return (Criteria) this;
        }

        public Criteria andAwardAprLessThan(BigDecimal value) {
            addCriterion("award_apr <", value, "awardApr");
            return (Criteria) this;
        }

        public Criteria andAwardAprLessThanOrEqualTo(BigDecimal value) {
            addCriterion("award_apr <=", value, "awardApr");
            return (Criteria) this;
        }

        public Criteria andAwardAprIn(List<BigDecimal> values) {
            addCriterion("award_apr in", values, "awardApr");
            return (Criteria) this;
        }

        public Criteria andAwardAprNotIn(List<BigDecimal> values) {
            addCriterion("award_apr not in", values, "awardApr");
            return (Criteria) this;
        }

        public Criteria andAwardAprBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("award_apr between", value1, value2, "awardApr");
            return (Criteria) this;
        }

        public Criteria andAwardAprNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("award_apr not between", value1, value2, "awardApr");
            return (Criteria) this;
        }

        public Criteria andCgStatusIsNull() {
            addCriterion("cg_status is null");
            return (Criteria) this;
        }

        public Criteria andCgStatusIsNotNull() {
            addCriterion("cg_status is not null");
            return (Criteria) this;
        }

        public Criteria andCgStatusEqualTo(String value) {
            addCriterion("cg_status =", value, "cgStatus");
            return (Criteria) this;
        }

        public Criteria andCgStatusNotEqualTo(String value) {
            addCriterion("cg_status <>", value, "cgStatus");
            return (Criteria) this;
        }

        public Criteria andCgStatusGreaterThan(String value) {
            addCriterion("cg_status >", value, "cgStatus");
            return (Criteria) this;
        }

        public Criteria andCgStatusGreaterThanOrEqualTo(String value) {
            addCriterion("cg_status >=", value, "cgStatus");
            return (Criteria) this;
        }

        public Criteria andCgStatusLessThan(String value) {
            addCriterion("cg_status <", value, "cgStatus");
            return (Criteria) this;
        }

        public Criteria andCgStatusLessThanOrEqualTo(String value) {
            addCriterion("cg_status <=", value, "cgStatus");
            return (Criteria) this;
        }

        public Criteria andCgStatusLike(String value) {
            addCriterion("cg_status like", value, "cgStatus");
            return (Criteria) this;
        }

        public Criteria andCgStatusNotLike(String value) {
            addCriterion("cg_status not like", value, "cgStatus");
            return (Criteria) this;
        }

        public Criteria andCgStatusIn(List<String> values) {
            addCriterion("cg_status in", values, "cgStatus");
            return (Criteria) this;
        }

        public Criteria andCgStatusNotIn(List<String> values) {
            addCriterion("cg_status not in", values, "cgStatus");
            return (Criteria) this;
        }

        public Criteria andCgStatusBetween(String value1, String value2) {
            addCriterion("cg_status between", value1, value2, "cgStatus");
            return (Criteria) this;
        }

        public Criteria andCgStatusNotBetween(String value1, String value2) {
            addCriterion("cg_status not between", value1, value2, "cgStatus");
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