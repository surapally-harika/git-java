package com.interfaces;

public class rectangle implements shape {
	
	public int height;
	public int weight;
	

	public rectangle(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int area() {
		int result=height+weight;
		return result;
	}

	@Override
	public int parameter() {
		int result1=2*(height+weight);
		return result1;
	}
	
	
	

}
