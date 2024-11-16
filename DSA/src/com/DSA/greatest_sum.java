package com.DSA;

import java.util.Arrays;

public class greatest_sum {

	public static void main(String[] args) {

		int[] arr = {5, 2, 7, 6, 9, 1, 2};
        
        int max1 = Integer.MIN_VALUE; 
        int max2 = Integer.MIN_VALUE; 
        for (int num : arr) {
            if (num > max1) {

                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        int greatestSum = max1 + max2;
        System.out.println("Greatest sum of two integers: " + greatestSum);
		
		
//		int greatest_sum = 0;	
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				int sum = arr[i] + arr[j];
//				if(sum > greatest_sum) {
//					greatest_sum = sum;
//				}
//			}
//		}
//		System.out.println(greatest_sum);
//		
		
		
		
	}

}
