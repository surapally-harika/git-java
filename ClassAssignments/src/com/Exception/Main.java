package com.Exception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		
		
		int[] arr = {1,2,3,4};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num:");
		int a = sc.nextInt();
		try {
		arr[5] = a;
		}
		catch(Exception e) {
			System.out.println("ArrayOutOfBoundsException");
		}
		
		
	}

}
