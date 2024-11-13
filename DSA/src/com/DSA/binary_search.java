package com.DSA;

import java.util.Scanner;

public class binary_search {

	public static void main(String[] args) {

		int[] arr = {4,8,12,19,23,27,32};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
		
		boolean found = false;
		int i = 0;
		int j = arr.length-1;
		
		while(i <= j) {
			
			int mid = i+(j-i)/2;
			if(arr[mid] == num) {
				found = true;
				break;
			}else if(num > arr[mid]) {
				i = mid+1;
			}else {
				j = mid-1;
			}
		}
	System.out.println(found);
	}

}
