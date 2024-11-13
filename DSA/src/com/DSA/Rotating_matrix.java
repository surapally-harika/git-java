package com.DSA;

public class Rotating_matrix {

	public static void main(String[] args) {

		int[][] matrix = { {1, 2, 3, 4},
						   {5, 6, 7, 8},
						   {9, 10,11,12},
						   {13,14,15,16}};
		int n = matrix.length;

		for(int i=0;i<n;i++) {
			
			for(int j=0;j<n/2;j++) {
				
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][n-i-1];
				matrix[j][n-i-1] = temp;

			}
			
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
			System.out.print(matrix[i][j]+"  ");
			}System.out.println();
		}

	}

}
