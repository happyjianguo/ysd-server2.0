package com.ysd.account.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAccountCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAccountCriteria() {
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

        public Criteria andAbleMoneyIsNull() {
            addCriterion("able_money is null");
            return (Criteria) this;
        }

        public Criteria andAbleMoneyIsNotNull() {
            addCriterion("able_money is not null");
            return (Criteria) this;
        }

        public Criteria andAbleMoneyEqualTo(BigDecimal value) {
            addCriterion("able_money =", value, "ableMoney");
            return (Criteria) this;
        }

        public Criteria andAbleMoneyNotEqualTo(BigDecimal value) {
            addCriterion("able_money <>", value, "ableMoney");
            return (Criteria) this;
        }

        public Criteria andAbleMoneyGreaterThan(BigDecimal value) {
            addCriterion("able_money >", value, "ableMoney");
            return (Criteria) this;
        }

        public Criteria andAbleMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("able_money >=", value, "ableMoney");
            return (Criteria) this;
        }

        public Criteria andAbleMoneyLessThan(BigDecimal value) {
            addCriterion("able_money <", value, "ableMoney");
            return (Criteria) this;
        }

        public Criteria andAbleMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("able_money <=", value, "ableMoney");
            return (Criteria) this;
        }

        public Criteria andAbleMoneyIn(List<BigDecimal> values) {
            addCriterion("able_money in", values, "ableMoney");
            return (Criteria) this;
        }

        public Criteria andAbleMoneyNotIn(List<BigDecimal> values) {
            addCriterion("able_money not in", values, "ableMoney");
            return (Criteria) this;
        }

        public Criteria andAbleMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("able_money between", value1, value2, "ableMoney");
            return (Criteria) this;
        }

        public Criteria andAbleMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("able_money not between", value1, value2, "ableMoney");
            return (Criteria) this;
        }

        public Criteria andUnableMoneyIsNull() {
            addCriterion("unable_money is null");
            return (Criteria) this;
        }

        public Criteria andUnableMoneyIsNotNull() {
            addCriterion("unable_money is not null");
            return (Criteria) this;
        }

        public Criteria andUnableMoneyEqualTo(BigDecimal value) {
            addCriterion("unable_money =", value, "unableMoney");
            return (Criteria) this;
        }

        public Criteria andUnableMoneyNotEqualTo(BigDecimal value) {
            addCriterion("unable_money <>", value, "unableMoney");
            return (Criteria) this;
        }

        public Criteria andUnableMoneyGreaterThan(BigDecimal value) {
            addCriterion("unable_money >", value, "unableMoney");
            return (Criteria) this;
        }

        public Criteria andUnableMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unable_money >=", value, "unableMoney");
            return (Criteria) this;
        }

        public Criteria andUnableMoneyLessThan(BigDecimal value) {
            addCriterion("unable_money <", value, "unableMoney");
            return (Criteria) this;
        }

        public Criteria andUnableMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unable_money <=", value, "unableMoney");
            return (Criteria) this;
        }

        public Criteria andUnableMoneyIn(List<BigDecimal> values) {
            addCriterion("unable_money in", values, "unableMoney");
            return (Criteria) this;
        }

        public Criteria andUnableMoneyNotIn(List<BigDecimal> values) {
            addCriterion("unable_money not in", values, "unableMoney");
            return (Criteria) this;
        }

        public Criteria andUnableMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unable_money between", value1, value2, "unableMoney");
            return (Criteria) this;
        }

        public Criteria andUnableMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unable_money not between", value1, value2, "unableMoney");
            return (Criteria) this;
        }

        public Criteria andCollectionIsNull() {
            addCriterion("collection is null");
            return (Criteria) this;
        }

        public Criteria andCollectionIsNotNull() {
            addCriterion("collection is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionEqualTo(BigDecimal value) {
            addCriterion("collection =", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionNotEqualTo(BigDecimal value) {
            addCriterion("collection <>", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionGreaterThan(BigDecimal value) {
            addCriterion("collection >", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("collection >=", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionLessThan(BigDecimal value) {
            addCriterion("collection <", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("collection <=", value, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionIn(List<BigDecimal> values) {
            addCriterion("collection in", values, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionNotIn(List<BigDecimal> values) {
            addCriterion("collection not in", values, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("collection between", value1, value2, "collection");
            return (Criteria) this;
        }

        public Criteria andCollectionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("collection not between", value1, value2, "collection");
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

        public Criteria andInvestorCollectionCapitalIsNull() {
            addCriterion("investor_collection_capital is null");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionCapitalIsNotNull() {
            addCriterion("investor_collection_capital is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionCapitalEqualTo(BigDecimal value) {
            addCriterion("investor_collection_capital =", value, "investorCollectionCapital");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionCapitalNotEqualTo(BigDecimal value) {
            addCriterion("investor_collection_capital <>", value, "investorCollectionCapital");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionCapitalGreaterThan(BigDecimal value) {
            addCriterion("investor_collection_capital >", value, "investorCollectionCapital");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("investor_collection_capital >=", value, "investorCollectionCapital");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionCapitalLessThan(BigDecimal value) {
            addCriterion("investor_collection_capital <", value, "investorCollectionCapital");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("investor_collection_capital <=", value, "investorCollectionCapital");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionCapitalIn(List<BigDecimal> values) {
            addCriterion("investor_collection_capital in", values, "investorCollectionCapital");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionCapitalNotIn(List<BigDecimal> values) {
            addCriterion("investor_collection_capital not in", values, "investorCollectionCapital");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("investor_collection_capital between", value1, value2, "investorCollectionCapital");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("investor_collection_capital not between", value1, value2, "investorCollectionCapital");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionInterestIsNull() {
            addCriterion("investor_collection_interest is null");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionInterestIsNotNull() {
            addCriterion("investor_collection_interest is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionInterestEqualTo(BigDecimal value) {
            addCriterion("investor_collection_interest =", value, "investorCollectionInterest");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionInterestNotEqualTo(BigDecimal value) {
            addCriterion("investor_collection_interest <>", value, "investorCollectionInterest");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionInterestGreaterThan(BigDecimal value) {
            addCriterion("investor_collection_interest >", value, "investorCollectionInterest");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("investor_collection_interest >=", value, "investorCollectionInterest");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionInterestLessThan(BigDecimal value) {
            addCriterion("investor_collection_interest <", value, "investorCollectionInterest");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("investor_collection_interest <=", value, "investorCollectionInterest");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionInterestIn(List<BigDecimal> values) {
            addCriterion("investor_collection_interest in", values, "investorCollectionInterest");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionInterestNotIn(List<BigDecimal> values) {
            addCriterion("investor_collection_interest not in", values, "investorCollectionInterest");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("investor_collection_interest between", value1, value2, "investorCollectionInterest");
            return (Criteria) this;
        }

        public Criteria andInvestorCollectionInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("investor_collection_interest not between", value1, value2, "investorCollectionInterest");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionCapitalIsNull() {
            addCriterion("borrower_collection_capital is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionCapitalIsNotNull() {
            addCriterion("borrower_collection_capital is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionCapitalEqualTo(BigDecimal value) {
            addCriterion("borrower_collection_capital =", value, "borrowerCollectionCapital");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionCapitalNotEqualTo(BigDecimal value) {
            addCriterion("borrower_collection_capital <>", value, "borrowerCollectionCapital");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionCapitalGreaterThan(BigDecimal value) {
            addCriterion("borrower_collection_capital >", value, "borrowerCollectionCapital");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("borrower_collection_capital >=", value, "borrowerCollectionCapital");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionCapitalLessThan(BigDecimal value) {
            addCriterion("borrower_collection_capital <", value, "borrowerCollectionCapital");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("borrower_collection_capital <=", value, "borrowerCollectionCapital");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionCapitalIn(List<BigDecimal> values) {
            addCriterion("borrower_collection_capital in", values, "borrowerCollectionCapital");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionCapitalNotIn(List<BigDecimal> values) {
            addCriterion("borrower_collection_capital not in", values, "borrowerCollectionCapital");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrower_collection_capital between", value1, value2, "borrowerCollectionCapital");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrower_collection_capital not between", value1, value2, "borrowerCollectionCapital");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionInterestIsNull() {
            addCriterion("borrower_collection_interest is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionInterestIsNotNull() {
            addCriterion("borrower_collection_interest is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionInterestEqualTo(BigDecimal value) {
            addCriterion("borrower_collection_interest =", value, "borrowerCollectionInterest");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionInterestNotEqualTo(BigDecimal value) {
            addCriterion("borrower_collection_interest <>", value, "borrowerCollectionInterest");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionInterestGreaterThan(BigDecimal value) {
            addCriterion("borrower_collection_interest >", value, "borrowerCollectionInterest");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("borrower_collection_interest >=", value, "borrowerCollectionInterest");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionInterestLessThan(BigDecimal value) {
            addCriterion("borrower_collection_interest <", value, "borrowerCollectionInterest");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("borrower_collection_interest <=", value, "borrowerCollectionInterest");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionInterestIn(List<BigDecimal> values) {
            addCriterion("borrower_collection_interest in", values, "borrowerCollectionInterest");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionInterestNotIn(List<BigDecimal> values) {
            addCriterion("borrower_collection_interest not in", values, "borrowerCollectionInterest");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrower_collection_interest between", value1, value2, "borrowerCollectionInterest");
            return (Criteria) this;
        }

        public Criteria andBorrowerCollectionInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrower_collection_interest not between", value1, value2, "borrowerCollectionInterest");
            return (Criteria) this;
        }

        public Criteria andContinueTotalIsNull() {
            addCriterion("continue_total is null");
            return (Criteria) this;
        }

        public Criteria andContinueTotalIsNotNull() {
            addCriterion("continue_total is not null");
            return (Criteria) this;
        }

        public Criteria andContinueTotalEqualTo(BigDecimal value) {
            addCriterion("continue_total =", value, "continueTotal");
            return (Criteria) this;
        }

        public Criteria andContinueTotalNotEqualTo(BigDecimal value) {
            addCriterion("continue_total <>", value, "continueTotal");
            return (Criteria) this;
        }

        public Criteria andContinueTotalGreaterThan(BigDecimal value) {
            addCriterion("continue_total >", value, "continueTotal");
            return (Criteria) this;
        }

        public Criteria andContinueTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("continue_total >=", value, "continueTotal");
            return (Criteria) this;
        }

        public Criteria andContinueTotalLessThan(BigDecimal value) {
            addCriterion("continue_total <", value, "continueTotal");
            return (Criteria) this;
        }

        public Criteria andContinueTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("continue_total <=", value, "continueTotal");
            return (Criteria) this;
        }

        public Criteria andContinueTotalIn(List<BigDecimal> values) {
            addCriterion("continue_total in", values, "continueTotal");
            return (Criteria) this;
        }

        public Criteria andContinueTotalNotIn(List<BigDecimal> values) {
            addCriterion("continue_total not in", values, "continueTotal");
            return (Criteria) this;
        }

        public Criteria andContinueTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continue_total between", value1, value2, "continueTotal");
            return (Criteria) this;
        }

        public Criteria andContinueTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continue_total not between", value1, value2, "continueTotal");
            return (Criteria) this;
        }

        public Criteria andUserPointsIsNull() {
            addCriterion("user_points is null");
            return (Criteria) this;
        }

        public Criteria andUserPointsIsNotNull() {
            addCriterion("user_points is not null");
            return (Criteria) this;
        }

        public Criteria andUserPointsEqualTo(Integer value) {
            addCriterion("user_points =", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsNotEqualTo(Integer value) {
            addCriterion("user_points <>", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsGreaterThan(Integer value) {
            addCriterion("user_points >", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_points >=", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsLessThan(Integer value) {
            addCriterion("user_points <", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsLessThanOrEqualTo(Integer value) {
            addCriterion("user_points <=", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsIn(List<Integer> values) {
            addCriterion("user_points in", values, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsNotIn(List<Integer> values) {
            addCriterion("user_points not in", values, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsBetween(Integer value1, Integer value2) {
            addCriterion("user_points between", value1, value2, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("user_points not between", value1, value2, "userPoints");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyIsNull() {
            addCriterion("award_money is null");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyIsNotNull() {
            addCriterion("award_money is not null");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyEqualTo(BigDecimal value) {
            addCriterion("award_money =", value, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyNotEqualTo(BigDecimal value) {
            addCriterion("award_money <>", value, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyGreaterThan(BigDecimal value) {
            addCriterion("award_money >", value, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("award_money >=", value, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyLessThan(BigDecimal value) {
            addCriterion("award_money <", value, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("award_money <=", value, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyIn(List<BigDecimal> values) {
            addCriterion("award_money in", values, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyNotIn(List<BigDecimal> values) {
            addCriterion("award_money not in", values, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("award_money between", value1, value2, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("award_money not between", value1, value2, "awardMoney");
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