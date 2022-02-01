package com.codingdojo.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.services.LanguageService;

@Controller
public class LanguageController {
	public final LanguageService languageService;

	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	@RequestMapping("/languages")
	public String getAll(Model model) {
		List<Language> languages = languageService.getAllLanguages();
		model.addAttribute("allLanguages", languages);
		return "/languages/languagesIndex.jsp";
	}
	@RequestMapping("/languages/new")
	public String createPage(@ModelAttribute("newLanguage") Language language) {
		return "/languages/newLanguage.jsp";
	}
	@RequestMapping(value = "/languages", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("newLanguage") Language language, BindingResult result){
		if (result.hasErrors()){
			//return "/languages/languagesIndex.jsp";
			return "/languages/newLanguage.jsp";
		}else {
			languageService.create(language);
		}
		return "redirect:/languages";
	}
	@RequestMapping("/languages/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("oneLanguage", languageService.findLanguage(id));
		return "/languages/showLanguage.jsp";
	}
	@RequestMapping("/languages/edit/{id}")
	public String getEditPage(@PathVariable("id") Long id, Model model, @ModelAttribute("editedLanguage") Language language){
		model.addAttribute("editLanguage",languageService.findLanguage(id));
		return "/languages/editLanguage.jsp";
	}
	@RequestMapping(value = "/languages/edit", method = RequestMethod.POST)
	public String edit(@Valid @ModelAttribute("editedLanguage") Language language, BindingResult result) {
		if (result.hasErrors()){
			//return "/languages/languagesIndex.jsp";
			return "/languages/editLanguage.jsp";
			//return "redirect:/languages";	
		}else {
			languageService.updateLanguage(language);
		}
		return "redirect:/languages";	
	}
	@RequestMapping (value = ("/languages/{id}"), method = RequestMethod.DELETE)
	public String deleteLanguage(@PathVariable("id")Long id) {
		languageService.deleteLanguage(id);
		return "redirect:/languages";
	}
	}
	