package com.DSA;

import java.util.Scanner;

public class rotating {

	public static void main(String[] args) {
		
		String str = "abcd";
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n = sc.nextInt();
		n = n % str.length();
		String rotate = str.substring(n)+str.substring(0,n);
		System.out.println(rotate);
		
		
		
	}

}
