package com.example.domain.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andUserLastNameIsNull() {
            addCriterion("user_last_name is null");
            return (Criteria) this;
        }

        public Criteria andUserLastNameIsNotNull() {
            addCriterion("user_last_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserLastNameEqualTo(String value) {
            addCriterion("user_last_name =", value, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameNotEqualTo(String value) {
            addCriterion("user_last_name <>", value, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameGreaterThan(String value) {
            addCriterion("user_last_name >", value, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_last_name >=", value, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameLessThan(String value) {
            addCriterion("user_last_name <", value, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameLessThanOrEqualTo(String value) {
            addCriterion("user_last_name <=", value, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameLike(String value) {
            addCriterion("user_last_name like", value, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameNotLike(String value) {
            addCriterion("user_last_name not like", value, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameIn(List<String> values) {
            addCriterion("user_last_name in", values, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameNotIn(List<String> values) {
            addCriterion("user_last_name not in", values, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameBetween(String value1, String value2) {
            addCriterion("user_last_name between", value1, value2, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserLastNameNotBetween(String value1, String value2) {
            addCriterion("user_last_name not between", value1, value2, "userLastName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameIsNull() {
            addCriterion("user_first_name is null");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameIsNotNull() {
            addCriterion("user_first_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameEqualTo(String value) {
            addCriterion("user_first_name =", value, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameNotEqualTo(String value) {
            addCriterion("user_first_name <>", value, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameGreaterThan(String value) {
            addCriterion("user_first_name >", value, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_first_name >=", value, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameLessThan(String value) {
            addCriterion("user_first_name <", value, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameLessThanOrEqualTo(String value) {
            addCriterion("user_first_name <=", value, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameLike(String value) {
            addCriterion("user_first_name like", value, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameNotLike(String value) {
            addCriterion("user_first_name not like", value, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameIn(List<String> values) {
            addCriterion("user_first_name in", values, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameNotIn(List<String> values) {
            addCriterion("user_first_name not in", values, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameBetween(String value1, String value2) {
            addCriterion("user_first_name between", value1, value2, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserFirstNameNotBetween(String value1, String value2) {
            addCriterion("user_first_name not between", value1, value2, "userFirstName");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressIsNull() {
            addCriterion("user_mailaddress is null");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressIsNotNull() {
            addCriterion("user_mailaddress is not null");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressEqualTo(String value) {
            addCriterion("user_mailaddress =", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressNotEqualTo(String value) {
            addCriterion("user_mailaddress <>", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressGreaterThan(String value) {
            addCriterion("user_mailaddress >", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_mailaddress >=", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressLessThan(String value) {
            addCriterion("user_mailaddress <", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressLessThanOrEqualTo(String value) {
            addCriterion("user_mailaddress <=", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressLike(String value) {
            addCriterion("user_mailaddress like", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressNotLike(String value) {
            addCriterion("user_mailaddress not like", value, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressIn(List<String> values) {
            addCriterion("user_mailaddress in", values, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressNotIn(List<String> values) {
            addCriterion("user_mailaddress not in", values, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressBetween(String value1, String value2) {
            addCriterion("user_mailaddress between", value1, value2, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andUserMailaddressNotBetween(String value1, String value2) {
            addCriterion("user_mailaddress not between", value1, value2, "userMailaddress");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andIsAdminIsNull() {
            addCriterion("is_admin is null");
            return (Criteria) this;
        }

        public Criteria andIsAdminIsNotNull() {
            addCriterion("is_admin is not null");
            return (Criteria) this;
        }

        public Criteria andIsAdminEqualTo(Byte value) {
            addCriterion("is_admin =", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotEqualTo(Byte value) {
            addCriterion("is_admin <>", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThan(Byte value) {
            addCriterion("is_admin >", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_admin >=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThan(Byte value) {
            addCriterion("is_admin <", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminLessThanOrEqualTo(Byte value) {
            addCriterion("is_admin <=", value, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminIn(List<Byte> values) {
            addCriterion("is_admin in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotIn(List<Byte> values) {
            addCriterion("is_admin not in", values, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminBetween(Byte value1, Byte value2) {
            addCriterion("is_admin between", value1, value2, "isAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAdminNotBetween(Byte value1, Byte value2) {
            addCriterion("is_admin not between", value1, value2, "isAdmin");
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