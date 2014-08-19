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

import com.ints.common.model.TaFaqMng;
import com.ints.common.srv.TaFaqMngService;

/**
 * @클래스명 : AdminFaqController
 * @소속 : 아이엔티시스템
 * @작성자 : 이일환
 * @생성일 : 2014. 7. 16.
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
 *       <td>2014. 7. 16.</td><td>이일환</th><td>생성</td>
 *    </tr>
 * </table>
 * </pre>
 */

@Controller
public class AdminFaqController {
	@Autowired
	TaFaqMngService FaqService;
	
	@RequestMapping(value="/admin/board/FAQ/manageFAQ.do", method={RequestMethod.GET, RequestMethod.POST})
	public String manageFaq(Locale locale,Model model, @RequestParam(value="page", required=false, defaultValue="1")int page){
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		int cnt = FaqService.getFaqListCnt();
		int pageNum = ((cnt-1)/10)+1;
		
		model.addAttribute("FaqList", FaqService.getFaqList(page));
		model.addAttribute("cnt", cnt);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("page", page);
		model.addAttribute("bType", "FAQ");
		model.addAttribute("bPath", "FAQ");
		
		return "admin/board/FAQ/manageFAQ";
	}
	
	@RequestMapping(value="/admin/board/FAQ/createFAQ.do", method={RequestMethod.GET, RequestMethod.POST})
	public String createFaq(Locale locale,Model model){
		
		Date date = new Date() ;
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		return "admin/board/FAQ/createFAQ";
	}
	
	@RequestMapping(value="/admin/board/FAQ/insertFAQPro.do", method={RequestMethod.GET, RequestMethod.POST})
	public String insertFaqPro(Locale locale,Model model, @ModelAttribute("viewObject")TaFaqMng vo, HttpServletResponse response) throws IOException{
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		vo.setCreateDate(date);
		vo.setCreateId("admin");
		
		int result = FaqService.insertFaq(vo);
		
		if(result > 0) {
			out.print("<script>");
			out.print("alert('게시물이 등록 되었습니다.');");
			out.print("parent.location.href = '/admin/board/FAQ/manageFAQ.do';");
			out.print("</script>");
			out.close();
			return null;
		}
		
		
		return "redirect:admin/board/FAQ/manageFAQ";
	}
	
	@RequestMapping(value="/admin/board/FAQ/deleteFAQPro.do", method={RequestMethod.GET, RequestMethod.POST})
	public String deleteFaqPro(Locale locale,Model model, @RequestParam("FaqMngIdx")int FaqMngIdx, HttpServletResponse response) throws IOException{
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		

		int result = FaqService.deleteFaq(FaqMngIdx);
		
		if(result > 0) {
			out.print("<script>");
			out.print("alert('게시물이 삭제 되었습니다.');");
			out.print("parent.location.href = '/admin/board/FAQ/manageFAQ.do';");
			out.print("</script>");
			out.close();
			return null;
		}
		
		
		return "redirect:admin/board/FAQ/manageFAQ";
	}
	

	@RequestMapping(value="/admin/board/FAQ/updateFAQ.do", method={RequestMethod.GET, RequestMethod.POST})
	public String updateFaq(Locale locale,Model model, @RequestParam("FaqMngIdx")int FaqMngIdx){
		
		Date date = new Date() ;
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		model.addAttribute("vo", FaqService.getFaqByIdx(FaqMngIdx));
		
		return "admin/board/FAQ/updateFAQ";
	}
	
	@RequestMapping(value="/admin/board/FAQ/updateFAQPro.do", method={RequestMethod.GET, RequestMethod.POST})
	public String updateFaqPro(Locale locale,Model model, @ModelAttribute("viewObject")TaFaqMng vo, HttpServletResponse response) throws IOException{
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		vo.setCreateDate(date);
		int result = FaqService.updateFaq(vo);
		
		if(result > 0) {
			out.print("<script>");
			out.print("alert('게시물이 수정 되었습니다.');");
			out.print("parent.location.href = '/admin/board/FAQ/manageFAQ.do';");
			out.print("</script>");
			out.close();
			return null;
		}
		
		
		return null;
	}
	
	@RequestMapping(value="/admin/board/FAQ/searchFAQPro.do", method={RequestMethod.GET, RequestMethod.POST})
	public String searchFaq(Locale locale,Model model, @RequestParam("searchWord")String searchWord, @RequestParam("startDate")String startDate, @RequestParam("endDate")String endDate, @RequestParam(value="page", required=false, defaultValue="1")int page ){
		
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
	
		
		
		int cnt = FaqService.getSearchFaqListCnt(searchWord, startDate, endDate);
		int pageNum = ((cnt-1)/10)+1;
		
		
		
		model.addAttribute("cnt", cnt);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("page", page);
		model.addAttribute("bType", "FAQ");
		model.addAttribute("bPath", "FAQ");
		
		model.addAttribute("FaqList", FaqService.getSearchedList(searchWord, startDate, endDate, page));
		
		return "admin/board/FAQ/manageFAQ";
	}
}
