package com.DSA;



public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] nums = {1, 2, 5, 4, 1, 3, 2, 5};
        boolean[] seen = new boolean[101]; 
        int uniqueCount = 0;
        for (int num : nums) {
            if (!seen[num]) {
                nums[uniqueCount++] = num; 
                seen[num] = true;
            }
        }

        for (int i = 0; i < uniqueCount - 1; i++) {
            for (int j = i + 1; j < uniqueCount; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i]+" ");
            
        }
    
	}

}
