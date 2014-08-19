package com.ints.common.dao;

import com.ints.common.model.TaMember;
import com.ints.common.model.TaMemberExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TaMemberMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_MEMBER
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	int countByExample(TaMemberExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_MEMBER
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	int deleteByExample(TaMemberExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_MEMBER
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	int deleteByPrimaryKey(Integer memberIdx);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_MEMBER
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	int insert(TaMember record);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_MEMBER
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	int insertSelective(TaMember record);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_MEMBER
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	List<TaMember> selectByExample(TaMemberExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_MEMBER
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	TaMember selectByPrimaryKey(Integer memberIdx);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_MEMBER
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	int updateByExampleSelective(@Param("record") TaMember record,
			@Param("example") TaMemberExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_MEMBER
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	int updateByExample(@Param("record") TaMember record,
			@Param("example") TaMemberExample example);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_MEMBER
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	int updateByPrimaryKeySelective(TaMember record);
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table TA_MEMBER
	 * @mbggenerated  Tue Jul 29 17:30:03 KST 2014
	 */
	int updateByPrimaryKey(TaMember record);
	List<TaMember> selectMemberList(@Param("page")int page);
    List<TaMember> selectSearchedMemberList(@Param("searchWord")String searchWord, @Param("startDate")String startDate, @Param("endDate")String endDate, @Param("page")int page);
    int selectMemberListCnt();
    int selectSearchedMemberCnt(@Param("searchWord")String searchWord, @Param("startDate")String startDate, @Param("endDate")String endDate);
    
}