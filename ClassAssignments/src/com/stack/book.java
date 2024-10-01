package com.stack;

public class book {

	public String bookName;
	public int price;
	public String isbn;
	public String author;
	
	
	public book(String bookName, int price, String isbn, String author) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.isbn = isbn;
		this.author = author;
	}


	@Override
	public String toString() {
		return "book [bookName=" + bookName + ", price=" + price + ", isbn=" + isbn + ", author=" + author + "]";
	}
	
	
	
}
