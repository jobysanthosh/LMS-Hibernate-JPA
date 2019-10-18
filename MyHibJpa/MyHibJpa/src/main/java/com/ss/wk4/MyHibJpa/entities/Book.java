package com.ss.wk4.MyHibJpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer book_id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "author_id")
	private String author_id;

	/**
	 * @return the book_id
	 */
	public Integer getBook_id() {
		return book_id;
	}

	/**
	 * @param book_id the book_id to set
	 */
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author_id
	 */
	public String getAuthor_id() {
		return author_id;
	}

	/**
	 * @param author_id the author_id to set
	 */
	public void setAuthor_id(String author_id) {
		this.author_id = author_id;
	}

	
}
