  package com.DSA;

public class duplicateCharacter {

	public static void main(String[] args) {
		String str = "abcadfb";
		StringBuilder sb = new StringBuilder(str.length());
		
		boolean[] seen=new boolean[128];
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(!seen[c]) {
				sb.append(c);
				seen[c]=true;
				
				
			}
			
		}
		System.out.println(sb);
		
	}

}
