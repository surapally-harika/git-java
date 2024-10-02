package com.DSA;

public class secondMax {

	public static void main(String[] args) {
		
		int[] arr = {1,35,0,-23,45,89,56,37};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Second Maximum:"+arr[n-2]);
	}

}
