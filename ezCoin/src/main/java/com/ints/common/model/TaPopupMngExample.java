package com.ints.common.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TaPopupMngExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table TA_POPUP_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table TA_POPUP_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table TA_POPUP_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_POPUP_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public TaPopupMngExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_POPUP_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_POPUP_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_POPUP_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_POPUP_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_POPUP_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_POPUP_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_POPUP_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_POPUP_MNG
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_POPUP_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_POPUP_MNG
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table TA_POPUP_MNG
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

		public Criteria andPopupMngIdxIsNull() {
			addCriterion("popup_mng_idx is null");
			return (Criteria) this;
		}

		public Criteria andPopupMngIdxIsNotNull() {
			addCriterion("popup_mng_idx is not null");
			return (Criteria) this;
		}

		public Criteria andPopupMngIdxEqualTo(Integer value) {
			addCriterion("popup_mng_idx =", value, "popupMngIdx");
			return (Criteria) this;
		}

		public Criteria andPopupMngIdxNotEqualTo(Integer value) {
			addCriterion("popup_mng_idx <>", value, "popupMngIdx");
			return (Criteria) this;
		}

		public Criteria andPopupMngIdxGreaterThan(Integer value) {
			addCriterion("popup_mng_idx >", value, "popupMngIdx");
			return (Criteria) this;
		}

		public Criteria andPopupMngIdxGreaterThanOrEqualTo(Integer value) {
			addCriterion("popup_mng_idx >=", value, "popupMngIdx");
			return (Criteria) this;
		}

		public Criteria andPopupMngIdxLessThan(Integer value) {
			addCriterion("popup_mng_idx <", value, "popupMngIdx");
			return (Criteria) this;
		}

		public Criteria andPopupMngIdxLessThanOrEqualTo(Integer value) {
			addCriterion("popup_mng_idx <=", value, "popupMngIdx");
			return (Criteria) this;
		}

		public Criteria andPopupMngIdxIn(List<Integer> values) {
			addCriterion("popup_mng_idx in", values, "popupMngIdx");
			return (Criteria) this;
		}

		public Criteria andPopupMngIdxNotIn(List<Integer> values) {
			addCriterion("popup_mng_idx not in", values, "popupMngIdx");
			return (Criteria) this;
		}

		public Criteria andPopupMngIdxBetween(Integer value1, Integer value2) {
			addCriterion("popup_mng_idx between", value1, value2, "popupMngIdx");
			return (Criteria) this;
		}

		public Criteria andPopupMngIdxNotBetween(Integer value1, Integer value2) {
			addCriterion("popup_mng_idx not between", value1, value2,
					"popupMngIdx");
			return (Criteria) this;
		}

		public Criteria andSubjectIsNull() {
			addCriterion("subject is null");
			return (Criteria) this;
		}

		public Criteria andSubjectIsNotNull() {
			addCriterion("subject is not null");
			return (Criteria) this;
		}

		public Criteria andSubjectEqualTo(String value) {
			addCriterion("subject =", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectNotEqualTo(String value) {
			addCriterion("subject <>", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectGreaterThan(String value) {
			addCriterion("subject >", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectGreaterThanOrEqualTo(String value) {
			addCriterion("subject >=", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectLessThan(String value) {
			addCriterion("subject <", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectLessThanOrEqualTo(String value) {
			addCriterion("subject <=", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectLike(String value) {
			addCriterion("subject like", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectNotLike(String value) {
			addCriterion("subject not like", value, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectIn(List<String> values) {
			addCriterion("subject in", values, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectNotIn(List<String> values) {
			addCriterion("subject not in", values, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectBetween(String value1, String value2) {
			addCriterion("subject between", value1, value2, "subject");
			return (Criteria) this;
		}

		public Criteria andSubjectNotBetween(String value1, String value2) {
			addCriterion("subject not between", value1, value2, "subject");
			return (Criteria) this;
		}

		public Criteria andWinDatePopIsNull() {
			addCriterion("win_date_pop is null");
			return (Criteria) this;
		}

		public Criteria andWinDatePopIsNotNull() {
			addCriterion("win_date_pop is not null");
			return (Criteria) this;
		}

		public Criteria andWinDatePopEqualTo(String value) {
			addCriterion("win_date_pop =", value, "winDatePop");
			return (Criteria) this;
		}

		public Criteria andWinDatePopNotEqualTo(String value) {
			addCriterion("win_date_pop <>", value, "winDatePop");
			return (Criteria) this;
		}

		public Criteria andWinDatePopGreaterThan(String value) {
			addCriterion("win_date_pop >", value, "winDatePop");
			return (Criteria) this;
		}

		public Criteria andWinDatePopGreaterThanOrEqualTo(String value) {
			addCriterion("win_date_pop >=", value, "winDatePop");
			return (Criteria) this;
		}

		public Criteria andWinDatePopLessThan(String value) {
			addCriterion("win_date_pop <", value, "winDatePop");
			return (Criteria) this;
		}

		public Criteria andWinDatePopLessThanOrEqualTo(String value) {
			addCriterion("win_date_pop <=", value, "winDatePop");
			return (Criteria) this;
		}

		public Criteria andWinDatePopLike(String value) {
			addCriterion("win_date_pop like", value, "winDatePop");
			return (Criteria) this;
		}

		public Criteria andWinDatePopNotLike(String value) {
			addCriterion("win_date_pop not like", value, "winDatePop");
			return (Criteria) this;
		}

		public Criteria andWinDatePopIn(List<String> values) {
			addCriterion("win_date_pop in", values, "winDatePop");
			return (Criteria) this;
		}

		public Criteria andWinDatePopNotIn(List<String> values) {
			addCriterion("win_date_pop not in", values, "winDatePop");
			return (Criteria) this;
		}

		public Criteria andWinDatePopBetween(String value1, String value2) {
			addCriterion("win_date_pop between", value1, value2, "winDatePop");
			return (Criteria) this;
		}

		public Criteria andWinDatePopNotBetween(String value1, String value2) {
			addCriterion("win_date_pop not between", value1, value2,
					"winDatePop");
			return (Criteria) this;
		}

		public Criteria andUseIsIsNull() {
			addCriterion("use_is is null");
			return (Criteria) this;
		}

		public Criteria andUseIsIsNotNull() {
			addCriterion("use_is is not null");
			return (Criteria) this;
		}

		public Criteria andUseIsEqualTo(Integer value) {
			addCriterion("use_is =", value, "useIs");
			return (Criteria) this;
		}

		public Criteria andUseIsNotEqualTo(Integer value) {
			addCriterion("use_is <>", value, "useIs");
			return (Criteria) this;
		}

		public Criteria andUseIsGreaterThan(Integer value) {
			addCriterion("use_is >", value, "useIs");
			return (Criteria) this;
		}

		public Criteria andUseIsGreaterThanOrEqualTo(Integer value) {
			addCriterion("use_is >=", value, "useIs");
			return (Criteria) this;
		}

		public Criteria andUseIsLessThan(Integer value) {
			addCriterion("use_is <", value, "useIs");
			return (Criteria) this;
		}

		public Criteria andUseIsLessThanOrEqualTo(Integer value) {
			addCriterion("use_is <=", value, "useIs");
			return (Criteria) this;
		}

		public Criteria andUseIsIn(List<Integer> values) {
			addCriterion("use_is in", values, "useIs");
			return (Criteria) this;
		}

		public Criteria andUseIsNotIn(List<Integer> values) {
			addCriterion("use_is not in", values, "useIs");
			return (Criteria) this;
		}

		public Criteria andUseIsBetween(Integer value1, Integer value2) {
			addCriterion("use_is between", value1, value2, "useIs");
			return (Criteria) this;
		}

		public Criteria andUseIsNotBetween(Integer value1, Integer value2) {
			addCriterion("use_is not between", value1, value2, "useIs");
			return (Criteria) this;
		}

		public Criteria andStartDatePopIsNull() {
			addCriterion("start_date_pop is null");
			return (Criteria) this;
		}

		public Criteria andStartDatePopIsNotNull() {
			addCriterion("start_date_pop is not null");
			return (Criteria) this;
		}

		public Criteria andStartDatePopEqualTo(String value) {
			addCriterion("start_date_pop =", value, "startDatePop");
			return (Criteria) this;
		}

		public Criteria andStartDatePopNotEqualTo(String value) {
			addCriterion("start_date_pop <>", value, "startDatePop");
			return (Criteria) this;
		}

		public Criteria andStartDatePopGreaterThan(String value) {
			addCriterion("start_date_pop >", value, "startDatePop");
			return (Criteria) this;
		}

		public Criteria andStartDatePopGreaterThanOrEqualTo(String value) {
			addCriterion("start_date_pop >=", value, "startDatePop");
			return (Criteria) this;
		}

		public Criteria andStartDatePopLessThan(String value) {
			addCriterion("start_date_pop <", value, "startDatePop");
			return (Criteria) this;
		}

		public Criteria andStartDatePopLessThanOrEqualTo(String value) {
			addCriterion("start_date_pop <=", value, "startDatePop");
			return (Criteria) this;
		}

		public Criteria andStartDatePopLike(String value) {
			addCriterion("start_date_pop like", value, "startDatePop");
			return (Criteria) this;
		}

		public Criteria andStartDatePopNotLike(String value) {
			addCriterion("start_date_pop not like", value, "startDatePop");
			return (Criteria) this;
		}

		public Criteria andStartDatePopIn(List<String> values) {
			addCriterion("start_date_pop in", values, "startDatePop");
			return (Criteria) this;
		}

		public Criteria andStartDatePopNotIn(List<String> values) {
			addCriterion("start_date_pop not in", values, "startDatePop");
			return (Criteria) this;
		}

		public Criteria andStartDatePopBetween(String value1, String value2) {
			addCriterion("start_date_pop between", value1, value2,
					"startDatePop");
			return (Criteria) this;
		}

		public Criteria andStartDatePopNotBetween(String value1, String value2) {
			addCriterion("start_date_pop not between", value1, value2,
					"startDatePop");
			return (Criteria) this;
		}

		public Criteria andThumbIsNull() {
			addCriterion("thumb is null");
			return (Criteria) this;
		}

		public Criteria andThumbIsNotNull() {
			addCriterion("thumb is not null");
			return (Criteria) this;
		}

		public Criteria andThumbEqualTo(String value) {
			addCriterion("thumb =", value, "thumb");
			return (Criteria) this;
		}

		public Criteria andThumbNotEqualTo(String value) {
			addCriterion("thumb <>", value, "thumb");
			return (Criteria) this;
		}

		public Criteria andThumbGreaterThan(String value) {
			addCriterion("thumb >", value, "thumb");
			return (Criteria) this;
		}

		public Criteria andThumbGreaterThanOrEqualTo(String value) {
			addCriterion("thumb >=", value, "thumb");
			return (Criteria) this;
		}

		public Criteria andThumbLessThan(String value) {
			addCriterion("thumb <", value, "thumb");
			return (Criteria) this;
		}

		public Criteria andThumbLessThanOrEqualTo(String value) {
			addCriterion("thumb <=", value, "thumb");
			return (Criteria) this;
		}

		public Criteria andThumbLike(String value) {
			addCriterion("thumb like", value, "thumb");
			return (Criteria) this;
		}

		public Criteria andThumbNotLike(String value) {
			addCriterion("thumb not like", value, "thumb");
			return (Criteria) this;
		}

		public Criteria andThumbIn(List<String> values) {
			addCriterion("thumb in", values, "thumb");
			return (Criteria) this;
		}

		public Criteria andThumbNotIn(List<String> values) {
			addCriterion("thumb not in", values, "thumb");
			return (Criteria) this;
		}

		public Criteria andThumbBetween(String value1, String value2) {
			addCriterion("thumb between", value1, value2, "thumb");
			return (Criteria) this;
		}

		public Criteria andThumbNotBetween(String value1, String value2) {
			addCriterion("thumb not between", value1, value2, "thumb");
			return (Criteria) this;
		}

		public Criteria andEventPageExlinkIsNull() {
			addCriterion("event_page_exlink is null");
			return (Criteria) this;
		}

		public Criteria andEventPageExlinkIsNotNull() {
			addCriterion("event_page_exlink is not null");
			return (Criteria) this;
		}

		public Criteria andEventPageExlinkEqualTo(String value) {
			addCriterion("event_page_exlink =", value, "eventPageExlink");
			return (Criteria) this;
		}

		public Criteria andEventPageExlinkNotEqualTo(String value) {
			addCriterion("event_page_exlink <>", value, "eventPageExlink");
			return (Criteria) this;
		}

		public Criteria andEventPageExlinkGreaterThan(String value) {
			addCriterion("event_page_exlink >", value, "eventPageExlink");
			return (Criteria) this;
		}

		public Criteria andEventPageExlinkGreaterThanOrEqualTo(String value) {
			addCriterion("event_page_exlink >=", value, "eventPageExlink");
			return (Criteria) this;
		}

		public Criteria andEventPageExlinkLessThan(String value) {
			addCriterion("event_page_exlink <", value, "eventPageExlink");
			return (Criteria) this;
		}

		public Criteria andEventPageExlinkLessThanOrEqualTo(String value) {
			addCriterion("event_page_exlink <=", value, "eventPageExlink");
			return (Criteria) this;
		}

		public Criteria andEventPageExlinkLike(String value) {
			addCriterion("event_page_exlink like", value, "eventPageExlink");
			return (Criteria) this;
		}

		public Criteria andEventPageExlinkNotLike(String value) {
			addCriterion("event_page_exlink not like", value, "eventPageExlink");
			return (Criteria) this;
		}

		public Criteria andEventPageExlinkIn(List<String> values) {
			addCriterion("event_page_exlink in", values, "eventPageExlink");
			return (Criteria) this;
		}

		public Criteria andEventPageExlinkNotIn(List<String> values) {
			addCriterion("event_page_exlink not in", values, "eventPageExlink");
			return (Criteria) this;
		}

		public Criteria andEventPageExlinkBetween(String value1, String value2) {
			addCriterion("event_page_exlink between", value1, value2,
					"eventPageExlink");
			return (Criteria) this;
		}

		public Criteria andEventPageExlinkNotBetween(String value1,
				String value2) {
			addCriterion("event_page_exlink not between", value1, value2,
					"eventPageExlink");
			return (Criteria) this;
		}

		public Criteria andEndDatePopIsNull() {
			addCriterion("end_date_pop is null");
			return (Criteria) this;
		}

		public Criteria andEndDatePopIsNotNull() {
			addCriterion("end_date_pop is not null");
			return (Criteria) this;
		}

		public Criteria andEndDatePopEqualTo(String value) {
			addCriterion("end_date_pop =", value, "endDatePop");
			return (Criteria) this;
		}

		public Criteria andEndDatePopNotEqualTo(String value) {
			addCriterion("end_date_pop <>", value, "endDatePop");
			return (Criteria) this;
		}

		public Criteria andEndDatePopGreaterThan(String value) {
			addCriterion("end_date_pop >", value, "endDatePop");
			return (Criteria) this;
		}

		public Criteria andEndDatePopGreaterThanOrEqualTo(String value) {
			addCriterion("end_date_pop >=", value, "endDatePop");
			return (Criteria) this;
		}

		public Criteria andEndDatePopLessThan(String value) {
			addCriterion("end_date_pop <", value, "endDatePop");
			return (Criteria) this;
		}

		public Criteria andEndDatePopLessThanOrEqualTo(String value) {
			addCriterion("end_date_pop <=", value, "endDatePop");
			return (Criteria) this;
		}

		public Criteria andEndDatePopLike(String value) {
			addCriterion("end_date_pop like", value, "endDatePop");
			return (Criteria) this;
		}

		public Criteria andEndDatePopNotLike(String value) {
			addCriterion("end_date_pop not like", value, "endDatePop");
			return (Criteria) this;
		}

		public Criteria andEndDatePopIn(List<String> values) {
			addCriterion("end_date_pop in", values, "endDatePop");
			return (Criteria) this;
		}

		public Criteria andEndDatePopNotIn(List<String> values) {
			addCriterion("end_date_pop not in", values, "endDatePop");
			return (Criteria) this;
		}

		public Criteria andEndDatePopBetween(String value1, String value2) {
			addCriterion("end_date_pop between", value1, value2, "endDatePop");
			return (Criteria) this;
		}

		public Criteria andEndDatePopNotBetween(String value1, String value2) {
			addCriterion("end_date_pop not between", value1, value2,
					"endDatePop");
			return (Criteria) this;
		}

		public Criteria andCreateIdIsNull() {
			addCriterion("create_id is null");
			return (Criteria) this;
		}

		public Criteria andCreateIdIsNotNull() {
			addCriterion("create_id is not null");
			return (Criteria) this;
		}

		public Criteria andCreateIdEqualTo(String value) {
			addCriterion("create_id =", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdNotEqualTo(String value) {
			addCriterion("create_id <>", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdGreaterThan(String value) {
			addCriterion("create_id >", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdGreaterThanOrEqualTo(String value) {
			addCriterion("create_id >=", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdLessThan(String value) {
			addCriterion("create_id <", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdLessThanOrEqualTo(String value) {
			addCriterion("create_id <=", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdLike(String value) {
			addCriterion("create_id like", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdNotLike(String value) {
			addCriterion("create_id not like", value, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdIn(List<String> values) {
			addCriterion("create_id in", values, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdNotIn(List<String> values) {
			addCriterion("create_id not in", values, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdBetween(String value1, String value2) {
			addCriterion("create_id between", value1, value2, "createId");
			return (Criteria) this;
		}

		public Criteria andCreateIdNotBetween(String value1, String value2) {
			addCriterion("create_id not between", value1, value2, "createId");
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
			addCriterion("create_date not between", value1, value2,
					"createDate");
			return (Criteria) this;
		}

		public Criteria andHitcountIsNull() {
			addCriterion("hitcount is null");
			return (Criteria) this;
		}

		public Criteria andHitcountIsNotNull() {
			addCriterion("hitcount is not null");
			return (Criteria) this;
		}

		public Criteria andHitcountEqualTo(Integer value) {
			addCriterion("hitcount =", value, "hitcount");
			return (Criteria) this;
		}

		public Criteria andHitcountNotEqualTo(Integer value) {
			addCriterion("hitcount <>", value, "hitcount");
			return (Criteria) this;
		}

		public Criteria andHitcountGreaterThan(Integer value) {
			addCriterion("hitcount >", value, "hitcount");
			return (Criteria) this;
		}

		public Criteria andHitcountGreaterThanOrEqualTo(Integer value) {
			addCriterion("hitcount >=", value, "hitcount");
			return (Criteria) this;
		}

		public Criteria andHitcountLessThan(Integer value) {
			addCriterion("hitcount <", value, "hitcount");
			return (Criteria) this;
		}

		public Criteria andHitcountLessThanOrEqualTo(Integer value) {
			addCriterion("hitcount <=", value, "hitcount");
			return (Criteria) this;
		}

		public Criteria andHitcountIn(List<Integer> values) {
			addCriterion("hitcount in", values, "hitcount");
			return (Criteria) this;
		}

		public Criteria andHitcountNotIn(List<Integer> values) {
			addCriterion("hitcount not in", values, "hitcount");
			return (Criteria) this;
		}

		public Criteria andHitcountBetween(Integer value1, Integer value2) {
			addCriterion("hitcount between", value1, value2, "hitcount");
			return (Criteria) this;
		}

		public Criteria andHitcountNotBetween(Integer value1, Integer value2) {
			addCriterion("hitcount not between", value1, value2, "hitcount");
			return (Criteria) this;
		}

		public Criteria andAttatchFileIsNull() {
			addCriterion("attatch_file is null");
			return (Criteria) this;
		}

		public Criteria andAttatchFileIsNotNull() {
			addCriterion("attatch_file is not null");
			return (Criteria) this;
		}

		public Criteria andAttatchFileEqualTo(String value) {
			addCriterion("attatch_file =", value, "attatchFile");
			return (Criteria) this;
		}

		public Criteria andAttatchFileNotEqualTo(String value) {
			addCriterion("attatch_file <>", value, "attatchFile");
			return (Criteria) this;
		}

		public Criteria andAttatchFileGreaterThan(String value) {
			addCriterion("attatch_file >", value, "attatchFile");
			return (Criteria) this;
		}

		public Criteria andAttatchFileGreaterThanOrEqualTo(String value) {
			addCriterion("attatch_file >=", value, "attatchFile");
			return (Criteria) this;
		}

		public Criteria andAttatchFileLessThan(String value) {
			addCriterion("attatch_file <", value, "attatchFile");
			return (Criteria) this;
		}

		public Criteria andAttatchFileLessThanOrEqualTo(String value) {
			addCriterion("attatch_file <=", value, "attatchFile");
			return (Criteria) this;
		}

		public Criteria andAttatchFileLike(String value) {
			addCriterion("attatch_file like", value, "attatchFile");
			return (Criteria) this;
		}

		public Criteria andAttatchFileNotLike(String value) {
			addCriterion("attatch_file not like", value, "attatchFile");
			return (Criteria) this;
		}

		public Criteria andAttatchFileIn(List<String> values) {
			addCriterion("attatch_file in", values, "attatchFile");
			return (Criteria) this;
		}

		public Criteria andAttatchFileNotIn(List<String> values) {
			addCriterion("attatch_file not in", values, "attatchFile");
			return (Criteria) this;
		}

		public Criteria andAttatchFileBetween(String value1, String value2) {
			addCriterion("attatch_file between", value1, value2, "attatchFile");
			return (Criteria) this;
		}

		public Criteria andAttatchFileNotBetween(String value1, String value2) {
			addCriterion("attatch_file not between", value1, value2,
					"attatchFile");
			return (Criteria) this;
		}

		public Criteria andStartDateTimeIsNull() {
			addCriterion("start_date_time is null");
			return (Criteria) this;
		}

		public Criteria andStartDateTimeIsNotNull() {
			addCriterion("start_date_time is not null");
			return (Criteria) this;
		}

		public Criteria andStartDateTimeEqualTo(String value) {
			addCriterion("start_date_time =", value, "startDateTime");
			return (Criteria) this;
		}

		public Criteria andStartDateTimeNotEqualTo(String value) {
			addCriterion("start_date_time <>", value, "startDateTime");
			return (Criteria) this;
		}

		public Criteria andStartDateTimeGreaterThan(String value) {
			addCriterion("start_date_time >", value, "startDateTime");
			return (Criteria) this;
		}

		public Criteria andStartDateTimeGreaterThanOrEqualTo(String value) {
			addCriterion("start_date_time >=", value, "startDateTime");
			return (Criteria) this;
		}

		public Criteria andStartDateTimeLessThan(String value) {
			addCriterion("start_date_time <", value, "startDateTime");
			return (Criteria) this;
		}

		public Criteria andStartDateTimeLessThanOrEqualTo(String value) {
			addCriterion("start_date_time <=", value, "startDateTime");
			return (Criteria) this;
		}

		public Criteria andStartDateTimeLike(String value) {
			addCriterion("start_date_time like", value, "startDateTime");
			return (Criteria) this;
		}

		public Criteria andStartDateTimeNotLike(String value) {
			addCriterion("start_date_time not like", value, "startDateTime");
			return (Criteria) this;
		}

		public Criteria andStartDateTimeIn(List<String> values) {
			addCriterion("start_date_time in", values, "startDateTime");
			return (Criteria) this;
		}

		public Criteria andStartDateTimeNotIn(List<String> values) {
			addCriterion("start_date_time not in", values, "startDateTime");
			return (Criteria) this;
		}

		public Criteria andStartDateTimeBetween(String value1, String value2) {
			addCriterion("start_date_time between", value1, value2,
					"startDateTime");
			return (Criteria) this;
		}

		public Criteria andStartDateTimeNotBetween(String value1, String value2) {
			addCriterion("start_date_time not between", value1, value2,
					"startDateTime");
			return (Criteria) this;
		}

		public Criteria andEndDateTimeIsNull() {
			addCriterion("end_date_time is null");
			return (Criteria) this;
		}

		public Criteria andEndDateTimeIsNotNull() {
			addCriterion("end_date_time is not null");
			return (Criteria) this;
		}

		public Criteria andEndDateTimeEqualTo(String value) {
			addCriterion("end_date_time =", value, "endDateTime");
			return (Criteria) this;
		}

		public Criteria andEndDateTimeNotEqualTo(String value) {
			addCriterion("end_date_time <>", value, "endDateTime");
			return (Criteria) this;
		}

		public Criteria andEndDateTimeGreaterThan(String value) {
			addCriterion("end_date_time >", value, "endDateTime");
			return (Criteria) this;
		}

		public Criteria andEndDateTimeGreaterThanOrEqualTo(String value) {
			addCriterion("end_date_time >=", value, "endDateTime");
			return (Criteria) this;
		}

		public Criteria andEndDateTimeLessThan(String value) {
			addCriterion("end_date_time <", value, "endDateTime");
			return (Criteria) this;
		}

		public Criteria andEndDateTimeLessThanOrEqualTo(String value) {
			addCriterion("end_date_time <=", value, "endDateTime");
			return (Criteria) this;
		}

		public Criteria andEndDateTimeLike(String value) {
			addCriterion("end_date_time like", value, "endDateTime");
			return (Criteria) this;
		}

		public Criteria andEndDateTimeNotLike(String value) {
			addCriterion("end_date_time not like", value, "endDateTime");
			return (Criteria) this;
		}

		public Criteria andEndDateTimeIn(List<String> values) {
			addCriterion("end_date_time in", values, "endDateTime");
			return (Criteria) this;
		}

		public Criteria andEndDateTimeNotIn(List<String> values) {
			addCriterion("end_date_time not in", values, "endDateTime");
			return (Criteria) this;
		}

		public Criteria andEndDateTimeBetween(String value1, String value2) {
			addCriterion("end_date_time between", value1, value2, "endDateTime");
			return (Criteria) this;
		}

		public Criteria andEndDateTimeNotBetween(String value1, String value2) {
			addCriterion("end_date_time not between", value1, value2,
					"endDateTime");
			return (Criteria) this;
		}

		public Criteria andWinDateTimeIsNull() {
			addCriterion("win_date_time is null");
			return (Criteria) this;
		}

		public Criteria andWinDateTimeIsNotNull() {
			addCriterion("win_date_time is not null");
			return (Criteria) this;
		}

		public Criteria andWinDateTimeEqualTo(String value) {
			addCriterion("win_date_time =", value, "winDateTime");
			return (Criteria) this;
		}

		public Criteria andWinDateTimeNotEqualTo(String value) {
			addCriterion("win_date_time <>", value, "winDateTime");
			return (Criteria) this;
		}

		public Criteria andWinDateTimeGreaterThan(String value) {
			addCriterion("win_date_time >", value, "winDateTime");
			return (Criteria) this;
		}

		public Criteria andWinDateTimeGreaterThanOrEqualTo(String value) {
			addCriterion("win_date_time >=", value, "winDateTime");
			return (Criteria) this;
		}

		public Criteria andWinDateTimeLessThan(String value) {
			addCriterion("win_date_time <", value, "winDateTime");
			return (Criteria) this;
		}

		public Criteria andWinDateTimeLessThanOrEqualTo(String value) {
			addCriterion("win_date_time <=", value, "winDateTime");
			return (Criteria) this;
		}

		public Criteria andWinDateTimeLike(String value) {
			addCriterion("win_date_time like", value, "winDateTime");
			return (Criteria) this;
		}

		public Criteria andWinDateTimeNotLike(String value) {
			addCriterion("win_date_time not like", value, "winDateTime");
			return (Criteria) this;
		}

		public Criteria andWinDateTimeIn(List<String> values) {
			addCriterion("win_date_time in", values, "winDateTime");
			return (Criteria) this;
		}

		public Criteria andWinDateTimeNotIn(List<String> values) {
			addCriterion("win_date_time not in", values, "winDateTime");
			return (Criteria) this;
		}

		public Criteria andWinDateTimeBetween(String value1, String value2) {
			addCriterion("win_date_time between", value1, value2, "winDateTime");
			return (Criteria) this;
		}

		public Criteria andWinDateTimeNotBetween(String value1, String value2) {
			addCriterion("win_date_time not between", value1, value2,
					"winDateTime");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table TA_POPUP_MNG
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
     * This class corresponds to the database table TA_POPUP_MNG
     *
     * @mbggenerated do_not_delete_during_merge Thu Jul 10 18:47:41 KST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}