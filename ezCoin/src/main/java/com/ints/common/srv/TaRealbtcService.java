package com.ints.common.srv;

import java.util.List;

import com.ints.common.model.TaRealbtc;


public interface TaRealbtcService {

	public List<TaRealbtc> getRealbtcList(int page);
	public List<TaRealbtc> getSearchedRealbtcList(String searchWord, String startDate, String endDate, int page);
	public int getRealbtcCnt();
	public int getSearchedRealbtcCnt(String searchWord, String startDate, String endDate);
}
