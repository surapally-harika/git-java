package com.DSA;

public class vowels {

	public static void main(String[] args) {
		String str = "afdedf";
		String vowels="";
		String str1="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'
					||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
				vowels+=ch;
				 
			}else {
				str1+=ch;
			}
		}
		String st=vowels+str1;
		System.out.println(st);
		
	}
}
