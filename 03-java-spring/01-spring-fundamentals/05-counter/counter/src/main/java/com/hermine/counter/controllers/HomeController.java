package com.hermine.counter.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session){
		if (session.getAttribute("count") == null) {
		session.setAttribute("count", 0);
		}
		  else { 
			  int currentCount = (int)session.getAttribute("count"); 
			  currentCount++;
			  session.setAttribute("count", currentCount); }
		 
	        return "index.jsp";
	    }
	@RequestMapping("/counter")
	public String showCount(HttpSession session,Model model, HttpServletRequest hsr) {
		Integer currentCount = (Integer)session.getAttribute("count");
		String string = hsr.getRequestURI();
		model.addAttribute("countToShow", currentCount);
		model.addAttribute("string", string);
		
		return "showCount.jsp";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "index.jsp";
	}
	
	
	
}

	