package com.stack;

//import java.util.Iterator;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Stack<book> books = new Stack<book>();
		book b1=new book("java",150,"34GX45654"," ABC");
		book b2=new book("Python",160,"34GX45654"," XYZ");
		book b3=new book("DBMS",170,"34GX45654"," GHJ");
		books.push(b1);
		books.push(b2);
		books.push(b3);
		
//		System.out.println(books.pop());
//		System.out.println(books.pop());
//		System.out.println(books.pop());
		
		while(!books.isEmpty()) {
			System.out.println(books.pop());
		}
		
		
		
		

	}

}
