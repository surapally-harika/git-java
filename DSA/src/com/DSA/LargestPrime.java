package com.DSA;

public class LargestPrime {	

		public static boolean isPrime(int num) {
		
	        if (num < 2) 
	        	return false;
	        for (int i = 2; i * i <= num; i++) {
	            if (num % i == 0)
	            	return false;
	        }
	        return true;
	    }
	public static void main(String[] args) {
		
		int[][] arr= {{1,2,3},{5,17,7},{9,11,10}};
		int largest_prime=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(isPrime(arr[i][i])) {
				largest_prime = Math.max(largest_prime, arr[i][i]);
				
			}
			 	
			
		}
		
		System.out.println(largest_prime);
		
	}

}
