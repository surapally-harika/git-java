package com.DSA;

public class missingNum {
	
	
	public static int smallestPositiveNum(int[] arr) {
		
		int n=arr.length;
		
		for(int i=0;i<n;i++) {
			
				if(arr[i] > 0 && arr[i] <= n) {
				int temp = arr[i];
				arr[i] = arr[temp -1];
				arr[temp - 1] = temp;
			}
		}
		
		for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
		return n+1;
	
	}

	public static void main(String[] args) {
		
		int[] arr = {-3, 0, -4, 2, 1};
		
		System.out.println(smallestPositiveNum(arr));
	}

}
