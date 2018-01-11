package com.ysd.account.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MtpRepaymentBatchFileCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MtpRepaymentBatchFileCriteria() {
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

        public Criteria andSubmitTimeIsNull() {
            addCriterion("submit_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNotNull() {
            addCriterion("submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeEqualTo(String value) {
            addCriterion("submit_time =", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotEqualTo(String value) {
            addCriterion("submit_time <>", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThan(String value) {
            addCriterion("submit_time >", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThanOrEqualTo(String value) {
            addCriterion("submit_time >=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThan(String value) {
            addCriterion("submit_time <", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThanOrEqualTo(String value) {
            addCriterion("submit_time <=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLike(String value) {
            addCriterion("submit_time like", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotLike(String value) {
            addCriterion("submit_time not like", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIn(List<String> values) {
            addCriterion("submit_time in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotIn(List<String> values) {
            addCriterion("submit_time not in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeBetween(String value1, String value2) {
            addCriterion("submit_time between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotBetween(String value1, String value2) {
            addCriterion("submit_time not between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeIsNull() {
            addCriterion("back_time is null");
            return (Criteria) this;
        }

        public Criteria andBackTimeIsNotNull() {
            addCriterion("back_time is not null");
            return (Criteria) this;
        }

        public Criteria andBackTimeEqualTo(Date value) {
            addCriterion("back_time =", value, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeNotEqualTo(Date value) {
            addCriterion("back_time <>", value, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeGreaterThan(Date value) {
            addCriterion("back_time >", value, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("back_time >=", value, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeLessThan(Date value) {
            addCriterion("back_time <", value, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeLessThanOrEqualTo(Date value) {
            addCriterion("back_time <=", value, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeIn(List<Date> values) {
            addCriterion("back_time in", values, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeNotIn(List<Date> values) {
            addCriterion("back_time not in", values, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeBetween(Date value1, Date value2) {
            addCriterion("back_time between", value1, value2, "backTime");
            return (Criteria) this;
        }

        public Criteria andBackTimeNotBetween(Date value1, Date value2) {
            addCriterion("back_time not between", value1, value2, "backTime");
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

        public Criteria andTotalUnitsIsNull() {
            addCriterion("total_units is null");
            return (Criteria) this;
        }

        public Criteria andTotalUnitsIsNotNull() {
            addCriterion("total_units is not null");
            return (Criteria) this;
        }

        public Criteria andTotalUnitsEqualTo(BigDecimal value) {
            addCriterion("total_units =", value, "totalUnits");
            return (Criteria) this;
        }

        public Criteria andTotalUnitsNotEqualTo(BigDecimal value) {
            addCriterion("total_units <>", value, "totalUnits");
            return (Criteria) this;
        }

        public Criteria andTotalUnitsGreaterThan(BigDecimal value) {
            addCriterion("total_units >", value, "totalUnits");
            return (Criteria) this;
        }

        public Criteria andTotalUnitsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_units >=", value, "totalUnits");
            return (Criteria) this;
        }

        public Criteria andTotalUnitsLessThan(BigDecimal value) {
            addCriterion("total_units <", value, "totalUnits");
            return (Criteria) this;
        }

        public Criteria andTotalUnitsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_units <=", value, "totalUnits");
            return (Criteria) this;
        }

        public Criteria andTotalUnitsIn(List<BigDecimal> values) {
            addCriterion("total_units in", values, "totalUnits");
            return (Criteria) this;
        }

        public Criteria andTotalUnitsNotIn(List<BigDecimal> values) {
            addCriterion("total_units not in", values, "totalUnits");
            return (Criteria) this;
        }

        public Criteria andTotalUnitsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_units between", value1, value2, "totalUnits");
            return (Criteria) this;
        }

        public Criteria andTotalUnitsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_units not between", value1, value2, "totalUnits");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNull() {
            addCriterion("total_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNotNull() {
            addCriterion("total_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCountEqualTo(BigDecimal value) {
            addCriterion("total_count =", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualTo(BigDecimal value) {
            addCriterion("total_count <>", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThan(BigDecimal value) {
            addCriterion("total_count >", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_count >=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThan(BigDecimal value) {
            addCriterion("total_count <", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_count <=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIn(List<BigDecimal> values) {
            addCriterion("total_count in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotIn(List<BigDecimal> values) {
            addCriterion("total_count not in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_count between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_count not between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountIsNull() {
            addCriterion("total_discount is null");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountIsNotNull() {
            addCriterion("total_discount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountEqualTo(BigDecimal value) {
            addCriterion("total_discount =", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountNotEqualTo(BigDecimal value) {
            addCriterion("total_discount <>", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountGreaterThan(BigDecimal value) {
            addCriterion("total_discount >", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_discount >=", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountLessThan(BigDecimal value) {
            addCriterion("total_discount <", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_discount <=", value, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountIn(List<BigDecimal> values) {
            addCriterion("total_discount in", values, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountNotIn(List<BigDecimal> values) {
            addCriterion("total_discount not in", values, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_discount between", value1, value2, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andTotalDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_discount not between", value1, value2, "totalDiscount");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNull() {
            addCriterion("batch_no is null");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNotNull() {
            addCriterion("batch_no is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNoEqualTo(String value) {
            addCriterion("batch_no =", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotEqualTo(String value) {
            addCriterion("batch_no <>", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThan(String value) {
            addCriterion("batch_no >", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("batch_no >=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThan(String value) {
            addCriterion("batch_no <", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThanOrEqualTo(String value) {
            addCriterion("batch_no <=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLike(String value) {
            addCriterion("batch_no like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotLike(String value) {
            addCriterion("batch_no not like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoIn(List<String> values) {
            addCriterion("batch_no in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotIn(List<String> values) {
            addCriterion("batch_no not in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoBetween(String value1, String value2) {
            addCriterion("batch_no between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotBetween(String value1, String value2) {
            addCriterion("batch_no not between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNull() {
            addCriterion("product_num is null");
            return (Criteria) this;
        }

        public Criteria andProductNumIsNotNull() {
            addCriterion("product_num is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumEqualTo(String value) {
            addCriterion("product_num =", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotEqualTo(String value) {
            addCriterion("product_num <>", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThan(String value) {
            addCriterion("product_num >", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumGreaterThanOrEqualTo(String value) {
            addCriterion("product_num >=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThan(String value) {
            addCriterion("product_num <", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLessThanOrEqualTo(String value) {
            addCriterion("product_num <=", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumLike(String value) {
            addCriterion("product_num like", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotLike(String value) {
            addCriterion("product_num not like", value, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumIn(List<String> values) {
            addCriterion("product_num in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotIn(List<String> values) {
            addCriterion("product_num not in", values, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumBetween(String value1, String value2) {
            addCriterion("product_num between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andProductNumNotBetween(String value1, String value2) {
            addCriterion("product_num not between", value1, value2, "productNum");
            return (Criteria) this;
        }

        public Criteria andTransDateIsNull() {
            addCriterion("trans_date is null");
            return (Criteria) this;
        }

        public Criteria andTransDateIsNotNull() {
            addCriterion("trans_date is not null");
            return (Criteria) this;
        }

        public Criteria andTransDateEqualTo(String value) {
            addCriterion("trans_date =", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotEqualTo(String value) {
            addCriterion("trans_date <>", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThan(String value) {
            addCriterion("trans_date >", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateGreaterThanOrEqualTo(String value) {
            addCriterion("trans_date >=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThan(String value) {
            addCriterion("trans_date <", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLessThanOrEqualTo(String value) {
            addCriterion("trans_date <=", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateLike(String value) {
            addCriterion("trans_date like", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotLike(String value) {
            addCriterion("trans_date not like", value, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateIn(List<String> values) {
            addCriterion("trans_date in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotIn(List<String> values) {
            addCriterion("trans_date not in", values, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateBetween(String value1, String value2) {
            addCriterion("trans_date between", value1, value2, "transDate");
            return (Criteria) this;
        }

        public Criteria andTransDateNotBetween(String value1, String value2) {
            addCriterion("trans_date not between", value1, value2, "transDate");
            return (Criteria) this;
        }

        public Criteria andBackBatchNoIsNull() {
            addCriterion("back_batch_no is null");
            return (Criteria) this;
        }

        public Criteria andBackBatchNoIsNotNull() {
            addCriterion("back_batch_no is not null");
            return (Criteria) this;
        }

        public Criteria andBackBatchNoEqualTo(String value) {
            addCriterion("back_batch_no =", value, "backBatchNo");
            return (Criteria) this;
        }

        public Criteria andBackBatchNoNotEqualTo(String value) {
            addCriterion("back_batch_no <>", value, "backBatchNo");
            return (Criteria) this;
        }

        public Criteria andBackBatchNoGreaterThan(String value) {
            addCriterion("back_batch_no >", value, "backBatchNo");
            return (Criteria) this;
        }

        public Criteria andBackBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("back_batch_no >=", value, "backBatchNo");
            return (Criteria) this;
        }

        public Criteria andBackBatchNoLessThan(String value) {
            addCriterion("back_batch_no <", value, "backBatchNo");
            return (Criteria) this;
        }

        public Criteria andBackBatchNoLessThanOrEqualTo(String value) {
            addCriterion("back_batch_no <=", value, "backBatchNo");
            return (Criteria) this;
        }

        public Criteria andBackBatchNoLike(String value) {
            addCriterion("back_batch_no like", value, "backBatchNo");
            return (Criteria) this;
        }

        public Criteria andBackBatchNoNotLike(String value) {
            addCriterion("back_batch_no not like", value, "backBatchNo");
            return (Criteria) this;
        }

        public Criteria andBackBatchNoIn(List<String> values) {
            addCriterion("back_batch_no in", values, "backBatchNo");
            return (Criteria) this;
        }

        public Criteria andBackBatchNoNotIn(List<String> values) {
            addCriterion("back_batch_no not in", values, "backBatchNo");
            return (Criteria) this;
        }

        public Criteria andBackBatchNoBetween(String value1, String value2) {
            addCriterion("back_batch_no between", value1, value2, "backBatchNo");
            return (Criteria) this;
        }

        public Criteria andBackBatchNoNotBetween(String value1, String value2) {
            addCriterion("back_batch_no not between", value1, value2, "backBatchNo");
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