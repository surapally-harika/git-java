package com.DSA;

import java.util.ArrayList;

public class NumDigit {

	public static void main(String[] args) {


		int[] arr = {7,1345,3,93};
		
		ArrayList<Integer> array = new ArrayList<>();
		for(int i : arr) {
		String num = Integer.toString(i);
		
		for(char j : num.toCharArray() ) {
			array.add(Character.getNumericValue(j));
			}
		
		}
		System.out.println(array);
		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] > 9) {
//				int n = arr[i]/10;
//				array.add(n);
//				
//				 n = arr[i]%10;
//				array.add(n);
//				
//								
//			}else {
//				array.add(arr[i]);
//			}
//		}
//		for(int i : array) {
//			System.out.print(i+",");
//			
//		}

	}

}
