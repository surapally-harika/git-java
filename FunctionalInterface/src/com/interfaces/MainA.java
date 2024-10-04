package com.interfaces;

public class MainA {

	public static void main(String[] args) {
		
		info(null);

	
//	example e = new example() {
//
//		@Override
//		public void funA() {
//			System.out.println("funA is implemented using the anonymous ");
//			
//		}
//		
//	};
		
		example e = () ->{
			System.out.println("funA is implemented using lambda expression");
		};
		info(e);
	
//	classA a = new classA();
//	info(a);
	
}	
	public static void info(example e) {
		
		if(e != null) {
			e.funA();
		}
		else {
			System.out.println("null is passed");
		}
	}
}

