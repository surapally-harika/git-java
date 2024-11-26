package com.DSA;

public class log_substring {

	public static boolean substring( String s) {
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i) == s.charAt(j)) {
					return false;
				}
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		
		String str = "abcadcfgd";
		int n = str.length();
		 String longest_substring = "";
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				String substring = str.substring(i, j);
				
				if(substring(substring) == true && substring.length() > longest_substring.length()) {
					longest_substring = substring;
				}
			}
		}
		System.out.println(longest_substring);
	}

}
