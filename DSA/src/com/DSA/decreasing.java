package com.DSA;

public class decreasing {

	public static void main(String[] args) {
		int[] arr = {1,3,9,0,3,1};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("decreasing order:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
