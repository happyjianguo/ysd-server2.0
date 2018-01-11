package com.ysd.account.criteria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAwardDetailCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAwardDetailCriteria() {
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

        public Criteria andSignFlgIsNull() {
            addCriterion("sign_flg is null");
            return (Criteria) this;
        }

        public Criteria andSignFlgIsNotNull() {
            addCriterion("sign_flg is not null");
            return (Criteria) this;
        }

        public Criteria andSignFlgEqualTo(Integer value) {
            addCriterion("sign_flg =", value, "signFlg");
            return (Criteria) this;
        }

        public Criteria andSignFlgNotEqualTo(Integer value) {
            addCriterion("sign_flg <>", value, "signFlg");
            return (Criteria) this;
        }

        public Criteria andSignFlgGreaterThan(Integer value) {
            addCriterion("sign_flg >", value, "signFlg");
            return (Criteria) this;
        }

        public Criteria andSignFlgGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_flg >=", value, "signFlg");
            return (Criteria) this;
        }

        public Criteria andSignFlgLessThan(Integer value) {
            addCriterion("sign_flg <", value, "signFlg");
            return (Criteria) this;
        }

        public Criteria andSignFlgLessThanOrEqualTo(Integer value) {
            addCriterion("sign_flg <=", value, "signFlg");
            return (Criteria) this;
        }

        public Criteria andSignFlgIn(List<Integer> values) {
            addCriterion("sign_flg in", values, "signFlg");
            return (Criteria) this;
        }

        public Criteria andSignFlgNotIn(List<Integer> values) {
            addCriterion("sign_flg not in", values, "signFlg");
            return (Criteria) this;
        }

        public Criteria andSignFlgBetween(Integer value1, Integer value2) {
            addCriterion("sign_flg between", value1, value2, "signFlg");
            return (Criteria) this;
        }

        public Criteria andSignFlgNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_flg not between", value1, value2, "signFlg");
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

        public Criteria andUserAccountDetailIdIsNull() {
            addCriterion("user_account_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountDetailIdIsNotNull() {
            addCriterion("user_account_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountDetailIdEqualTo(Integer value) {
            addCriterion("user_account_detail_id =", value, "userAccountDetailId");
            return (Criteria) this;
        }

        public Criteria andUserAccountDetailIdNotEqualTo(Integer value) {
            addCriterion("user_account_detail_id <>", value, "userAccountDetailId");
            return (Criteria) this;
        }

        public Criteria andUserAccountDetailIdGreaterThan(Integer value) {
            addCriterion("user_account_detail_id >", value, "userAccountDetailId");
            return (Criteria) this;
        }

        public Criteria andUserAccountDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_account_detail_id >=", value, "userAccountDetailId");
            return (Criteria) this;
        }

        public Criteria andUserAccountDetailIdLessThan(Integer value) {
            addCriterion("user_account_detail_id <", value, "userAccountDetailId");
            return (Criteria) this;
        }

        public Criteria andUserAccountDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_account_detail_id <=", value, "userAccountDetailId");
            return (Criteria) this;
        }

        public Criteria andUserAccountDetailIdIn(List<Integer> values) {
            addCriterion("user_account_detail_id in", values, "userAccountDetailId");
            return (Criteria) this;
        }

        public Criteria andUserAccountDetailIdNotIn(List<Integer> values) {
            addCriterion("user_account_detail_id not in", values, "userAccountDetailId");
            return (Criteria) this;
        }

        public Criteria andUserAccountDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("user_account_detail_id between", value1, value2, "userAccountDetailId");
            return (Criteria) this;
        }

        public Criteria andUserAccountDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_account_detail_id not between", value1, value2, "userAccountDetailId");
            return (Criteria) this;
        }

        public Criteria andRelateToIsNull() {
            addCriterion("relate_to is null");
            return (Criteria) this;
        }

        public Criteria andRelateToIsNotNull() {
            addCriterion("relate_to is not null");
            return (Criteria) this;
        }

        public Criteria andRelateToEqualTo(Integer value) {
            addCriterion("relate_to =", value, "relateTo");
            return (Criteria) this;
        }

        public Criteria andRelateToNotEqualTo(Integer value) {
            addCriterion("relate_to <>", value, "relateTo");
            return (Criteria) this;
        }

        public Criteria andRelateToGreaterThan(Integer value) {
            addCriterion("relate_to >", value, "relateTo");
            return (Criteria) this;
        }

        public Criteria andRelateToGreaterThanOrEqualTo(Integer value) {
            addCriterion("relate_to >=", value, "relateTo");
            return (Criteria) this;
        }

        public Criteria andRelateToLessThan(Integer value) {
            addCriterion("relate_to <", value, "relateTo");
            return (Criteria) this;
        }

        public Criteria andRelateToLessThanOrEqualTo(Integer value) {
            addCriterion("relate_to <=", value, "relateTo");
            return (Criteria) this;
        }

        public Criteria andRelateToIn(List<Integer> values) {
            addCriterion("relate_to in", values, "relateTo");
            return (Criteria) this;
        }

        public Criteria andRelateToNotIn(List<Integer> values) {
            addCriterion("relate_to not in", values, "relateTo");
            return (Criteria) this;
        }

        public Criteria andRelateToBetween(Integer value1, Integer value2) {
            addCriterion("relate_to between", value1, value2, "relateTo");
            return (Criteria) this;
        }

        public Criteria andRelateToNotBetween(Integer value1, Integer value2) {
            addCriterion("relate_to not between", value1, value2, "relateTo");
            return (Criteria) this;
        }

        public Criteria andRelateKeyIsNull() {
            addCriterion("relate_key is null");
            return (Criteria) this;
        }

        public Criteria andRelateKeyIsNotNull() {
            addCriterion("relate_key is not null");
            return (Criteria) this;
        }

        public Criteria andRelateKeyEqualTo(String value) {
            addCriterion("relate_key =", value, "relateKey");
            return (Criteria) this;
        }

        public Criteria andRelateKeyNotEqualTo(String value) {
            addCriterion("relate_key <>", value, "relateKey");
            return (Criteria) this;
        }

        public Criteria andRelateKeyGreaterThan(String value) {
            addCriterion("relate_key >", value, "relateKey");
            return (Criteria) this;
        }

        public Criteria andRelateKeyGreaterThanOrEqualTo(String value) {
            addCriterion("relate_key >=", value, "relateKey");
            return (Criteria) this;
        }

        public Criteria andRelateKeyLessThan(String value) {
            addCriterion("relate_key <", value, "relateKey");
            return (Criteria) this;
        }

        public Criteria andRelateKeyLessThanOrEqualTo(String value) {
            addCriterion("relate_key <=", value, "relateKey");
            return (Criteria) this;
        }

        public Criteria andRelateKeyLike(String value) {
            addCriterion("relate_key like", value, "relateKey");
            return (Criteria) this;
        }

        public Criteria andRelateKeyNotLike(String value) {
            addCriterion("relate_key not like", value, "relateKey");
            return (Criteria) this;
        }

        public Criteria andRelateKeyIn(List<String> values) {
            addCriterion("relate_key in", values, "relateKey");
            return (Criteria) this;
        }

        public Criteria andRelateKeyNotIn(List<String> values) {
            addCriterion("relate_key not in", values, "relateKey");
            return (Criteria) this;
        }

        public Criteria andRelateKeyBetween(String value1, String value2) {
            addCriterion("relate_key between", value1, value2, "relateKey");
            return (Criteria) this;
        }

        public Criteria andRelateKeyNotBetween(String value1, String value2) {
            addCriterion("relate_key not between", value1, value2, "relateKey");
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