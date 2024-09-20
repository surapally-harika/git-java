package library.members;

import java.awt.print.Book;

 	
 	public class Member {
	private String memberID;
	private String memberName;
	
	
	
	public Member(String memberID, String memberName) {
		super();
		this.memberID = memberID;
		this.memberName = memberName;
	}
	
	
	public String getMemberID() {
		return memberID;
	}


	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	@Override
	public String toString() {
		return "Member [memberID=" + memberID + ", memberName=" + memberName + "]";
	}


	public String borrowBook(Book b) {

		return b.borrowBook();
	}
	protected void showMemberDetails() {
		
		System.out.println(this.memberID);
		System.out.println(this.memberName);
	}

	

}
