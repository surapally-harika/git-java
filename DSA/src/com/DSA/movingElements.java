package com.DSA;

public class movingElements {

	public static void main(String[] args) {

		int[] arr = {2,3,5,6,3,4,1};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length-1;j++) {
				if(arr[j] %2 == 0 && arr[j+1]%2 != 0) {
					int swap = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = swap;
				}
			}
		}
		
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
	}

}
