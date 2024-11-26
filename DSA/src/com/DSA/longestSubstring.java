package com.DSA;


public class longestSubstring {

	    public static boolean Substring(String s) {
	        for (int i = 0; i < s.length(); i++) {
	            for (int j = i + 1; j < s.length(); j++) {
	                if (s.charAt(i) == s.charAt(j)) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }



	    public static void main(String[] args) {
	        String str = "abcadcfgd";
	        
	        int n = str.length();
	       String longestSubstring="";

	        for (int i = 0; i < n; i++) {
	        	String str1="";
	            for (int j = i + 1; j <= n; j++) {
	            	
	                String substring = str.substring(i, j);

	                if (Substring(substring) == true && substring.length() > longestSubstring.length()) {
	                    longestSubstring = substring;
	                }
	            }
	        }
	        
	        
	        System.out.println(longestSubstring);
	    }
	


}
