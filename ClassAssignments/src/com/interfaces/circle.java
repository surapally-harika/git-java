package com.interfaces;

public class circle  implements shape{
	
	public int radius;
	
	

	public circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public int area() {
		int pi= (int) 3.14;
		int result2=pi*radius*radius;
		return result2;
	}

	@Override
	public int parameter() {
		int pi= (int) 3.14;
		int result3=2*(pi*radius*radius);
		return result3;
	}

}
