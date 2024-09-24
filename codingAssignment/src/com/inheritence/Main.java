package com.inheritence;

public class Main {
		public static void main(String[] args) {
	
			book b = new book("java",250,"Gemes",007063677);
			
			book b1 = new book("java",250,"Gemes",007063677);
			 
			
			if(b.equals(b1)) {
				System.out.println("both are equal");
			}else {
				System.out.println("both are not equal");
			}
		}
}
