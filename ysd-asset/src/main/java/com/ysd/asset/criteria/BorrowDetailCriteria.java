package com.ysd.asset.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BorrowDetailCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowDetailCriteria() {
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

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(String value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(String value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(String value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(String value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(String value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLike(String value) {
            addCriterion("money like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotLike(String value) {
            addCriterion("money not like", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<String> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<String> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(String value1, String value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(String value1, String value2) {
            addCriterion("money not between", value1, value2, "money");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andAbleAmountIsNull() {
            addCriterion("able_amount is null");
            return (Criteria) this;
        }

        public Criteria andAbleAmountIsNotNull() {
            addCriterion("able_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAbleAmountEqualTo(String value) {
            addCriterion("able_amount =", value, "ableAmount");
            return (Criteria) this;
        }

        public Criteria andAbleAmountNotEqualTo(String value) {
            addCriterion("able_amount <>", value, "ableAmount");
            return (Criteria) this;
        }

        public Criteria andAbleAmountGreaterThan(String value) {
            addCriterion("able_amount >", value, "ableAmount");
            return (Criteria) this;
        }

        public Criteria andAbleAmountGreaterThanOrEqualTo(String value) {
            addCriterion("able_amount >=", value, "ableAmount");
            return (Criteria) this;
        }

        public Criteria andAbleAmountLessThan(String value) {
            addCriterion("able_amount <", value, "ableAmount");
            return (Criteria) this;
        }

        public Criteria andAbleAmountLessThanOrEqualTo(String value) {
            addCriterion("able_amount <=", value, "ableAmount");
            return (Criteria) this;
        }

        public Criteria andAbleAmountLike(String value) {
            addCriterion("able_amount like", value, "ableAmount");
            return (Criteria) this;
        }

        public Criteria andAbleAmountNotLike(String value) {
            addCriterion("able_amount not like", value, "ableAmount");
            return (Criteria) this;
        }

        public Criteria andAbleAmountIn(List<String> values) {
            addCriterion("able_amount in", values, "ableAmount");
            return (Criteria) this;
        }

        public Criteria andAbleAmountNotIn(List<String> values) {
            addCriterion("able_amount not in", values, "ableAmount");
            return (Criteria) this;
        }

        public Criteria andAbleAmountBetween(String value1, String value2) {
            addCriterion("able_amount between", value1, value2, "ableAmount");
            return (Criteria) this;
        }

        public Criteria andAbleAmountNotBetween(String value1, String value2) {
            addCriterion("able_amount not between", value1, value2, "ableAmount");
            return (Criteria) this;
        }

        public Criteria andContinueAmountIsNull() {
            addCriterion("continue_amount is null");
            return (Criteria) this;
        }

        public Criteria andContinueAmountIsNotNull() {
            addCriterion("continue_amount is not null");
            return (Criteria) this;
        }

        public Criteria andContinueAmountEqualTo(String value) {
            addCriterion("continue_amount =", value, "continueAmount");
            return (Criteria) this;
        }

        public Criteria andContinueAmountNotEqualTo(String value) {
            addCriterion("continue_amount <>", value, "continueAmount");
            return (Criteria) this;
        }

        public Criteria andContinueAmountGreaterThan(String value) {
            addCriterion("continue_amount >", value, "continueAmount");
            return (Criteria) this;
        }

        public Criteria andContinueAmountGreaterThanOrEqualTo(String value) {
            addCriterion("continue_amount >=", value, "continueAmount");
            return (Criteria) this;
        }

        public Criteria andContinueAmountLessThan(String value) {
            addCriterion("continue_amount <", value, "continueAmount");
            return (Criteria) this;
        }

        public Criteria andContinueAmountLessThanOrEqualTo(String value) {
            addCriterion("continue_amount <=", value, "continueAmount");
            return (Criteria) this;
        }

        public Criteria andContinueAmountLike(String value) {
            addCriterion("continue_amount like", value, "continueAmount");
            return (Criteria) this;
        }

        public Criteria andContinueAmountNotLike(String value) {
            addCriterion("continue_amount not like", value, "continueAmount");
            return (Criteria) this;
        }

        public Criteria andContinueAmountIn(List<String> values) {
            addCriterion("continue_amount in", values, "continueAmount");
            return (Criteria) this;
        }

        public Criteria andContinueAmountNotIn(List<String> values) {
            addCriterion("continue_amount not in", values, "continueAmount");
            return (Criteria) this;
        }

        public Criteria andContinueAmountBetween(String value1, String value2) {
            addCriterion("continue_amount between", value1, value2, "continueAmount");
            return (Criteria) this;
        }

        public Criteria andContinueAmountNotBetween(String value1, String value2) {
            addCriterion("continue_amount not between", value1, value2, "continueAmount");
            return (Criteria) this;
        }

        public Criteria andHongbaoAmountIsNull() {
            addCriterion("hongbao_amount is null");
            return (Criteria) this;
        }

        public Criteria andHongbaoAmountIsNotNull() {
            addCriterion("hongbao_amount is not null");
            return (Criteria) this;
        }

        public Criteria andHongbaoAmountEqualTo(String value) {
            addCriterion("hongbao_amount =", value, "hongbaoAmount");
            return (Criteria) this;
        }

        public Criteria andHongbaoAmountNotEqualTo(String value) {
            addCriterion("hongbao_amount <>", value, "hongbaoAmount");
            return (Criteria) this;
        }

        public Criteria andHongbaoAmountGreaterThan(String value) {
            addCriterion("hongbao_amount >", value, "hongbaoAmount");
            return (Criteria) this;
        }

        public Criteria andHongbaoAmountGreaterThanOrEqualTo(String value) {
            addCriterion("hongbao_amount >=", value, "hongbaoAmount");
            return (Criteria) this;
        }

        public Criteria andHongbaoAmountLessThan(String value) {
            addCriterion("hongbao_amount <", value, "hongbaoAmount");
            return (Criteria) this;
        }

        public Criteria andHongbaoAmountLessThanOrEqualTo(String value) {
            addCriterion("hongbao_amount <=", value, "hongbaoAmount");
            return (Criteria) this;
        }

        public Criteria andHongbaoAmountLike(String value) {
            addCriterion("hongbao_amount like", value, "hongbaoAmount");
            return (Criteria) this;
        }

        public Criteria andHongbaoAmountNotLike(String value) {
            addCriterion("hongbao_amount not like", value, "hongbaoAmount");
            return (Criteria) this;
        }

        public Criteria andHongbaoAmountIn(List<String> values) {
            addCriterion("hongbao_amount in", values, "hongbaoAmount");
            return (Criteria) this;
        }

        public Criteria andHongbaoAmountNotIn(List<String> values) {
            addCriterion("hongbao_amount not in", values, "hongbaoAmount");
            return (Criteria) this;
        }

        public Criteria andHongbaoAmountBetween(String value1, String value2) {
            addCriterion("hongbao_amount between", value1, value2, "hongbaoAmount");
            return (Criteria) this;
        }

        public Criteria andHongbaoAmountNotBetween(String value1, String value2) {
            addCriterion("hongbao_amount not between", value1, value2, "hongbaoAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountIsNull() {
            addCriterion("taste_amount is null");
            return (Criteria) this;
        }

        public Criteria andTasteAmountIsNotNull() {
            addCriterion("taste_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTasteAmountEqualTo(String value) {
            addCriterion("taste_amount =", value, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountNotEqualTo(String value) {
            addCriterion("taste_amount <>", value, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountGreaterThan(String value) {
            addCriterion("taste_amount >", value, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountGreaterThanOrEqualTo(String value) {
            addCriterion("taste_amount >=", value, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountLessThan(String value) {
            addCriterion("taste_amount <", value, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountLessThanOrEqualTo(String value) {
            addCriterion("taste_amount <=", value, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountLike(String value) {
            addCriterion("taste_amount like", value, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountNotLike(String value) {
            addCriterion("taste_amount not like", value, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountIn(List<String> values) {
            addCriterion("taste_amount in", values, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountNotIn(List<String> values) {
            addCriterion("taste_amount not in", values, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountBetween(String value1, String value2) {
            addCriterion("taste_amount between", value1, value2, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andTasteAmountNotBetween(String value1, String value2) {
            addCriterion("taste_amount not between", value1, value2, "tasteAmount");
            return (Criteria) this;
        }

        public Criteria andBackStatusIsNull() {
            addCriterion("back_status is null");
            return (Criteria) this;
        }

        public Criteria andBackStatusIsNotNull() {
            addCriterion("back_status is not null");
            return (Criteria) this;
        }

        public Criteria andBackStatusEqualTo(Integer value) {
            addCriterion("back_status =", value, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusNotEqualTo(Integer value) {
            addCriterion("back_status <>", value, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusGreaterThan(Integer value) {
            addCriterion("back_status >", value, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("back_status >=", value, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusLessThan(Integer value) {
            addCriterion("back_status <", value, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusLessThanOrEqualTo(Integer value) {
            addCriterion("back_status <=", value, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusIn(List<Integer> values) {
            addCriterion("back_status in", values, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusNotIn(List<Integer> values) {
            addCriterion("back_status not in", values, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusBetween(Integer value1, Integer value2) {
            addCriterion("back_status between", value1, value2, "backStatus");
            return (Criteria) this;
        }

        public Criteria andBackStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("back_status not between", value1, value2, "backStatus");
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

        public Criteria andRewardIsNull() {
            addCriterion("reward is null");
            return (Criteria) this;
        }

        public Criteria andRewardIsNotNull() {
            addCriterion("reward is not null");
            return (Criteria) this;
        }

        public Criteria andRewardEqualTo(BigDecimal value) {
            addCriterion("reward =", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotEqualTo(BigDecimal value) {
            addCriterion("reward <>", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardGreaterThan(BigDecimal value) {
            addCriterion("reward >", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reward >=", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLessThan(BigDecimal value) {
            addCriterion("reward <", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reward <=", value, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardIn(List<BigDecimal> values) {
            addCriterion("reward in", values, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotIn(List<BigDecimal> values) {
            addCriterion("reward not in", values, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reward between", value1, value2, "reward");
            return (Criteria) this;
        }

        public Criteria andRewardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reward not between", value1, value2, "reward");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNull() {
            addCriterion("client_type is null");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNotNull() {
            addCriterion("client_type is not null");
            return (Criteria) this;
        }

        public Criteria andClientTypeEqualTo(Integer value) {
            addCriterion("client_type =", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotEqualTo(Integer value) {
            addCriterion("client_type <>", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThan(Integer value) {
            addCriterion("client_type >", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("client_type >=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThan(Integer value) {
            addCriterion("client_type <", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThanOrEqualTo(Integer value) {
            addCriterion("client_type <=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeIn(List<Integer> values) {
            addCriterion("client_type in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotIn(List<Integer> values) {
            addCriterion("client_type not in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeBetween(Integer value1, Integer value2) {
            addCriterion("client_type between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("client_type not between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andHrewardIsNull() {
            addCriterion("hreward is null");
            return (Criteria) this;
        }

        public Criteria andHrewardIsNotNull() {
            addCriterion("hreward is not null");
            return (Criteria) this;
        }

        public Criteria andHrewardEqualTo(BigDecimal value) {
            addCriterion("hreward =", value, "hreward");
            return (Criteria) this;
        }

        public Criteria andHrewardNotEqualTo(BigDecimal value) {
            addCriterion("hreward <>", value, "hreward");
            return (Criteria) this;
        }

        public Criteria andHrewardGreaterThan(BigDecimal value) {
            addCriterion("hreward >", value, "hreward");
            return (Criteria) this;
        }

        public Criteria andHrewardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("hreward >=", value, "hreward");
            return (Criteria) this;
        }

        public Criteria andHrewardLessThan(BigDecimal value) {
            addCriterion("hreward <", value, "hreward");
            return (Criteria) this;
        }

        public Criteria andHrewardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("hreward <=", value, "hreward");
            return (Criteria) this;
        }

        public Criteria andHrewardIn(List<BigDecimal> values) {
            addCriterion("hreward in", values, "hreward");
            return (Criteria) this;
        }

        public Criteria andHrewardNotIn(List<BigDecimal> values) {
            addCriterion("hreward not in", values, "hreward");
            return (Criteria) this;
        }

        public Criteria andHrewardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hreward between", value1, value2, "hreward");
            return (Criteria) this;
        }

        public Criteria andHrewardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("hreward not between", value1, value2, "hreward");
            return (Criteria) this;
        }

        public Criteria andBankFreezeIdIsNull() {
            addCriterion("bank_freeze_id is null");
            return (Criteria) this;
        }

        public Criteria andBankFreezeIdIsNotNull() {
            addCriterion("bank_freeze_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankFreezeIdEqualTo(String value) {
            addCriterion("bank_freeze_id =", value, "bankFreezeId");
            return (Criteria) this;
        }

        public Criteria andBankFreezeIdNotEqualTo(String value) {
            addCriterion("bank_freeze_id <>", value, "bankFreezeId");
            return (Criteria) this;
        }

        public Criteria andBankFreezeIdGreaterThan(String value) {
            addCriterion("bank_freeze_id >", value, "bankFreezeId");
            return (Criteria) this;
        }

        public Criteria andBankFreezeIdGreaterThanOrEqualTo(String value) {
            addCriterion("bank_freeze_id >=", value, "bankFreezeId");
            return (Criteria) this;
        }

        public Criteria andBankFreezeIdLessThan(String value) {
            addCriterion("bank_freeze_id <", value, "bankFreezeId");
            return (Criteria) this;
        }

        public Criteria andBankFreezeIdLessThanOrEqualTo(String value) {
            addCriterion("bank_freeze_id <=", value, "bankFreezeId");
            return (Criteria) this;
        }

        public Criteria andBankFreezeIdLike(String value) {
            addCriterion("bank_freeze_id like", value, "bankFreezeId");
            return (Criteria) this;
        }

        public Criteria andBankFreezeIdNotLike(String value) {
            addCriterion("bank_freeze_id not like", value, "bankFreezeId");
            return (Criteria) this;
        }

        public Criteria andBankFreezeIdIn(List<String> values) {
            addCriterion("bank_freeze_id in", values, "bankFreezeId");
            return (Criteria) this;
        }

        public Criteria andBankFreezeIdNotIn(List<String> values) {
            addCriterion("bank_freeze_id not in", values, "bankFreezeId");
            return (Criteria) this;
        }

        public Criteria andBankFreezeIdBetween(String value1, String value2) {
            addCriterion("bank_freeze_id between", value1, value2, "bankFreezeId");
            return (Criteria) this;
        }

        public Criteria andBankFreezeIdNotBetween(String value1, String value2) {
            addCriterion("bank_freeze_id not between", value1, value2, "bankFreezeId");
            return (Criteria) this;
        }

        public Criteria andBankTransIdIsNull() {
            addCriterion("bank_trans_id is null");
            return (Criteria) this;
        }

        public Criteria andBankTransIdIsNotNull() {
            addCriterion("bank_trans_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankTransIdEqualTo(String value) {
            addCriterion("bank_trans_id =", value, "bankTransId");
            return (Criteria) this;
        }

        public Criteria andBankTransIdNotEqualTo(String value) {
            addCriterion("bank_trans_id <>", value, "bankTransId");
            return (Criteria) this;
        }

        public Criteria andBankTransIdGreaterThan(String value) {
            addCriterion("bank_trans_id >", value, "bankTransId");
            return (Criteria) this;
        }

        public Criteria andBankTransIdGreaterThanOrEqualTo(String value) {
            addCriterion("bank_trans_id >=", value, "bankTransId");
            return (Criteria) this;
        }

        public Criteria andBankTransIdLessThan(String value) {
            addCriterion("bank_trans_id <", value, "bankTransId");
            return (Criteria) this;
        }

        public Criteria andBankTransIdLessThanOrEqualTo(String value) {
            addCriterion("bank_trans_id <=", value, "bankTransId");
            return (Criteria) this;
        }

        public Criteria andBankTransIdLike(String value) {
            addCriterion("bank_trans_id like", value, "bankTransId");
            return (Criteria) this;
        }

        public Criteria andBankTransIdNotLike(String value) {
            addCriterion("bank_trans_id not like", value, "bankTransId");
            return (Criteria) this;
        }

        public Criteria andBankTransIdIn(List<String> values) {
            addCriterion("bank_trans_id in", values, "bankTransId");
            return (Criteria) this;
        }

        public Criteria andBankTransIdNotIn(List<String> values) {
            addCriterion("bank_trans_id not in", values, "bankTransId");
            return (Criteria) this;
        }

        public Criteria andBankTransIdBetween(String value1, String value2) {
            addCriterion("bank_trans_id between", value1, value2, "bankTransId");
            return (Criteria) this;
        }

        public Criteria andBankTransIdNotBetween(String value1, String value2) {
            addCriterion("bank_trans_id not between", value1, value2, "bankTransId");
            return (Criteria) this;
        }

        public Criteria andBankFeeAmtIsNull() {
            addCriterion("bank_fee_amt is null");
            return (Criteria) this;
        }

        public Criteria andBankFeeAmtIsNotNull() {
            addCriterion("bank_fee_amt is not null");
            return (Criteria) this;
        }

        public Criteria andBankFeeAmtEqualTo(BigDecimal value) {
            addCriterion("bank_fee_amt =", value, "bankFeeAmt");
            return (Criteria) this;
        }

        public Criteria andBankFeeAmtNotEqualTo(BigDecimal value) {
            addCriterion("bank_fee_amt <>", value, "bankFeeAmt");
            return (Criteria) this;
        }

        public Criteria andBankFeeAmtGreaterThan(BigDecimal value) {
            addCriterion("bank_fee_amt >", value, "bankFeeAmt");
            return (Criteria) this;
        }

        public Criteria andBankFeeAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_fee_amt >=", value, "bankFeeAmt");
            return (Criteria) this;
        }

        public Criteria andBankFeeAmtLessThan(BigDecimal value) {
            addCriterion("bank_fee_amt <", value, "bankFeeAmt");
            return (Criteria) this;
        }

        public Criteria andBankFeeAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bank_fee_amt <=", value, "bankFeeAmt");
            return (Criteria) this;
        }

        public Criteria andBankFeeAmtIn(List<BigDecimal> values) {
            addCriterion("bank_fee_amt in", values, "bankFeeAmt");
            return (Criteria) this;
        }

        public Criteria andBankFeeAmtNotIn(List<BigDecimal> values) {
            addCriterion("bank_fee_amt not in", values, "bankFeeAmt");
            return (Criteria) this;
        }

        public Criteria andBankFeeAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_fee_amt between", value1, value2, "bankFeeAmt");
            return (Criteria) this;
        }

        public Criteria andBankFeeAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bank_fee_amt not between", value1, value2, "bankFeeAmt");
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