package com.vehicle;

public class Main {
	
	
	
	
	public static String expensive(Vehicle v) {
		
		if(v.price>200000) {
			return "expensive";
					
		}else {
			return "not expensive";
		}
		
	}

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle(200001);
		
//		v.setPrice(300000);
		
		String result = expensive(v);
		
		System.out.println(result);
		
		

	}

}
