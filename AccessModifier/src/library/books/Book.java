package library.books;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private boolean isAvailable;
	
	
	
	public Book(String title, String author, String iSBN, boolean isAvailable) {
		super();
		this.title = title;
		this.author = author;
		ISBN = iSBN;
		this.isAvailable = isAvailable;
	}
	
	
	public boolean getIsAvailable() {
		return isAvailable;
	}


	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", isAvailable=" + isAvailable + "]";
	}


public String borrowBook() {
		
		if(isAvailable) {
			return "book is available for borrow";
		}else {
			return "Book is not availabe for borrow";
		}
		
	}
	 
	
	private boolean returnBook() {
		
		
		return false;
		
	}

}
