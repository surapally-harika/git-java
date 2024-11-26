package com.DSA;

import java.util.ArrayList;

public class Triplets {
	
	public static void main(String[] args) {
		
		int[] arr = {-1,0,1,2,-1,-4};
		
		
		for(int i=1;i<arr.length-1;i++) {
			for(int j=i;j<arr.length-1;j++) {
				for(int k=j+1;j<arr.length;j++) {
					int sum = arr[i]+arr[j]+arr[k];
					if(sum == 0) {
						System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
					}
				}
			}
		}
	}

}
