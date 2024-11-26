package com.DSA;

public class MinMaxDiff {

	public static void main(String[] args) {

		int[] arr = {2,3,9,5,1,7};
		
		int mindiff = 0;
		int maxdiff = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int diff = arr[i]-arr[j];
				if(diff > maxdiff) {
					maxdiff = diff;
				}if( diff < mindiff) {
					mindiff = diff;
				}
			}
		}
		System.out.println("mindiff ="+mindiff);
		System.out.println("maxdiff ="+maxdiff);

	}

}
