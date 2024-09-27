package com.DSA;

public class MinMax {

	public static void main(String[] args) {
		int[] array= {4,5,9,3,5,7};
		int min=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
			
		}System.out.println("min"+min);
		
		int max=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}System.out.println("max"+max);
	}

	
}
