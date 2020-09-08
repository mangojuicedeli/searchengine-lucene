package com.search.lucene.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "newsroom")
@Indexed
@Getter
@Setter
public class NewsRoom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "newsroom_no")
	private Integer newsroomNo;
	
	@Column(name = "link")
	private String link;
	
	@Column(name = "title")
	@Field
	private String title;
	
	@Column(name = "content")
	@Field
	private String content;
}
