package com.ss.wk4.MyHibJpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class Author {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer author_id;
    
    @Column(name = "author_name")
	private String author_name;

	/**
	 * @return the author_id
	 */
	public Integer getAuthor_id() {
		return author_id;
	}

	/**
	 * @param author_id the author_id to set
	 */
	public void setAuthor_id(Integer author_id) {
		this.author_id = author_id;
	}

	/**
	 * @return the author_name
	 */
	public String getAuthor_name() {
		return author_name;
	}

	/**
	 * @param author_name the author_name to set
	 */
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

}
