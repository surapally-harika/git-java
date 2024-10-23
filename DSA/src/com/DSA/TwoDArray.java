package com.DSA;

public class TwoDArray {

	public static void main(String[] args) {

		int[][] matrix = { {0,1,1,1},
				   		   {0,0,1,1},
						   {1,1,1,1},
						   {0,0,0,0}};

		int max = 0;
		int row = 0;

		for(int i=0;i<matrix.length;i++) {
			int count = 0 ;
			for(int j=0;j<matrix.length;j++) {
				if(matrix[i][j] == 1) {
					count++;

				}
			}
			if(count > max ) {
				max = count;

				row = i;
			}

		}
		System.out.println(row);
		

	}

}
