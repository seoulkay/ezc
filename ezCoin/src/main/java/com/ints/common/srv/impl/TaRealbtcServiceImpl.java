package com.ints.common.srv.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ints.common.dao.TaRealbtcMapper;
import com.ints.common.model.TaRealbtc;
import com.ints.common.srv.TaRealbtcService;
@Repository
public class TaRealbtcServiceImpl implements TaRealbtcService {

	@Autowired
	TaRealbtcMapper mapper;
	
	@Override
	public List<TaRealbtc> getRealbtcList(int page) {
		return mapper.selectRealbtcList((page-1)*10);
	}

	@Override
	public List<TaRealbtc> getSearchedRealbtcList(String searchWord,
			String startDate, String endDate, int page) {
		return mapper.selectSearchedRealbtcList(searchWord, startDate, endDate, (page-1)*10);
	}

	@Override
	public int getRealbtcCnt() {
		return mapper.selectRealbtcListCnt();
	}

	@Override
	public int getSearchedRealbtcCnt(String searchWord, String startDate,
			String endDate) {
		return mapper.selectSearchedRealbtcListCnt(searchWord, startDate, endDate);
	}

}
