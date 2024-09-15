package com.Statement;

public class sumOfEvenDigit {

	public static void main(String[] args) {
		int num=230568;
		int sum=0;
		while(num!=0) {
			int n=num%10;
			while(n%2==0) {
			sum+=n;
			}
			num/=10;	
		}
		System.out.print(sum);

	}

}
