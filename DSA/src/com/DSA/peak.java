package com.DSA;

public class peak {

	public static void main(String[] args) {
     
		int[] arr = {10, 20, 15, 2, 23, 90, 90};
		
			int n=arr.length;
			if(arr[0] >= arr[1]) {
				System.out.println(arr[0]);
			}
			if(arr[n-1] >= arr[n-2]) {
				System.out.println(arr[n-1]);
			}
			
				for(int j=1;j<n-1;j++) {
				
					if(arr[j-1] < arr[j] && arr[j+1] < arr[j] ) {
					
						
						System.out.println(arr[j]);
						
				 }
				
				}
			
			
		
		
	}

}
