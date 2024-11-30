package com.DSA;



public class MaxGifts {

	public static void main(String[] args) {

		int[] arr = {25,64,9,4,100};
		int k=9;
	
		for(int i=0;i<k;i++) {
			int max = 0;
			for(int j=1;j<arr.length;j++) {
			if(arr[j] > max) {
				max = arr[j];
				
				}

			}
			int maxGifts = arr[max];
            int sqrtFloor = 0;
            for (int x = 0; x <= maxGifts; x++) {
                sqrtFloor = x;
            }

           
            arr[max] = sqrtFloor;
        }

      
        int totalGifts = 0;
        for (int gift : arr) {
            totalGifts += gift;
        }

        System.out.println(totalGifts);
    
		
		
		
	}

}
