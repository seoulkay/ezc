package com.ints.common.srv;

import java.util.List;

import com.ints.common.model.TaNoticeMng;

public interface TaNoticeMngService {
	public int insertNotice(TaNoticeMng vo);
	public List<TaNoticeMng> getNoticeList(int page);
	public int deleteNotice(int noticeMngIdx);
	public TaNoticeMng getNoticeByIdx(int noticeMngIdx);
	public int updateNotice(TaNoticeMng vo);
	public List<TaNoticeMng> getSearchedList(String searchWord, String startDate, String endDate, int page);
	public int getNoticeListCnt();
	public int getSearchNoticeListCnt(String searchWord, String startDate, String endDate);
}
