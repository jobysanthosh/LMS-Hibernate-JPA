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

import com.ss.wk4.MyHibJpa.dao.BookDao;
import com.ss.wk4.MyHibJpa.entities.Author;
import com.ss.wk4.MyHibJpa.entities.Book;

@RestController
@RequestMapping("/Week4")
public class BookController {

	@Autowired
	private BookDao bookDao;
	
	@GetMapping("/book")
	public List<Book> getAllPublisher() {
	    return bookDao.findAll();
	}
	
	// Create a new Note
	@PostMapping("/book")
	public Book createNote(@Valid @RequestBody Book book) {
	    return bookDao.save(book);
	}
	
	@PutMapping("/book")
	public Book updateNote(@Valid @RequestBody Book book) {
		return bookDao.save(book);
	}
	
	@DeleteMapping("/book")
	public void deleteNote(@Valid @RequestBody Book book) {
		 bookDao.delete(book);
	}
}
