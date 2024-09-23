package com.interfaces;

public class dog implements animal {

	@Override
	public void move() {
		System.out.println("dog are  moving");
		
	}

	@Override
	public void makesound() {
		System.out.println("dogs are make sounds");
		
	}

	@Override
	public void eat() {
		System.out.println("dogs are eat the bones");
		
	}

	@Override
	public void sleep() {
		System.out.println("dogs are sleep");
	}

}
