package com.srp.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.srp.poc.model.Book;
import com.srp.poc.service.BookServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {
	 @Autowired
	    private BookServiceImpl bookService;

	    @GetMapping("/")
	    public String home() {
	        return "Welcome to the Book API!";
	    }

	    @GetMapping("/findbyid/{id}")
	    public Book findBookById(@PathVariable int id) {
	        return bookService.findBookById(id);
	    }

	    @GetMapping("/findall")
	    public List<Book> findAllBooks() {
	        return bookService.findAllBooks();
	    }

	    @DeleteMapping("/delete")
	    public String deleteAllBooks() {
	        bookService.deleteAllBooks();
	        return "All books have been deleted.";
	    }
}
