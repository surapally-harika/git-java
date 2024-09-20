package library.app;

import java.awt.print.Book;
import java.lang.reflect.Member;

public class LibraryApp {

	public static void main(String[] args) {
		
		Member m = new Member(343332, "Sumit kumar");
		   
		   Book b = new Book();
		   
		   Book b1 = new Book();
		 
		   System.out.println("the list of books :");
		   System.out.println(b);
		   System.out.println(b1);
  		 
		   
		   System.out.println("A memeber want to borrow the book :");
		   String result =   m.borrowBook(b);
		   
		   System.out.println(result);
		
		
		

	}

}

