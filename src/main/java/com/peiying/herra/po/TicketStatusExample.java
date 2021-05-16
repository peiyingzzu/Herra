package com.peiying.herra.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TicketStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TicketStatusExample() {
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

        public Criteria andTicketidIsNull() {
            addCriterion("TicketId is null");
            return (Criteria) this;
        }

        public Criteria andTicketidIsNotNull() {
            addCriterion("TicketId is not null");
            return (Criteria) this;
        }

        public Criteria andTicketidEqualTo(Long value) {
            addCriterion("TicketId =", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidNotEqualTo(Long value) {
            addCriterion("TicketId <>", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidGreaterThan(Long value) {
            addCriterion("TicketId >", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidGreaterThanOrEqualTo(Long value) {
            addCriterion("TicketId >=", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidLessThan(Long value) {
            addCriterion("TicketId <", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidLessThanOrEqualTo(Long value) {
            addCriterion("TicketId <=", value, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidIn(List<Long> values) {
            addCriterion("TicketId in", values, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidNotIn(List<Long> values) {
            addCriterion("TicketId not in", values, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidBetween(Long value1, Long value2) {
            addCriterion("TicketId between", value1, value2, "ticketid");
            return (Criteria) this;
        }

        public Criteria andTicketidNotBetween(Long value1, Long value2) {
            addCriterion("TicketId not between", value1, value2, "ticketid");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("Level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("Level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("Level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("Level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("Level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("Level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("Level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("Level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("Level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("Level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("Level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("Level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOwnerusernoIsNull() {
            addCriterion("OwnerUserNo is null");
            return (Criteria) this;
        }

        public Criteria andOwnerusernoIsNotNull() {
            addCriterion("OwnerUserNo is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerusernoEqualTo(String value) {
            addCriterion("OwnerUserNo =", value, "owneruserno");
            return (Criteria) this;
        }

        public Criteria andOwnerusernoNotEqualTo(String value) {
            addCriterion("OwnerUserNo <>", value, "owneruserno");
            return (Criteria) this;
        }

        public Criteria andOwnerusernoGreaterThan(String value) {
            addCriterion("OwnerUserNo >", value, "owneruserno");
            return (Criteria) this;
        }

        public Criteria andOwnerusernoGreaterThanOrEqualTo(String value) {
            addCriterion("OwnerUserNo >=", value, "owneruserno");
            return (Criteria) this;
        }

        public Criteria andOwnerusernoLessThan(String value) {
            addCriterion("OwnerUserNo <", value, "owneruserno");
            return (Criteria) this;
        }

        public Criteria andOwnerusernoLessThanOrEqualTo(String value) {
            addCriterion("OwnerUserNo <=", value, "owneruserno");
            return (Criteria) this;
        }

        public Criteria andOwnerusernoLike(String value) {
            addCriterion("OwnerUserNo like", value, "owneruserno");
            return (Criteria) this;
        }

        public Criteria andOwnerusernoNotLike(String value) {
            addCriterion("OwnerUserNo not like", value, "owneruserno");
            return (Criteria) this;
        }

        public Criteria andOwnerusernoIn(List<String> values) {
            addCriterion("OwnerUserNo in", values, "owneruserno");
            return (Criteria) this;
        }

        public Criteria andOwnerusernoNotIn(List<String> values) {
            addCriterion("OwnerUserNo not in", values, "owneruserno");
            return (Criteria) this;
        }

        public Criteria andOwnerusernoBetween(String value1, String value2) {
            addCriterion("OwnerUserNo between", value1, value2, "owneruserno");
            return (Criteria) this;
        }

        public Criteria andOwnerusernoNotBetween(String value1, String value2) {
            addCriterion("OwnerUserNo not between", value1, value2, "owneruserno");
            return (Criteria) this;
        }

        public Criteria andWatcheduserlistIsNull() {
            addCriterion("WatchedUserList is null");
            return (Criteria) this;
        }

        public Criteria andWatcheduserlistIsNotNull() {
            addCriterion("WatchedUserList is not null");
            return (Criteria) this;
        }

        public Criteria andWatcheduserlistEqualTo(String value) {
            addCriterion("WatchedUserList =", value, "watcheduserlist");
            return (Criteria) this;
        }

        public Criteria andWatcheduserlistNotEqualTo(String value) {
            addCriterion("WatchedUserList <>", value, "watcheduserlist");
            return (Criteria) this;
        }

        public Criteria andWatcheduserlistGreaterThan(String value) {
            addCriterion("WatchedUserList >", value, "watcheduserlist");
            return (Criteria) this;
        }

        public Criteria andWatcheduserlistGreaterThanOrEqualTo(String value) {
            addCriterion("WatchedUserList >=", value, "watcheduserlist");
            return (Criteria) this;
        }

        public Criteria andWatcheduserlistLessThan(String value) {
            addCriterion("WatchedUserList <", value, "watcheduserlist");
            return (Criteria) this;
        }

        public Criteria andWatcheduserlistLessThanOrEqualTo(String value) {
            addCriterion("WatchedUserList <=", value, "watcheduserlist");
            return (Criteria) this;
        }

        public Criteria andWatcheduserlistLike(String value) {
            addCriterion("WatchedUserList like", value, "watcheduserlist");
            return (Criteria) this;
        }

        public Criteria andWatcheduserlistNotLike(String value) {
            addCriterion("WatchedUserList not like", value, "watcheduserlist");
            return (Criteria) this;
        }

        public Criteria andWatcheduserlistIn(List<String> values) {
            addCriterion("WatchedUserList in", values, "watcheduserlist");
            return (Criteria) this;
        }

        public Criteria andWatcheduserlistNotIn(List<String> values) {
            addCriterion("WatchedUserList not in", values, "watcheduserlist");
            return (Criteria) this;
        }

        public Criteria andWatcheduserlistBetween(String value1, String value2) {
            addCriterion("WatchedUserList between", value1, value2, "watcheduserlist");
            return (Criteria) this;
        }

        public Criteria andWatcheduserlistNotBetween(String value1, String value2) {
            addCriterion("WatchedUserList not between", value1, value2, "watcheduserlist");
            return (Criteria) this;
        }

        public Criteria andResponsetimeIsNull() {
            addCriterion("ResponseTime is null");
            return (Criteria) this;
        }

        public Criteria andResponsetimeIsNotNull() {
            addCriterion("ResponseTime is not null");
            return (Criteria) this;
        }

        public Criteria andResponsetimeEqualTo(Date value) {
            addCriterion("ResponseTime =", value, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeNotEqualTo(Date value) {
            addCriterion("ResponseTime <>", value, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeGreaterThan(Date value) {
            addCriterion("ResponseTime >", value, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ResponseTime >=", value, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeLessThan(Date value) {
            addCriterion("ResponseTime <", value, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeLessThanOrEqualTo(Date value) {
            addCriterion("ResponseTime <=", value, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeIn(List<Date> values) {
            addCriterion("ResponseTime in", values, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeNotIn(List<Date> values) {
            addCriterion("ResponseTime not in", values, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeBetween(Date value1, Date value2) {
            addCriterion("ResponseTime between", value1, value2, "responsetime");
            return (Criteria) this;
        }

        public Criteria andResponsetimeNotBetween(Date value1, Date value2) {
            addCriterion("ResponseTime not between", value1, value2, "responsetime");
            return (Criteria) this;
        }

        public Criteria andSolvedtimeIsNull() {
            addCriterion("SolvedTime is null");
            return (Criteria) this;
        }

        public Criteria andSolvedtimeIsNotNull() {
            addCriterion("SolvedTime is not null");
            return (Criteria) this;
        }

        public Criteria andSolvedtimeEqualTo(Date value) {
            addCriterion("SolvedTime =", value, "solvedtime");
            return (Criteria) this;
        }

        public Criteria andSolvedtimeNotEqualTo(Date value) {
            addCriterion("SolvedTime <>", value, "solvedtime");
            return (Criteria) this;
        }

        public Criteria andSolvedtimeGreaterThan(Date value) {
            addCriterion("SolvedTime >", value, "solvedtime");
            return (Criteria) this;
        }

        public Criteria andSolvedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SolvedTime >=", value, "solvedtime");
            return (Criteria) this;
        }

        public Criteria andSolvedtimeLessThan(Date value) {
            addCriterion("SolvedTime <", value, "solvedtime");
            return (Criteria) this;
        }

        public Criteria andSolvedtimeLessThanOrEqualTo(Date value) {
            addCriterion("SolvedTime <=", value, "solvedtime");
            return (Criteria) this;
        }

        public Criteria andSolvedtimeIn(List<Date> values) {
            addCriterion("SolvedTime in", values, "solvedtime");
            return (Criteria) this;
        }

        public Criteria andSolvedtimeNotIn(List<Date> values) {
            addCriterion("SolvedTime not in", values, "solvedtime");
            return (Criteria) this;
        }

        public Criteria andSolvedtimeBetween(Date value1, Date value2) {
            addCriterion("SolvedTime between", value1, value2, "solvedtime");
            return (Criteria) this;
        }

        public Criteria andSolvedtimeNotBetween(Date value1, Date value2) {
            addCriterion("SolvedTime not between", value1, value2, "solvedtime");
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