package com.ints.system.ezcoin.controller.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletResponse;

import org.neo4j.cypher.internal.compiler.v2_1.planner.logical.steps.outerJoin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ints.common.model.TaNoticeMng;
import com.ints.common.srv.TaFaqMngService;
import com.ints.common.srv.TaNoticeMngService;

/**
 * @클래스명 : AdminBoardController
 * @소속 : 아이엔티시스템
 * @작성자 : 이일환
 * @생성일 : 2014. 7. 14.
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
 *       <td>2014. 7. 14.</td><td>이일환</th><td>생성</td>
 *    </tr>
 * </table>
 * </pre>
 */
@Controller
public class AdminBoardController {
	
	@Autowired
	TaNoticeMngService noticeService;
	
	@RequestMapping(value="/admin/board/notice/manageNotice.do", method={RequestMethod.GET, RequestMethod.POST})
	public String manageNotice(Locale locale,Model model, @RequestParam(value="page", required=false, defaultValue="1")int page){
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		int cnt = noticeService.getNoticeListCnt();
		int pageNum = ((cnt-1)/10)+1;
		
		model.addAttribute("noticeList", noticeService.getNoticeList(page));
		model.addAttribute("cnt", cnt);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("page", page);
		model.addAttribute("bType", "Notice");
		model.addAttribute("bPath", "notice");
		
		
		return "admin/board/notice/manageNotice";
	}
	
	@RequestMapping(value="/admin/board/notice/createNotice.do", method={RequestMethod.GET, RequestMethod.POST})
	public String createNotice(Locale locale,Model model){
		
		Date date = new Date() ;
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		return "admin/board/notice/createNotice";
	}
	
	@RequestMapping(value="/admin/board/notice/insertNoticePro.do", method={RequestMethod.GET, RequestMethod.POST})
	public String insertNoticePro(Locale locale,Model model, @ModelAttribute("viewObject")TaNoticeMng vo, HttpServletResponse response) throws IOException{
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		vo.setCreateDate(date);
		vo.setCreateId("admin");
		
		int result = noticeService.insertNotice(vo);
		
		if(result > 0) {
			out.print("<script>");
			out.print("alert('게시물이 등록 되었습니다.');");
			out.print("parent.location.href = '/admin/board/notice/manageNotice.do';");
			out.print("</script>");
			out.close();
			return null;
		}
		
		
		return "redirect:admin/board/notice/manageNotice";
	}
	
	@RequestMapping(value="/admin/board/notice/deleteNoticePro.do", method={RequestMethod.GET, RequestMethod.POST})
	public String deleteNoticePro(Locale locale,Model model, @RequestParam("noticeMngIdx")int noticeMngIdx, HttpServletResponse response) throws IOException{
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		

		int result = noticeService.deleteNotice(noticeMngIdx);
		
		if(result > 0) {
			out.print("<script>");
			out.print("alert('게시물이 삭제 되었습니다.');");
			out.print("parent.location.href = '/admin/board/notice/manageNotice.do';");
			out.print("</script>");
			out.close();
			return null;
		}
		
		
		return "redirect:admin/board/notice/manageNotice";
	}
	

	@RequestMapping(value="/admin/board/notice/updateNotice.do", method={RequestMethod.GET, RequestMethod.POST})
	public String updateNotice(Locale locale,Model model, @RequestParam("noticeMngIdx")int noticeMngIdx){
		
		Date date = new Date() ;
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		model.addAttribute("vo", noticeService.getNoticeByIdx(noticeMngIdx));
		
		return "admin/board/notice/updateNotice";
	}
	
	@RequestMapping(value="/admin/board/notice/updateNoticePro.do", method={RequestMethod.GET, RequestMethod.POST})
	public String updateNoticePro(Locale locale,Model model, @ModelAttribute("viewObject")TaNoticeMng vo, HttpServletResponse response) throws IOException{
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		vo.setCreateDate(date);
		int result = noticeService.updateNotice(vo);
		
		if(result > 0) {
			out.print("<script>");
			out.print("alert('게시물이 수정 되었습니다.');");
			out.print("parent.location.href = '/admin/board/notice/manageNotice.do';");
			out.print("</script>");
			out.close();
			return null;
		}
		
		
		return null;
	}
	
	@RequestMapping(value="/admin/board/notice/searchNoticePro.do", method={RequestMethod.GET, RequestMethod.POST})
	public String searchNotice(Locale locale,Model model, @RequestParam("searchWord")String searchWord, @RequestParam("startDate")String startDate, @RequestParam("endDate")String endDate, @RequestParam(value="page", required=false, defaultValue="1")int page ){
		
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
	
		
		
		int cnt = noticeService.getSearchNoticeListCnt(searchWord, startDate, endDate);
		int pageNum = ((cnt-1)/10)+1;
		
		
		
		model.addAttribute("cnt", cnt);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("page", page);
		model.addAttribute("bType", "Notice");
		model.addAttribute("bPath", "notice");
		
		model.addAttribute("noticeList", noticeService.getSearchedList(searchWord, startDate, endDate, page));
		
		return "admin/board/notice/manageNotice";
	}
	
	
	
	
}

