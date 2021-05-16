package com.peiying.herra.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public UserInfoExample() {
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

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andIdIsNull() {
			addCriterion("Id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("Id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("Id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("Id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("Id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("Id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("Id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("Id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("Id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("Id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("Id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("Id not between", value1, value2, "id");
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

		public Criteria andNameIsNull() {
			addCriterion("Name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("Name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("Name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("Name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("Name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("Name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("Name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("Name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("Name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("Name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("Name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("Name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("Name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("Name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNull() {
			addCriterion("Phone is null");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNotNull() {
			addCriterion("Phone is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneEqualTo(String value) {
			addCriterion("Phone =", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotEqualTo(String value) {
			addCriterion("Phone <>", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThan(String value) {
			addCriterion("Phone >", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("Phone >=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThan(String value) {
			addCriterion("Phone <", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThanOrEqualTo(String value) {
			addCriterion("Phone <=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLike(String value) {
			addCriterion("Phone like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotLike(String value) {
			addCriterion("Phone not like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneIn(List<String> values) {
			addCriterion("Phone in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotIn(List<String> values) {
			addCriterion("Phone not in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneBetween(String value1, String value2) {
			addCriterion("Phone between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotBetween(String value1, String value2) {
			addCriterion("Phone not between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andDepidIsNull() {
			addCriterion("DepId is null");
			return (Criteria) this;
		}

		public Criteria andDepidIsNotNull() {
			addCriterion("DepId is not null");
			return (Criteria) this;
		}

		public Criteria andDepidEqualTo(Integer value) {
			addCriterion("DepId =", value, "depid");
			return (Criteria) this;
		}

		public Criteria andDepidNotEqualTo(Integer value) {
			addCriterion("DepId <>", value, "depid");
			return (Criteria) this;
		}

		public Criteria andDepidGreaterThan(Integer value) {
			addCriterion("DepId >", value, "depid");
			return (Criteria) this;
		}

		public Criteria andDepidGreaterThanOrEqualTo(Integer value) {
			addCriterion("DepId >=", value, "depid");
			return (Criteria) this;
		}

		public Criteria andDepidLessThan(Integer value) {
			addCriterion("DepId <", value, "depid");
			return (Criteria) this;
		}

		public Criteria andDepidLessThanOrEqualTo(Integer value) {
			addCriterion("DepId <=", value, "depid");
			return (Criteria) this;
		}

		public Criteria andDepidIn(List<Integer> values) {
			addCriterion("DepId in", values, "depid");
			return (Criteria) this;
		}

		public Criteria andDepidNotIn(List<Integer> values) {
			addCriterion("DepId not in", values, "depid");
			return (Criteria) this;
		}

		public Criteria andDepidBetween(Integer value1, Integer value2) {
			addCriterion("DepId between", value1, value2, "depid");
			return (Criteria) this;
		}

		public Criteria andDepidNotBetween(Integer value1, Integer value2) {
			addCriterion("DepId not between", value1, value2, "depid");
			return (Criteria) this;
		}

		public Criteria andJoindateIsNull() {
			addCriterion("JoinDate is null");
			return (Criteria) this;
		}

		public Criteria andJoindateIsNotNull() {
			addCriterion("JoinDate is not null");
			return (Criteria) this;
		}

		public Criteria andJoindateEqualTo(Date value) {
			addCriterionForJDBCDate("JoinDate =", value, "joindate");
			return (Criteria) this;
		}

		public Criteria andJoindateNotEqualTo(Date value) {
			addCriterionForJDBCDate("JoinDate <>", value, "joindate");
			return (Criteria) this;
		}

		public Criteria andJoindateGreaterThan(Date value) {
			addCriterionForJDBCDate("JoinDate >", value, "joindate");
			return (Criteria) this;
		}

		public Criteria andJoindateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("JoinDate >=", value, "joindate");
			return (Criteria) this;
		}

		public Criteria andJoindateLessThan(Date value) {
			addCriterionForJDBCDate("JoinDate <", value, "joindate");
			return (Criteria) this;
		}

		public Criteria andJoindateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("JoinDate <=", value, "joindate");
			return (Criteria) this;
		}

		public Criteria andJoindateIn(List<Date> values) {
			addCriterionForJDBCDate("JoinDate in", values, "joindate");
			return (Criteria) this;
		}

		public Criteria andJoindateNotIn(List<Date> values) {
			addCriterionForJDBCDate("JoinDate not in", values, "joindate");
			return (Criteria) this;
		}

		public Criteria andJoindateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("JoinDate between", value1, value2, "joindate");
			return (Criteria) this;
		}

		public Criteria andJoindateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("JoinDate not between", value1, value2, "joindate");
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