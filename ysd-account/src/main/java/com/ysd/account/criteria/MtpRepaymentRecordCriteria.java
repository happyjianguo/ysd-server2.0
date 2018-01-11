package com.ysd.account.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MtpRepaymentRecordCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MtpRepaymentRecordCriteria() {
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

        public Criteria andBankIsNull() {
            addCriterion("bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBranchIsNull() {
            addCriterion("branch is null");
            return (Criteria) this;
        }

        public Criteria andBranchIsNotNull() {
            addCriterion("branch is not null");
            return (Criteria) this;
        }

        public Criteria andBranchEqualTo(String value) {
            addCriterion("branch =", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotEqualTo(String value) {
            addCriterion("branch <>", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThan(String value) {
            addCriterion("branch >", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThanOrEqualTo(String value) {
            addCriterion("branch >=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThan(String value) {
            addCriterion("branch <", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThanOrEqualTo(String value) {
            addCriterion("branch <=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLike(String value) {
            addCriterion("branch like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotLike(String value) {
            addCriterion("branch not like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchIn(List<String> values) {
            addCriterion("branch in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotIn(List<String> values) {
            addCriterion("branch not in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchBetween(String value1, String value2) {
            addCriterion("branch between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotBetween(String value1, String value2) {
            addCriterion("branch not between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(BigDecimal value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(BigDecimal value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(BigDecimal value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(BigDecimal value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<BigDecimal> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<BigDecimal> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andCreditedIsNull() {
            addCriterion("credited is null");
            return (Criteria) this;
        }

        public Criteria andCreditedIsNotNull() {
            addCriterion("credited is not null");
            return (Criteria) this;
        }

        public Criteria andCreditedEqualTo(BigDecimal value) {
            addCriterion("credited =", value, "credited");
            return (Criteria) this;
        }

        public Criteria andCreditedNotEqualTo(BigDecimal value) {
            addCriterion("credited <>", value, "credited");
            return (Criteria) this;
        }

        public Criteria andCreditedGreaterThan(BigDecimal value) {
            addCriterion("credited >", value, "credited");
            return (Criteria) this;
        }

        public Criteria andCreditedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("credited >=", value, "credited");
            return (Criteria) this;
        }

        public Criteria andCreditedLessThan(BigDecimal value) {
            addCriterion("credited <", value, "credited");
            return (Criteria) this;
        }

        public Criteria andCreditedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("credited <=", value, "credited");
            return (Criteria) this;
        }

        public Criteria andCreditedIn(List<BigDecimal> values) {
            addCriterion("credited in", values, "credited");
            return (Criteria) this;
        }

        public Criteria andCreditedNotIn(List<BigDecimal> values) {
            addCriterion("credited not in", values, "credited");
            return (Criteria) this;
        }

        public Criteria andCreditedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credited between", value1, value2, "credited");
            return (Criteria) this;
        }

        public Criteria andCreditedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credited not between", value1, value2, "credited");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andVerifyUseridIsNull() {
            addCriterion("verify_userid is null");
            return (Criteria) this;
        }

        public Criteria andVerifyUseridIsNotNull() {
            addCriterion("verify_userid is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyUseridEqualTo(Integer value) {
            addCriterion("verify_userid =", value, "verifyUserid");
            return (Criteria) this;
        }

        public Criteria andVerifyUseridNotEqualTo(Integer value) {
            addCriterion("verify_userid <>", value, "verifyUserid");
            return (Criteria) this;
        }

        public Criteria andVerifyUseridGreaterThan(Integer value) {
            addCriterion("verify_userid >", value, "verifyUserid");
            return (Criteria) this;
        }

        public Criteria andVerifyUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("verify_userid >=", value, "verifyUserid");
            return (Criteria) this;
        }

        public Criteria andVerifyUseridLessThan(Integer value) {
            addCriterion("verify_userid <", value, "verifyUserid");
            return (Criteria) this;
        }

        public Criteria andVerifyUseridLessThanOrEqualTo(Integer value) {
            addCriterion("verify_userid <=", value, "verifyUserid");
            return (Criteria) this;
        }

        public Criteria andVerifyUseridIn(List<Integer> values) {
            addCriterion("verify_userid in", values, "verifyUserid");
            return (Criteria) this;
        }

        public Criteria andVerifyUseridNotIn(List<Integer> values) {
            addCriterion("verify_userid not in", values, "verifyUserid");
            return (Criteria) this;
        }

        public Criteria andVerifyUseridBetween(Integer value1, Integer value2) {
            addCriterion("verify_userid between", value1, value2, "verifyUserid");
            return (Criteria) this;
        }

        public Criteria andVerifyUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("verify_userid not between", value1, value2, "verifyUserid");
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

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddipIsNull() {
            addCriterion("addip is null");
            return (Criteria) this;
        }

        public Criteria andAddipIsNotNull() {
            addCriterion("addip is not null");
            return (Criteria) this;
        }

        public Criteria andAddipEqualTo(String value) {
            addCriterion("addip =", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipNotEqualTo(String value) {
            addCriterion("addip <>", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipGreaterThan(String value) {
            addCriterion("addip >", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipGreaterThanOrEqualTo(String value) {
            addCriterion("addip >=", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipLessThan(String value) {
            addCriterion("addip <", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipLessThanOrEqualTo(String value) {
            addCriterion("addip <=", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipLike(String value) {
            addCriterion("addip like", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipNotLike(String value) {
            addCriterion("addip not like", value, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipIn(List<String> values) {
            addCriterion("addip in", values, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipNotIn(List<String> values) {
            addCriterion("addip not in", values, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipBetween(String value1, String value2) {
            addCriterion("addip between", value1, value2, "addip");
            return (Criteria) this;
        }

        public Criteria andAddipNotBetween(String value1, String value2) {
            addCriterion("addip not between", value1, value2, "addip");
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

        public Criteria andChangeNumIsNull() {
            addCriterion("change_num is null");
            return (Criteria) this;
        }

        public Criteria andChangeNumIsNotNull() {
            addCriterion("change_num is not null");
            return (Criteria) this;
        }

        public Criteria andChangeNumEqualTo(BigDecimal value) {
            addCriterion("change_num =", value, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumNotEqualTo(BigDecimal value) {
            addCriterion("change_num <>", value, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumGreaterThan(BigDecimal value) {
            addCriterion("change_num >", value, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("change_num >=", value, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumLessThan(BigDecimal value) {
            addCriterion("change_num <", value, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("change_num <=", value, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumIn(List<BigDecimal> values) {
            addCriterion("change_num in", values, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumNotIn(List<BigDecimal> values) {
            addCriterion("change_num not in", values, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("change_num between", value1, value2, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("change_num not between", value1, value2, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeRemarkIsNull() {
            addCriterion("change_remark is null");
            return (Criteria) this;
        }

        public Criteria andChangeRemarkIsNotNull() {
            addCriterion("change_remark is not null");
            return (Criteria) this;
        }

        public Criteria andChangeRemarkEqualTo(String value) {
            addCriterion("change_remark =", value, "changeRemark");
            return (Criteria) this;
        }

        public Criteria andChangeRemarkNotEqualTo(String value) {
            addCriterion("change_remark <>", value, "changeRemark");
            return (Criteria) this;
        }

        public Criteria andChangeRemarkGreaterThan(String value) {
            addCriterion("change_remark >", value, "changeRemark");
            return (Criteria) this;
        }

        public Criteria andChangeRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("change_remark >=", value, "changeRemark");
            return (Criteria) this;
        }

        public Criteria andChangeRemarkLessThan(String value) {
            addCriterion("change_remark <", value, "changeRemark");
            return (Criteria) this;
        }

        public Criteria andChangeRemarkLessThanOrEqualTo(String value) {
            addCriterion("change_remark <=", value, "changeRemark");
            return (Criteria) this;
        }

        public Criteria andChangeRemarkLike(String value) {
            addCriterion("change_remark like", value, "changeRemark");
            return (Criteria) this;
        }

        public Criteria andChangeRemarkNotLike(String value) {
            addCriterion("change_remark not like", value, "changeRemark");
            return (Criteria) this;
        }

        public Criteria andChangeRemarkIn(List<String> values) {
            addCriterion("change_remark in", values, "changeRemark");
            return (Criteria) this;
        }

        public Criteria andChangeRemarkNotIn(List<String> values) {
            addCriterion("change_remark not in", values, "changeRemark");
            return (Criteria) this;
        }

        public Criteria andChangeRemarkBetween(String value1, String value2) {
            addCriterion("change_remark between", value1, value2, "changeRemark");
            return (Criteria) this;
        }

        public Criteria andChangeRemarkNotBetween(String value1, String value2) {
            addCriterion("change_remark not between", value1, value2, "changeRemark");
            return (Criteria) this;
        }

        public Criteria andAbleCashMoneyIsNull() {
            addCriterion("able_cash_money is null");
            return (Criteria) this;
        }

        public Criteria andAbleCashMoneyIsNotNull() {
            addCriterion("able_cash_money is not null");
            return (Criteria) this;
        }

        public Criteria andAbleCashMoneyEqualTo(BigDecimal value) {
            addCriterion("able_cash_money =", value, "ableCashMoney");
            return (Criteria) this;
        }

        public Criteria andAbleCashMoneyNotEqualTo(BigDecimal value) {
            addCriterion("able_cash_money <>", value, "ableCashMoney");
            return (Criteria) this;
        }

        public Criteria andAbleCashMoneyGreaterThan(BigDecimal value) {
            addCriterion("able_cash_money >", value, "ableCashMoney");
            return (Criteria) this;
        }

        public Criteria andAbleCashMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("able_cash_money >=", value, "ableCashMoney");
            return (Criteria) this;
        }

        public Criteria andAbleCashMoneyLessThan(BigDecimal value) {
            addCriterion("able_cash_money <", value, "ableCashMoney");
            return (Criteria) this;
        }

        public Criteria andAbleCashMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("able_cash_money <=", value, "ableCashMoney");
            return (Criteria) this;
        }

        public Criteria andAbleCashMoneyIn(List<BigDecimal> values) {
            addCriterion("able_cash_money in", values, "ableCashMoney");
            return (Criteria) this;
        }

        public Criteria andAbleCashMoneyNotIn(List<BigDecimal> values) {
            addCriterion("able_cash_money not in", values, "ableCashMoney");
            return (Criteria) this;
        }

        public Criteria andAbleCashMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("able_cash_money between", value1, value2, "ableCashMoney");
            return (Criteria) this;
        }

        public Criteria andAbleCashMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("able_cash_money not between", value1, value2, "ableCashMoney");
            return (Criteria) this;
        }

        public Criteria andFreeCashMoneyIsNull() {
            addCriterion("free_cash_money is null");
            return (Criteria) this;
        }

        public Criteria andFreeCashMoneyIsNotNull() {
            addCriterion("free_cash_money is not null");
            return (Criteria) this;
        }

        public Criteria andFreeCashMoneyEqualTo(BigDecimal value) {
            addCriterion("free_cash_money =", value, "freeCashMoney");
            return (Criteria) this;
        }

        public Criteria andFreeCashMoneyNotEqualTo(BigDecimal value) {
            addCriterion("free_cash_money <>", value, "freeCashMoney");
            return (Criteria) this;
        }

        public Criteria andFreeCashMoneyGreaterThan(BigDecimal value) {
            addCriterion("free_cash_money >", value, "freeCashMoney");
            return (Criteria) this;
        }

        public Criteria andFreeCashMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("free_cash_money >=", value, "freeCashMoney");
            return (Criteria) this;
        }

        public Criteria andFreeCashMoneyLessThan(BigDecimal value) {
            addCriterion("free_cash_money <", value, "freeCashMoney");
            return (Criteria) this;
        }

        public Criteria andFreeCashMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("free_cash_money <=", value, "freeCashMoney");
            return (Criteria) this;
        }

        public Criteria andFreeCashMoneyIn(List<BigDecimal> values) {
            addCriterion("free_cash_money in", values, "freeCashMoney");
            return (Criteria) this;
        }

        public Criteria andFreeCashMoneyNotIn(List<BigDecimal> values) {
            addCriterion("free_cash_money not in", values, "freeCashMoney");
            return (Criteria) this;
        }

        public Criteria andFreeCashMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("free_cash_money between", value1, value2, "freeCashMoney");
            return (Criteria) this;
        }

        public Criteria andFreeCashMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("free_cash_money not between", value1, value2, "freeCashMoney");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNull() {
            addCriterion("trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNotNull() {
            addCriterion("trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualTo(String value) {
            addCriterion("trade_no =", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLike(String value) {
            addCriterion("trade_no like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotLike(String value) {
            addCriterion("trade_no not like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIn(List<String> values) {
            addCriterion("trade_no in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotIn(List<String> values) {
            addCriterion("trade_no not in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoBetween(String value1, String value2) {
            addCriterion("trade_no between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotBetween(String value1, String value2) {
            addCriterion("trade_no not between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andMtpRepaymentStatusIsNull() {
            addCriterion("mtp_repayment_status is null");
            return (Criteria) this;
        }

        public Criteria andMtpRepaymentStatusIsNotNull() {
            addCriterion("mtp_repayment_status is not null");
            return (Criteria) this;
        }

        public Criteria andMtpRepaymentStatusEqualTo(Integer value) {
            addCriterion("mtp_repayment_status =", value, "mtpRepaymentStatus");
            return (Criteria) this;
        }

        public Criteria andMtpRepaymentStatusNotEqualTo(Integer value) {
            addCriterion("mtp_repayment_status <>", value, "mtpRepaymentStatus");
            return (Criteria) this;
        }

        public Criteria andMtpRepaymentStatusGreaterThan(Integer value) {
            addCriterion("mtp_repayment_status >", value, "mtpRepaymentStatus");
            return (Criteria) this;
        }

        public Criteria andMtpRepaymentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("mtp_repayment_status >=", value, "mtpRepaymentStatus");
            return (Criteria) this;
        }

        public Criteria andMtpRepaymentStatusLessThan(Integer value) {
            addCriterion("mtp_repayment_status <", value, "mtpRepaymentStatus");
            return (Criteria) this;
        }

        public Criteria andMtpRepaymentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("mtp_repayment_status <=", value, "mtpRepaymentStatus");
            return (Criteria) this;
        }

        public Criteria andMtpRepaymentStatusIn(List<Integer> values) {
            addCriterion("mtp_repayment_status in", values, "mtpRepaymentStatus");
            return (Criteria) this;
        }

        public Criteria andMtpRepaymentStatusNotIn(List<Integer> values) {
            addCriterion("mtp_repayment_status not in", values, "mtpRepaymentStatus");
            return (Criteria) this;
        }

        public Criteria andMtpRepaymentStatusBetween(Integer value1, Integer value2) {
            addCriterion("mtp_repayment_status between", value1, value2, "mtpRepaymentStatus");
            return (Criteria) this;
        }

        public Criteria andMtpRepaymentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("mtp_repayment_status not between", value1, value2, "mtpRepaymentStatus");
            return (Criteria) this;
        }

        public Criteria andAllinTradeNoIsNull() {
            addCriterion("allin_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andAllinTradeNoIsNotNull() {
            addCriterion("allin_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andAllinTradeNoEqualTo(String value) {
            addCriterion("allin_trade_no =", value, "allinTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinTradeNoNotEqualTo(String value) {
            addCriterion("allin_trade_no <>", value, "allinTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinTradeNoGreaterThan(String value) {
            addCriterion("allin_trade_no >", value, "allinTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("allin_trade_no >=", value, "allinTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinTradeNoLessThan(String value) {
            addCriterion("allin_trade_no <", value, "allinTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinTradeNoLessThanOrEqualTo(String value) {
            addCriterion("allin_trade_no <=", value, "allinTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinTradeNoLike(String value) {
            addCriterion("allin_trade_no like", value, "allinTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinTradeNoNotLike(String value) {
            addCriterion("allin_trade_no not like", value, "allinTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinTradeNoIn(List<String> values) {
            addCriterion("allin_trade_no in", values, "allinTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinTradeNoNotIn(List<String> values) {
            addCriterion("allin_trade_no not in", values, "allinTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinTradeNoBetween(String value1, String value2) {
            addCriterion("allin_trade_no between", value1, value2, "allinTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinTradeNoNotBetween(String value1, String value2) {
            addCriterion("allin_trade_no not between", value1, value2, "allinTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinSubmitTradeNoIsNull() {
            addCriterion("allin_submit_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andAllinSubmitTradeNoIsNotNull() {
            addCriterion("allin_submit_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andAllinSubmitTradeNoEqualTo(String value) {
            addCriterion("allin_submit_trade_no =", value, "allinSubmitTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinSubmitTradeNoNotEqualTo(String value) {
            addCriterion("allin_submit_trade_no <>", value, "allinSubmitTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinSubmitTradeNoGreaterThan(String value) {
            addCriterion("allin_submit_trade_no >", value, "allinSubmitTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinSubmitTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("allin_submit_trade_no >=", value, "allinSubmitTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinSubmitTradeNoLessThan(String value) {
            addCriterion("allin_submit_trade_no <", value, "allinSubmitTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinSubmitTradeNoLessThanOrEqualTo(String value) {
            addCriterion("allin_submit_trade_no <=", value, "allinSubmitTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinSubmitTradeNoLike(String value) {
            addCriterion("allin_submit_trade_no like", value, "allinSubmitTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinSubmitTradeNoNotLike(String value) {
            addCriterion("allin_submit_trade_no not like", value, "allinSubmitTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinSubmitTradeNoIn(List<String> values) {
            addCriterion("allin_submit_trade_no in", values, "allinSubmitTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinSubmitTradeNoNotIn(List<String> values) {
            addCriterion("allin_submit_trade_no not in", values, "allinSubmitTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinSubmitTradeNoBetween(String value1, String value2) {
            addCriterion("allin_submit_trade_no between", value1, value2, "allinSubmitTradeNo");
            return (Criteria) this;
        }

        public Criteria andAllinSubmitTradeNoNotBetween(String value1, String value2) {
            addCriterion("allin_submit_trade_no not between", value1, value2, "allinSubmitTradeNo");
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