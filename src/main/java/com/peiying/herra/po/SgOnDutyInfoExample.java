package com.peiying.herra.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SgOnDutyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SgOnDutyInfoExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSgidIsNull() {
            addCriterion("SgId is null");
            return (Criteria) this;
        }

        public Criteria andSgidIsNotNull() {
            addCriterion("SgId is not null");
            return (Criteria) this;
        }

        public Criteria andSgidEqualTo(Integer value) {
            addCriterion("SgId =", value, "sgid");
            return (Criteria) this;
        }

        public Criteria andSgidNotEqualTo(Integer value) {
            addCriterion("SgId <>", value, "sgid");
            return (Criteria) this;
        }

        public Criteria andSgidGreaterThan(Integer value) {
            addCriterion("SgId >", value, "sgid");
            return (Criteria) this;
        }

        public Criteria andSgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SgId >=", value, "sgid");
            return (Criteria) this;
        }

        public Criteria andSgidLessThan(Integer value) {
            addCriterion("SgId <", value, "sgid");
            return (Criteria) this;
        }

        public Criteria andSgidLessThanOrEqualTo(Integer value) {
            addCriterion("SgId <=", value, "sgid");
            return (Criteria) this;
        }

        public Criteria andSgidIn(List<Integer> values) {
            addCriterion("SgId in", values, "sgid");
            return (Criteria) this;
        }

        public Criteria andSgidNotIn(List<Integer> values) {
            addCriterion("SgId not in", values, "sgid");
            return (Criteria) this;
        }

        public Criteria andSgidBetween(Integer value1, Integer value2) {
            addCriterion("SgId between", value1, value2, "sgid");
            return (Criteria) this;
        }

        public Criteria andSgidNotBetween(Integer value1, Integer value2) {
            addCriterion("SgId not between", value1, value2, "sgid");
            return (Criteria) this;
        }

        public Criteria andUsernoIsNull() {
            addCriterion("UserNo is null");
            return (Criteria) this;
        }

        public Criteria andUsernoIsNotNull() {
            addCriterion("UserNo is not null");
            return (Criteria) this;
        }

        public Criteria andUsernoEqualTo(String value) {
            addCriterion("UserNo =", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoNotEqualTo(String value) {
            addCriterion("UserNo <>", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoGreaterThan(String value) {
            addCriterion("UserNo >", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoGreaterThanOrEqualTo(String value) {
            addCriterion("UserNo >=", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoLessThan(String value) {
            addCriterion("UserNo <", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoLessThanOrEqualTo(String value) {
            addCriterion("UserNo <=", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoLike(String value) {
            addCriterion("UserNo like", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoNotLike(String value) {
            addCriterion("UserNo not like", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoIn(List<String> values) {
            addCriterion("UserNo in", values, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoNotIn(List<String> values) {
            addCriterion("UserNo not in", values, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoBetween(String value1, String value2) {
            addCriterion("UserNo between", value1, value2, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoNotBetween(String value1, String value2) {
            addCriterion("UserNo not between", value1, value2, "userno");
            return (Criteria) this;
        }

        public Criteria andDutystatusIsNull() {
            addCriterion("DutyStatus is null");
            return (Criteria) this;
        }

        public Criteria andDutystatusIsNotNull() {
            addCriterion("DutyStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDutystatusEqualTo(Integer value) {
            addCriterion("DutyStatus =", value, "dutystatus");
            return (Criteria) this;
        }

        public Criteria andDutystatusNotEqualTo(Integer value) {
            addCriterion("DutyStatus <>", value, "dutystatus");
            return (Criteria) this;
        }

        public Criteria andDutystatusGreaterThan(Integer value) {
            addCriterion("DutyStatus >", value, "dutystatus");
            return (Criteria) this;
        }

        public Criteria andDutystatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("DutyStatus >=", value, "dutystatus");
            return (Criteria) this;
        }

        public Criteria andDutystatusLessThan(Integer value) {
            addCriterion("DutyStatus <", value, "dutystatus");
            return (Criteria) this;
        }

        public Criteria andDutystatusLessThanOrEqualTo(Integer value) {
            addCriterion("DutyStatus <=", value, "dutystatus");
            return (Criteria) this;
        }

        public Criteria andDutystatusIn(List<Integer> values) {
            addCriterion("DutyStatus in", values, "dutystatus");
            return (Criteria) this;
        }

        public Criteria andDutystatusNotIn(List<Integer> values) {
            addCriterion("DutyStatus not in", values, "dutystatus");
            return (Criteria) this;
        }

        public Criteria andDutystatusBetween(Integer value1, Integer value2) {
            addCriterion("DutyStatus between", value1, value2, "dutystatus");
            return (Criteria) this;
        }

        public Criteria andDutystatusNotBetween(Integer value1, Integer value2) {
            addCriterion("DutyStatus not between", value1, value2, "dutystatus");
            return (Criteria) this;
        }

        public Criteria andCurrentdutystarttimeIsNull() {
            addCriterion("CurrentDutyStartTime is null");
            return (Criteria) this;
        }

        public Criteria andCurrentdutystarttimeIsNotNull() {
            addCriterion("CurrentDutyStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentdutystarttimeEqualTo(Date value) {
            addCriterion("CurrentDutyStartTime =", value, "currentdutystarttime");
            return (Criteria) this;
        }

        public Criteria andCurrentdutystarttimeNotEqualTo(Date value) {
            addCriterion("CurrentDutyStartTime <>", value, "currentdutystarttime");
            return (Criteria) this;
        }

        public Criteria andCurrentdutystarttimeGreaterThan(Date value) {
            addCriterion("CurrentDutyStartTime >", value, "currentdutystarttime");
            return (Criteria) this;
        }

        public Criteria andCurrentdutystarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CurrentDutyStartTime >=", value, "currentdutystarttime");
            return (Criteria) this;
        }

        public Criteria andCurrentdutystarttimeLessThan(Date value) {
            addCriterion("CurrentDutyStartTime <", value, "currentdutystarttime");
            return (Criteria) this;
        }

        public Criteria andCurrentdutystarttimeLessThanOrEqualTo(Date value) {
            addCriterion("CurrentDutyStartTime <=", value, "currentdutystarttime");
            return (Criteria) this;
        }

        public Criteria andCurrentdutystarttimeIn(List<Date> values) {
            addCriterion("CurrentDutyStartTime in", values, "currentdutystarttime");
            return (Criteria) this;
        }

        public Criteria andCurrentdutystarttimeNotIn(List<Date> values) {
            addCriterion("CurrentDutyStartTime not in", values, "currentdutystarttime");
            return (Criteria) this;
        }

        public Criteria andCurrentdutystarttimeBetween(Date value1, Date value2) {
            addCriterion("CurrentDutyStartTime between", value1, value2, "currentdutystarttime");
            return (Criteria) this;
        }

        public Criteria andCurrentdutystarttimeNotBetween(Date value1, Date value2) {
            addCriterion("CurrentDutyStartTime not between", value1, value2, "currentdutystarttime");
            return (Criteria) this;
        }

        public Criteria andCurrentdutyendtimeIsNull() {
            addCriterion("CurrentDutyEndTime is null");
            return (Criteria) this;
        }

        public Criteria andCurrentdutyendtimeIsNotNull() {
            addCriterion("CurrentDutyEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentdutyendtimeEqualTo(Date value) {
            addCriterion("CurrentDutyEndTime =", value, "currentdutyendtime");
            return (Criteria) this;
        }

        public Criteria andCurrentdutyendtimeNotEqualTo(Date value) {
            addCriterion("CurrentDutyEndTime <>", value, "currentdutyendtime");
            return (Criteria) this;
        }

        public Criteria andCurrentdutyendtimeGreaterThan(Date value) {
            addCriterion("CurrentDutyEndTime >", value, "currentdutyendtime");
            return (Criteria) this;
        }

        public Criteria andCurrentdutyendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CurrentDutyEndTime >=", value, "currentdutyendtime");
            return (Criteria) this;
        }

        public Criteria andCurrentdutyendtimeLessThan(Date value) {
            addCriterion("CurrentDutyEndTime <", value, "currentdutyendtime");
            return (Criteria) this;
        }

        public Criteria andCurrentdutyendtimeLessThanOrEqualTo(Date value) {
            addCriterion("CurrentDutyEndTime <=", value, "currentdutyendtime");
            return (Criteria) this;
        }

        public Criteria andCurrentdutyendtimeIn(List<Date> values) {
            addCriterion("CurrentDutyEndTime in", values, "currentdutyendtime");
            return (Criteria) this;
        }

        public Criteria andCurrentdutyendtimeNotIn(List<Date> values) {
            addCriterion("CurrentDutyEndTime not in", values, "currentdutyendtime");
            return (Criteria) this;
        }

        public Criteria andCurrentdutyendtimeBetween(Date value1, Date value2) {
            addCriterion("CurrentDutyEndTime between", value1, value2, "currentdutyendtime");
            return (Criteria) this;
        }

        public Criteria andCurrentdutyendtimeNotBetween(Date value1, Date value2) {
            addCriterion("CurrentDutyEndTime not between", value1, value2, "currentdutyendtime");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNull() {
            addCriterion("CreateBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("CreateBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(String value) {
            addCriterion("CreateBy =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(String value) {
            addCriterion("CreateBy <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(String value) {
            addCriterion("CreateBy >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("CreateBy >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(String value) {
            addCriterion("CreateBy <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(String value) {
            addCriterion("CreateBy <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLike(String value) {
            addCriterion("CreateBy like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotLike(String value) {
            addCriterion("CreateBy not like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<String> values) {
            addCriterion("CreateBy in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<String> values) {
            addCriterion("CreateBy not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(String value1, String value2) {
            addCriterion("CreateBy between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(String value1, String value2) {
            addCriterion("CreateBy not between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNull() {
            addCriterion("UpdateBy is null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNotNull() {
            addCriterion("UpdateBy is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyEqualTo(String value) {
            addCriterion("UpdateBy =", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotEqualTo(String value) {
            addCriterion("UpdateBy <>", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThan(String value) {
            addCriterion("UpdateBy >", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThanOrEqualTo(String value) {
            addCriterion("UpdateBy >=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThan(String value) {
            addCriterion("UpdateBy <", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThanOrEqualTo(String value) {
            addCriterion("UpdateBy <=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLike(String value) {
            addCriterion("UpdateBy like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotLike(String value) {
            addCriterion("UpdateBy not like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIn(List<String> values) {
            addCriterion("UpdateBy in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotIn(List<String> values) {
            addCriterion("UpdateBy not in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyBetween(String value1, String value2) {
            addCriterion("UpdateBy between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotBetween(String value1, String value2) {
            addCriterion("UpdateBy not between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updatetime");
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