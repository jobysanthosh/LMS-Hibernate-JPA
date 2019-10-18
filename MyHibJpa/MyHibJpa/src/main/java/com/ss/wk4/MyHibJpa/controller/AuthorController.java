package com.ss.wk4.MyHibJpa.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ss.wk4.MyHibJpa.dao.AuthorDao;
import com.ss.wk4.MyHibJpa.entities.Author;

@RestController
@RequestMapping("/Week4")
public class AuthorController {

	@Autowired
	private AuthorDao authorDao;
	
	@GetMapping("/author")
	public List<Author> getAllPublisher() {
	    return authorDao.findAll();
	}
	
	// Create a new Note
	@PostMapping("/author")
	public Author createNote(@Valid @RequestBody Author author) {
	    return authorDao.save(author);
	}
	
	@PutMapping("/author")
	public Author updateNote(@Valid @RequestBody Author author) {
		return authorDao.save(author);
	}
	
	@DeleteMapping("/author")
	public void deleteNote(@Valid @RequestBody Author author) {
		 authorDao.delete(author);
	}
	
}
