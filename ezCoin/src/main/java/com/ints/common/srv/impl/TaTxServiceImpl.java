package com.ints.common.srv.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ints.common.dao.TaKrwRequestMapper;
import com.ints.common.dao.TaWonRequestMapper;
import com.ints.common.model.TaKrwRequest;
import com.ints.common.model.TaWonRequest;
import com.ints.common.srv.TaTxService;

@Repository
public class TaTxServiceImpl implements TaTxService{
	@Autowired
	TaWonRequestMapper wMapper;
	@Autowired
	TaKrwRequestMapper kMapper;
	
	
	@Override
	public List<TaKrwRequest> getKrwRequestList(int page) {
		return kMapper.selectKrwRequestList((page-1)*10);
	}

	@Override
	public List<TaKrwRequest> getSearchedKrwRequestList(String searchWord,
			String startDate, String endDate, int page) {
		return kMapper.selectSearchedKrwRequestList(searchWord, startDate, endDate, (page-1)*10);
	}

	@Override
	public int getKrwRequestListCnt() {
		return kMapper.selectKrwRequestListCnt();
	}

	@Override
	public int getSearchedKrwRequestListCnt(String searchWord,
			String startDate, String endDate) {
		return kMapper.selectSearchedKrwRequestListCnt(searchWord, startDate, endDate);
	}

	@Override
	public List<TaWonRequest> getWonRequestList(int page) {
		return wMapper.selectWonRequestList((page-1)*10);
	}

	@Override
	public List<TaWonRequest> getSearchedWonRequestList(String searchWord,
			String startDate, String endDate, int page) {
		return wMapper.selectSearchedWonRequestList(searchWord, startDate, endDate, (page-1)*10);
	}

	@Override
	public int getWonRequestListCnt() {
		return wMapper.selectWonRequestListCnt();
	}

	@Override
	public int getSearchedWonRequestListCnt(String searchWord,
			String startDate, String endDate) {
		return wMapper.selectSearchedWonRequestListCnt(searchWord, startDate, endDate);
	}

	@Override
	public int updateKrw(TaKrwRequest record) {
		return kMapper.updateByPrimaryKeySelective(record);
	}

}
