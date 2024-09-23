package com.override;



public class car extends vehicle{

	
	public void start() {
		System.out.println("car is in start mood");
	}
	public static void main(String[] args) {
		

		car c = new car();
		c.start();
	}

}
