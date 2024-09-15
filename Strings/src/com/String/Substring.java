package com.String;

public class Substring {

	public static void main(String[] args) {
		String str = "abcdef";
		int i,j;
		
		for(i=0;i<=str.length();i++) {

				for(j=i+1;j<=str.length();j++) {
					System.out.println(str.substring(i, j));
					
					
				}
			

		}
		

	}

}
