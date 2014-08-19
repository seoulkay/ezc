package com.ints.common.srv;

import java.util.List;

import com.ints.common.model.TaAskMng;

public interface TaQnaMngService {

	public int insertQna(TaAskMng vo);
	public List<TaAskMng> getQnaList(int page);
	public int deleteQna(int QnaMngIdx);
	public TaAskMng getQnaByIdx(int QnaMngIdx);
	public int updateQna(TaAskMng vo);
	public List<TaAskMng> getSearchedList(String searchWord, String startDate, String endDate, int page);
	public int getQnaListCnt();
	public int getSearchQnaListCnt(String searchWord, String startDate, String endDate);
}
