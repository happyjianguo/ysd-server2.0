package com.ysd.asset.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BorrowRechargeCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowRechargeCriteria() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andBorrowIdIsNull() {
            addCriterion("borrow_id is null");
            return (Criteria) this;
        }

        public Criteria andBorrowIdIsNotNull() {
            addCriterion("borrow_id is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowIdEqualTo(Integer value) {
            addCriterion("borrow_id =", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdNotEqualTo(Integer value) {
            addCriterion("borrow_id <>", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdGreaterThan(Integer value) {
            addCriterion("borrow_id >", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_id >=", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdLessThan(Integer value) {
            addCriterion("borrow_id <", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_id <=", value, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdIn(List<Integer> values) {
            addCriterion("borrow_id in", values, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdNotIn(List<Integer> values) {
            addCriterion("borrow_id not in", values, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdBetween(Integer value1, Integer value2) {
            addCriterion("borrow_id between", value1, value2, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_id not between", value1, value2, "borrowId");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentIdIsNull() {
            addCriterion("borrow_repayment_id is null");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentIdIsNotNull() {
            addCriterion("borrow_repayment_id is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentIdEqualTo(Integer value) {
            addCriterion("borrow_repayment_id =", value, "borrowRepaymentId");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentIdNotEqualTo(Integer value) {
            addCriterion("borrow_repayment_id <>", value, "borrowRepaymentId");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentIdGreaterThan(Integer value) {
            addCriterion("borrow_repayment_id >", value, "borrowRepaymentId");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_repayment_id >=", value, "borrowRepaymentId");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentIdLessThan(Integer value) {
            addCriterion("borrow_repayment_id <", value, "borrowRepaymentId");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentIdLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_repayment_id <=", value, "borrowRepaymentId");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentIdIn(List<Integer> values) {
            addCriterion("borrow_repayment_id in", values, "borrowRepaymentId");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentIdNotIn(List<Integer> values) {
            addCriterion("borrow_repayment_id not in", values, "borrowRepaymentId");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentIdBetween(Integer value1, Integer value2) {
            addCriterion("borrow_repayment_id between", value1, value2, "borrowRepaymentId");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_repayment_id not between", value1, value2, "borrowRepaymentId");
            return (Criteria) this;
        }

        public Criteria andEndFlgIsNull() {
            addCriterion("end_flg is null");
            return (Criteria) this;
        }

        public Criteria andEndFlgIsNotNull() {
            addCriterion("end_flg is not null");
            return (Criteria) this;
        }

        public Criteria andEndFlgEqualTo(Integer value) {
            addCriterion("end_flg =", value, "endFlg");
            return (Criteria) this;
        }

        public Criteria andEndFlgNotEqualTo(Integer value) {
            addCriterion("end_flg <>", value, "endFlg");
            return (Criteria) this;
        }

        public Criteria andEndFlgGreaterThan(Integer value) {
            addCriterion("end_flg >", value, "endFlg");
            return (Criteria) this;
        }

        public Criteria andEndFlgGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_flg >=", value, "endFlg");
            return (Criteria) this;
        }

        public Criteria andEndFlgLessThan(Integer value) {
            addCriterion("end_flg <", value, "endFlg");
            return (Criteria) this;
        }

        public Criteria andEndFlgLessThanOrEqualTo(Integer value) {
            addCriterion("end_flg <=", value, "endFlg");
            return (Criteria) this;
        }

        public Criteria andEndFlgIn(List<Integer> values) {
            addCriterion("end_flg in", values, "endFlg");
            return (Criteria) this;
        }

        public Criteria andEndFlgNotIn(List<Integer> values) {
            addCriterion("end_flg not in", values, "endFlg");
            return (Criteria) this;
        }

        public Criteria andEndFlgBetween(Integer value1, Integer value2) {
            addCriterion("end_flg between", value1, value2, "endFlg");
            return (Criteria) this;
        }

        public Criteria andEndFlgNotBetween(Integer value1, Integer value2) {
            addCriterion("end_flg not between", value1, value2, "endFlg");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andRechargeNameIsNull() {
            addCriterion("recharge_name is null");
            return (Criteria) this;
        }

        public Criteria andRechargeNameIsNotNull() {
            addCriterion("recharge_name is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeNameEqualTo(String value) {
            addCriterion("recharge_name =", value, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameNotEqualTo(String value) {
            addCriterion("recharge_name <>", value, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameGreaterThan(String value) {
            addCriterion("recharge_name >", value, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_name >=", value, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameLessThan(String value) {
            addCriterion("recharge_name <", value, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameLessThanOrEqualTo(String value) {
            addCriterion("recharge_name <=", value, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameLike(String value) {
            addCriterion("recharge_name like", value, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameNotLike(String value) {
            addCriterion("recharge_name not like", value, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameIn(List<String> values) {
            addCriterion("recharge_name in", values, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameNotIn(List<String> values) {
            addCriterion("recharge_name not in", values, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameBetween(String value1, String value2) {
            addCriterion("recharge_name between", value1, value2, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeNameNotBetween(String value1, String value2) {
            addCriterion("recharge_name not between", value1, value2, "rechargeName");
            return (Criteria) this;
        }

        public Criteria andRechargeDateIsNull() {
            addCriterion("recharge_date is null");
            return (Criteria) this;
        }

        public Criteria andRechargeDateIsNotNull() {
            addCriterion("recharge_date is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeDateEqualTo(Date value) {
            addCriterion("recharge_date =", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateNotEqualTo(Date value) {
            addCriterion("recharge_date <>", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateGreaterThan(Date value) {
            addCriterion("recharge_date >", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("recharge_date >=", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateLessThan(Date value) {
            addCriterion("recharge_date <", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateLessThanOrEqualTo(Date value) {
            addCriterion("recharge_date <=", value, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateIn(List<Date> values) {
            addCriterion("recharge_date in", values, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateNotIn(List<Date> values) {
            addCriterion("recharge_date not in", values, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateBetween(Date value1, Date value2) {
            addCriterion("recharge_date between", value1, value2, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeDateNotBetween(Date value1, Date value2) {
            addCriterion("recharge_date not between", value1, value2, "rechargeDate");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeIsNull() {
            addCriterion("recharge_type is null");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeIsNotNull() {
            addCriterion("recharge_type is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeEqualTo(Integer value) {
            addCriterion("recharge_type =", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotEqualTo(Integer value) {
            addCriterion("recharge_type <>", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeGreaterThan(Integer value) {
            addCriterion("recharge_type >", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_type >=", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeLessThan(Integer value) {
            addCriterion("recharge_type <", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_type <=", value, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeIn(List<Integer> values) {
            addCriterion("recharge_type in", values, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotIn(List<Integer> values) {
            addCriterion("recharge_type not in", values, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeBetween(Integer value1, Integer value2) {
            addCriterion("recharge_type between", value1, value2, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_type not between", value1, value2, "rechargeType");
            return (Criteria) this;
        }

        public Criteria andRechargeAccountIsNull() {
            addCriterion("recharge_account is null");
            return (Criteria) this;
        }

        public Criteria andRechargeAccountIsNotNull() {
            addCriterion("recharge_account is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeAccountEqualTo(String value) {
            addCriterion("recharge_account =", value, "rechargeAccount");
            return (Criteria) this;
        }

        public Criteria andRechargeAccountNotEqualTo(String value) {
            addCriterion("recharge_account <>", value, "rechargeAccount");
            return (Criteria) this;
        }

        public Criteria andRechargeAccountGreaterThan(String value) {
            addCriterion("recharge_account >", value, "rechargeAccount");
            return (Criteria) this;
        }

        public Criteria andRechargeAccountGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_account >=", value, "rechargeAccount");
            return (Criteria) this;
        }

        public Criteria andRechargeAccountLessThan(String value) {
            addCriterion("recharge_account <", value, "rechargeAccount");
            return (Criteria) this;
        }

        public Criteria andRechargeAccountLessThanOrEqualTo(String value) {
            addCriterion("recharge_account <=", value, "rechargeAccount");
            return (Criteria) this;
        }

        public Criteria andRechargeAccountLike(String value) {
            addCriterion("recharge_account like", value, "rechargeAccount");
            return (Criteria) this;
        }

        public Criteria andRechargeAccountNotLike(String value) {
            addCriterion("recharge_account not like", value, "rechargeAccount");
            return (Criteria) this;
        }

        public Criteria andRechargeAccountIn(List<String> values) {
            addCriterion("recharge_account in", values, "rechargeAccount");
            return (Criteria) this;
        }

        public Criteria andRechargeAccountNotIn(List<String> values) {
            addCriterion("recharge_account not in", values, "rechargeAccount");
            return (Criteria) this;
        }

        public Criteria andRechargeAccountBetween(String value1, String value2) {
            addCriterion("recharge_account between", value1, value2, "rechargeAccount");
            return (Criteria) this;
        }

        public Criteria andRechargeAccountNotBetween(String value1, String value2) {
            addCriterion("recharge_account not between", value1, value2, "rechargeAccount");
            return (Criteria) this;
        }

        public Criteria andRechargeBankIsNull() {
            addCriterion("recharge_bank is null");
            return (Criteria) this;
        }

        public Criteria andRechargeBankIsNotNull() {
            addCriterion("recharge_bank is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeBankEqualTo(String value) {
            addCriterion("recharge_bank =", value, "rechargeBank");
            return (Criteria) this;
        }

        public Criteria andRechargeBankNotEqualTo(String value) {
            addCriterion("recharge_bank <>", value, "rechargeBank");
            return (Criteria) this;
        }

        public Criteria andRechargeBankGreaterThan(String value) {
            addCriterion("recharge_bank >", value, "rechargeBank");
            return (Criteria) this;
        }

        public Criteria andRechargeBankGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_bank >=", value, "rechargeBank");
            return (Criteria) this;
        }

        public Criteria andRechargeBankLessThan(String value) {
            addCriterion("recharge_bank <", value, "rechargeBank");
            return (Criteria) this;
        }

        public Criteria andRechargeBankLessThanOrEqualTo(String value) {
            addCriterion("recharge_bank <=", value, "rechargeBank");
            return (Criteria) this;
        }

        public Criteria andRechargeBankLike(String value) {
            addCriterion("recharge_bank like", value, "rechargeBank");
            return (Criteria) this;
        }

        public Criteria andRechargeBankNotLike(String value) {
            addCriterion("recharge_bank not like", value, "rechargeBank");
            return (Criteria) this;
        }

        public Criteria andRechargeBankIn(List<String> values) {
            addCriterion("recharge_bank in", values, "rechargeBank");
            return (Criteria) this;
        }

        public Criteria andRechargeBankNotIn(List<String> values) {
            addCriterion("recharge_bank not in", values, "rechargeBank");
            return (Criteria) this;
        }

        public Criteria andRechargeBankBetween(String value1, String value2) {
            addCriterion("recharge_bank between", value1, value2, "rechargeBank");
            return (Criteria) this;
        }

        public Criteria andRechargeBankNotBetween(String value1, String value2) {
            addCriterion("recharge_bank not between", value1, value2, "rechargeBank");
            return (Criteria) this;
        }

        public Criteria andRechargeFileIsNull() {
            addCriterion("recharge_file is null");
            return (Criteria) this;
        }

        public Criteria andRechargeFileIsNotNull() {
            addCriterion("recharge_file is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeFileEqualTo(String value) {
            addCriterion("recharge_file =", value, "rechargeFile");
            return (Criteria) this;
        }

        public Criteria andRechargeFileNotEqualTo(String value) {
            addCriterion("recharge_file <>", value, "rechargeFile");
            return (Criteria) this;
        }

        public Criteria andRechargeFileGreaterThan(String value) {
            addCriterion("recharge_file >", value, "rechargeFile");
            return (Criteria) this;
        }

        public Criteria andRechargeFileGreaterThanOrEqualTo(String value) {
            addCriterion("recharge_file >=", value, "rechargeFile");
            return (Criteria) this;
        }

        public Criteria andRechargeFileLessThan(String value) {
            addCriterion("recharge_file <", value, "rechargeFile");
            return (Criteria) this;
        }

        public Criteria andRechargeFileLessThanOrEqualTo(String value) {
            addCriterion("recharge_file <=", value, "rechargeFile");
            return (Criteria) this;
        }

        public Criteria andRechargeFileLike(String value) {
            addCriterion("recharge_file like", value, "rechargeFile");
            return (Criteria) this;
        }

        public Criteria andRechargeFileNotLike(String value) {
            addCriterion("recharge_file not like", value, "rechargeFile");
            return (Criteria) this;
        }

        public Criteria andRechargeFileIn(List<String> values) {
            addCriterion("recharge_file in", values, "rechargeFile");
            return (Criteria) this;
        }

        public Criteria andRechargeFileNotIn(List<String> values) {
            addCriterion("recharge_file not in", values, "rechargeFile");
            return (Criteria) this;
        }

        public Criteria andRechargeFileBetween(String value1, String value2) {
            addCriterion("recharge_file between", value1, value2, "rechargeFile");
            return (Criteria) this;
        }

        public Criteria andRechargeFileNotBetween(String value1, String value2) {
            addCriterion("recharge_file not between", value1, value2, "rechargeFile");
            return (Criteria) this;
        }

        public Criteria andVerifyAdminIsNull() {
            addCriterion("verify_admin is null");
            return (Criteria) this;
        }

        public Criteria andVerifyAdminIsNotNull() {
            addCriterion("verify_admin is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyAdminEqualTo(String value) {
            addCriterion("verify_admin =", value, "verifyAdmin");
            return (Criteria) this;
        }

        public Criteria andVerifyAdminNotEqualTo(String value) {
            addCriterion("verify_admin <>", value, "verifyAdmin");
            return (Criteria) this;
        }

        public Criteria andVerifyAdminGreaterThan(String value) {
            addCriterion("verify_admin >", value, "verifyAdmin");
            return (Criteria) this;
        }

        public Criteria andVerifyAdminGreaterThanOrEqualTo(String value) {
            addCriterion("verify_admin >=", value, "verifyAdmin");
            return (Criteria) this;
        }

        public Criteria andVerifyAdminLessThan(String value) {
            addCriterion("verify_admin <", value, "verifyAdmin");
            return (Criteria) this;
        }

        public Criteria andVerifyAdminLessThanOrEqualTo(String value) {
            addCriterion("verify_admin <=", value, "verifyAdmin");
            return (Criteria) this;
        }

        public Criteria andVerifyAdminLike(String value) {
            addCriterion("verify_admin like", value, "verifyAdmin");
            return (Criteria) this;
        }

        public Criteria andVerifyAdminNotLike(String value) {
            addCriterion("verify_admin not like", value, "verifyAdmin");
            return (Criteria) this;
        }

        public Criteria andVerifyAdminIn(List<String> values) {
            addCriterion("verify_admin in", values, "verifyAdmin");
            return (Criteria) this;
        }

        public Criteria andVerifyAdminNotIn(List<String> values) {
            addCriterion("verify_admin not in", values, "verifyAdmin");
            return (Criteria) this;
        }

        public Criteria andVerifyAdminBetween(String value1, String value2) {
            addCriterion("verify_admin between", value1, value2, "verifyAdmin");
            return (Criteria) this;
        }

        public Criteria andVerifyAdminNotBetween(String value1, String value2) {
            addCriterion("verify_admin not between", value1, value2, "verifyAdmin");
            return (Criteria) this;
        }

        public Criteria andVerifyPhoneIsNull() {
            addCriterion("verify_phone is null");
            return (Criteria) this;
        }

        public Criteria andVerifyPhoneIsNotNull() {
            addCriterion("verify_phone is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyPhoneEqualTo(String value) {
            addCriterion("verify_phone =", value, "verifyPhone");
            return (Criteria) this;
        }

        public Criteria andVerifyPhoneNotEqualTo(String value) {
            addCriterion("verify_phone <>", value, "verifyPhone");
            return (Criteria) this;
        }

        public Criteria andVerifyPhoneGreaterThan(String value) {
            addCriterion("verify_phone >", value, "verifyPhone");
            return (Criteria) this;
        }

        public Criteria andVerifyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("verify_phone >=", value, "verifyPhone");
            return (Criteria) this;
        }

        public Criteria andVerifyPhoneLessThan(String value) {
            addCriterion("verify_phone <", value, "verifyPhone");
            return (Criteria) this;
        }

        public Criteria andVerifyPhoneLessThanOrEqualTo(String value) {
            addCriterion("verify_phone <=", value, "verifyPhone");
            return (Criteria) this;
        }

        public Criteria andVerifyPhoneLike(String value) {
            addCriterion("verify_phone like", value, "verifyPhone");
            return (Criteria) this;
        }

        public Criteria andVerifyPhoneNotLike(String value) {
            addCriterion("verify_phone not like", value, "verifyPhone");
            return (Criteria) this;
        }

        public Criteria andVerifyPhoneIn(List<String> values) {
            addCriterion("verify_phone in", values, "verifyPhone");
            return (Criteria) this;
        }

        public Criteria andVerifyPhoneNotIn(List<String> values) {
            addCriterion("verify_phone not in", values, "verifyPhone");
            return (Criteria) this;
        }

        public Criteria andVerifyPhoneBetween(String value1, String value2) {
            addCriterion("verify_phone between", value1, value2, "verifyPhone");
            return (Criteria) this;
        }

        public Criteria andVerifyPhoneNotBetween(String value1, String value2) {
            addCriterion("verify_phone not between", value1, value2, "verifyPhone");
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