package com.ints.common.srv;

import java.util.List;

import com.ints.common.model.TaKrwRequest;
import com.ints.common.model.TaWonRequest;

public interface TaTxService {
	public List<TaKrwRequest> getKrwRequestList(int page);
	public List<TaKrwRequest> getSearchedKrwRequestList(String searchWord, String startDate, String endDate, int page);
	public int getKrwRequestListCnt();
	public int getSearchedKrwRequestListCnt(String searchWord, String startDate, String endDate);
	
	public int updateKrw(TaKrwRequest record);
	
	
	public List<TaWonRequest> getWonRequestList(int page);
	public List<TaWonRequest> getSearchedWonRequestList(String searchWord, String startDate, String endDate, int page);
	public int getWonRequestListCnt();
	public int getSearchedWonRequestListCnt(String searchWord, String startDate, String endDate);
}
