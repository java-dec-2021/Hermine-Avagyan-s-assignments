package com.codingdojo.languages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.services.LanguageService;


@RestController
public class LanguageApiController {
@Autowired
	private LanguageService languageService;

@GetMapping("/api/languages")
public List<Language> languages(){
	return this.languageService.getAllLanguages();
}

@PostMapping("/api/createLanguage")
public Language createLanguage(Language language) {
	return this.languageService.create(language);
}


}

	
	
