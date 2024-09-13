package com.Statement;

public class reverse {
	public static void main(String[] args) {
		
		int n=3456;
		int rev=0;
		
		while(n>0) {
			int i=n%10;  
			rev = rev*10+i;  
			n/=10; 
			
		}
		
		System.out.print("reverse of the number is:"+rev);
		
	}

}
