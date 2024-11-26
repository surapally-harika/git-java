package com.DSA;

public class MaxMin {

	public static void main(String[] args) {
		
		int[] arr = {1,2,-3,5,6,-20,30,27,6,9};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			
		}
		System.out.println("minimum number:"+min);
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("maximum number:"+max);

	}

}
