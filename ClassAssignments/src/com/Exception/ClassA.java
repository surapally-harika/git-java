package com.Exception;

public class ClassA {
	
	
	public static void divide(int n1,int n2) throws Exception{
		int result = 0;
		try {
		result = n1/n2;
		System.out.println(result);
		}catch (ArithmeticException e) {
			throw new Exception(e.getMessage());
		}
	
		
	}
	public static void main(String[] args) throws Exception {
		
		
			divide(4, 0);

		
		
	}

}
