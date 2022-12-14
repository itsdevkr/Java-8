package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_table")

public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookId;
	
	@Column(name="book_name")
	private String bookName;
	
	@Column(name="book_title")
	private String bookTitle;
	
	@Column(name="book_price")
	private double bookPrice;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(String bookName, String bookTitle, double bookPrice) {
		super();
		this.bookName = bookName;
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
		
	
	/*
	  {
    "bookName":"Life in Metro",
    "bookTitle":"Uncarved Metro by Sushil",
    "bookPrice":"199.00"
	}
	 */
}
