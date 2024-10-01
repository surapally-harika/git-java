package com.DSA;

public class Maximum {

	public static void main(String[] args) {
		int[] arr = {340,450,320,920,560,720,640};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		for(int i=0;i<n;i++){
			
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		System.out.println("first maximum:"+arr[n-1]+"\n"+"second maximum:"+arr[n-2]);
	}

}
