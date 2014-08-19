package com.ints.common.srv;

import java.util.List;

import com.ints.common.model.TaFaqMng;

public interface TaFaqMngService {
	public int insertFaq(TaFaqMng vo);
	public List<TaFaqMng> getFaqList(int page);
	public int deleteFaq(int FaqMngIdx);
	public TaFaqMng getFaqByIdx(int FaqMngIdx);
	public int updateFaq(TaFaqMng vo);
	public List<TaFaqMng> getSearchedList(String searchWord, String startDate, String endDate, int page);
	public int getFaqListCnt();
	public int getSearchFaqListCnt(String searchWord, String startDate, String endDate);

}
