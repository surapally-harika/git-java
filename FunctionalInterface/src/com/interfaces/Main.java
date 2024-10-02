package com.interfaces;

public class Main {

	public static void main(String[] args) {
		
		InterY i1 = new InterY() {
			public void info() {
				System.out.println("info method is called using the anonymous inner class");
			}
		};
		i1.info();
		
		InterY i = () -> {
			System.out.println("info method is called using the lambda expresion");
		};
		i.info();
	}

}
