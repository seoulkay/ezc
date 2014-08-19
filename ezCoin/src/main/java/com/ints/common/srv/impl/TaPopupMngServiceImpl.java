package com.ints.common.srv.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ints.common.dao.TaPopupMngMapper;
import com.ints.common.model.TaPopupMng;
import com.ints.common.srv.TaPopupMngService;

@Repository
public class TaPopupMngServiceImpl implements TaPopupMngService{
	
	@Autowired
	TaPopupMngMapper mapper;
	
	@Override
	public int insertPopup(TaPopupMng vo) {
		return mapper.insert(vo);
	}

	@Override
	public List<TaPopupMng> getPopupList(int page) {
		return mapper.selectPopupList((page-1)*10);
	}

	@Override
	public int deletePopup(int PopupMngIdx) {
		return mapper.deleteByPrimaryKey(PopupMngIdx);
	}

	@Override
	public TaPopupMng getPopupByIdx(int PopupMngIdx) {
		return mapper.selectByPrimaryKey(PopupMngIdx);
	}

	@Override
	public int updatePopup(TaPopupMng vo) {
		return mapper.updateByPrimaryKey(vo);
	}

	@Override
	public List<TaPopupMng> getSearchedList(String searchWord,
			String startDate, String endDate, int page) {
		
		return mapper.selectSearchPopupList(searchWord, startDate, endDate, (page-1)*10);
	}

	@Override
	public int getPopupListCnt() {
		return mapper.selectPopupListCnt();
	}

	@Override
	public int getSearchPopupListCnt(String searchWord, String startDate, String endDate) {
		
		return mapper.selectSearchPopupListCnt(searchWord, startDate, endDate);
	}
}
