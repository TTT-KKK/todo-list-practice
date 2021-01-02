package com.example.domain.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Long value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Long value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Long value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Long value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Long> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Long> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Long value1, Long value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("task_name >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("task_name <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskEndAtIsNull() {
            addCriterion("task_end_at is null");
            return (Criteria) this;
        }

        public Criteria andTaskEndAtIsNotNull() {
            addCriterion("task_end_at is not null");
            return (Criteria) this;
        }

        public Criteria andTaskEndAtEqualTo(Date value) {
            addCriterion("task_end_at =", value, "taskEndAt");
            return (Criteria) this;
        }

        public Criteria andTaskEndAtNotEqualTo(Date value) {
            addCriterion("task_end_at <>", value, "taskEndAt");
            return (Criteria) this;
        }

        public Criteria andTaskEndAtGreaterThan(Date value) {
            addCriterion("task_end_at >", value, "taskEndAt");
            return (Criteria) this;
        }

        public Criteria andTaskEndAtGreaterThanOrEqualTo(Date value) {
            addCriterion("task_end_at >=", value, "taskEndAt");
            return (Criteria) this;
        }

        public Criteria andTaskEndAtLessThan(Date value) {
            addCriterion("task_end_at <", value, "taskEndAt");
            return (Criteria) this;
        }

        public Criteria andTaskEndAtLessThanOrEqualTo(Date value) {
            addCriterion("task_end_at <=", value, "taskEndAt");
            return (Criteria) this;
        }

        public Criteria andTaskEndAtIn(List<Date> values) {
            addCriterion("task_end_at in", values, "taskEndAt");
            return (Criteria) this;
        }

        public Criteria andTaskEndAtNotIn(List<Date> values) {
            addCriterion("task_end_at not in", values, "taskEndAt");
            return (Criteria) this;
        }

        public Criteria andTaskEndAtBetween(Date value1, Date value2) {
            addCriterion("task_end_at between", value1, value2, "taskEndAt");
            return (Criteria) this;
        }

        public Criteria andTaskEndAtNotBetween(Date value1, Date value2) {
            addCriterion("task_end_at not between", value1, value2, "taskEndAt");
            return (Criteria) this;
        }

        public Criteria andTaskMemoIsNull() {
            addCriterion("task_memo is null");
            return (Criteria) this;
        }

        public Criteria andTaskMemoIsNotNull() {
            addCriterion("task_memo is not null");
            return (Criteria) this;
        }

        public Criteria andTaskMemoEqualTo(String value) {
            addCriterion("task_memo =", value, "taskMemo");
            return (Criteria) this;
        }

        public Criteria andTaskMemoNotEqualTo(String value) {
            addCriterion("task_memo <>", value, "taskMemo");
            return (Criteria) this;
        }

        public Criteria andTaskMemoGreaterThan(String value) {
            addCriterion("task_memo >", value, "taskMemo");
            return (Criteria) this;
        }

        public Criteria andTaskMemoGreaterThanOrEqualTo(String value) {
            addCriterion("task_memo >=", value, "taskMemo");
            return (Criteria) this;
        }

        public Criteria andTaskMemoLessThan(String value) {
            addCriterion("task_memo <", value, "taskMemo");
            return (Criteria) this;
        }

        public Criteria andTaskMemoLessThanOrEqualTo(String value) {
            addCriterion("task_memo <=", value, "taskMemo");
            return (Criteria) this;
        }

        public Criteria andTaskMemoLike(String value) {
            addCriterion("task_memo like", value, "taskMemo");
            return (Criteria) this;
        }

        public Criteria andTaskMemoNotLike(String value) {
            addCriterion("task_memo not like", value, "taskMemo");
            return (Criteria) this;
        }

        public Criteria andTaskMemoIn(List<String> values) {
            addCriterion("task_memo in", values, "taskMemo");
            return (Criteria) this;
        }

        public Criteria andTaskMemoNotIn(List<String> values) {
            addCriterion("task_memo not in", values, "taskMemo");
            return (Criteria) this;
        }

        public Criteria andTaskMemoBetween(String value1, String value2) {
            addCriterion("task_memo between", value1, value2, "taskMemo");
            return (Criteria) this;
        }

        public Criteria andTaskMemoNotBetween(String value1, String value2) {
            addCriterion("task_memo not between", value1, value2, "taskMemo");
            return (Criteria) this;
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

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("updated_by like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("updated_by not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
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

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andIsDoneIsNull() {
            addCriterion("is_done is null");
            return (Criteria) this;
        }

        public Criteria andIsDoneIsNotNull() {
            addCriterion("is_done is not null");
            return (Criteria) this;
        }

        public Criteria andIsDoneEqualTo(Byte value) {
            addCriterion("is_done =", value, "isDone");
            return (Criteria) this;
        }

        public Criteria andIsDoneNotEqualTo(Byte value) {
            addCriterion("is_done <>", value, "isDone");
            return (Criteria) this;
        }

        public Criteria andIsDoneGreaterThan(Byte value) {
            addCriterion("is_done >", value, "isDone");
            return (Criteria) this;
        }

        public Criteria andIsDoneGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_done >=", value, "isDone");
            return (Criteria) this;
        }

        public Criteria andIsDoneLessThan(Byte value) {
            addCriterion("is_done <", value, "isDone");
            return (Criteria) this;
        }

        public Criteria andIsDoneLessThanOrEqualTo(Byte value) {
            addCriterion("is_done <=", value, "isDone");
            return (Criteria) this;
        }

        public Criteria andIsDoneIn(List<Byte> values) {
            addCriterion("is_done in", values, "isDone");
            return (Criteria) this;
        }

        public Criteria andIsDoneNotIn(List<Byte> values) {
            addCriterion("is_done not in", values, "isDone");
            return (Criteria) this;
        }

        public Criteria andIsDoneBetween(Byte value1, Byte value2) {
            addCriterion("is_done between", value1, value2, "isDone");
            return (Criteria) this;
        }

        public Criteria andIsDoneNotBetween(Byte value1, Byte value2) {
            addCriterion("is_done not between", value1, value2, "isDone");
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