package com.hermine.dojooverflow.models;


import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.Transient;

@Entity
@Table(name = "questions")
public class Question {

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String qText;

	@Transient
	private String tagsFromFrontEnd;

	@OneToMany(mappedBy = "quest", 
	cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	
	private List<Answer> answers;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
	name ="question_tag", 
	joinColumns = @JoinColumn(name ="question_id"),
	inverseJoinColumns=@JoinColumn(name ="tag_id")
	)
	private List<Tag> qtags;

	public Question() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getqText() {
		return qText;
	}

	public void setqText(String qText) {
		this.qText = qText;
	}

	public String getTagsFromFrontEnd() {
		return tagsFromFrontEnd;
	}

	public void setTagsFromFrontEnd(String tagsFromFrontEnd) {
		this.tagsFromFrontEnd = tagsFromFrontEnd;
	}
	public List<Tag> getQtags() {
		return qtags;
	}

	public void setQtags(List<Tag> qtags) {
		this.qtags = qtags;
	}
	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
}
