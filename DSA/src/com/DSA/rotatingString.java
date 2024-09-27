package com.DSA;

import java.util.Scanner;

public class rotatingString {

	public static void main(String[] args) {
		
		String str = "abcd";
        int n = 3;
        n = n % str.length();
        String rotated = str.substring(n) + str.substring(0, n);
        System.out.println(rotated);
	}

}
