package com.casting;

public class animal {

	
	
	public String color;
	public int hight;
	public int weight;
	
	
	public animal(String color, int height, int weight) {
		super();
		this.color = color;
		this.hight = hight;
		this.weight = weight;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getHight() {
		return hight;
	}


	public void setHight(int hight) {
		this.hight = hight;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void details() {
		
		System.out.println("animal color:"+this.color);
		System.out.println("animal hight:"+this.hight);
		System.out.println("animal weight:"+this.weight);
	}
	
}
