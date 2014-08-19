package com.ints.common.srv.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ints.common.dao.TaFaqMngMapper;
import com.ints.common.model.TaFaqMng;
import com.ints.common.srv.TaFaqMngService;
@Repository
public class TaFaqMngServiceImpl implements TaFaqMngService {
	@Autowired
	TaFaqMngMapper mapper;
	
	@Override
	public int insertFaq(TaFaqMng vo) {
		return mapper.insert(vo);
	}

	@Override
	public List<TaFaqMng> getFaqList(int page) {
		return mapper.selectFaqList((page-1)*10);
	}

	@Override
	public int deleteFaq(int FaqMngIdx) {
		return mapper.deleteByPrimaryKey(FaqMngIdx);
	}

	@Override
	public TaFaqMng getFaqByIdx(int FaqMngIdx) {
		return mapper.selectByPrimaryKey(FaqMngIdx);
	}

	@Override
	public int updateFaq(TaFaqMng vo) {
		return mapper.updateByPrimaryKey(vo);
	}

	@Override
	public List<TaFaqMng> getSearchedList(String searchWord,
			String startDate, String endDate, int page) {
		
		return mapper.selectSearchFaqList(searchWord, startDate, endDate, (page-1)*10);
	}

	@Override
	public int getFaqListCnt() {
		return mapper.selectFaqListCnt();
	}

	@Override
	public int getSearchFaqListCnt(String searchWord, String startDate, String endDate) {
		
		return mapper.selectSearchFaqListCnt(searchWord, startDate, endDate);
	}
}
