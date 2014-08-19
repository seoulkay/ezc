package com.ints.system.ezcoin.controller.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ints.common.model.TaAdminMng;
import com.ints.common.srv.TaAdminMngService;

@Controller
public class AdminLoginController {
	
	@Autowired
	TaAdminMngService adminSrv;
	
	@RequestMapping(value="/admin/login/adminLogin.do", method=RequestMethod.GET)
	public String adminLogin(Locale locale,Model model){
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		return "admin/login/adminLogin";
	}
	
	@RequestMapping(value="/admin/login/adminLoginPro.do", method=RequestMethod.POST)
	public String adminLoginPro(Locale locale,Model model, @ModelAttribute("viewObject")TaAdminMng vo, HttpServletResponse response, HttpServletRequest request) throws IOException{
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		int result = adminSrv.checkAdminMngByAdminId(vo.getAdminId(), vo.getAdminPass());
		
		if(result == 0) {
			out.print("<script>");
			out.print("alert('아이디와 비밀번호를 확인 하십시요.');");
			out.print("parent.location.href = '/admin/login/adminLogin.do';");
			out.print("</script>");
			out.close();
			return null;
		}
		TaAdminMng adminInfo = adminSrv.getAdminMngByAdminId(vo.getAdminId());
		
		request.getSession().setAttribute("adminId", adminInfo.getAdminId());
		request.getSession().setAttribute("adminName", adminInfo.getAdminName());
		request.getSession().setAttribute("adminAuth", adminInfo.getAdminAuth());

		request.getSession().setMaxInactiveInterval(60*30);
		
		
		
		return "redirect:/admin/main/adminMain.do";
	}
	
	@RequestMapping(value="/admin/login/adminLogoutPro.do", method=RequestMethod.GET)
	public String adminLogout(Locale locale,Model model, HttpServletRequest request){
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate ); 
		
		HttpSession session = request.getSession();
		
		session.invalidate();
		
		return "admin/login/adminLogin";
	}
}
