package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Book;

public interface BookService {
	Book createBook(Book book);
	List<Book> bookList();
	
}
