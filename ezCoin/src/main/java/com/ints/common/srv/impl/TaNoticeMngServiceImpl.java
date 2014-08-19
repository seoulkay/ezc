package com.ints.common.srv.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ints.common.dao.TaNoticeMngMapper;
import com.ints.common.model.TaNoticeMng;
import com.ints.common.srv.TaNoticeMngService;

@Repository
public class TaNoticeMngServiceImpl implements TaNoticeMngService{

	@Autowired
	TaNoticeMngMapper mapper;
	
	@Override
	public int insertNotice(TaNoticeMng vo) {
		return mapper.insert(vo);
	}

	@Override
	public List<TaNoticeMng> getNoticeList(int page) {
		return mapper.selectNoticeList((page-1)*10);
	}

	@Override
	public int deleteNotice(int noticeMngIdx) {
		return mapper.deleteByPrimaryKey(noticeMngIdx);
	}

	@Override
	public TaNoticeMng getNoticeByIdx(int noticeMngIdx) {
		return mapper.selectByPrimaryKey(noticeMngIdx);
	}

	@Override
	public int updateNotice(TaNoticeMng vo) {
		return mapper.updateByPrimaryKey(vo);
	}

	@Override
	public List<TaNoticeMng> getSearchedList(String searchWord,
			String startDate, String endDate, int page) {
		
		return mapper.selectSearchNoticeList(searchWord, startDate, endDate, (page-1)*10);
	}

	@Override
	public int getNoticeListCnt() {
		return mapper.selectNoticeListCnt();
	}

	@Override
	public int getSearchNoticeListCnt(String searchWord, String startDate, String endDate) {
		
		return mapper.selectSearchNoticeListCnt(searchWord, startDate, endDate);
	}

}
