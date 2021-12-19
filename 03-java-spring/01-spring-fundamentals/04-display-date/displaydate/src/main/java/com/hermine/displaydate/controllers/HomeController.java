package com.hermine.displaydate.controllers;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	
	public String index() {
		return "index.jsp";
	}
	
@GetMapping("/date")
	
	public String displayDate(Model model) {
	LocalDateTime ldt = LocalDateTime.now();
	model.addAttribute("date", ldt.getDayOfWeek() + " the " + 
						ldt.getDayOfMonth() + " of " + ldt.getMonth() + " " + 
						ldt.getYear());
	return "date.jsp";
	}

@GetMapping("/time")
public String displayTime(Model model) {
	LocalDateTime ldt = LocalDateTime.now();
	String time = ldt.getHour() + ":" + ldt.getMinute();
	model.addAttribute("time", time);	
	return "time.jsp";
}	
@GetMapping("/goToHome")
public String goToHome(){
	return "index.jsp";
}
}
