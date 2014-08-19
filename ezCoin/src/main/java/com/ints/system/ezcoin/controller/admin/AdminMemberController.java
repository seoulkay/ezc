package com.ints.system.ezcoin.controller.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ints.common.model.TaMember;
import com.ints.common.model.TaPopupMng;
import com.ints.common.srv.TaMemberService;

@Controller
public class AdminMemberController {
	
	@Autowired
	TaMemberService MemberService;
	
	@RequestMapping(value="/admin/member/info/memberList.do", method={RequestMethod.GET, RequestMethod.POST})
	public String memberList(Locale locale,Model model, @RequestParam(value="page", required=false, defaultValue="1")int page){
		
		Date date = new Date() ;
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		int cnt = MemberService.getMemberCnt();
		int pageNum = ((cnt-1)/10)+1;
		
		model.addAttribute("memberList", MemberService.getMemberList(page));
		model.addAttribute("cnt", cnt);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("page", page);
		model.addAttribute("bType", "memberList");
		model.addAttribute("bPath", "/admin/member/info/");
		
		
		return "admin/member/info/memberList";
	}
	
	@RequestMapping(value="/admin/member/info/updateMember.do", method={RequestMethod.GET, RequestMethod.POST})
	public String updateMember(Locale locale,Model model, @RequestParam("memberIdx")int memberIdx){
		
		Date date = new Date() ;
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		model.addAttribute("vo", MemberService.getMemberByIdx(memberIdx));
		
		return "admin/member/info/getMemberInfo";
	}
	
	@RequestMapping(value="/admin/member/info/updateMemberPro.do", method={RequestMethod.GET, RequestMethod.POST})
	public String updatememberPro(Locale locale,Model model, @ModelAttribute("viewObject")TaMember vo, HttpServletResponse response) throws IOException{
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		//등록일 넣어주기
		TaMember temp = MemberService.getMemberByIdx(vo.getMemberIdx());
		vo.setRegDate(temp.getRegDate());
		
		int result = MemberService.updateMemeber(vo);
		
		if(result > 0) {
			out.print("<script>");
			out.print("alert('회원 정보가 수정 되었습니다.');");
			out.print("self.opener = self;");
			out.print("self.close();");
			out.print("</script>");
			out.close();
			return null;
		}
		
		
		return null;
	}
	
	@RequestMapping(value="/admin/member/info/deleteMemberPro.do", method={RequestMethod.GET, RequestMethod.POST})
	public String deletememberPro(Locale locale,Model model, @RequestParam("memberIdx")int memberIdx, HttpServletResponse response) throws IOException{
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		

		int result = MemberService.deleteMember(memberIdx);
		
		if(result > 0) {
			out.print("<script>");
			out.print("alert('회원이 탈퇴 처리 되었습니다.');");
			out.print("parent.location.href = '/admin/member/info/memberList.do';");
			out.print("</script>");
			out.close();
			return null;
		}
		
		
		return "redirect:admin/member/info/memberList.do";
	}
	
	@RequestMapping(value="/admin/member/info/searchMemberListPro.do", method={RequestMethod.GET, RequestMethod.POST})
	public String searchMember(Locale locale,Model model, @RequestParam("searchWord")String searchWord, @RequestParam("startDate")String startDate, @RequestParam("endDate")String endDate, @RequestParam(value="page", required=false, defaultValue="1")int page ){
		
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
	
		
		
		int cnt = MemberService.getSearchedMemberCnt(searchWord, startDate, endDate);
		int pageNum = ((cnt-1)/10)+1;
		
		
		
		model.addAttribute("cnt", cnt);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("page", page);
		model.addAttribute("bType", "MemberList");
		model.addAttribute("bPath", "/admin/member/info/");
		
		model.addAttribute("memberList", MemberService.getSearchedMemberList(searchWord, startDate, endDate, page));
		
		return "admin/member/info/memberList";
	}
	
	@RequestMapping(value="/admin/member/info/getMemberWalletInfo.do", method={RequestMethod.GET, RequestMethod.POST})
	public String memberWalletList(Locale locale,Model model, @RequestParam(value="page", required=false, defaultValue="1")int page, @RequestParam("memberIdx")int memberIdx){
		
		Date date = new Date() ;
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
	
		
		int cnt = MemberService.getMemberWalletCnt(memberIdx);
		int pageNum = ((cnt-1)/10)+1;
		
		model.addAttribute("memberList", MemberService.getMemberWalletList(page, memberIdx));
		model.addAttribute("cnt", cnt);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("page", page);
		model.addAttribute("bType", "getMemberWalletInfo");
		model.addAttribute("bPath", "/admin/member/info/");
		model.addAttribute("para","&memberIdx="+memberIdx);
		
		return "admin/member/info/getMemberWalletInfo";
	}
	
	@RequestMapping(value="/admin/member/info/searchMemberWalletInfoPro.do", method={RequestMethod.GET, RequestMethod.POST})
	public String searchmemberWallet(Locale locale,Model model, @RequestParam("searchWord")String searchWord, @RequestParam("startDate")String startDate, @RequestParam("endDate")String endDate, @RequestParam(value="page", required=false, defaultValue="1")int page, @RequestParam("memberIdx")int memberIdx){
		
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
	
		
		
		int cnt = MemberService.getSearchedMemberWalletCnt(searchWord, startDate, endDate, memberIdx);
		int pageNum = ((cnt-1)/10)+1;
		
				
		model.addAttribute("cnt", cnt);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("page", page);
		model.addAttribute("bType", "MemberWalletInfo");
		model.addAttribute("bPath", "/admin/member/info/");
		model.addAttribute("para","&memberIdx="+memberIdx);
		model.addAttribute("memberList", MemberService.getSearchedMemberWalletList(searchWord, startDate, endDate, page, memberIdx));
		
		return "admin/member/info/getMemberWalletInfo";
	}
	
}
