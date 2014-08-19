package com.ints.system.ezcoin.controller.admin;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ints.common.model.TaKrwRequest;
import com.ints.common.model.TaMember;
import com.ints.common.srv.TaMemberService;
import com.ints.common.srv.TaRealbtcService;
import com.ints.common.srv.TaTxService;

/**
 * @클래스명 : AdminTxController
 * @소속 : 아이엔티시스템
 * @작성자 : 이일환
 * @생성일 : 2014. 7. 29.
 * @클래스설명 :
 *
 * @이력정보 <pre>
 * <table border=1>
 *    <colgroup>
 *       <col width="200px" />
 *    </colgroup>
 *    <tr>
 *       <th>수정일</th><th>수정자</th><th>설명</th>
 *    </tr>
 *    <tr>
 *       <td>2014. 7. 29.</td><td>이일환</th><td>생성</td>
 *    </tr>
 * </table>
 * </pre>
 */
@Controller
public class AdminTxController {
	@Autowired
	TaMemberService MemberService;
	@Autowired
	TaRealbtcService btcService;
	@Autowired
	TaTxService txService;
	
	
	@RequestMapping(value="/admin/tx/transaction/manageTx.do", method={RequestMethod.GET, RequestMethod.POST})
	public String txList(Locale locale,Model model, @RequestParam(value="page", required=false, defaultValue="1")int page){
		
		Date date = new Date() ;
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
	
		
		int cnt = MemberService.getMemberWalletCnt();
		int pageNum = ((cnt-1)/10)+1;
		
		model.addAttribute("vo", MemberService.getMemberWalletList(page));
		model.addAttribute("cnt", cnt);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("page", page);
		model.addAttribute("bType", "manageTx");
		model.addAttribute("bPath", "/admin/tx/transaction/");
		
		return "admin/tx/transaction/manageTx";
	}
	
	@RequestMapping(value="/admin/tx/transaction/searchTxPro.do", method={RequestMethod.GET, RequestMethod.POST})
	public String searchmemberWallet(Locale locale,Model model, @RequestParam("searchWord")String searchWord, @RequestParam("startDate")String startDate, @RequestParam("endDate")String endDate, @RequestParam(value="page", required=false, defaultValue="1")int page){
		
		Date date = new Date() ;
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		
		if(startDate == ""){
			startDate ="1900-08-29";
		}
		if(endDate == ""){
			endDate = sdf.format(date);
		}
	
		
		
		int cnt = MemberService.getSearchedMemberWalletCnt(searchWord, startDate, endDate);
		int pageNum = ((cnt-1)/10)+1;
		
				
		model.addAttribute("cnt", cnt);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("page", page);
		model.addAttribute("bType", "Tx");
		model.addAttribute("bPath", "/admin/tx/transaction/");
		model.addAttribute("vo", MemberService.getSearchedMemberWalletList(searchWord, startDate, endDate, page));
		
		return "admin/tx/transaction/manageTx";
	}
	
	@RequestMapping(value="/admin/tx/wallet/manageWallet.do", method={RequestMethod.GET, RequestMethod.POST})
	public String walletList(Locale locale,Model model, @RequestParam(value="page", required=false, defaultValue="1")int page){
		
		Date date = new Date() ;
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
	
		
		int cnt = btcService.getRealbtcCnt();
		int pageNum = ((cnt-1)/10)+1;
		
		model.addAttribute("vo", btcService.getRealbtcList(page));
		model.addAttribute("cnt", cnt);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("page", page);
		model.addAttribute("bType", "manageWallet");
		model.addAttribute("bPath", "/admin/tx/wallet/");
		
		return "admin/tx/wallet/manageWallet";
	}
	
	@RequestMapping(value="/admin/tx/wallet/searchWalletPro.do", method={RequestMethod.GET, RequestMethod.POST})
	public String searchWalletList(Locale locale,Model model, @RequestParam("searchWord")String searchWord, @RequestParam("startDate")String startDate, @RequestParam("endDate")String endDate, @RequestParam(value="page", required=false, defaultValue="1")int page){
		
		Date date = new Date() ;
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		
		if(startDate == ""){
			startDate ="1900-08-29";
		}
		if(endDate == ""){
			endDate = sdf.format(date);
		}
	
		
		
		int cnt = btcService.getSearchedRealbtcCnt(searchWord, startDate, endDate);
		int pageNum = ((cnt-1)/10)+1;
		
				
		model.addAttribute("cnt", cnt);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("page", page);
		model.addAttribute("bType", "Wallet");
		model.addAttribute("bPath", "/admin/tx/wallet/");
		model.addAttribute("vo", btcService.getSearchedRealbtcList(searchWord, startDate, endDate, page));
		
		return "admin/tx/wallet/manageWallet";
	}
	
