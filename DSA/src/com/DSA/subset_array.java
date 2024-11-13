package com.DSA;

import java.util.HashSet;

public class subset_array {

	public static void main(String[] args) {

		int[] arr1 = {11, 1, 13, 21, 3, 7};
		int[] arr2 = {11, 2, 7, 1};
		
		HashSet<Integer> arr = new HashSet<>();
		for(int i : arr1) {
			arr.add(i);
		}
		
		for(int i : arr2) {
			if(!arr.contains(i)) {
				
				System.out.println("no");
				
			}
		}
		System.out.println("yes");
	}

}
