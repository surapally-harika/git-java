package com.interfaces;

public class cat  implements animal{

	@Override
	public void move() {
		System.out.println("cats are  moving");
		
	}

	@Override
	public void makesound() {
		System.out.println("cats are make sounds");
		
	}

	@Override
	public void eat() {
		System.out.println("cats are eat the bones");
		
	}

	@Override
	public void sleep() {
		System.out.println("cats are sleep");
	}

}
