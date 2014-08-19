package com.ints.common.srv;

import java.util.List;

import com.ints.common.model.TaMember;
import com.ints.common.model.TaMemberWallet;

public interface TaMemberService {
	
	public List<TaMember> getMemberList(int page);
	public List<TaMember> getSearchedMemberList(String searchWord, String startDate, String endDate, int page);
	public int getMemberCnt();
	public int getSearchedMemberCnt(String searchWord, String startDate, String endDate);
	public int deleteMember(int memberIdx);
	public int updateMemeber(TaMember vo);
	public TaMember getMemberByIdx(int memberIdx);
	
	public List<TaMemberWallet> getMemberWalletList(int page, int memberIdx);
	public List<TaMemberWallet> getSearchedMemberWalletList(String searchWord, String startDate, String endDate, int page, int memberIdx);
	public int getMemberWalletCnt(int memberIdx);
	public int getSearchedMemberWalletCnt(String searchWord, String startDate, String endDate, int memberIdx);
	
	public List<TaMemberWallet> getMemberWalletList(int page);
	public List<TaMemberWallet> getSearchedMemberWalletList(String searchWord, String startDate, String endDate, int page);
	public int getMemberWalletCnt();
	public int getSearchedMemberWalletCnt(String searchWord, String startDate, String endDate);
	
	public int updateMemberKrw(TaMember record);
}