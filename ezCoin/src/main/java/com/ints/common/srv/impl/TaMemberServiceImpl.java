package com.ints.common.srv.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ints.common.dao.TaMemberMapper;
import com.ints.common.dao.TaMemberWalletMapper;
import com.ints.common.model.TaMember;
import com.ints.common.model.TaMemberWallet;
import com.ints.common.srv.TaMemberService;

@Repository
public class TaMemberServiceImpl implements TaMemberService{
	
	@Autowired
	TaMemberMapper mapper;
	@Autowired
	TaMemberWalletMapper wMapper;
	

	@Override
	public List<TaMember> getMemberList(int page) {
		return mapper.selectMemberList((page-1)*10);
	}

	@Override
	public List<TaMember> getSearchedMemberList(String searchWord,
			String startDate, String endDate, int page) {
		return mapper.selectSearchedMemberList(searchWord, startDate, endDate, (page-1)*10);
	}

	@Override
	public int getMemberCnt() {
		return mapper.selectMemberListCnt();
	}

	@Override
	public int getSearchedMemberCnt(String searchWord, String startDate,
			String endDate) {
		return mapper.selectSearchedMemberCnt(searchWord, startDate, endDate);
	}

	@Override
	public int deleteMember(int memberIdx) {
		return mapper.deleteByPrimaryKey(memberIdx);
	}

	@Override
	public int updateMemeber(TaMember vo) {
		return mapper.updateByPrimaryKey(vo);
	}

	@Override
	public TaMember getMemberByIdx(int memberIdx) {
		return mapper.selectByPrimaryKey(memberIdx);
	}

	@Override
	public List<TaMemberWallet> getMemberWalletList(int page, int memberIdx) {
		return wMapper.selectMemberWalletList((page-1)*10, memberIdx);
	}

	@Override
	public List<TaMemberWallet> getSearchedMemberWalletList(String searchWord,
			String startDate, String endDate, int page, int memberIdx) {
		
		return wMapper.selectSearchedMemberWalletList(searchWord, startDate, endDate, (page-1)*10, memberIdx);
	}

	@Override
	public int getMemberWalletCnt(int memberIdx) {
		return wMapper.selectMemberWalletListCnt(memberIdx);
	}

	@Override
	public int getSearchedMemberWalletCnt(String searchWord, String startDate,
			String endDate, int memberIdx) {
		return wMapper.selectSearchedMemberWalletCnt(searchWord, startDate, endDate, memberIdx);
	}

	@Override
	public List<TaMemberWallet> getMemberWalletList(int page) {
		return wMapper.selectMemberWalletListWoi((page-1)*10);
	}

	@Override
	public List<TaMemberWallet> getSearchedMemberWalletList(String searchWord,
			String startDate, String endDate, int page) {
		return wMapper.selectSearchedMemberWalletListWoi(searchWord, startDate, endDate, (page-1)*10);
	}

	@Override
	public int getMemberWalletCnt() {
		return wMapper.selectMemberWalletListCntWoi();
	}

	@Override
	public int getSearchedMemberWalletCnt(String searchWord, String startDate,
			String endDate) {
		return wMapper.selectSearchedMemberWalletCntWoi(searchWord, startDate, endDate);
	}

	@Override
	public int updateMemberKrw(TaMember record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

}
