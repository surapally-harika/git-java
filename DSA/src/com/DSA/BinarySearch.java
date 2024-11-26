package com.DSA;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int pos = 0;
		int k = 5;
		int start=0;
		int end = arr.length-1;
		
		while(start <= end) {
			int  mid = start + (end-start)/2;
			if(arr[mid] == k) {
				
				pos = mid;
				break;
			}
			
			else if(k > arr[mid]) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		System.out.println(pos+1);
	}

}
