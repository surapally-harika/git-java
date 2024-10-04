package com.DSA;

public class MaxRepeated {

	public static void main(String[] args) {
		
		int[] arr = {2,3,3,4,5,4,6,4,7};

		int max=0;
		int temp =0;
		
		for(int i=0;i<arr.length;i++) {
			int count = 0;
				for(int j=0;j<arr.length;j++) {
					if(arr[i] == arr[j]) {
						count++;
					}
				}
			if(count > max) {
				max = count;
				temp = arr[i];
			}
		}
		System.out.println(temp);
	}

}
