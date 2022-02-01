package com.codingdojo.languages.models;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "languages")
public class Language {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 @NotNull(message = "Needs a name")
	 @Size(min = 2, max = 20, message = "Language needs a name")
	 private String name;
	 
	 
	 @NotBlank
	 @Size(min = 2, max = 20)
	 private String creator;
	 
	 @NotNull
	 private Float currentVersion;
	 
// This will not allow the createdAt column to be updated after creation
	 @Column(updatable=false)
	 @DateTimeFormat(pattern="yyyy-MM-dd")
	 private Date createdAt;
	 
	 public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Float  getCurrentVersion() {
		return currentVersion;
	}
	/*
	 * public float currentVersionToFloat(String version) { version =
	 * this.currentVersion; return Float.parseFloat(version); }
	 */

	public void setCurrentVersion(Float currentVersion) {
		this.currentVersion = currentVersion;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
	 private Date updatedAt;

}
