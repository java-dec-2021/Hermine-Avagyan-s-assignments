package com.hermine.dojooverflow.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hermine.dojooverflow.models.Answer;
import com.hermine.dojooverflow.models.Question;
import com.hermine.dojooverflow.models.Tag;
import com.hermine.dojooverflow.repositories.AnswerRepository;
import com.hermine.dojooverflow.repositories.QuestionRepository;
import com.hermine.dojooverflow.repositories.TagRepository;

@Service
public class OverflowService {
	@Autowired
	private AnswerRepository aRepo;
	@Autowired
	private QuestionRepository qRepo;
	@Autowired
	private TagRepository tRepo;

	//get one Tag
	public Tag getOneTag(String subject) {
		return this.tRepo.findBySubject(subject);
	}
	
	//split the string given from the front end into individual tags 
	public ArrayList<Tag> splitTags(String tags) {
		ArrayList<Tag> tagsForQuestion = new ArrayList<Tag>();
		String[] tagsToProcess = tags.split(",");
		for (String s : tagsToProcess) {
			if (this.tRepo.existsBySubject(s)) {
				Tag tagToAdd = this.getOneTag(s);
				tagsForQuestion.add(tagToAdd);
			} else {
				Tag newTag = new Tag();
				newTag.setSubject(s);
				this.tRepo.save(newTag);
				tagsForQuestion.add(this.getOneTag(s));

			}

		}
		return tagsForQuestion;
	}
	
	//create a Question
	public Question createQuestion(Question question) {
		question.setQtags(this.splitTags(question.getTagsFromFrontEnd()));
		return this.qRepo.save(question);
	}
	//Get all questions
	public List<Question> getAllQuestions(){
		return this.qRepo.findAll();
	}
	//Get one question
	public Question getOneQuestion(Long id) {
		return this.qRepo.findById(id).orElse(null);
	}
	//create an Answer
	public Answer createAnswer(Answer answer) {
		return this.aRepo.save(answer);
	}

}
