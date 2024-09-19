package com.DSA;

public class CommonChar {

	public static void main(String[] args) {
		String str = "abcdef";
		String str1 = "sdfab";
		int i,j;
		for(i=0;i<str.length();i++) {
			for( j=0;j<str1.length();j++) {
				if(str.charAt(i)==str1.charAt(j)) {
					System.out.print(str.charAt(i));
					
				}
			}
		}
		

	}

}
