package com.DSA;

public class LongestSubsequence {

	public static void main(String[] args) {


		int[] arr = {1,0,0,1,0,0,0,1};
		int n=arr.length;
//		int count =0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				for(int k = i;k<=j;k++) {
					System.out.print(arr[k]+" ");
//	                  System.out.println();
				}
				System.out.println();
			}
			
		}
		

	}

}
