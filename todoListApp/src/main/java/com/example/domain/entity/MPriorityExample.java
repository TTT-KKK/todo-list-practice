package com.example.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class MPriorityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MPriorityExample() {
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

        public Criteria andPriorityIdIsNull() {
            addCriterion("priority_id is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIdIsNotNull() {
            addCriterion("priority_id is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityIdEqualTo(Integer value) {
            addCriterion("priority_id =", value, "priorityId");
            return (Criteria) this;
        }

        public Criteria andPriorityIdNotEqualTo(Integer value) {
            addCriterion("priority_id <>", value, "priorityId");
            return (Criteria) this;
        }

        public Criteria andPriorityIdGreaterThan(Integer value) {
            addCriterion("priority_id >", value, "priorityId");
            return (Criteria) this;
        }

        public Criteria andPriorityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority_id >=", value, "priorityId");
            return (Criteria) this;
        }

        public Criteria andPriorityIdLessThan(Integer value) {
            addCriterion("priority_id <", value, "priorityId");
            return (Criteria) this;
        }

        public Criteria andPriorityIdLessThanOrEqualTo(Integer value) {
            addCriterion("priority_id <=", value, "priorityId");
            return (Criteria) this;
        }

        public Criteria andPriorityIdIn(List<Integer> values) {
            addCriterion("priority_id in", values, "priorityId");
            return (Criteria) this;
        }

        public Criteria andPriorityIdNotIn(List<Integer> values) {
            addCriterion("priority_id not in", values, "priorityId");
            return (Criteria) this;
        }

        public Criteria andPriorityIdBetween(Integer value1, Integer value2) {
            addCriterion("priority_id between", value1, value2, "priorityId");
            return (Criteria) this;
        }

        public Criteria andPriorityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("priority_id not between", value1, value2, "priorityId");
            return (Criteria) this;
        }

        public Criteria andPriorityNameIsNull() {
            addCriterion("priority_name is null");
            return (Criteria) this;
        }

        public Criteria andPriorityNameIsNotNull() {
            addCriterion("priority_name is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityNameEqualTo(String value) {
            addCriterion("priority_name =", value, "priorityName");
            return (Criteria) this;
        }

        public Criteria andPriorityNameNotEqualTo(String value) {
            addCriterion("priority_name <>", value, "priorityName");
            return (Criteria) this;
        }

        public Criteria andPriorityNameGreaterThan(String value) {
            addCriterion("priority_name >", value, "priorityName");
            return (Criteria) this;
        }

        public Criteria andPriorityNameGreaterThanOrEqualTo(String value) {
            addCriterion("priority_name >=", value, "priorityName");
            return (Criteria) this;
        }

        public Criteria andPriorityNameLessThan(String value) {
            addCriterion("priority_name <", value, "priorityName");
            return (Criteria) this;
        }

        public Criteria andPriorityNameLessThanOrEqualTo(String value) {
            addCriterion("priority_name <=", value, "priorityName");
            return (Criteria) this;
        }

        public Criteria andPriorityNameLike(String value) {
            addCriterion("priority_name like", value, "priorityName");
            return (Criteria) this;
        }

        public Criteria andPriorityNameNotLike(String value) {
            addCriterion("priority_name not like", value, "priorityName");
            return (Criteria) this;
        }

        public Criteria andPriorityNameIn(List<String> values) {
            addCriterion("priority_name in", values, "priorityName");
            return (Criteria) this;
        }

        public Criteria andPriorityNameNotIn(List<String> values) {
            addCriterion("priority_name not in", values, "priorityName");
            return (Criteria) this;
        }

        public Criteria andPriorityNameBetween(String value1, String value2) {
            addCriterion("priority_name between", value1, value2, "priorityName");
            return (Criteria) this;
        }

        public Criteria andPriorityNameNotBetween(String value1, String value2) {
            addCriterion("priority_name not between", value1, value2, "priorityName");
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