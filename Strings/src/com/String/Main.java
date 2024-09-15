package com.String;

public class Main {

	public static void main(String[] args) {
		
		String str = "Harika";
		String str1="Harika";
		String st=new String("Gayathri");
		String st1=new String("Gayathri");
		if(str==str1) {
			System.out.println("both are same");
		}else {
			System.out.println("both are not same");
		}
		
		if(st==st1) {
			System.out.println("both are same");
		}else {
			System.out.println("both are not same");
		}
		System.out.println(st.equals(st1));
		
		
	}

}
