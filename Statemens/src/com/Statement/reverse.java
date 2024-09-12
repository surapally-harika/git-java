package com.Statement;

public class reverse {
	public static void main(String[] args) {
		
		int n=3456;
		int rev=0;
		
		while(n>0) {
			int i=n%10;  //6  //5 //4 //3
			rev = rev*10+i;  //6  //65 //654  //6543
			n/=10; //345 //34 //3  //0
			
		}
		
		System.out.print("reverse of the number is:"+rev);
		
	}

}
