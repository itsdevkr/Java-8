package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepo;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepo bookRepo;
	
	@Override
	public Book createBook(Book book) {
		Book newBook = bookRepo.save(book);
		return newBook;
	}

	@Override
	public List<Book> bookList() {
		List<Book> bookList = bookRepo.findAll();
		return bookList;
	}

}
