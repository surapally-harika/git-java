package com.DSA;

public class ArrangeElements {

	public static void main(String[] args) {
		
		int[] arr = {2,3,5,7,4,9,3};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]%2 == 0 && arr[j+1]%2 != 0 ) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
