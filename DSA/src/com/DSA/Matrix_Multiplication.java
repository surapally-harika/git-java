package com.DSA;

public class Matrix_Multiplication {

	public static void main(String[] args) {

		int[][] matrix1 = { {1, 1}, {2, 2} };
		int[][] matrix2 = { {1, 1}, {2, 2} };
		
		int[][] matrix3 = new int[2][2];
		
		
		for(int i=0;i<matrix1.length;i++) {
	
			for(int j=0;j<matrix2.length;j++) {
				matrix3[i][j] = 0;
				for(int k=0;k<2;k++) {
				matrix3[i][j] += matrix1[i][k]*matrix2[k][j];
				}
				System.out.print(matrix3[i][j]+" ");
			}System.out.println();
		}
		

	}

}
