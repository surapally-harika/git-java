package com.DSA;

public class Lexicographical {
	
	public static boolean  function(String str1,String str2) {
		
		int i=0;
		int j=0;
		while(i<str1.length() && j<str2.length()) {
			int char1 = str1.charAt(i);
			int char2 = str2.charAt(j);
			if(char2 > char1) {
				return false;
			}else if(char1 > char2) {
				return true;
			}
			i++;
			j++;
		}
		
		if(i != str1.length()) {
			return true;
		}if(j != str1.length()) {
			return false;
		}return false;
		
	}

	public static void main(String[] args) {
		
		String[] arr = {"abcd","abed","reo","debw","abce"};
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(function(arr[i],arr[j])) {
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			
			}
			
			
		}
		for(String s : arr) {
			System.out.println(s);
		}
		
	}

}
