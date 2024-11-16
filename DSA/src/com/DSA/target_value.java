package com.DSA;

public class target_value {

	public static void main(String[] args) {

		int[] arr = {-8, 1, 4, 6, 10, 45};
		int target = 16;
		boolean found = false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j] == target) {
					found = true;
					break;
				}	
			}
		}
		System.out.println(found);

	}

}
