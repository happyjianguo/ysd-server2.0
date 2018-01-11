package com.ysd.asset.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BorrowAccountDetailCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowAccountDetailCriteria() {
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

        public Criteria andBorrowTotalIsNull() {
            addCriterion("borrow_total is null");
            return (Criteria) this;
        }

        public Criteria andBorrowTotalIsNotNull() {
            addCriterion("borrow_total is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowTotalEqualTo(BigDecimal value) {
            addCriterion("borrow_total =", value, "borrowTotal");
            return (Criteria) this;
        }

        public Criteria andBorrowTotalNotEqualTo(BigDecimal value) {
            addCriterion("borrow_total <>", value, "borrowTotal");
            return (Criteria) this;
        }

        public Criteria andBorrowTotalGreaterThan(BigDecimal value) {
            addCriterion("borrow_total >", value, "borrowTotal");
            return (Criteria) this;
        }

        public Criteria andBorrowTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_total >=", value, "borrowTotal");
            return (Criteria) this;
        }

        public Criteria andBorrowTotalLessThan(BigDecimal value) {
            addCriterion("borrow_total <", value, "borrowTotal");
            return (Criteria) this;
        }

        public Criteria andBorrowTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_total <=", value, "borrowTotal");
            return (Criteria) this;
        }

        public Criteria andBorrowTotalIn(List<BigDecimal> values) {
            addCriterion("borrow_total in", values, "borrowTotal");
            return (Criteria) this;
        }

        public Criteria andBorrowTotalNotIn(List<BigDecimal> values) {
            addCriterion("borrow_total not in", values, "borrowTotal");
            return (Criteria) this;
        }

        public Criteria andBorrowTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_total between", value1, value2, "borrowTotal");
            return (Criteria) this;
        }

        public Criteria andBorrowTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_total not between", value1, value2, "borrowTotal");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalYesIsNull() {
            addCriterion("borrow_capital_yes is null");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalYesIsNotNull() {
            addCriterion("borrow_capital_yes is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalYesEqualTo(BigDecimal value) {
            addCriterion("borrow_capital_yes =", value, "borrowCapitalYes");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalYesNotEqualTo(BigDecimal value) {
            addCriterion("borrow_capital_yes <>", value, "borrowCapitalYes");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalYesGreaterThan(BigDecimal value) {
            addCriterion("borrow_capital_yes >", value, "borrowCapitalYes");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalYesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_capital_yes >=", value, "borrowCapitalYes");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalYesLessThan(BigDecimal value) {
            addCriterion("borrow_capital_yes <", value, "borrowCapitalYes");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalYesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_capital_yes <=", value, "borrowCapitalYes");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalYesIn(List<BigDecimal> values) {
            addCriterion("borrow_capital_yes in", values, "borrowCapitalYes");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalYesNotIn(List<BigDecimal> values) {
            addCriterion("borrow_capital_yes not in", values, "borrowCapitalYes");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalYesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_capital_yes between", value1, value2, "borrowCapitalYes");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalYesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_capital_yes not between", value1, value2, "borrowCapitalYes");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestYesIsNull() {
            addCriterion("borrow_interest_yes is null");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestYesIsNotNull() {
            addCriterion("borrow_interest_yes is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestYesEqualTo(BigDecimal value) {
            addCriterion("borrow_interest_yes =", value, "borrowInterestYes");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestYesNotEqualTo(BigDecimal value) {
            addCriterion("borrow_interest_yes <>", value, "borrowInterestYes");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestYesGreaterThan(BigDecimal value) {
            addCriterion("borrow_interest_yes >", value, "borrowInterestYes");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestYesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_interest_yes >=", value, "borrowInterestYes");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestYesLessThan(BigDecimal value) {
            addCriterion("borrow_interest_yes <", value, "borrowInterestYes");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestYesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_interest_yes <=", value, "borrowInterestYes");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestYesIn(List<BigDecimal> values) {
            addCriterion("borrow_interest_yes in", values, "borrowInterestYes");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestYesNotIn(List<BigDecimal> values) {
            addCriterion("borrow_interest_yes not in", values, "borrowInterestYes");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestYesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_interest_yes between", value1, value2, "borrowInterestYes");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestYesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_interest_yes not between", value1, value2, "borrowInterestYes");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalNoIsNull() {
            addCriterion("borrow_capital_no is null");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalNoIsNotNull() {
            addCriterion("borrow_capital_no is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalNoEqualTo(BigDecimal value) {
            addCriterion("borrow_capital_no =", value, "borrowCapitalNo");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalNoNotEqualTo(BigDecimal value) {
            addCriterion("borrow_capital_no <>", value, "borrowCapitalNo");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalNoGreaterThan(BigDecimal value) {
            addCriterion("borrow_capital_no >", value, "borrowCapitalNo");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_capital_no >=", value, "borrowCapitalNo");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalNoLessThan(BigDecimal value) {
            addCriterion("borrow_capital_no <", value, "borrowCapitalNo");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_capital_no <=", value, "borrowCapitalNo");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalNoIn(List<BigDecimal> values) {
            addCriterion("borrow_capital_no in", values, "borrowCapitalNo");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalNoNotIn(List<BigDecimal> values) {
            addCriterion("borrow_capital_no not in", values, "borrowCapitalNo");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_capital_no between", value1, value2, "borrowCapitalNo");
            return (Criteria) this;
        }

        public Criteria andBorrowCapitalNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_capital_no not between", value1, value2, "borrowCapitalNo");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestNoIsNull() {
            addCriterion("borrow_interest_no is null");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestNoIsNotNull() {
            addCriterion("borrow_interest_no is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestNoEqualTo(BigDecimal value) {
            addCriterion("borrow_interest_no =", value, "borrowInterestNo");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestNoNotEqualTo(BigDecimal value) {
            addCriterion("borrow_interest_no <>", value, "borrowInterestNo");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestNoGreaterThan(BigDecimal value) {
            addCriterion("borrow_interest_no >", value, "borrowInterestNo");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_interest_no >=", value, "borrowInterestNo");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestNoLessThan(BigDecimal value) {
            addCriterion("borrow_interest_no <", value, "borrowInterestNo");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("borrow_interest_no <=", value, "borrowInterestNo");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestNoIn(List<BigDecimal> values) {
            addCriterion("borrow_interest_no in", values, "borrowInterestNo");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestNoNotIn(List<BigDecimal> values) {
            addCriterion("borrow_interest_no not in", values, "borrowInterestNo");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_interest_no between", value1, value2, "borrowInterestNo");
            return (Criteria) this;
        }

        public Criteria andBorrowInterestNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("borrow_interest_no not between", value1, value2, "borrowInterestNo");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
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