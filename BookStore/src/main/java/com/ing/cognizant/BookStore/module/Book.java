package com.ing.cognizant.BookStore.module;

public class Book {

	private String bookName;
	private String bookAuthor;
	private Double price;
	
	public Book() {
		
		
	}
	
	public Book(String bookName, String bookAuthor, Double price) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.price = price;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookAuthor=" + bookAuthor
				+ ", price=" + price + "]";
	}
}
