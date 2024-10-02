package com.FunctionalInterface;

public class Main {

	public static void main(String[] args) {
		
		FunInter f = (a,b) ->{
			return a+b;
		};
		
		int result = f.sum(5, 4);
		System.out.println(result);
	}

}
