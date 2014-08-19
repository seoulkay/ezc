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

import com.ints.common.model.TaPopupMng;
import com.ints.common.srv.TaPopupMngService;

/**
 * @클래스명 : AdminPopupController
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
public class AdminPopupController {
	@Autowired
	TaPopupMngService PopupService;
	
	@RequestMapping(value="/admin/board/popup/managePopup.do", method={RequestMethod.GET, RequestMethod.POST})
	public String managePopup(Locale locale,Model model, @RequestParam(value="page", required=false, defaultValue="1")int page){
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		int cnt = PopupService.getPopupListCnt();
		int pageNum = ((cnt-1)/10)+1;
		
		model.addAttribute("PopupList", PopupService.getPopupList(page));
		model.addAttribute("cnt", cnt);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("page", page);
		model.addAttribute("bType", "Popup");
		model.addAttribute("bPath", "popup");
		
		return "admin/board/popup/managePopup";
	}
	
	@RequestMapping(value="/admin/board/popup/createPopup.do", method={RequestMethod.GET, RequestMethod.POST})
	public String createPopup(Locale locale,Model model){
		
		Date date = new Date() ;
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		return "admin/board/popup/createPopup";
	}
	
	@RequestMapping(value="/admin/board/popup/insertPopupPro.do", method={RequestMethod.GET, RequestMethod.POST})
	public String insertPopupPro(Locale locale,Model model, @ModelAttribute("viewObject")TaPopupMng vo, HttpServletResponse response) throws IOException{
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		vo.setCreateDate(date);
		vo.setCreateId("admin");
		
		int result = PopupService.insertPopup(vo);
		
		if(result > 0) {
			out.print("<script>");
			out.print("alert('게시물이 등록 되었습니다.');");
			out.print("parent.location.href = '/admin/board/popup/managePopup.do';");
			out.print("</script>");
			out.close();
			return null;
		}
		
		
		return "redirect:admin/board/popup/managePopup";
	}
	
	@RequestMapping(value="/admin/board/popup/deletePopupPro.do", method={RequestMethod.GET, RequestMethod.POST})
	public String deletePopupPro(Locale locale,Model model, @RequestParam("popupMngIdx")int PopupMngIdx, HttpServletResponse response) throws IOException{
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		

		int result = PopupService.deletePopup(PopupMngIdx);
		
		if(result > 0) {
			out.print("<script>");
			out.print("alert('게시물이 삭제 되었습니다.');");
			out.print("parent.location.href = '/admin/board/popup/managePopup.do';");
			out.print("</script>");
			out.close();
			return null;
		}
		
		
		return "redirect:admin/board/popup/managePopup";
	}
	

	@RequestMapping(value="/admin/board/popup/updatePopup.do", method={RequestMethod.GET, RequestMethod.POST})
	public String updatePopup(Locale locale,Model model, @RequestParam("popupMngIdx")int PopupMngIdx){
		
		Date date = new Date() ;
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		model.addAttribute("vo", PopupService.getPopupByIdx(PopupMngIdx));
		
		return "admin/board/popup/updatePopup";
	}
	
	@RequestMapping(value="/admin/board/popup/updatePopupPro.do", method={RequestMethod.GET, RequestMethod.POST})
	public String updatePopupPro(Locale locale,Model model, @ModelAttribute("viewObject")TaPopupMng vo, HttpServletResponse response) throws IOException{
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		vo.setCreateDate(date);
		int result = PopupService.updatePopup(vo);
		
		if(result > 0) {
			out.print("<script>");
			out.print("alert('게시물이 수정 되었습니다.');");
			out.print("parent.location.href = '/admin/board/popup/managePopup.do';");
			out.print("</script>");
			out.close();
			return null;
		}
		
		
		return null;
	}
	
	@RequestMapping(value="/admin/board/popup/searchPopupPro.do", method={RequestMethod.GET, RequestMethod.POST})
	public String searchPopup(Locale locale,Model model, @RequestParam("searchWord")String searchWord, @RequestParam("startDate")String startDate, @RequestParam("endDate")String endDate, @RequestParam(value="page", required=false, defaultValue="1")int page ){
		
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
	
		
		
		int cnt = PopupService.getSearchPopupListCnt(searchWord, startDate, endDate);
		int pageNum = ((cnt-1)/10)+1;
		
		
		
		model.addAttribute("cnt", cnt);
		model.addAttribute("pageNum", pageNum);
		model.addAttribute("page", page);
		model.addAttribute("bType", "Popup");
		model.addAttribute("bPath", "popup");
		
		model.addAttribute("PopupList", PopupService.getSearchedList(searchWord, startDate, endDate, page));
		
		return "admin/board/popup/managePopup";
	}
}
