package com.ints.common.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TaBoardReplyExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table TA_BOARD_REPLY
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table TA_BOARD_REPLY
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table TA_BOARD_REPLY
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_BOARD_REPLY
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public TaBoardReplyExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_BOARD_REPLY
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_BOARD_REPLY
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_BOARD_REPLY
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_BOARD_REPLY
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_BOARD_REPLY
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_BOARD_REPLY
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_BOARD_REPLY
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_BOARD_REPLY
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_BOARD_REPLY
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_BOARD_REPLY
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table TA_BOARD_REPLY
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

		public Criteria andReplyIdxIsNull() {
			addCriterion("reply_idx is null");
			return (Criteria) this;
		}

		public Criteria andReplyIdxIsNotNull() {
			addCriterion("reply_idx is not null");
			return (Criteria) this;
		}

		public Criteria andReplyIdxEqualTo(Integer value) {
			addCriterion("reply_idx =", value, "replyIdx");
			return (Criteria) this;
		}

		public Criteria andReplyIdxNotEqualTo(Integer value) {
			addCriterion("reply_idx <>", value, "replyIdx");
			return (Criteria) this;
		}

		public Criteria andReplyIdxGreaterThan(Integer value) {
			addCriterion("reply_idx >", value, "replyIdx");
			return (Criteria) this;
		}

		public Criteria andReplyIdxGreaterThanOrEqualTo(Integer value) {
			addCriterion("reply_idx >=", value, "replyIdx");
			return (Criteria) this;
		}

		public Criteria andReplyIdxLessThan(Integer value) {
			addCriterion("reply_idx <", value, "replyIdx");
			return (Criteria) this;
		}

		public Criteria andReplyIdxLessThanOrEqualTo(Integer value) {
			addCriterion("reply_idx <=", value, "replyIdx");
			return (Criteria) this;
		}

		public Criteria andReplyIdxIn(List<Integer> values) {
			addCriterion("reply_idx in", values, "replyIdx");
			return (Criteria) this;
		}

		public Criteria andReplyIdxNotIn(List<Integer> values) {
			addCriterion("reply_idx not in", values, "replyIdx");
			return (Criteria) this;
		}

		public Criteria andReplyIdxBetween(Integer value1, Integer value2) {
			addCriterion("reply_idx between", value1, value2, "replyIdx");
			return (Criteria) this;
		}

		public Criteria andReplyIdxNotBetween(Integer value1, Integer value2) {
			addCriterion("reply_idx not between", value1, value2, "replyIdx");
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

		public Criteria andWritingIdxIsNull() {
			addCriterion("writing_idx is null");
			return (Criteria) this;
		}

		public Criteria andWritingIdxIsNotNull() {
			addCriterion("writing_idx is not null");
			return (Criteria) this;
		}

		public Criteria andWritingIdxEqualTo(Integer value) {
			addCriterion("writing_idx =", value, "writingIdx");
			return (Criteria) this;
		}

		public Criteria andWritingIdxNotEqualTo(Integer value) {
			addCriterion("writing_idx <>", value, "writingIdx");
			return (Criteria) this;
		}

		public Criteria andWritingIdxGreaterThan(Integer value) {
			addCriterion("writing_idx >", value, "writingIdx");
			return (Criteria) this;
		}

		public Criteria andWritingIdxGreaterThanOrEqualTo(Integer value) {
			addCriterion("writing_idx >=", value, "writingIdx");
			return (Criteria) this;
		}

		public Criteria andWritingIdxLessThan(Integer value) {
			addCriterion("writing_idx <", value, "writingIdx");
			return (Criteria) this;
		}

		public Criteria andWritingIdxLessThanOrEqualTo(Integer value) {
			addCriterion("writing_idx <=", value, "writingIdx");
			return (Criteria) this;
		}

		public Criteria andWritingIdxIn(List<Integer> values) {
			addCriterion("writing_idx in", values, "writingIdx");
			return (Criteria) this;
		}

		public Criteria andWritingIdxNotIn(List<Integer> values) {
			addCriterion("writing_idx not in", values, "writingIdx");
			return (Criteria) this;
		}

		public Criteria andWritingIdxBetween(Integer value1, Integer value2) {
			addCriterion("writing_idx between", value1, value2, "writingIdx");
			return (Criteria) this;
		}

		public Criteria andWritingIdxNotBetween(Integer value1, Integer value2) {
			addCriterion("writing_idx not between", value1, value2,
					"writingIdx");
			return (Criteria) this;
		}

		public Criteria andIsAnswerIsNull() {
			addCriterion("is_answer is null");
			return (Criteria) this;
		}

		public Criteria andIsAnswerIsNotNull() {
			addCriterion("is_answer is not null");
			return (Criteria) this;
		}

		public Criteria andIsAnswerEqualTo(Integer value) {
			addCriterion("is_answer =", value, "isAnswer");
			return (Criteria) this;
		}

		public Criteria andIsAnswerNotEqualTo(Integer value) {
			addCriterion("is_answer <>", value, "isAnswer");
			return (Criteria) this;
		}

		public Criteria andIsAnswerGreaterThan(Integer value) {
			addCriterion("is_answer >", value, "isAnswer");
			return (Criteria) this;
		}

		public Criteria andIsAnswerGreaterThanOrEqualTo(Integer value) {
			addCriterion("is_answer >=", value, "isAnswer");
			return (Criteria) this;
		}

		public Criteria andIsAnswerLessThan(Integer value) {
			addCriterion("is_answer <", value, "isAnswer");
			return (Criteria) this;
		}

		public Criteria andIsAnswerLessThanOrEqualTo(Integer value) {
			addCriterion("is_answer <=", value, "isAnswer");
			return (Criteria) this;
		}

		public Criteria andIsAnswerIn(List<Integer> values) {
			addCriterion("is_answer in", values, "isAnswer");
			return (Criteria) this;
		}

		public Criteria andIsAnswerNotIn(List<Integer> values) {
			addCriterion("is_answer not in", values, "isAnswer");
			return (Criteria) this;
		}

		public Criteria andIsAnswerBetween(Integer value1, Integer value2) {
			addCriterion("is_answer between", value1, value2, "isAnswer");
			return (Criteria) this;
		}

		public Criteria andIsAnswerNotBetween(Integer value1, Integer value2) {
			addCriterion("is_answer not between", value1, value2, "isAnswer");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table TA_BOARD_REPLY
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
     * This class corresponds to the database table TA_BOARD_REPLY
     *
     * @mbggenerated do_not_delete_during_merge Thu Jul 10 18:47:41 KST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}