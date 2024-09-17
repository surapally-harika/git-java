package com.String;

public class Strings {

	public static void main(String[] args) {
		String str = "Hey";
		StringBuilder str1 = new StringBuilder(str);
		str1.append(" How are you?");
		System.out.println(str1);
		int result= str1.lastIndexOf("H");
		System.out.println("last occurence of index H:"+result);
		int count=0;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("total number of whiteSpaces:"+count);
		
	}

}
