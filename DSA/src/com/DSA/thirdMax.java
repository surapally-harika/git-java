package com.DSA;

public class thirdMax {

	public static void main(String[] args) {
		
		int[] arr = {2, 6, 8, 23, 14, 12, 26};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[j]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[n-3]);

	}

}
