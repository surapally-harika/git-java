package com.DSA;

public class MatrixDiagonal {

	public static void main(String[] args) {

		int[][] matrix = {{2, 3, 5, 1},
						 {0, 9, 4, 6},
						 {2, 8, 7, 3}, 
						 {2, 1, 4, 0}};
		
		int m = matrix.length;
		
		for(int i=0;i<m;i++) {
			System.out.println(matrix[i][i]);
		}
		
		

	}

}
