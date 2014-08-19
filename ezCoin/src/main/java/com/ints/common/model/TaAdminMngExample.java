package com.ints.common.model;

import java.util.ArrayList;
import java.util.List;

public class TaAdminMngExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table TA_ADMIN_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table TA_ADMIN_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table TA_ADMIN_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_ADMIN_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public TaAdminMngExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_ADMIN_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_ADMIN_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_ADMIN_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_ADMIN_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_ADMIN_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_ADMIN_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_ADMIN_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_ADMIN_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_ADMIN_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_ADMIN_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table TA_ADMIN_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andAdminMngIdxIsNull() {
			addCriterion("admin_mng_idx is null");
			return (Criteria) this;
		}

		public Criteria andAdminMngIdxIsNotNull() {
			addCriterion("admin_mng_idx is not null");
			return (Criteria) this;
		}

		public Criteria andAdminMngIdxEqualTo(Integer value) {
			addCriterion("admin_mng_idx =", value, "adminMngIdx");
			return (Criteria) this;
		}

		public Criteria andAdminMngIdxNotEqualTo(Integer value) {
			addCriterion("admin_mng_idx <>", value, "adminMngIdx");
			return (Criteria) this;
		}

		public Criteria andAdminMngIdxGreaterThan(Integer value) {
			addCriterion("admin_mng_idx >", value, "adminMngIdx");
			return (Criteria) this;
		}

		public Criteria andAdminMngIdxGreaterThanOrEqualTo(Integer value) {
			addCriterion("admin_mng_idx >=", value, "adminMngIdx");
			return (Criteria) this;
		}

		public Criteria andAdminMngIdxLessThan(Integer value) {
			addCriterion("admin_mng_idx <", value, "adminMngIdx");
			return (Criteria) this;
		}

		public Criteria andAdminMngIdxLessThanOrEqualTo(Integer value) {
			addCriterion("admin_mng_idx <=", value, "adminMngIdx");
			return (Criteria) this;
		}

		public Criteria andAdminMngIdxIn(List<Integer> values) {
			addCriterion("admin_mng_idx in", values, "adminMngIdx");
			return (Criteria) this;
		}

		public Criteria andAdminMngIdxNotIn(List<Integer> values) {
			addCriterion("admin_mng_idx not in", values, "adminMngIdx");
			return (Criteria) this;
		}

		public Criteria andAdminMngIdxBetween(Integer value1, Integer value2) {
			addCriterion("admin_mng_idx between", value1, value2, "adminMngIdx");
			return (Criteria) this;
		}

		public Criteria andAdminMngIdxNotBetween(Integer value1, Integer value2) {
			addCriterion("admin_mng_idx not between", value1, value2,
					"adminMngIdx");
			return (Criteria) this;
		}

		public Criteria andAdminIdIsNull() {
			addCriterion("admin_id is null");
			return (Criteria) this;
		}

		public Criteria andAdminIdIsNotNull() {
			addCriterion("admin_id is not null");
			return (Criteria) this;
		}

		public Criteria andAdminIdEqualTo(String value) {
			addCriterion("admin_id =", value, "adminId");
			return (Criteria) this;
		}

		public Criteria andAdminIdNotEqualTo(String value) {
			addCriterion("admin_id <>", value, "adminId");
			return (Criteria) this;
		}

		public Criteria andAdminIdGreaterThan(String value) {
			addCriterion("admin_id >", value, "adminId");
			return (Criteria) this;
		}

		public Criteria andAdminIdGreaterThanOrEqualTo(String value) {
			addCriterion("admin_id >=", value, "adminId");
			return (Criteria) this;
		}

		public Criteria andAdminIdLessThan(String value) {
			addCriterion("admin_id <", value, "adminId");
			return (Criteria) this;
		}

		public Criteria andAdminIdLessThanOrEqualTo(String value) {
			addCriterion("admin_id <=", value, "adminId");
			return (Criteria) this;
		}

		public Criteria andAdminIdLike(String value) {
			addCriterion("admin_id like", value, "adminId");
			return (Criteria) this;
		}

		public Criteria andAdminIdNotLike(String value) {
			addCriterion("admin_id not like", value, "adminId");
			return (Criteria) this;
		}

		public Criteria andAdminIdIn(List<String> values) {
			addCriterion("admin_id in", values, "adminId");
			return (Criteria) this;
		}

		public Criteria andAdminIdNotIn(List<String> values) {
			addCriterion("admin_id not in", values, "adminId");
			return (Criteria) this;
		}

		public Criteria andAdminIdBetween(String value1, String value2) {
			addCriterion("admin_id between", value1, value2, "adminId");
			return (Criteria) this;
		}

		public Criteria andAdminIdNotBetween(String value1, String value2) {
			addCriterion("admin_id not between", value1, value2, "adminId");
			return (Criteria) this;
		}

		public Criteria andAdminNameIsNull() {
			addCriterion("admin_name is null");
			return (Criteria) this;
		}

		public Criteria andAdminNameIsNotNull() {
			addCriterion("admin_name is not null");
			return (Criteria) this;
		}

		public Criteria andAdminNameEqualTo(String value) {
			addCriterion("admin_name =", value, "adminName");
			return (Criteria) this;
		}

		public Criteria andAdminNameNotEqualTo(String value) {
			addCriterion("admin_name <>", value, "adminName");
			return (Criteria) this;
		}

		public Criteria andAdminNameGreaterThan(String value) {
			addCriterion("admin_name >", value, "adminName");
			return (Criteria) this;
		}

		public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
			addCriterion("admin_name >=", value, "adminName");
			return (Criteria) this;
		}

		public Criteria andAdminNameLessThan(String value) {
			addCriterion("admin_name <", value, "adminName");
			return (Criteria) this;
		}

		public Criteria andAdminNameLessThanOrEqualTo(String value) {
			addCriterion("admin_name <=", value, "adminName");
			return (Criteria) this;
		}

		public Criteria andAdminNameLike(String value) {
			addCriterion("admin_name like", value, "adminName");
			return (Criteria) this;
		}

		public Criteria andAdminNameNotLike(String value) {
			addCriterion("admin_name not like", value, "adminName");
			return (Criteria) this;
		}

		public Criteria andAdminNameIn(List<String> values) {
			addCriterion("admin_name in", values, "adminName");
			return (Criteria) this;
		}

		public Criteria andAdminNameNotIn(List<String> values) {
			addCriterion("admin_name not in", values, "adminName");
			return (Criteria) this;
		}

		public Criteria andAdminNameBetween(String value1, String value2) {
			addCriterion("admin_name between", value1, value2, "adminName");
			return (Criteria) this;
		}

		public Criteria andAdminNameNotBetween(String value1, String value2) {
			addCriterion("admin_name not between", value1, value2, "adminName");
			return (Criteria) this;
		}

		public Criteria andAdminPassIsNull() {
			addCriterion("admin_pass is null");
			return (Criteria) this;
		}

		public Criteria andAdminPassIsNotNull() {
			addCriterion("admin_pass is not null");
			return (Criteria) this;
		}

		public Criteria andAdminPassEqualTo(String value) {
			addCriterion("admin_pass =", value, "adminPass");
			return (Criteria) this;
		}

		public Criteria andAdminPassNotEqualTo(String value) {
			addCriterion("admin_pass <>", value, "adminPass");
			return (Criteria) this;
		}

		public Criteria andAdminPassGreaterThan(String value) {
			addCriterion("admin_pass >", value, "adminPass");
			return (Criteria) this;
		}

		public Criteria andAdminPassGreaterThanOrEqualTo(String value) {
			addCriterion("admin_pass >=", value, "adminPass");
			return (Criteria) this;
		}

		public Criteria andAdminPassLessThan(String value) {
			addCriterion("admin_pass <", value, "adminPass");
			return (Criteria) this;
		}

		public Criteria andAdminPassLessThanOrEqualTo(String value) {
			addCriterion("admin_pass <=", value, "adminPass");
			return (Criteria) this;
		}

		public Criteria andAdminPassLike(String value) {
			addCriterion("admin_pass like", value, "adminPass");
			return (Criteria) this;
		}

		public Criteria andAdminPassNotLike(String value) {
			addCriterion("admin_pass not like", value, "adminPass");
			return (Criteria) this;
		}

		public Criteria andAdminPassIn(List<String> values) {
			addCriterion("admin_pass in", values, "adminPass");
			return (Criteria) this;
		}

		public Criteria andAdminPassNotIn(List<String> values) {
			addCriterion("admin_pass not in", values, "adminPass");
			return (Criteria) this;
		}

		public Criteria andAdminPassBetween(String value1, String value2) {
			addCriterion("admin_pass between", value1, value2, "adminPass");
			return (Criteria) this;
		}

		public Criteria andAdminPassNotBetween(String value1, String value2) {
			addCriterion("admin_pass not between", value1, value2, "adminPass");
			return (Criteria) this;
		}

		public Criteria andAdminAuthIsNull() {
			addCriterion("admin_auth is null");
			return (Criteria) this;
		}

		public Criteria andAdminAuthIsNotNull() {
			addCriterion("admin_auth is not null");
			return (Criteria) this;
		}

		public Criteria andAdminAuthEqualTo(String value) {
			addCriterion("admin_auth =", value, "adminAuth");
			return (Criteria) this;
		}

		public Criteria andAdminAuthNotEqualTo(String value) {
			addCriterion("admin_auth <>", value, "adminAuth");
			return (Criteria) this;
		}

		public Criteria andAdminAuthGreaterThan(String value) {
			addCriterion("admin_auth >", value, "adminAuth");
			return (Criteria) this;
		}

		public Criteria andAdminAuthGreaterThanOrEqualTo(String value) {
			addCriterion("admin_auth >=", value, "adminAuth");
			return (Criteria) this;
		}

		public Criteria andAdminAuthLessThan(String value) {
			addCriterion("admin_auth <", value, "adminAuth");
			return (Criteria) this;
		}

		public Criteria andAdminAuthLessThanOrEqualTo(String value) {
			addCriterion("admin_auth <=", value, "adminAuth");
			return (Criteria) this;
		}

		public Criteria andAdminAuthLike(String value) {
			addCriterion("admin_auth like", value, "adminAuth");
			return (Criteria) this;
		}

		public Criteria andAdminAuthNotLike(String value) {
			addCriterion("admin_auth not like", value, "adminAuth");
			return (Criteria) this;
		}

		public Criteria andAdminAuthIn(List<String> values) {
			addCriterion("admin_auth in", values, "adminAuth");
			return (Criteria) this;
		}

		public Criteria andAdminAuthNotIn(List<String> values) {
			addCriterion("admin_auth not in", values, "adminAuth");
			return (Criteria) this;
		}

		public Criteria andAdminAuthBetween(String value1, String value2) {
			addCriterion("admin_auth between", value1, value2, "adminAuth");
			return (Criteria) this;
		}

		public Criteria andAdminAuthNotBetween(String value1, String value2) {
			addCriterion("admin_auth not between", value1, value2, "adminAuth");
			return (Criteria) this;
		}

		public Criteria andAdminDeptIsNull() {
			addCriterion("admin_dept is null");
			return (Criteria) this;
		}

		public Criteria andAdminDeptIsNotNull() {
			addCriterion("admin_dept is not null");
			return (Criteria) this;
		}

		public Criteria andAdminDeptEqualTo(String value) {
			addCriterion("admin_dept =", value, "adminDept");
			return (Criteria) this;
		}

		public Criteria andAdminDeptNotEqualTo(String value) {
			addCriterion("admin_dept <>", value, "adminDept");
			return (Criteria) this;
		}

		public Criteria andAdminDeptGreaterThan(String value) {
			addCriterion("admin_dept >", value, "adminDept");
			return (Criteria) this;
		}

		public Criteria andAdminDeptGreaterThanOrEqualTo(String value) {
			addCriterion("admin_dept >=", value, "adminDept");
			return (Criteria) this;
		}

		public Criteria andAdminDeptLessThan(String value) {
			addCriterion("admin_dept <", value, "adminDept");
			return (Criteria) this;
		}

		public Criteria andAdminDeptLessThanOrEqualTo(String value) {
			addCriterion("admin_dept <=", value, "adminDept");
			return (Criteria) this;
		}

		public Criteria andAdminDeptLike(String value) {
			addCriterion("admin_dept like", value, "adminDept");
			return (Criteria) this;
		}

		public Criteria andAdminDeptNotLike(String value) {
			addCriterion("admin_dept not like", value, "adminDept");
			return (Criteria) this;
		}

		public Criteria andAdminDeptIn(List<String> values) {
			addCriterion("admin_dept in", values, "adminDept");
			return (Criteria) this;
		}

		public Criteria andAdminDeptNotIn(List<String> values) {
			addCriterion("admin_dept not in", values, "adminDept");
			return (Criteria) this;
		}

		public Criteria andAdminDeptBetween(String value1, String value2) {
			addCriterion("admin_dept between", value1, value2, "adminDept");
			return (Criteria) this;
		}

		public Criteria andAdminDeptNotBetween(String value1, String value2) {
			addCriterion("admin_dept not between", value1, value2, "adminDept");
			return (Criteria) this;
		}

		public Criteria andAdminTitleIsNull() {
			addCriterion("admin_title is null");
			return (Criteria) this;
		}

		public Criteria andAdminTitleIsNotNull() {
			addCriterion("admin_title is not null");
			return (Criteria) this;
		}

		public Criteria andAdminTitleEqualTo(String value) {
			addCriterion("admin_title =", value, "adminTitle");
			return (Criteria) this;
		}

		public Criteria andAdminTitleNotEqualTo(String value) {
			addCriterion("admin_title <>", value, "adminTitle");
			return (Criteria) this;
		}

		public Criteria andAdminTitleGreaterThan(String value) {
			addCriterion("admin_title >", value, "adminTitle");
			return (Criteria) this;
		}

		public Criteria andAdminTitleGreaterThanOrEqualTo(String value) {
			addCriterion("admin_title >=", value, "adminTitle");
			return (Criteria) this;
		}

		public Criteria andAdminTitleLessThan(String value) {
			addCriterion("admin_title <", value, "adminTitle");
			return (Criteria) this;
		}

		public Criteria andAdminTitleLessThanOrEqualTo(String value) {
			addCriterion("admin_title <=", value, "adminTitle");
			return (Criteria) this;
		}

		public Criteria andAdminTitleLike(String value) {
			addCriterion("admin_title like", value, "adminTitle");
			return (Criteria) this;
		}

		public Criteria andAdminTitleNotLike(String value) {
			addCriterion("admin_title not like", value, "adminTitle");
			return (Criteria) this;
		}

		public Criteria andAdminTitleIn(List<String> values) {
			addCriterion("admin_title in", values, "adminTitle");
			return (Criteria) this;
		}

		public Criteria andAdminTitleNotIn(List<String> values) {
			addCriterion("admin_title not in", values, "adminTitle");
			return (Criteria) this;
		}

		public Criteria andAdminTitleBetween(String value1, String value2) {
			addCriterion("admin_title between", value1, value2, "adminTitle");
			return (Criteria) this;
		}

		public Criteria andAdminTitleNotBetween(String value1, String value2) {
			addCriterion("admin_title not between", value1, value2,
					"adminTitle");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table TA_ADMIN_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TA_ADMIN_MNG
     *
     * @mbggenerated do_not_delete_during_merge Thu Jul 10 18:47:41 KST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}