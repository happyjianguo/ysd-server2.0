package com.ysd.asset.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BorrowRepaymentDetailCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowRepaymentDetailCriteria() {
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

        public Criteria andWebstatusIsNull() {
            addCriterion("webstatus is null");
            return (Criteria) this;
        }

        public Criteria andWebstatusIsNotNull() {
            addCriterion("webstatus is not null");
            return (Criteria) this;
        }

        public Criteria andWebstatusEqualTo(Integer value) {
            addCriterion("webstatus =", value, "webstatus");
            return (Criteria) this;
        }

        public Criteria andWebstatusNotEqualTo(Integer value) {
            addCriterion("webstatus <>", value, "webstatus");
            return (Criteria) this;
        }

        public Criteria andWebstatusGreaterThan(Integer value) {
            addCriterion("webstatus >", value, "webstatus");
            return (Criteria) this;
        }

        public Criteria andWebstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("webstatus >=", value, "webstatus");
            return (Criteria) this;
        }

        public Criteria andWebstatusLessThan(Integer value) {
            addCriterion("webstatus <", value, "webstatus");
            return (Criteria) this;
        }

        public Criteria andWebstatusLessThanOrEqualTo(Integer value) {
            addCriterion("webstatus <=", value, "webstatus");
            return (Criteria) this;
        }

        public Criteria andWebstatusIn(List<Integer> values) {
            addCriterion("webstatus in", values, "webstatus");
            return (Criteria) this;
        }

        public Criteria andWebstatusNotIn(List<Integer> values) {
            addCriterion("webstatus not in", values, "webstatus");
            return (Criteria) this;
        }

        public Criteria andWebstatusBetween(Integer value1, Integer value2) {
            addCriterion("webstatus between", value1, value2, "webstatus");
            return (Criteria) this;
        }

        public Criteria andWebstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("webstatus not between", value1, value2, "webstatus");
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

        public Criteria andRepaymentYestimeIsNull() {
            addCriterion("repayment_yestime is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeIsNotNull() {
            addCriterion("repayment_yestime is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeEqualTo(Date value) {
            addCriterion("repayment_yestime =", value, "repaymentYestime");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeNotEqualTo(Date value) {
            addCriterion("repayment_yestime <>", value, "repaymentYestime");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeGreaterThan(Date value) {
            addCriterion("repayment_yestime >", value, "repaymentYestime");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeGreaterThanOrEqualTo(Date value) {
            addCriterion("repayment_yestime >=", value, "repaymentYestime");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeLessThan(Date value) {
            addCriterion("repayment_yestime <", value, "repaymentYestime");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeLessThanOrEqualTo(Date value) {
            addCriterion("repayment_yestime <=", value, "repaymentYestime");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeIn(List<Date> values) {
            addCriterion("repayment_yestime in", values, "repaymentYestime");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeNotIn(List<Date> values) {
            addCriterion("repayment_yestime not in", values, "repaymentYestime");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeBetween(Date value1, Date value2) {
            addCriterion("repayment_yestime between", value1, value2, "repaymentYestime");
            return (Criteria) this;
        }

        public Criteria andRepaymentYestimeNotBetween(Date value1, Date value2) {
            addCriterion("repayment_yestime not between", value1, value2, "repaymentYestime");
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

        public Criteria andLateDaysIsNull() {
            addCriterion("late_days is null");
            return (Criteria) this;
        }

        public Criteria andLateDaysIsNotNull() {
            addCriterion("late_days is not null");
            return (Criteria) this;
        }

        public Criteria andLateDaysEqualTo(Integer value) {
            addCriterion("late_days =", value, "lateDays");
            return (Criteria) this;
        }

        public Criteria andLateDaysNotEqualTo(Integer value) {
            addCriterion("late_days <>", value, "lateDays");
            return (Criteria) this;
        }

        public Criteria andLateDaysGreaterThan(Integer value) {
            addCriterion("late_days >", value, "lateDays");
            return (Criteria) this;
        }

        public Criteria andLateDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("late_days >=", value, "lateDays");
            return (Criteria) this;
        }

        public Criteria andLateDaysLessThan(Integer value) {
            addCriterion("late_days <", value, "lateDays");
            return (Criteria) this;
        }

        public Criteria andLateDaysLessThanOrEqualTo(Integer value) {
            addCriterion("late_days <=", value, "lateDays");
            return (Criteria) this;
        }

        public Criteria andLateDaysIn(List<Integer> values) {
            addCriterion("late_days in", values, "lateDays");
            return (Criteria) this;
        }

        public Criteria andLateDaysNotIn(List<Integer> values) {
            addCriterion("late_days not in", values, "lateDays");
            return (Criteria) this;
        }

        public Criteria andLateDaysBetween(Integer value1, Integer value2) {
            addCriterion("late_days between", value1, value2, "lateDays");
            return (Criteria) this;
        }

        public Criteria andLateDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("late_days not between", value1, value2, "lateDays");
            return (Criteria) this;
        }

        public Criteria andLateInterestIsNull() {
            addCriterion("late_interest is null");
            return (Criteria) this;
        }

        public Criteria andLateInterestIsNotNull() {
            addCriterion("late_interest is not null");
            return (Criteria) this;
        }

        public Criteria andLateInterestEqualTo(String value) {
            addCriterion("late_interest =", value, "lateInterest");
            return (Criteria) this;
        }

        public Criteria andLateInterestNotEqualTo(String value) {
            addCriterion("late_interest <>", value, "lateInterest");
            return (Criteria) this;
        }

        public Criteria andLateInterestGreaterThan(String value) {
            addCriterion("late_interest >", value, "lateInterest");
            return (Criteria) this;
        }

        public Criteria andLateInterestGreaterThanOrEqualTo(String value) {
            addCriterion("late_interest >=", value, "lateInterest");
            return (Criteria) this;
        }

        public Criteria andLateInterestLessThan(String value) {
            addCriterion("late_interest <", value, "lateInterest");
            return (Criteria) this;
        }

        public Criteria andLateInterestLessThanOrEqualTo(String value) {
            addCriterion("late_interest <=", value, "lateInterest");
            return (Criteria) this;
        }

        public Criteria andLateInterestLike(String value) {
            addCriterion("late_interest like", value, "lateInterest");
            return (Criteria) this;
        }

        public Criteria andLateInterestNotLike(String value) {
            addCriterion("late_interest not like", value, "lateInterest");
            return (Criteria) this;
        }

        public Criteria andLateInterestIn(List<String> values) {
            addCriterion("late_interest in", values, "lateInterest");
            return (Criteria) this;
        }

        public Criteria andLateInterestNotIn(List<String> values) {
            addCriterion("late_interest not in", values, "lateInterest");
            return (Criteria) this;
        }

        public Criteria andLateInterestBetween(String value1, String value2) {
            addCriterion("late_interest between", value1, value2, "lateInterest");
            return (Criteria) this;
        }

        public Criteria andLateInterestNotBetween(String value1, String value2) {
            addCriterion("late_interest not between", value1, value2, "lateInterest");
            return (Criteria) this;
        }

        public Criteria andInterestIsNull() {
            addCriterion("interest is null");
            return (Criteria) this;
        }

        public Criteria andInterestIsNotNull() {
            addCriterion("interest is not null");
            return (Criteria) this;
        }

        public Criteria andInterestEqualTo(String value) {
            addCriterion("interest =", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotEqualTo(String value) {
            addCriterion("interest <>", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThan(String value) {
            addCriterion("interest >", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThanOrEqualTo(String value) {
            addCriterion("interest >=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThan(String value) {
            addCriterion("interest <", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThanOrEqualTo(String value) {
            addCriterion("interest <=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLike(String value) {
            addCriterion("interest like", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotLike(String value) {
            addCriterion("interest not like", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestIn(List<String> values) {
            addCriterion("interest in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotIn(List<String> values) {
            addCriterion("interest not in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestBetween(String value1, String value2) {
            addCriterion("interest between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotBetween(String value1, String value2) {
            addCriterion("interest not between", value1, value2, "interest");
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

        public Criteria andCapitalEqualTo(String value) {
            addCriterion("capital =", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotEqualTo(String value) {
            addCriterion("capital <>", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThan(String value) {
            addCriterion("capital >", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("capital >=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThan(String value) {
            addCriterion("capital <", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLessThanOrEqualTo(String value) {
            addCriterion("capital <=", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalLike(String value) {
            addCriterion("capital like", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotLike(String value) {
            addCriterion("capital not like", value, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalIn(List<String> values) {
            addCriterion("capital in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotIn(List<String> values) {
            addCriterion("capital not in", values, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalBetween(String value1, String value2) {
            addCriterion("capital between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalNotBetween(String value1, String value2) {
            addCriterion("capital not between", value1, value2, "capital");
            return (Criteria) this;
        }

        public Criteria andCapitalTasteIsNull() {
            addCriterion("capital_taste is null");
            return (Criteria) this;
        }

        public Criteria andCapitalTasteIsNotNull() {
            addCriterion("capital_taste is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalTasteEqualTo(String value) {
            addCriterion("capital_taste =", value, "capitalTaste");
            return (Criteria) this;
        }

        public Criteria andCapitalTasteNotEqualTo(String value) {
            addCriterion("capital_taste <>", value, "capitalTaste");
            return (Criteria) this;
        }

        public Criteria andCapitalTasteGreaterThan(String value) {
            addCriterion("capital_taste >", value, "capitalTaste");
            return (Criteria) this;
        }

        public Criteria andCapitalTasteGreaterThanOrEqualTo(String value) {
            addCriterion("capital_taste >=", value, "capitalTaste");
            return (Criteria) this;
        }

        public Criteria andCapitalTasteLessThan(String value) {
            addCriterion("capital_taste <", value, "capitalTaste");
            return (Criteria) this;
        }

        public Criteria andCapitalTasteLessThanOrEqualTo(String value) {
            addCriterion("capital_taste <=", value, "capitalTaste");
            return (Criteria) this;
        }

        public Criteria andCapitalTasteLike(String value) {
            addCriterion("capital_taste like", value, "capitalTaste");
            return (Criteria) this;
        }

        public Criteria andCapitalTasteNotLike(String value) {
            addCriterion("capital_taste not like", value, "capitalTaste");
            return (Criteria) this;
        }

        public Criteria andCapitalTasteIn(List<String> values) {
            addCriterion("capital_taste in", values, "capitalTaste");
            return (Criteria) this;
        }

        public Criteria andCapitalTasteNotIn(List<String> values) {
            addCriterion("capital_taste not in", values, "capitalTaste");
            return (Criteria) this;
        }

        public Criteria andCapitalTasteBetween(String value1, String value2) {
            addCriterion("capital_taste between", value1, value2, "capitalTaste");
            return (Criteria) this;
        }

        public Criteria andCapitalTasteNotBetween(String value1, String value2) {
            addCriterion("capital_taste not between", value1, value2, "capitalTaste");
            return (Criteria) this;
        }

        public Criteria andCapitalDirectIsNull() {
            addCriterion("capital_direct is null");
            return (Criteria) this;
        }

        public Criteria andCapitalDirectIsNotNull() {
            addCriterion("capital_direct is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalDirectEqualTo(String value) {
            addCriterion("capital_direct =", value, "capitalDirect");
            return (Criteria) this;
        }

        public Criteria andCapitalDirectNotEqualTo(String value) {
            addCriterion("capital_direct <>", value, "capitalDirect");
            return (Criteria) this;
        }

        public Criteria andCapitalDirectGreaterThan(String value) {
            addCriterion("capital_direct >", value, "capitalDirect");
            return (Criteria) this;
        }

        public Criteria andCapitalDirectGreaterThanOrEqualTo(String value) {
            addCriterion("capital_direct >=", value, "capitalDirect");
            return (Criteria) this;
        }

        public Criteria andCapitalDirectLessThan(String value) {
            addCriterion("capital_direct <", value, "capitalDirect");
            return (Criteria) this;
        }

        public Criteria andCapitalDirectLessThanOrEqualTo(String value) {
            addCriterion("capital_direct <=", value, "capitalDirect");
            return (Criteria) this;
        }

        public Criteria andCapitalDirectLike(String value) {
            addCriterion("capital_direct like", value, "capitalDirect");
            return (Criteria) this;
        }

        public Criteria andCapitalDirectNotLike(String value) {
            addCriterion("capital_direct not like", value, "capitalDirect");
            return (Criteria) this;
        }

        public Criteria andCapitalDirectIn(List<String> values) {
            addCriterion("capital_direct in", values, "capitalDirect");
            return (Criteria) this;
        }

        public Criteria andCapitalDirectNotIn(List<String> values) {
            addCriterion("capital_direct not in", values, "capitalDirect");
            return (Criteria) this;
        }

        public Criteria andCapitalDirectBetween(String value1, String value2) {
            addCriterion("capital_direct between", value1, value2, "capitalDirect");
            return (Criteria) this;
        }

        public Criteria andCapitalDirectNotBetween(String value1, String value2) {
            addCriterion("capital_direct not between", value1, value2, "capitalDirect");
            return (Criteria) this;
        }

        public Criteria andForfeitIsNull() {
            addCriterion("forfeit is null");
            return (Criteria) this;
        }

        public Criteria andForfeitIsNotNull() {
            addCriterion("forfeit is not null");
            return (Criteria) this;
        }

        public Criteria andForfeitEqualTo(String value) {
            addCriterion("forfeit =", value, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitNotEqualTo(String value) {
            addCriterion("forfeit <>", value, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitGreaterThan(String value) {
            addCriterion("forfeit >", value, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitGreaterThanOrEqualTo(String value) {
            addCriterion("forfeit >=", value, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitLessThan(String value) {
            addCriterion("forfeit <", value, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitLessThanOrEqualTo(String value) {
            addCriterion("forfeit <=", value, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitLike(String value) {
            addCriterion("forfeit like", value, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitNotLike(String value) {
            addCriterion("forfeit not like", value, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitIn(List<String> values) {
            addCriterion("forfeit in", values, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitNotIn(List<String> values) {
            addCriterion("forfeit not in", values, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitBetween(String value1, String value2) {
            addCriterion("forfeit between", value1, value2, "forfeit");
            return (Criteria) this;
        }

        public Criteria andForfeitNotBetween(String value1, String value2) {
            addCriterion("forfeit not between", value1, value2, "forfeit");
            return (Criteria) this;
        }

        public Criteria andReminderFeeIsNull() {
            addCriterion("reminder_fee is null");
            return (Criteria) this;
        }

        public Criteria andReminderFeeIsNotNull() {
            addCriterion("reminder_fee is not null");
            return (Criteria) this;
        }

        public Criteria andReminderFeeEqualTo(String value) {
            addCriterion("reminder_fee =", value, "reminderFee");
            return (Criteria) this;
        }

        public Criteria andReminderFeeNotEqualTo(String value) {
            addCriterion("reminder_fee <>", value, "reminderFee");
            return (Criteria) this;
        }

        public Criteria andReminderFeeGreaterThan(String value) {
            addCriterion("reminder_fee >", value, "reminderFee");
            return (Criteria) this;
        }

        public Criteria andReminderFeeGreaterThanOrEqualTo(String value) {
            addCriterion("reminder_fee >=", value, "reminderFee");
            return (Criteria) this;
        }

        public Criteria andReminderFeeLessThan(String value) {
            addCriterion("reminder_fee <", value, "reminderFee");
            return (Criteria) this;
        }

        public Criteria andReminderFeeLessThanOrEqualTo(String value) {
            addCriterion("reminder_fee <=", value, "reminderFee");
            return (Criteria) this;
        }

        public Criteria andReminderFeeLike(String value) {
            addCriterion("reminder_fee like", value, "reminderFee");
            return (Criteria) this;
        }

        public Criteria andReminderFeeNotLike(String value) {
            addCriterion("reminder_fee not like", value, "reminderFee");
            return (Criteria) this;
        }

        public Criteria andReminderFeeIn(List<String> values) {
            addCriterion("reminder_fee in", values, "reminderFee");
            return (Criteria) this;
        }

        public Criteria andReminderFeeNotIn(List<String> values) {
            addCriterion("reminder_fee not in", values, "reminderFee");
            return (Criteria) this;
        }

        public Criteria andReminderFeeBetween(String value1, String value2) {
            addCriterion("reminder_fee between", value1, value2, "reminderFee");
            return (Criteria) this;
        }

        public Criteria andReminderFeeNotBetween(String value1, String value2) {
            addCriterion("reminder_fee not between", value1, value2, "reminderFee");
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

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(String value) {
            addCriterion("operator_id =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(String value) {
            addCriterion("operator_id <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(String value) {
            addCriterion("operator_id >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("operator_id >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(String value) {
            addCriterion("operator_id <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(String value) {
            addCriterion("operator_id <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLike(String value) {
            addCriterion("operator_id like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotLike(String value) {
            addCriterion("operator_id not like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<String> values) {
            addCriterion("operator_id in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<String> values) {
            addCriterion("operator_id not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(String value1, String value2) {
            addCriterion("operator_id between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(String value1, String value2) {
            addCriterion("operator_id not between", value1, value2, "operatorId");
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

        public Criteria andRepaymentDateIntIsNull() {
            addCriterion("repayment_date_int is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIntIsNotNull() {
            addCriterion("repayment_date_int is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIntEqualTo(Integer value) {
            addCriterion("repayment_date_int =", value, "repaymentDateInt");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIntNotEqualTo(Integer value) {
            addCriterion("repayment_date_int <>", value, "repaymentDateInt");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIntGreaterThan(Integer value) {
            addCriterion("repayment_date_int >", value, "repaymentDateInt");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIntGreaterThanOrEqualTo(Integer value) {
            addCriterion("repayment_date_int >=", value, "repaymentDateInt");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIntLessThan(Integer value) {
            addCriterion("repayment_date_int <", value, "repaymentDateInt");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIntLessThanOrEqualTo(Integer value) {
            addCriterion("repayment_date_int <=", value, "repaymentDateInt");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIntIn(List<Integer> values) {
            addCriterion("repayment_date_int in", values, "repaymentDateInt");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIntNotIn(List<Integer> values) {
            addCriterion("repayment_date_int not in", values, "repaymentDateInt");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIntBetween(Integer value1, Integer value2) {
            addCriterion("repayment_date_int between", value1, value2, "repaymentDateInt");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIntNotBetween(Integer value1, Integer value2) {
            addCriterion("repayment_date_int not between", value1, value2, "repaymentDateInt");
            return (Criteria) this;
        }

        public Criteria andRewardIsNull() {
            addCriterion("reward is null");
            return (Criteria) this;
        }

        public Criteria andRewardIsNotNull() {
            addCriterion("reward is not null");
            return (Criteria) this;
        }

        public Criteria andRewardEqualTo(String value) {
            addCriterion("reward =", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotEqualTo(String value) {
            addCriterion("reward <>", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardGreaterThan(String value) {
            addCriterion("reward >", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardGreaterThanOrEqualTo(String value) {
            addCriterion("reward >=", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLessThan(String value) {
            addCriterion("reward <", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLessThanOrEqualTo(String value) {
            addCriterion("reward <=", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLike(String value) {
            addCriterion("reward like", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotLike(String value) {
            addCriterion("reward not like", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardIn(List<String> values) {
            addCriterion("reward in", values, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotIn(List<String> values) {
            addCriterion("reward not in", values, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardBetween(String value1, String value2) {
            addCriterion("reward between", value1, value2, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotBetween(String value1, String value2) {
            addCriterion("reward not between", value1, value2, "reward");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusIsNull() {
            addCriterion("recharge_status is null");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusIsNotNull() {
            addCriterion("recharge_status is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusEqualTo(Integer value) {
            addCriterion("recharge_status =", value, "rechargeStatus");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusNotEqualTo(Integer value) {
            addCriterion("recharge_status <>", value, "rechargeStatus");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusGreaterThan(Integer value) {
            addCriterion("recharge_status >", value, "rechargeStatus");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_status >=", value, "rechargeStatus");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusLessThan(Integer value) {
            addCriterion("recharge_status <", value, "rechargeStatus");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_status <=", value, "rechargeStatus");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusIn(List<Integer> values) {
            addCriterion("recharge_status in", values, "rechargeStatus");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusNotIn(List<Integer> values) {
            addCriterion("recharge_status not in", values, "rechargeStatus");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusBetween(Integer value1, Integer value2) {
            addCriterion("recharge_status between", value1, value2, "rechargeStatus");
            return (Criteria) this;
        }

        public Criteria andRechargeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_status not between", value1, value2, "rechargeStatus");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNull() {
            addCriterion("recharge_money is null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNotNull() {
            addCriterion("recharge_money is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyEqualTo(BigDecimal value) {
            addCriterion("recharge_money =", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotEqualTo(BigDecimal value) {
            addCriterion("recharge_money <>", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThan(BigDecimal value) {
            addCriterion("recharge_money >", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge_money >=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThan(BigDecimal value) {
            addCriterion("recharge_money <", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge_money <=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIn(List<BigDecimal> values) {
            addCriterion("recharge_money in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotIn(List<BigDecimal> values) {
            addCriterion("recharge_money not in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge_money between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge_money not between", value1, value2, "rechargeMoney");
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