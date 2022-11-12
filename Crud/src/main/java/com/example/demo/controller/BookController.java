package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookServiceImpl;

@RestController
@RequestMapping
public class BookController {
	
	@Autowired
	private BookServiceImpl bookServiceImpl;
	
	@PostMapping("/")
	ResponseEntity<Book> addBook(Book book){
		Book newBook = bookServiceImpl.createBook(book);
		return new ResponseEntity<Book>(newBook, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/books")
	ResponseEntity<List<Book>> getAllBooks(){
		List<Book> bookList = bookServiceImpl.bookList();
		return new ResponseEntity<List<Book>>(bookList, HttpStatus.OK);
	}
}
