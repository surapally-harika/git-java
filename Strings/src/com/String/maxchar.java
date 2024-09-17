package com.String;

public class maxchar {

	public static void main(String[] args) {
		String str = "abcadefafa";
		int maxCount=1; 
		char max_count_char = str.charAt(0);
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int count=0;
			for(int j=1;j<str.length()-1;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}if(count>maxCount) {
				maxCount = count;
				max_count_char = ch;
			}
		}
		System.out.print(max_count_char);
	}

}
