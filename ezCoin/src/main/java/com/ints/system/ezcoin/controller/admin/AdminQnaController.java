
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

import com.ints.common.model.TaAskMng;
import com.ints.common.srv.TaQnaMngService;

/**
 * @클래스명 : AdminQnaController
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
public class AdminQnaController {
	
		@Autowired
		TaQnaMngService QNAService;
		
		@RequestMapping(value="/admin/board/QNA/manageQNA.do", method={RequestMethod.GET, RequestMethod.POST})
		public String manageQNA(Locale locale,Model model, @RequestParam(value="page", required=false, defaultValue="1")int page){
			
			Date date = new Date();
			DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
			
			String formattedDate = dateFormat.format(date);
			
			model.addAttribute("serverTime", formattedDate ); 
			
			int cnt = QNAService.getQnaListCnt();
			int pageNum = ((cnt-1)/10)+1;
			
			model.addAttribute("QNAList", QNAService.getQnaList(page));
			model.addAttribute("cnt", cnt);
			model.addAttribute("pageNum", pageNum);
			model.addAttribute("page", page);
			model.addAttribute("bType", "QNA");
			model.addAttribute("bPath", "QNA");
			
			return "admin/board/QNA/manageQNA";
		}
		
		@RequestMapping(value="/admin/board/QNA/createQNA.do", method={RequestMethod.GET, RequestMethod.POST})
		public String createQNA(Locale locale,Model model){
			
			Date date = new Date() ;
			DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
			
			String formattedDate = dateFormat.format(date);
			
			model.addAttribute("serverTime", formattedDate ); 
			
			return "admin/board/QNA/createQNA";
		}
		
		@RequestMapping(value="/admin/board/QNA/insertQNAPro.do", method={RequestMethod.GET, RequestMethod.POST})
		public String insertQNAPro(Locale locale,Model model, @ModelAttribute("viewObject")TaAskMng vo, HttpServletResponse response) throws IOException{
			
			Date date = new Date();
			DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
			
			String formattedDate = dateFormat.format(date);
			
			model.addAttribute("serverTime", formattedDate ); 
			
			response.setContentType("text/html;charset=UTF-8");
			
			PrintWriter out = response.getWriter();
			
			vo.setCreateDate(date);
			vo.setCreateId("admin");
			
			int result = QNAService.insertQna(vo);
			
			if(result > 0) {
				out.print("<script>");
				out.print("alert('게시물이 등록 되었습니다.');");
				out.print("parent.location.href = '/admin/board/QNA/manageQNA.do';");
				out.print("</script>");
				out.close();
				return null;
			}
			
			
			return "redirect:admin/board/QNA/manageQNA";
		}
		
		@RequestMapping(value="/admin/board/QNA/deleteQNAPro.do", method={RequestMethod.GET, RequestMethod.POST})
		public String deleteQNAPro(Locale locale,Model model, @RequestParam("QNAMngIdx")int QNAMngIdx, HttpServletResponse response) throws IOException{
			
			Date date = new Date();
			DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
			
			
			
			String formattedDate = dateFormat.format(date);
			
			model.addAttribute("serverTime", formattedDate ); 
			
			response.setContentType("text/html;charset=UTF-8");
			
			PrintWriter out = response.getWriter();
			

			int result = QNAService.deleteQna(QNAMngIdx);
			
			if(result > 0) {
				out.print("<script>");
				out.print("alert('게시물이 삭제 되었습니다.');");
				out.print("parent.location.href = '/admin/board/QNA/manageQNA.do';");
				out.print("</script>");
				out.close();
				return null;
			}
			
			
			return "redirect:admin/board/QNA/manageQNA";
		}
		

		@RequestMapping(value="/admin/board/QNA/updateQNA.do", method={RequestMethod.GET, RequestMethod.POST})
		public String updateQNA(Locale locale,Model model, @RequestParam("QNAMngIdx")int QNAMngIdx){
			
			Date date = new Date() ;
			DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
			
			String formattedDate = dateFormat.format(date);
			
			model.addAttribute("serverTime", formattedDate ); 
			
			model.addAttribute("vo", QNAService.getQnaByIdx(QNAMngIdx));
			
			return "admin/board/QNA/updateQNA";
		}
		
		@RequestMapping(value="/admin/board/QNA/updateQNAPro.do", method={RequestMethod.GET, RequestMethod.POST})
		public String updateQNAPro(Locale locale,Model model, @ModelAttribute("viewObject")TaAskMng vo, HttpServletResponse response) throws IOException{
			
			Date date = new Date();
			DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
			
			
			
			String formattedDate = dateFormat.format(date);
			
			model.addAttribute("serverTime", formattedDate ); 
			
			response.setContentType("text/html;charset=UTF-8");
			
			PrintWriter out = response.getWriter();
			
			vo.setResponseCreateDate(date);
			vo.setResponseCreateId("admin");
			
			int result = QNAService.updateQna(vo);
			
			if(result > 0) {
				out.print("<script>");
				out.print("alert('답변을 수정 했습니다.');");
				out.print("parent.location.href = '/admin/board/QNA/manageQNA.do';");
				out.print("</script>");
				out.close();
				return null;
			}
			
			
			return null;
		}
		
		@RequestMapping(value="/admin/board/QNA/searchQNAPro.do", method={RequestMethod.GET, RequestMethod.POST})
		public String searchQNA(Locale locale,Model model, @RequestParam("searchWord")String searchWord, @RequestParam("startDate")String startDate, @RequestParam("endDate")String endDate, @RequestParam(value="page", required=false, defaultValue="1")int page ){
			
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
		
			
			
			int cnt = QNAService.getSearchQnaListCnt(searchWord, startDate, endDate);
			int pageNum = ((cnt-1)/10)+1;
			
			
			
			model.addAttribute("cnt", cnt);
			model.addAttribute("pageNum", pageNum);
			model.addAttribute("page", page);
			model.addAttribute("bType", "QNA");
			model.addAttribute("bPath", "QNA");
			
			model.addAttribute("QNAList", QNAService.getSearchedList(searchWord, startDate, endDate, page));
			
			return "admin/board/QNA/manageQNA";
		}
	}


