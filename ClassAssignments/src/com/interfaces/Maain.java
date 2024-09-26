package com.interfaces;

public class Maain {

	public static void main(String[] args) {
		rectangle r=new rectangle(5,7);
		System.out.println("parameter:"+r.parameter());
		System.out.println("area:"+r.area());
		
		circle c=new circle(5);
		System.out.println("parameter:"+c.parameter());
		System.out.println("area:"+c.area());
	}

}
