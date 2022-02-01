package com.hermine.dojooverflow.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.hermine.dojooverflow.models.Answer;
import com.hermine.dojooverflow.models.Question;
import com.hermine.dojooverflow.services.OverflowService;
import com.hermine.dojooverflow.validator.TagValidator;

@Controller
public class HomeController {
	@Autowired
	private OverflowService oService;
	@Autowired
	private TagValidator tValidator;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("allQuestions", this.oService.getAllQuestions());
		return "dashboard.jsp";
	}
	@GetMapping("/new")
	public String newQuesion(@ModelAttribute("question") Question question) {
		return "new.jsp";
	}
	@PostMapping("/newQuestion")
		public String addQuestion(@Valid @ModelAttribute("question") Question question, BindingResult result) {
			tValidator.validate(question, result);
			if(result.hasErrors()) {
				return "new.jsp";
			}
			this.oService.createQuestion(question);
			return "redirect:/";
		}
	@GetMapping("/show/{id}")
	public String show(@PathVariable("id") Long id, Model model, @ModelAttribute("answer") Answer answer) {
		model.addAttribute("question", this.oService.getOneQuestion(id));
		return "show.jsp";
	}
	
	@PostMapping("/addAnswer")
	public String addAnswer(@Valid @ModelAttribute("answer")Answer answer,BindingResult result,Model model) {
		if (result.hasErrors()) {
			model.addAttribute("question", this.oService.getOneQuestion(answer.getQuest().getId()));
			return "show.jsp";
			
		}
		this.oService.createAnswer(answer);
		return "redirect:/show/" + answer.getQuest().getId();
	}
	}


