package com.ints.common.srv.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ints.common.dao.TaAskMngMapper;
import com.ints.common.dao.TaFaqMngMapper;
import com.ints.common.model.TaAskMng;
import com.ints.common.model.TaFaqMng;
import com.ints.common.srv.TaQnaMngService;

@Repository
public class TaQnaMngServiceImpl implements TaQnaMngService{

	
	@Autowired
	TaAskMngMapper mapper;
	
	@Override
	public int insertQna(TaAskMng vo) {
		return mapper.insert(vo);
	}

	@Override
	public List<TaAskMng> getQnaList(int page) {
		return mapper.selectQnaList((page-1)*10);
	}

	@Override
	public int deleteQna(int QnaMngIdx) {
		return mapper.deleteByPrimaryKey(QnaMngIdx);
	}

	@Override
	public TaAskMng getQnaByIdx(int QnaMngIdx) {
		return mapper.selectByPrimaryKey(QnaMngIdx);
	}

	@Override
	public int updateQna(TaAskMng vo) {
		TaAskMng temp = mapper.selectByPrimaryKey(vo.getAskMngIdx());
		vo.setCreateDate(temp.getCreateDate());
		//등록일을 살리기위해
		return mapper.updateByPrimaryKey(vo);
	}

	@Override
	public List<TaAskMng> getSearchedList(String searchWord,
			String startDate, String endDate, int page) {
		
		return mapper.selectSearchQnaList(searchWord, startDate, endDate, (page-1)*10);
	}

	@Override
	public int getQnaListCnt() {
		return mapper.selectQnaListCnt();
	}

	@Override
	public int getSearchQnaListCnt(String searchWord, String startDate, String endDate) {
		
		return mapper.selectSearchQnaListCnt(searchWord, startDate, endDate);
	}
}
