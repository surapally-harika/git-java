package com.DSA;

import java.util.Arrays;

public class stringArray {

	public static void main(String[] args) {
		String[] st= {"suman","sunil","ankita","ankit"};
		
		for(int i=0;i<st.length;i++) {
			for(int j=1;j<st.length;j++) {
				int result = st[i].compareTo(st[j]);
				if(result>0) {
					
					st[i]=st[i];
					st[j]=st[j];
				}
				if(result<0) {
					String temp=st[i];
					st[i]=st[j];
					st[j]=temp;
				}
				
			}
		}
		
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i]);
		}

	}

}