	@RequestMapping(value="/admin/tx/KRW/manageKRWInput.do", method={RequestMethod.GET, RequestMethod.POST})
	public String krwList(Locale locale,Model model, @RequestParam(value="page", required=false, defaultValue="1")int page){
		
		Date date = new Date() ;
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
	
		
		int cnt = txService.getKrwRequestListCnt();	
		int pageNum = ((cnt-1)/10)+1;
		
		model.addAttribute("vo", txService.getKrwRequestList(page));
		model.addAttribute("cnt", cnt);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("page", page);
		model.addAttribute("bType", "manageKRWInput");
		model.addAttribute("bPath", "/admin/tx/KRW/");
		
		return "admin/tx/KRW/manageKRWInput";
	}
	
	@RequestMapping(value="/admin/tx/KRW/updateKRWInput.do", method={RequestMethod.GET, RequestMethod.POST})
	public String updateKrwList(Locale locale,Model model, @RequestParam(value="page", required=false, defaultValue="1")int page,@RequestParam("sessionId") String responseId, @RequestParam("inputKrw") int inputKrw, @RequestParam("memberIdx") int memberIdx, @RequestParam("krwRequestIdx") int krwRequestIdx){
		
		//날짜 시간 구하기
		Date date = new Date() ;
		Timestamp ts = new Timestamp(date.getTime());
		
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		
		//오류처리하라
		try{
		TaKrwRequest record = new TaKrwRequest();
		
		record.setKrwRequestResponseId(responseId);
		record.setKrwRequestIdx(krwRequestIdx);
		record.setKrwRequestResponseDatetime(ts);
		
		txService.updateKrw(record);
		
		int preKrw = MemberService.getMemberByIdx(memberIdx).getMemberKrw();
		
		TaMember record2 = new TaMember();
		record2.setMemberIdx(memberIdx);
		record2.setMemberKrw(preKrw+inputKrw);
		
		MemberService.updateMemberKrw(record2);
		
		}catch(Exception e){
			return "admin/tx/KRW/error";
		}
		
		
		int cnt = txService.getKrwRequestListCnt();	
		int pageNum = ((cnt-1)/10)+1;
		
		model.addAttribute("vo", txService.getKrwRequestList(page));
		model.addAttribute("cnt", cnt);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("page", page);
		model.addAttribute("bType", "manageKRWInput");
		model.addAttribute("bPath", "/admin/tx/KRW/");
		
		return "admin/tx/KRW/manageKRWInput";
	}
	
	@RequestMapping(value="/admin/tx/KRW/searchKRWInputPro.do", method={RequestMethod.GET, RequestMethod.POST})
	public String searchKrwList(Locale locale,Model model, @RequestParam("searchWord")String searchWord, @RequestParam("startDate")String startDate, @RequestParam("endDate")String endDate, @RequestParam(value="page", required=false, defaultValue="1")int page){
		
		Date date = new Date() ;
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		
		if(startDate == ""){
			startDate ="1900-08-29";
		}
		if(endDate == ""){
			endDate = sdf.format(date);
		}
	
		
		
		int cnt = txService.getSearchedKrwRequestListCnt(searchWord, startDate, endDate);
		int pageNum = ((cnt-1)/10)+1;
		
				
		model.addAttribute("cnt", cnt);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("page", page);
		model.addAttribute("bType", "KRWInput");
		model.addAttribute("bPath", "/admin/tx/KRW/");
		model.addAttribute("vo", txService.getSearchedKrwRequestList(searchWord, startDate, endDate, page));
		
		return "admin/tx/KRW/manageKRWInput";
	}
	
	@RequestMapping(value="/admin/tx/KRW/manageKRWOutput.do", method={RequestMethod.GET, RequestMethod.POST})
	public String krwOutList(Locale locale,Model model, @RequestParam(value="page", required=false, defaultValue="1")int page){
		
		Date date = new Date() ;
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
	
		
		int cnt = txService.getWonRequestListCnt();
		int pageNum = ((cnt-1)/10)+1;
		
		model.addAttribute("vo", txService.getWonRequestList(page));
		model.addAttribute("cnt", cnt);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("page", page);
		model.addAttribute("bType", "manageKRWOutput");
		model.addAttribute("bPath", "/admin/tx/KRW/");
		
		return "admin/tx/KRW/manageKRWOutput";
	}
	
	@RequestMapping(value="/admin/tx/KRW/searchKRWOutputPro.do", method={RequestMethod.GET, RequestMethod.POST})
	public String searchKrwOutList(Locale locale,Model model, @RequestParam("searchWord")String searchWord, @RequestParam("startDate")String startDate, @RequestParam("endDate")String endDate, @RequestParam(value="page", required=false, defaultValue="1")int page){
		
		Date date = new Date() ;
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		
		if(startDate == ""){
			startDate ="1900-08-29";
		}
		if(endDate == ""){
			endDate = sdf.format(date);
		}
	
		
		
		int cnt = txService.getSearchedWonRequestListCnt(searchWord, startDate, endDate);
		int pageNum = ((cnt-1)/10)+1;
		
				
		model.addAttribute("cnt", cnt);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("page", page);
		model.addAttribute("bType", "KRWOutput");
		model.addAttribute("bPath", "/admin/tx/KRW/");
		model.addAttribute("vo", txService.getSearchedWonRequestList(searchWord, startDate, endDate, page));
		
		return "admin/tx/KRW/manageKRWOutput";
	}

}
