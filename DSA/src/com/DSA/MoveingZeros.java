package com.DSA;

public class MoveingZeros {

	public static void main(String[] args) {

		int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
			if(arr[j] == 0) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				}
			}
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
			
		}
	}

}
