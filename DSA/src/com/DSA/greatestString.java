package com.DSA;

public class greatestString {

	public static void main(String[] args) {
		
		String str="abdea";
		String str2="abcda";
		int result = str.compareTo(str2);
        if (result > 0) {
            System.out.println(str + " is greater and comes after " + str2 + " in lexicographical order.");
        } else if (result < 0) {
            System.out.println(str2 + " is greater and comes after " + str + " in lexicographical order.");
        } else {
            System.out.println(str + " and " + str2 + " are equal.");
        }
		
	}

}
