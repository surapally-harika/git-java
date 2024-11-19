package com.DSA;

public class symmetrix_matrix {

	public static void main(String[] args) {

		int[][] matrix =   {{1,2,3,6,7},
							{2,1,9,7,6},
							{3,9,2,9,4},
							{6,7,5,8,4},
							{7,6,4,4,2}};
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<=i;j++) {
				if(matrix[i][j] != matrix[j][i]) {
					System.out.println("no");
				}else {
					System.out.println("yes");
					break;
				}
			}break;
		}
		

			
		}
	

}
