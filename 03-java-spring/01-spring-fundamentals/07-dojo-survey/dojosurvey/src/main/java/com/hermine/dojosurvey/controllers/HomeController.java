package com.hermine.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	@PostMapping("/result")
	public String result(@RequestParam(value = "firstName") String fName, 
						@RequestParam(value = "location") String dojoLocation,
						@RequestParam(value = "language") String favoriteLanguage,
						@RequestParam(value = "comment", required = false) String optionalComment, Model model) {
		model.addAttribute("firstName", fName);
		model.addAttribute("location", dojoLocation);
		model.addAttribute("language", favoriteLanguage);
		model.addAttribute("comment", optionalComment);
		if(favoriteLanguage.equals("Java")) {
		return "javaChooser.jsp";
		}
		return "result.jsp";
	}
	

}
