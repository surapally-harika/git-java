package com.DSA;

public class maxProfit {

	public static void main(String[] args) {
		
		int[] arr = {7,1,5,3,6,4};
		
		int minprice = arr[0];
		int maxprofit = 0;
		
		for(int price : arr) {
			if(price < minprice) {
				minprice = price;
			}else if(price-minprice > maxprofit) {
				maxprofit = price-minprice;
			}
			
		}
		System.out.println(maxprofit);
	}

}
