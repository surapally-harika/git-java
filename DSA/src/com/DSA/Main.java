package com.DSA;

public class Main {

	public static void main(String[] args) {
		
		// selection sort
		
		int[] arr = {1,5,3,4,2};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}System.out.println("Selection sort:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//bubble sort 
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[i] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}System.out.println("Bobble sort:");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
