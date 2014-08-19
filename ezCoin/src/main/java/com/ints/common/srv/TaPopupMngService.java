package com.ints.common.srv;

import java.util.List;

import com.ints.common.model.TaPopupMng;

public interface TaPopupMngService {
	public int insertPopup(TaPopupMng vo);
	public List<TaPopupMng> getPopupList(int page);
	public int deletePopup(int PopupMngIdx);
	public TaPopupMng getPopupByIdx(int PopupMngIdx);
	public int updatePopup(TaPopupMng vo);
	public List<TaPopupMng> getSearchedList(String searchWord, String startDate, String endDate, int page);
	public int getPopupListCnt();
	public int getSearchPopupListCnt(String searchWord, String startDate, String endDate);

}
