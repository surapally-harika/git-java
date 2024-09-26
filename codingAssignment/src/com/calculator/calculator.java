package com.calculator;

public class calculator {

	public static int sum(int n1,int n2) {
		int sum=n1+n2;
		return sum;
	}
	
	public static int mul(int n1,int n2,int n3) {
		int result=n1*n2*n3;
		return result;
	}
	
	public static double sub(double n1,double n2) {
		double diff=n1-n2;
		return diff;
	}
	
	public static int div(int n1,int n2) {
		int rem=n1/n1;
		return rem;
	}
	
	public static void main(String[] args) {
		
		System.out.println("sum="+sum(5,4));
		System.out.println("multiplication="+mul(5,4,2));
		System.out.println("subtaction="+sub(5.3,7.4));
		System.out.println("division="+div(5,4));

		
	}

}
