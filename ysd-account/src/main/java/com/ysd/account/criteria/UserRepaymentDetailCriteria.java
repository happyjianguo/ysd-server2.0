package com.ysd.account.criteria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserRepaymentDetailCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserRepaymentDetailCriteria() {
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andWaitAccountIsNull() {
            addCriterion("wait_account is null");
            return (Criteria) this;
        }

        public Criteria andWaitAccountIsNotNull() {
            addCriterion("wait_account is not null");
            return (Criteria) this;
        }

        public Criteria andWaitAccountEqualTo(String value) {
            addCriterion("wait_account =", value, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andWaitAccountNotEqualTo(String value) {
            addCriterion("wait_account <>", value, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andWaitAccountGreaterThan(String value) {
            addCriterion("wait_account >", value, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andWaitAccountGreaterThanOrEqualTo(String value) {
            addCriterion("wait_account >=", value, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andWaitAccountLessThan(String value) {
            addCriterion("wait_account <", value, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andWaitAccountLessThanOrEqualTo(String value) {
            addCriterion("wait_account <=", value, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andWaitAccountLike(String value) {
            addCriterion("wait_account like", value, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andWaitAccountNotLike(String value) {
            addCriterion("wait_account not like", value, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andWaitAccountIn(List<String> values) {
            addCriterion("wait_account in", values, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andWaitAccountNotIn(List<String> values) {
            addCriterion("wait_account not in", values, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andWaitAccountBetween(String value1, String value2) {
            addCriterion("wait_account between", value1, value2, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andWaitAccountNotBetween(String value1, String value2) {
            addCriterion("wait_account not between", value1, value2, "waitAccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestIsNull() {
            addCriterion("repayment_yesinterest is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestIsNotNull() {
            addCriterion("repayment_yesinterest is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestEqualTo(String value) {
            addCriterion("repayment_yesinterest =", value, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestNotEqualTo(String value) {
            addCriterion("repayment_yesinterest <>", value, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestGreaterThan(String value) {
            addCriterion("repayment_yesinterest >", value, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestGreaterThanOrEqualTo(String value) {
            addCriterion("repayment_yesinterest >=", value, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestLessThan(String value) {
            addCriterion("repayment_yesinterest <", value, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestLessThanOrEqualTo(String value) {
            addCriterion("repayment_yesinterest <=", value, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestLike(String value) {
            addCriterion("repayment_yesinterest like", value, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestNotLike(String value) {
            addCriterion("repayment_yesinterest not like", value, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestIn(List<String> values) {
            addCriterion("repayment_yesinterest in", values, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestNotIn(List<String> values) {
            addCriterion("repayment_yesinterest not in", values, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestBetween(String value1, String value2) {
            addCriterion("repayment_yesinterest between", value1, value2, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andRepaymentYesinterestNotBetween(String value1, String value2) {
            addCriterion("repayment_yesinterest not between", value1, value2, "repaymentYesinterest");
            return (Criteria) this;
        }

        public Criteria andWaitInterestIsNull() {
            addCriterion("wait_interest is null");
            return (Criteria) this;
        }

        public Criteria andWaitInterestIsNotNull() {
            addCriterion("wait_interest is not null");
            return (Criteria) this;
        }

        public Criteria andWaitInterestEqualTo(String value) {
            addCriterion("wait_interest =", value, "waitInterest");
            return (Criteria) this;
        }

        public Criteria andWaitInterestNotEqualTo(String value) {
            addCriterion("wait_interest <>", value, "waitInterest");
            return (Criteria) this;
        }

        public Criteria andWaitInterestGreaterThan(String value) {
            addCriterion("wait_interest >", value, "waitInterest");
            return (Criteria) this;
        }

        public Criteria andWaitInterestGreaterThanOrEqualTo(String value) {
            addCriterion("wait_interest >=", value, "waitInterest");
            return (Criteria) this;
        }

        public Criteria andWaitInterestLessThan(String value) {
            addCriterion("wait_interest <", value, "waitInterest");
            return (Criteria) this;
        }

        public Criteria andWaitInterestLessThanOrEqualTo(String value) {
            addCriterion("wait_interest <=", value, "waitInterest");
            return (Criteria) this;
        }

        public Criteria andWaitInterestLike(String value) {
            addCriterion("wait_interest like", value, "waitInterest");
            return (Criteria) this;
        }

        public Criteria andWaitInterestNotLike(String value) {
            addCriterion("wait_interest not like", value, "waitInterest");
            return (Criteria) this;
        }

        public Criteria andWaitInterestIn(List<String> values) {
            addCriterion("wait_interest in", values, "waitInterest");
            return (Criteria) this;
        }

        public Criteria andWaitInterestNotIn(List<String> values) {
            addCriterion("wait_interest not in", values, "waitInterest");
            return (Criteria) this;
        }

        public Criteria andWaitInterestBetween(String value1, String value2) {
            addCriterion("wait_interest between", value1, value2, "waitInterest");
            return (Criteria) this;
        }

        public Criteria andWaitInterestNotBetween(String value1, String value2) {
            addCriterion("wait_interest not between", value1, value2, "waitInterest");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIsNull() {
            addCriterion("service_charge is null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIsNotNull() {
            addCriterion("service_charge is not null");
            return (Criteria) this;
        }

        public Criteria andServiceChargeEqualTo(String value) {
            addCriterion("service_charge =", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotEqualTo(String value) {
            addCriterion("service_charge <>", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThan(String value) {
            addCriterion("service_charge >", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeGreaterThanOrEqualTo(String value) {
            addCriterion("service_charge >=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThan(String value) {
            addCriterion("service_charge <", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLessThanOrEqualTo(String value) {
            addCriterion("service_charge <=", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeLike(String value) {
            addCriterion("service_charge like", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotLike(String value) {
            addCriterion("service_charge not like", value, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeIn(List<String> values) {
            addCriterion("service_charge in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotIn(List<String> values) {
            addCriterion("service_charge not in", values, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeBetween(String value1, String value2) {
            addCriterion("service_charge between", value1, value2, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andServiceChargeNotBetween(String value1, String value2) {
            addCriterion("service_charge not between", value1, value2, "serviceCharge");
            return (Criteria) this;
        }

        public Criteria andProfitIsNull() {
            addCriterion("profit is null");
            return (Criteria) this;
        }

        public Criteria andProfitIsNotNull() {
            addCriterion("profit is not null");
            return (Criteria) this;
        }

        public Criteria andProfitEqualTo(String value) {
            addCriterion("profit =", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotEqualTo(String value) {
            addCriterion("profit <>", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThan(String value) {
            addCriterion("profit >", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitGreaterThanOrEqualTo(String value) {
            addCriterion("profit >=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThan(String value) {
            addCriterion("profit <", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLessThanOrEqualTo(String value) {
            addCriterion("profit <=", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitLike(String value) {
            addCriterion("profit like", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotLike(String value) {
            addCriterion("profit not like", value, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitIn(List<String> values) {
            addCriterion("profit in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotIn(List<String> values) {
            addCriterion("profit not in", values, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitBetween(String value1, String value2) {
            addCriterion("profit between", value1, value2, "profit");
            return (Criteria) this;
        }

        public Criteria andProfitNotBetween(String value1, String value2) {
            addCriterion("profit not between", value1, value2, "profit");
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

        public Criteria andBorrowRepaymentDetailIdIsNull() {
            addCriterion("borrow_repayment_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentDetailIdIsNotNull() {
            addCriterion("borrow_repayment_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentDetailIdEqualTo(Integer value) {
            addCriterion("borrow_repayment_detail_id =", value, "borrowRepaymentDetailId");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentDetailIdNotEqualTo(Integer value) {
            addCriterion("borrow_repayment_detail_id <>", value, "borrowRepaymentDetailId");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentDetailIdGreaterThan(Integer value) {
            addCriterion("borrow_repayment_detail_id >", value, "borrowRepaymentDetailId");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_repayment_detail_id >=", value, "borrowRepaymentDetailId");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentDetailIdLessThan(Integer value) {
            addCriterion("borrow_repayment_detail_id <", value, "borrowRepaymentDetailId");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_repayment_detail_id <=", value, "borrowRepaymentDetailId");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentDetailIdIn(List<Integer> values) {
            addCriterion("borrow_repayment_detail_id in", values, "borrowRepaymentDetailId");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentDetailIdNotIn(List<Integer> values) {
            addCriterion("borrow_repayment_detail_id not in", values, "borrowRepaymentDetailId");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("borrow_repayment_detail_id between", value1, value2, "borrowRepaymentDetailId");
            return (Criteria) this;
        }

        public Criteria andBorrowRepaymentDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_repayment_detail_id not between", value1, value2, "borrowRepaymentDetailId");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodsIsNull() {
            addCriterion("borrow_periods is null");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodsIsNotNull() {
            addCriterion("borrow_periods is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodsEqualTo(Integer value) {
            addCriterion("borrow_periods =", value, "borrowPeriods");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodsNotEqualTo(Integer value) {
            addCriterion("borrow_periods <>", value, "borrowPeriods");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodsGreaterThan(Integer value) {
            addCriterion("borrow_periods >", value, "borrowPeriods");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_periods >=", value, "borrowPeriods");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodsLessThan(Integer value) {
            addCriterion("borrow_periods <", value, "borrowPeriods");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodsLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_periods <=", value, "borrowPeriods");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodsIn(List<Integer> values) {
            addCriterion("borrow_periods in", values, "borrowPeriods");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodsNotIn(List<Integer> values) {
            addCriterion("borrow_periods not in", values, "borrowPeriods");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodsBetween(Integer value1, Integer value2) {
            addCriterion("borrow_periods between", value1, value2, "borrowPeriods");
            return (Criteria) this;
        }

        public Criteria andBorrowPeriodsNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_periods not between", value1, value2, "borrowPeriods");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIsNull() {
            addCriterion("repayment_date is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIsNotNull() {
            addCriterion("repayment_date is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateEqualTo(Date value) {
            addCriterion("repayment_date =", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotEqualTo(Date value) {
            addCriterion("repayment_date <>", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateGreaterThan(Date value) {
            addCriterion("repayment_date >", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("repayment_date >=", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateLessThan(Date value) {
            addCriterion("repayment_date <", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateLessThanOrEqualTo(Date value) {
            addCriterion("repayment_date <=", value, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateIn(List<Date> values) {
            addCriterion("repayment_date in", values, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotIn(List<Date> values) {
            addCriterion("repayment_date not in", values, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateBetween(Date value1, Date value2) {
            addCriterion("repayment_date between", value1, value2, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andRepaymentDateNotBetween(Date value1, Date value2) {
            addCriterion("repayment_date not between", value1, value2, "repaymentDate");
            return (Criteria) this;
        }

        public Criteria andBorrowDetailIdIsNull() {
            addCriterion("borrow_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andBorrowDetailIdIsNotNull() {
            addCriterion("borrow_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowDetailIdEqualTo(Integer value) {
            addCriterion("borrow_detail_id =", value, "borrowDetailId");
            return (Criteria) this;
        }

        public Criteria andBorrowDetailIdNotEqualTo(Integer value) {
            addCriterion("borrow_detail_id <>", value, "borrowDetailId");
            return (Criteria) this;
        }

        public Criteria andBorrowDetailIdGreaterThan(Integer value) {
            addCriterion("borrow_detail_id >", value, "borrowDetailId");
            return (Criteria) this;
        }

        public Criteria andBorrowDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_detail_id >=", value, "borrowDetailId");
            return (Criteria) this;
        }

        public Criteria andBorrowDetailIdLessThan(Integer value) {
            addCriterion("borrow_detail_id <", value, "borrowDetailId");
            return (Criteria) this;
        }

        public Criteria andBorrowDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_detail_id <=", value, "borrowDetailId");
            return (Criteria) this;
        }

        public Criteria andBorrowDetailIdIn(List<Integer> values) {
            addCriterion("borrow_detail_id in", values, "borrowDetailId");
            return (Criteria) this;
        }

        public Criteria andBorrowDetailIdNotIn(List<Integer> values) {
            addCriterion("borrow_detail_id not in", values, "borrowDetailId");
            return (Criteria) this;
        }

        public Criteria andBorrowDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("borrow_detail_id between", value1, value2, "borrowDetailId");
            return (Criteria) this;
        }

        public Criteria andBorrowDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_detail_id not between", value1, value2, "borrowDetailId");
            return (Criteria) this;
        }

        public Criteria andApplyContinueTotalIsNull() {
            addCriterion("apply_continue_total is null");
            return (Criteria) this;
        }

        public Criteria andApplyContinueTotalIsNotNull() {
            addCriterion("apply_continue_total is not null");
            return (Criteria) this;
        }

        public Criteria andApplyContinueTotalEqualTo(String value) {
            addCriterion("apply_continue_total =", value, "applyContinueTotal");
            return (Criteria) this;
        }

        public Criteria andApplyContinueTotalNotEqualTo(String value) {
            addCriterion("apply_continue_total <>", value, "applyContinueTotal");
            return (Criteria) this;
        }

        public Criteria andApplyContinueTotalGreaterThan(String value) {
            addCriterion("apply_continue_total >", value, "applyContinueTotal");
            return (Criteria) this;
        }

        public Criteria andApplyContinueTotalGreaterThanOrEqualTo(String value) {
            addCriterion("apply_continue_total >=", value, "applyContinueTotal");
            return (Criteria) this;
        }

        public Criteria andApplyContinueTotalLessThan(String value) {
            addCriterion("apply_continue_total <", value, "applyContinueTotal");
            return (Criteria) this;
        }

        public Criteria andApplyContinueTotalLessThanOrEqualTo(String value) {
            addCriterion("apply_continue_total <=", value, "applyContinueTotal");
            return (Criteria) this;
        }

        public Criteria andApplyContinueTotalLike(String value) {
            addCriterion("apply_continue_total like", value, "applyContinueTotal");
            return (Criteria) this;
        }

        public Criteria andApplyContinueTotalNotLike(String value) {
            addCriterion("apply_continue_total not like", value, "applyContinueTotal");
            return (Criteria) this;
        }

        public Criteria andApplyContinueTotalIn(List<String> values) {
            addCriterion("apply_continue_total in", values, "applyContinueTotal");
            return (Criteria) this;
        }

        public Criteria andApplyContinueTotalNotIn(List<String> values) {
            addCriterion("apply_continue_total not in", values, "applyContinueTotal");
            return (Criteria) this;
        }

        public Criteria andApplyContinueTotalBetween(String value1, String value2) {
            addCriterion("apply_continue_total between", value1, value2, "applyContinueTotal");
            return (Criteria) this;
        }

        public Criteria andApplyContinueTotalNotBetween(String value1, String value2) {
            addCriterion("apply_continue_total not between", value1, value2, "applyContinueTotal");
            return (Criteria) this;
        }

        public Criteria andBorrowDividesIsNull() {
            addCriterion("borrow_divides is null");
            return (Criteria) this;
        }

        public Criteria andBorrowDividesIsNotNull() {
            addCriterion("borrow_divides is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowDividesEqualTo(Integer value) {
            addCriterion("borrow_divides =", value, "borrowDivides");
            return (Criteria) this;
        }

        public Criteria andBorrowDividesNotEqualTo(Integer value) {
            addCriterion("borrow_divides <>", value, "borrowDivides");
            return (Criteria) this;
        }

        public Criteria andBorrowDividesGreaterThan(Integer value) {
            addCriterion("borrow_divides >", value, "borrowDivides");
            return (Criteria) this;
        }

        public Criteria andBorrowDividesGreaterThanOrEqualTo(Integer value) {
            addCriterion("borrow_divides >=", value, "borrowDivides");
            return (Criteria) this;
        }

        public Criteria andBorrowDividesLessThan(Integer value) {
            addCriterion("borrow_divides <", value, "borrowDivides");
            return (Criteria) this;
        }

        public Criteria andBorrowDividesLessThanOrEqualTo(Integer value) {
            addCriterion("borrow_divides <=", value, "borrowDivides");
            return (Criteria) this;
        }

        public Criteria andBorrowDividesIn(List<Integer> values) {
            addCriterion("borrow_divides in", values, "borrowDivides");
            return (Criteria) this;
        }

        public Criteria andBorrowDividesNotIn(List<Integer> values) {
            addCriterion("borrow_divides not in", values, "borrowDivides");
            return (Criteria) this;
        }

        public Criteria andBorrowDividesBetween(Integer value1, Integer value2) {
            addCriterion("borrow_divides between", value1, value2, "borrowDivides");
            return (Criteria) this;
        }

        public Criteria andBorrowDividesNotBetween(Integer value1, Integer value2) {
            addCriterion("borrow_divides not between", value1, value2, "borrowDivides");
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