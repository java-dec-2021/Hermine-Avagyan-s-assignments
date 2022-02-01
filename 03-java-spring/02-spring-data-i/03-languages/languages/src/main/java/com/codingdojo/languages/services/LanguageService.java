package com.codingdojo.languages.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.repositories.LanguageRepository;


@Service
public class LanguageService {
	private LanguageRepository languageRepo;

	public LanguageService(LanguageRepository languageRepo) {
		this.languageRepo = languageRepo;
	}
	//Get all languages
	public List<Language> getAllLanguages(){
		return this.languageRepo.findAll();
	}
	//Creates a language
	public Language create(Language language) {
		return this.languageRepo.save(language);
	}
	//retrives a language by id
	public Language findLanguage(Long id) {
		Optional<Language> optionalLanguage = languageRepo.findById(id);
		if (optionalLanguage.isPresent()) {
			return optionalLanguage.get();			
		}else {
			return null;
		}
	}
	
	//updates a language
	public Language updateLanguage(Language language) {
		return languageRepo.save(language);
	}
	//deletes a language by id
	public void deleteLanguage(Long id) {
		languageRepo.deleteById(id);
	}	

}
