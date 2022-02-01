package com.hermine.dojooverflow.models;



import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "answers")
public class Answer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String aText;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "question_id")
	private Question quest;
	
	

	public Answer() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getaText() {
		return aText;
	}

	public void setaText(String aText) {
		this.aText = aText;
	}

	public Question getQuest() {
		return quest;
	}

	public void setQuest(Question quest) {
		this.quest = quest;
	}

}
