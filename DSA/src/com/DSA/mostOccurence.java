package com.DSA;

public class mostOccurence {

	public static void main(String[] args) {
		
		int[] arr = {2,3,7,2,4,3,7,9,3,1};
		int temp = 0;
		int most_Occurence = 0;
		
		for(int i=0;i<arr.length;i++) {
			int count = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					
					count++;
					
				}
				
			}if(count > most_Occurence) {
				most_Occurence = count;
				temp = arr[i];
			}
		}
		
		System.out.println(temp);
	}

}
