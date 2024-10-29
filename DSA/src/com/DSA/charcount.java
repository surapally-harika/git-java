package com.DSA;

public class charcount {

	public static void main(String[] args) {

		char[] c = {'a','a','a','b','b','c','c','c','c'};
		StringBuilder ch = new StringBuilder();
		int count =1;
	
			for(int j=1;j<c.length;j++) {
				
				if(c[j] == c[j-1]) {
					count++;
				}else {
					ch.append(c[j-1]).append(count);
					count = 1;
				}
				
			}

		ch.append(c[c.length-1]).append(count);
		System.out.println(ch.toString());
	}

}
