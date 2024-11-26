package com.DSA;

public class MaxProduct {
	
//	static int function(int s,int end,int[] arr){
//		int product = 1;
//		int maxproduct =0;
//
//	        for (int i = end; i >= s; i--) {
//	            product *= arr[i];
//	            if (product > maxproduct) {
//	                maxproduct = product;
//	            }
//	            
//	        }
//
//		return maxproduct;
//	}

	public static void main(String[] args) {

		int[] nums = {-2, 6, -2, -10, 0, 2};
		int maxProduct = nums[0];
        int maxCurrent = nums[0];
        int minCurrent = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxCurrent;
                maxCurrent = minCurrent;
                minCurrent = temp;
            }

            maxCurrent = Math.max(nums[i], maxCurrent * nums[i]);
            minCurrent = Math.min(nums[i], minCurrent * nums[i]);

            maxProduct = Math.max(maxProduct, maxCurrent);
        }

        System.out.println(maxProduct);
//		int pos = 0 ;
//		
//		int finalProduct = 0;
//
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] == 0) {
//
//			finalProduct = 	function(pos,i-1,arr);
//				pos = i+1;
//			}if(pos >= arr.length) {
//				break;
//			}
//		}
//		System.out.println(finalProduct);
	}

}
