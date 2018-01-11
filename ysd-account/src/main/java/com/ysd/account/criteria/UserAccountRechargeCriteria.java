package com.ysd.account.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAccountRechargeCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAccountRechargeCriteria() {
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

        public Criteria andPortDataIsNull() {
            addCriterion("port_data is null");
            return (Criteria) this;
        }

        public Criteria andPortDataIsNotNull() {
            addCriterion("port_data is not null");
            return (Criteria) this;
        }

        public Criteria andPortDataEqualTo(String value) {
            addCriterion("port_data =", value, "portData");
            return (Criteria) this;
        }

        public Criteria andPortDataNotEqualTo(String value) {
            addCriterion("port_data <>", value, "portData");
            return (Criteria) this;
        }

        public Criteria andPortDataGreaterThan(String value) {
            addCriterion("port_data >", value, "portData");
            return (Criteria) this;
        }

        public Criteria andPortDataGreaterThanOrEqualTo(String value) {
            addCriterion("port_data >=", value, "portData");
            return (Criteria) this;
        }

        public Criteria andPortDataLessThan(String value) {
            addCriterion("port_data <", value, "portData");
            return (Criteria) this;
        }

        public Criteria andPortDataLessThanOrEqualTo(String value) {
            addCriterion("port_data <=", value, "portData");
            return (Criteria) this;
        }

        public Criteria andPortDataLike(String value) {
            addCriterion("port_data like", value, "portData");
            return (Criteria) this;
        }

        public Criteria andPortDataNotLike(String value) {
            addCriterion("port_data not like", value, "portData");
            return (Criteria) this;
        }

        public Criteria andPortDataIn(List<String> values) {
            addCriterion("port_data in", values, "portData");
            return (Criteria) this;
        }

        public Criteria andPortDataNotIn(List<String> values) {
            addCriterion("port_data not in", values, "portData");
            return (Criteria) this;
        }

        public Criteria andPortDataBetween(String value1, String value2) {
            addCriterion("port_data between", value1, value2, "portData");
            return (Criteria) this;
        }

        public Criteria andPortDataNotBetween(String value1, String value2) {
            addCriterion("port_data not between", value1, value2, "portData");
            return (Criteria) this;
        }

        public Criteria andCompareStatusIsNull() {
            addCriterion("compare_status is null");
            return (Criteria) this;
        }

        public Criteria andCompareStatusIsNotNull() {
            addCriterion("compare_status is not null");
            return (Criteria) this;
        }

        public Criteria andCompareStatusEqualTo(Integer value) {
            addCriterion("compare_status =", value, "compareStatus");
            return (Criteria) this;
        }

        public Criteria andCompareStatusNotEqualTo(Integer value) {
            addCriterion("compare_status <>", value, "compareStatus");
            return (Criteria) this;
        }

        public Criteria andCompareStatusGreaterThan(Integer value) {
            addCriterion("compare_status >", value, "compareStatus");
            return (Criteria) this;
        }

        public Criteria andCompareStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("compare_status >=", value, "compareStatus");
            return (Criteria) this;
        }

        public Criteria andCompareStatusLessThan(Integer value) {
            addCriterion("compare_status <", value, "compareStatus");
            return (Criteria) this;
        }

        public Criteria andCompareStatusLessThanOrEqualTo(Integer value) {
            addCriterion("compare_status <=", value, "compareStatus");
            return (Criteria) this;
        }

        public Criteria andCompareStatusIn(List<Integer> values) {
            addCriterion("compare_status in", values, "compareStatus");
            return (Criteria) this;
        }

        public Criteria andCompareStatusNotIn(List<Integer> values) {
            addCriterion("compare_status not in", values, "compareStatus");
            return (Criteria) this;
        }

        public Criteria andCompareStatusBetween(Integer value1, Integer value2) {
            addCriterion("compare_status between", value1, value2, "compareStatus");
            return (Criteria) this;
        }

        public Criteria andCompareStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("compare_status not between", value1, value2, "compareStatus");
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

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andRechargeInterfaceIdIsNull() {
            addCriterion("recharge_interface_id is null");
            return (Criteria) this;
        }

        public Criteria andRechargeInterfaceIdIsNotNull() {
            addCriterion("recharge_interface_id is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeInterfaceIdEqualTo(Integer value) {
            addCriterion("recharge_interface_id =", value, "rechargeInterfaceId");
            return (Criteria) this;
        }

        public Criteria andRechargeInterfaceIdNotEqualTo(Integer value) {
            addCriterion("recharge_interface_id <>", value, "rechargeInterfaceId");
            return (Criteria) this;
        }

        public Criteria andRechargeInterfaceIdGreaterThan(Integer value) {
            addCriterion("recharge_interface_id >", value, "rechargeInterfaceId");
            return (Criteria) this;
        }

        public Criteria andRechargeInterfaceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recharge_interface_id >=", value, "rechargeInterfaceId");
            return (Criteria) this;
        }

        public Criteria andRechargeInterfaceIdLessThan(Integer value) {
            addCriterion("recharge_interface_id <", value, "rechargeInterfaceId");
            return (Criteria) this;
        }

        public Criteria andRechargeInterfaceIdLessThanOrEqualTo(Integer value) {
            addCriterion("recharge_interface_id <=", value, "rechargeInterfaceId");
            return (Criteria) this;
        }

        public Criteria andRechargeInterfaceIdIn(List<Integer> values) {
            addCriterion("recharge_interface_id in", values, "rechargeInterfaceId");
            return (Criteria) this;
        }

        public Criteria andRechargeInterfaceIdNotIn(List<Integer> values) {
            addCriterion("recharge_interface_id not in", values, "rechargeInterfaceId");
            return (Criteria) this;
        }

        public Criteria andRechargeInterfaceIdBetween(Integer value1, Integer value2) {
            addCriterion("recharge_interface_id between", value1, value2, "rechargeInterfaceId");
            return (Criteria) this;
        }

        public Criteria andRechargeInterfaceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recharge_interface_id not between", value1, value2, "rechargeInterfaceId");
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

        public Criteria andAdminOperatorIdIsNull() {
            addCriterion("admin_operator_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminOperatorIdIsNotNull() {
            addCriterion("admin_operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminOperatorIdEqualTo(Integer value) {
            addCriterion("admin_operator_id =", value, "adminOperatorId");
            return (Criteria) this;
        }

        public Criteria andAdminOperatorIdNotEqualTo(Integer value) {
            addCriterion("admin_operator_id <>", value, "adminOperatorId");
            return (Criteria) this;
        }

        public Criteria andAdminOperatorIdGreaterThan(Integer value) {
            addCriterion("admin_operator_id >", value, "adminOperatorId");
            return (Criteria) this;
        }

        public Criteria andAdminOperatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_operator_id >=", value, "adminOperatorId");
            return (Criteria) this;
        }

        public Criteria andAdminOperatorIdLessThan(Integer value) {
            addCriterion("admin_operator_id <", value, "adminOperatorId");
            return (Criteria) this;
        }

        public Criteria andAdminOperatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_operator_id <=", value, "adminOperatorId");
            return (Criteria) this;
        }

        public Criteria andAdminOperatorIdIn(List<Integer> values) {
            addCriterion("admin_operator_id in", values, "adminOperatorId");
            return (Criteria) this;
        }

        public Criteria andAdminOperatorIdNotIn(List<Integer> values) {
            addCriterion("admin_operator_id not in", values, "adminOperatorId");
            return (Criteria) this;
        }

        public Criteria andAdminOperatorIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_operator_id between", value1, value2, "adminOperatorId");
            return (Criteria) this;
        }

        public Criteria andAdminOperatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_operator_id not between", value1, value2, "adminOperatorId");
            return (Criteria) this;
        }

        public Criteria andAdminVerifyIdIsNull() {
            addCriterion("admin_verify_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminVerifyIdIsNotNull() {
            addCriterion("admin_verify_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminVerifyIdEqualTo(Integer value) {
            addCriterion("admin_verify_id =", value, "adminVerifyId");
            return (Criteria) this;
        }

        public Criteria andAdminVerifyIdNotEqualTo(Integer value) {
            addCriterion("admin_verify_id <>", value, "adminVerifyId");
            return (Criteria) this;
        }

        public Criteria andAdminVerifyIdGreaterThan(Integer value) {
            addCriterion("admin_verify_id >", value, "adminVerifyId");
            return (Criteria) this;
        }

        public Criteria andAdminVerifyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_verify_id >=", value, "adminVerifyId");
            return (Criteria) this;
        }

        public Criteria andAdminVerifyIdLessThan(Integer value) {
            addCriterion("admin_verify_id <", value, "adminVerifyId");
            return (Criteria) this;
        }

        public Criteria andAdminVerifyIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_verify_id <=", value, "adminVerifyId");
            return (Criteria) this;
        }

        public Criteria andAdminVerifyIdIn(List<Integer> values) {
            addCriterion("admin_verify_id in", values, "adminVerifyId");
            return (Criteria) this;
        }

        public Criteria andAdminVerifyIdNotIn(List<Integer> values) {
            addCriterion("admin_verify_id not in", values, "adminVerifyId");
            return (Criteria) this;
        }

        public Criteria andAdminVerifyIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_verify_id between", value1, value2, "adminVerifyId");
            return (Criteria) this;
        }

        public Criteria andAdminVerifyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_verify_id not between", value1, value2, "adminVerifyId");
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

        public Criteria andIpUserIsNull() {
            addCriterion("ip_user is null");
            return (Criteria) this;
        }

        public Criteria andIpUserIsNotNull() {
            addCriterion("ip_user is not null");
            return (Criteria) this;
        }

        public Criteria andIpUserEqualTo(String value) {
            addCriterion("ip_user =", value, "ipUser");
            return (Criteria) this;
        }

        public Criteria andIpUserNotEqualTo(String value) {
            addCriterion("ip_user <>", value, "ipUser");
            return (Criteria) this;
        }

        public Criteria andIpUserGreaterThan(String value) {
            addCriterion("ip_user >", value, "ipUser");
            return (Criteria) this;
        }

        public Criteria andIpUserGreaterThanOrEqualTo(String value) {
            addCriterion("ip_user >=", value, "ipUser");
            return (Criteria) this;
        }

        public Criteria andIpUserLessThan(String value) {
            addCriterion("ip_user <", value, "ipUser");
            return (Criteria) this;
        }

        public Criteria andIpUserLessThanOrEqualTo(String value) {
            addCriterion("ip_user <=", value, "ipUser");
            return (Criteria) this;
        }

        public Criteria andIpUserLike(String value) {
            addCriterion("ip_user like", value, "ipUser");
            return (Criteria) this;
        }

        public Criteria andIpUserNotLike(String value) {
            addCriterion("ip_user not like", value, "ipUser");
            return (Criteria) this;
        }

        public Criteria andIpUserIn(List<String> values) {
            addCriterion("ip_user in", values, "ipUser");
            return (Criteria) this;
        }

        public Criteria andIpUserNotIn(List<String> values) {
            addCriterion("ip_user not in", values, "ipUser");
            return (Criteria) this;
        }

        public Criteria andIpUserBetween(String value1, String value2) {
            addCriterion("ip_user between", value1, value2, "ipUser");
            return (Criteria) this;
        }

        public Criteria andIpUserNotBetween(String value1, String value2) {
            addCriterion("ip_user not between", value1, value2, "ipUser");
            return (Criteria) this;
        }

        public Criteria andIpOperatorIsNull() {
            addCriterion("ip_operator is null");
            return (Criteria) this;
        }

        public Criteria andIpOperatorIsNotNull() {
            addCriterion("ip_operator is not null");
            return (Criteria) this;
        }

        public Criteria andIpOperatorEqualTo(String value) {
            addCriterion("ip_operator =", value, "ipOperator");
            return (Criteria) this;
        }

        public Criteria andIpOperatorNotEqualTo(String value) {
            addCriterion("ip_operator <>", value, "ipOperator");
            return (Criteria) this;
        }

        public Criteria andIpOperatorGreaterThan(String value) {
            addCriterion("ip_operator >", value, "ipOperator");
            return (Criteria) this;
        }

        public Criteria andIpOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("ip_operator >=", value, "ipOperator");
            return (Criteria) this;
        }

        public Criteria andIpOperatorLessThan(String value) {
            addCriterion("ip_operator <", value, "ipOperator");
            return (Criteria) this;
        }

        public Criteria andIpOperatorLessThanOrEqualTo(String value) {
            addCriterion("ip_operator <=", value, "ipOperator");
            return (Criteria) this;
        }

        public Criteria andIpOperatorLike(String value) {
            addCriterion("ip_operator like", value, "ipOperator");
            return (Criteria) this;
        }

        public Criteria andIpOperatorNotLike(String value) {
            addCriterion("ip_operator not like", value, "ipOperator");
            return (Criteria) this;
        }

        public Criteria andIpOperatorIn(List<String> values) {
            addCriterion("ip_operator in", values, "ipOperator");
            return (Criteria) this;
        }

        public Criteria andIpOperatorNotIn(List<String> values) {
            addCriterion("ip_operator not in", values, "ipOperator");
            return (Criteria) this;
        }

        public Criteria andIpOperatorBetween(String value1, String value2) {
            addCriterion("ip_operator between", value1, value2, "ipOperator");
            return (Criteria) this;
        }

        public Criteria andIpOperatorNotBetween(String value1, String value2) {
            addCriterion("ip_operator not between", value1, value2, "ipOperator");
            return (Criteria) this;
        }

        public Criteria andIpVerifyIsNull() {
            addCriterion("ip_verify is null");
            return (Criteria) this;
        }

        public Criteria andIpVerifyIsNotNull() {
            addCriterion("ip_verify is not null");
            return (Criteria) this;
        }

        public Criteria andIpVerifyEqualTo(String value) {
            addCriterion("ip_verify =", value, "ipVerify");
            return (Criteria) this;
        }

        public Criteria andIpVerifyNotEqualTo(String value) {
            addCriterion("ip_verify <>", value, "ipVerify");
            return (Criteria) this;
        }

        public Criteria andIpVerifyGreaterThan(String value) {
            addCriterion("ip_verify >", value, "ipVerify");
            return (Criteria) this;
        }

        public Criteria andIpVerifyGreaterThanOrEqualTo(String value) {
            addCriterion("ip_verify >=", value, "ipVerify");
            return (Criteria) this;
        }

        public Criteria andIpVerifyLessThan(String value) {
            addCriterion("ip_verify <", value, "ipVerify");
            return (Criteria) this;
        }

        public Criteria andIpVerifyLessThanOrEqualTo(String value) {
            addCriterion("ip_verify <=", value, "ipVerify");
            return (Criteria) this;
        }

        public Criteria andIpVerifyLike(String value) {
            addCriterion("ip_verify like", value, "ipVerify");
            return (Criteria) this;
        }

        public Criteria andIpVerifyNotLike(String value) {
            addCriterion("ip_verify not like", value, "ipVerify");
            return (Criteria) this;
        }

        public Criteria andIpVerifyIn(List<String> values) {
            addCriterion("ip_verify in", values, "ipVerify");
            return (Criteria) this;
        }

        public Criteria andIpVerifyNotIn(List<String> values) {
            addCriterion("ip_verify not in", values, "ipVerify");
            return (Criteria) this;
        }

        public Criteria andIpVerifyBetween(String value1, String value2) {
            addCriterion("ip_verify between", value1, value2, "ipVerify");
            return (Criteria) this;
        }

        public Criteria andIpVerifyNotBetween(String value1, String value2) {
            addCriterion("ip_verify not between", value1, value2, "ipVerify");
            return (Criteria) this;
        }

        public Criteria andOffLineAccountIdIsNull() {
            addCriterion("off_line_account_id is null");
            return (Criteria) this;
        }

        public Criteria andOffLineAccountIdIsNotNull() {
            addCriterion("off_line_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andOffLineAccountIdEqualTo(Integer value) {
            addCriterion("off_line_account_id =", value, "offLineAccountId");
            return (Criteria) this;
        }

        public Criteria andOffLineAccountIdNotEqualTo(Integer value) {
            addCriterion("off_line_account_id <>", value, "offLineAccountId");
            return (Criteria) this;
        }

        public Criteria andOffLineAccountIdGreaterThan(Integer value) {
            addCriterion("off_line_account_id >", value, "offLineAccountId");
            return (Criteria) this;
        }

        public Criteria andOffLineAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("off_line_account_id >=", value, "offLineAccountId");
            return (Criteria) this;
        }

        public Criteria andOffLineAccountIdLessThan(Integer value) {
            addCriterion("off_line_account_id <", value, "offLineAccountId");
            return (Criteria) this;
        }

        public Criteria andOffLineAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("off_line_account_id <=", value, "offLineAccountId");
            return (Criteria) this;
        }

        public Criteria andOffLineAccountIdIn(List<Integer> values) {
            addCriterion("off_line_account_id in", values, "offLineAccountId");
            return (Criteria) this;
        }

        public Criteria andOffLineAccountIdNotIn(List<Integer> values) {
            addCriterion("off_line_account_id not in", values, "offLineAccountId");
            return (Criteria) this;
        }

        public Criteria andOffLineAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("off_line_account_id between", value1, value2, "offLineAccountId");
            return (Criteria) this;
        }

        public Criteria andOffLineAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("off_line_account_id not between", value1, value2, "offLineAccountId");
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