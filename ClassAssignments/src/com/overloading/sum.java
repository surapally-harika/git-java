package com.overloading;

public class sum {

	public void sum(int num1,int num2) {
		
		System.out.println("sum of two numbers is:"+(num1+num2));
		
	}
	
	public void sum(double num1,double num2) {
		System.out.println("sum of two numbers is:"+(num1+num2));
	}
	public static void main(String[] args) {
		
		sum s = new sum();
		s.sum(4.5,6.5);
		
	}

}
