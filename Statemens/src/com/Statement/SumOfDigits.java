package com.Statement;

public class SumOfDigits {
	public static void main(String[] args) {
		
		int num=2035;
		int sum=0;
		
		while(num>0) {
			
			int i=num%10;
			sum+=i;
			num/=10;
		}
			
		System.out.print("sum of digits:"+sum);
		
	}

}
