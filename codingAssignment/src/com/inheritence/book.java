package com.inheritence;

import java.util.Objects;

public class book {

	public String name;
	public int price;
	public String author;
	public int isbn;
	
	
	public book(String name, int price, String author, int isbn) {
		super();
		this.name = name;
		this.price = price;
		this.author = author;
		this.isbn = isbn;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


	@Override
	public int hashCode() {
		return Objects.hash(author, isbn, name, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		book other = (book) obj;
		return Objects.equals(author, other.author) && isbn == other.isbn && Objects.equals(name, other.name)
				&& price == other.price;
	}
	
	
	
}
