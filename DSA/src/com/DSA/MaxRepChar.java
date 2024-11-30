package com.DSA;

public class MaxRepChar {

	public static void main(String[] args) {

		String str = "gegeekkk";
		int maxrep = 0;
		char ch = 0 ;
		
		for(int i=1;i<str.length();i++) {
			 int count=1;
			if(str.charAt(i) == str.charAt(i-1)) {
					count++;
				}if(count > maxrep) {
					maxrep = count;
					ch = str.charAt(i);
				}	
		}
		System.out.println(ch);

	}

}
