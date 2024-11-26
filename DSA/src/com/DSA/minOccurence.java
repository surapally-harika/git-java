package com.DSA;

public class minOccurence {

	public static void main(String[] args) {
		
		int[] arr = {2,3,4,6,2,10,3,6,3,11};
		int temp =0;
		int min_occurence=0;
		for(int i=0;i<arr.length-1;i++) {
			int count = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
				
			}
			if(count > min_occurence) {
				min_occurence = count;
				temp =  arr[i];
			}
		}
		
		
		System.out.println(temp);

	}

}
