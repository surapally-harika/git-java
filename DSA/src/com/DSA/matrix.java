package com.DSA;

public class matrix {

	public static void main(String[] args) {


		int[][] matrix = {{-6, 3, 4},
				          {-2, 9, 6},
				          {-2,3, 5}};
		
		int row = 0;
		int temp = 0;
		for(int i=0;i<matrix.length;i++) {
			
			int sum = 0;
//			for(int j=0;j<matrix.length;j++) {
				sum+= matrix[i][i];
				
//			 }
			if(sum >= temp) {
				temp = sum;
				row = i;
			}
			
			
		}
		System.out.println(row);
		
	}

}
