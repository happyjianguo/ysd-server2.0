package com.ysd.account.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAccountDetailCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAccountDetailCriteria() {
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

        public Criteria andUseMoneyIsNull() {
            addCriterion("use_money is null");
            return (Criteria) this;
        }

        public Criteria andUseMoneyIsNotNull() {
            addCriterion("use_money is not null");
            return (Criteria) this;
        }

        public Criteria andUseMoneyEqualTo(BigDecimal value) {
            addCriterion("use_money =", value, "useMoney");
            return (Criteria) this;
        }

        public Criteria andUseMoneyNotEqualTo(BigDecimal value) {
            addCriterion("use_money <>", value, "useMoney");
            return (Criteria) this;
        }

        public Criteria andUseMoneyGreaterThan(BigDecimal value) {
            addCriterion("use_money >", value, "useMoney");
            return (Criteria) this;
        }

        public Criteria andUseMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("use_money >=", value, "useMoney");
            return (Criteria) this;
        }

        public Criteria andUseMoneyLessThan(BigDecimal value) {
            addCriterion("use_money <", value, "useMoney");
            return (Criteria) this;
        }

        public Criteria andUseMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("use_money <=", value, "useMoney");
            return (Criteria) this;
        }

        public Criteria andUseMoneyIn(List<BigDecimal> values) {
            addCriterion("use_money in", values, "useMoney");
            return (Criteria) this;
        }

        public Criteria andUseMoneyNotIn(List<BigDecimal> values) {
            addCriterion("use_money not in", values, "useMoney");
            return (Criteria) this;
        }

        public Criteria andUseMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_money between", value1, value2, "useMoney");
            return (Criteria) this;
        }

        public Criteria andUseMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_money not between", value1, value2, "useMoney");
            return (Criteria) this;
        }

        public Criteria andNoUseMoneyIsNull() {
            addCriterion("no_use_money is null");
            return (Criteria) this;
        }

        public Criteria andNoUseMoneyIsNotNull() {
            addCriterion("no_use_money is not null");
            return (Criteria) this;
        }

        public Criteria andNoUseMoneyEqualTo(BigDecimal value) {
            addCriterion("no_use_money =", value, "noUseMoney");
            return (Criteria) this;
        }

        public Criteria andNoUseMoneyNotEqualTo(BigDecimal value) {
            addCriterion("no_use_money <>", value, "noUseMoney");
            return (Criteria) this;
        }

        public Criteria andNoUseMoneyGreaterThan(BigDecimal value) {
            addCriterion("no_use_money >", value, "noUseMoney");
            return (Criteria) this;
        }

        public Criteria andNoUseMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("no_use_money >=", value, "noUseMoney");
            return (Criteria) this;
        }

        public Criteria andNoUseMoneyLessThan(BigDecimal value) {
            addCriterion("no_use_money <", value, "noUseMoney");
            return (Criteria) this;
        }

        public Criteria andNoUseMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("no_use_money <=", value, "noUseMoney");
            return (Criteria) this;
        }

        public Criteria andNoUseMoneyIn(List<BigDecimal> values) {
            addCriterion("no_use_money in", values, "noUseMoney");
            return (Criteria) this;
        }

        public Criteria andNoUseMoneyNotIn(List<BigDecimal> values) {
            addCriterion("no_use_money not in", values, "noUseMoney");
            return (Criteria) this;
        }

        public Criteria andNoUseMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("no_use_money between", value1, value2, "noUseMoney");
            return (Criteria) this;
        }

        public Criteria andNoUseMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("no_use_money not between", value1, value2, "noUseMoney");
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

        public Criteria andOperatorerIsNull() {
            addCriterion("operatorer is null");
            return (Criteria) this;
        }

        public Criteria andOperatorerIsNotNull() {
            addCriterion("operatorer is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorerEqualTo(String value) {
            addCriterion("operatorer =", value, "operatorer");
            return (Criteria) this;
        }

        public Criteria andOperatorerNotEqualTo(String value) {
            addCriterion("operatorer <>", value, "operatorer");
            return (Criteria) this;
        }

        public Criteria andOperatorerGreaterThan(String value) {
            addCriterion("operatorer >", value, "operatorer");
            return (Criteria) this;
        }

        public Criteria andOperatorerGreaterThanOrEqualTo(String value) {
            addCriterion("operatorer >=", value, "operatorer");
            return (Criteria) this;
        }

        public Criteria andOperatorerLessThan(String value) {
            addCriterion("operatorer <", value, "operatorer");
            return (Criteria) this;
        }

        public Criteria andOperatorerLessThanOrEqualTo(String value) {
            addCriterion("operatorer <=", value, "operatorer");
            return (Criteria) this;
        }

        public Criteria andOperatorerLike(String value) {
            addCriterion("operatorer like", value, "operatorer");
            return (Criteria) this;
        }

        public Criteria andOperatorerNotLike(String value) {
            addCriterion("operatorer not like", value, "operatorer");
            return (Criteria) this;
        }

        public Criteria andOperatorerIn(List<String> values) {
            addCriterion("operatorer in", values, "operatorer");
            return (Criteria) this;
        }

        public Criteria andOperatorerNotIn(List<String> values) {
            addCriterion("operatorer not in", values, "operatorer");
            return (Criteria) this;
        }

        public Criteria andOperatorerBetween(String value1, String value2) {
            addCriterion("operatorer between", value1, value2, "operatorer");
            return (Criteria) this;
        }

        public Criteria andOperatorerNotBetween(String value1, String value2) {
            addCriterion("operatorer not between", value1, value2, "operatorer");
            return (Criteria) this;
        }

        public Criteria andToUserIsNull() {
            addCriterion("to_user is null");
            return (Criteria) this;
        }

        public Criteria andToUserIsNotNull() {
            addCriterion("to_user is not null");
            return (Criteria) this;
        }

        public Criteria andToUserEqualTo(Integer value) {
            addCriterion("to_user =", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserNotEqualTo(Integer value) {
            addCriterion("to_user <>", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserGreaterThan(Integer value) {
            addCriterion("to_user >", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_user >=", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserLessThan(Integer value) {
            addCriterion("to_user <", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserLessThanOrEqualTo(Integer value) {
            addCriterion("to_user <=", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserIn(List<Integer> values) {
            addCriterion("to_user in", values, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserNotIn(List<Integer> values) {
            addCriterion("to_user not in", values, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserBetween(Integer value1, Integer value2) {
            addCriterion("to_user between", value1, value2, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserNotBetween(Integer value1, Integer value2) {
            addCriterion("to_user not between", value1, value2, "toUser");
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

        public Criteria andIsLookIsNull() {
            addCriterion("is_look is null");
            return (Criteria) this;
        }

        public Criteria andIsLookIsNotNull() {
            addCriterion("is_look is not null");
            return (Criteria) this;
        }

        public Criteria andIsLookEqualTo(Integer value) {
            addCriterion("is_look =", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookNotEqualTo(Integer value) {
            addCriterion("is_look <>", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookGreaterThan(Integer value) {
            addCriterion("is_look >", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_look >=", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookLessThan(Integer value) {
            addCriterion("is_look <", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookLessThanOrEqualTo(Integer value) {
            addCriterion("is_look <=", value, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookIn(List<Integer> values) {
            addCriterion("is_look in", values, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookNotIn(List<Integer> values) {
            addCriterion("is_look not in", values, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookBetween(Integer value1, Integer value2) {
            addCriterion("is_look between", value1, value2, "isLook");
            return (Criteria) this;
        }

        public Criteria andIsLookNotBetween(Integer value1, Integer value2) {
            addCriterion("is_look not between", value1, value2, "isLook");
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