package com.DSA;

public class Toeplitz {
	
	public static void main(String[] args) {
		
		int[][] matrix = {{1, 2, 3, 4},
		          {5, 1, 2, 3},
		          {9, 5, 1, 2}};


			boolean toeplitz = true;
			
			for(int i=0;i<matrix.length;i++) {
				
				for(int j=0;j<matrix[0].length-1;j++) {
					if(matrix[i][j] != matrix[i+1][j+1]) {
						toeplitz = false;
						break;
					}
					
				
				}
				if(!toeplitz)	
					break;
			}
			if(toeplitz) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}

	}

}
