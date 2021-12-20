package com.hermine.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	public String index(HttpSession session){
		
		session.setAttribute("count", 0);
		
	        
	        return "index.jsp";
	    }
	
	public String showCount(HttpSession session) {
		Integer currentCount = (Integer)session.getAttribute("count");
		return "showCount.jsp";
	}
	
	
}
