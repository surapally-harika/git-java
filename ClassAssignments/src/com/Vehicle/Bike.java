package com.Vehicle;

public class Bike extends Vehicle {
	
	public String modelName;
	public int Price;
	public int numOfTyers;
	
	
	public Bike(String modelName, int price, int numOfTyers) {
		super();
		this.modelName = modelName;
		Price = price;
		this.numOfTyers = numOfTyers;
			}

	
	public String toString() {
		return "Bike [modelName=" + modelName + ", Price=" + Price + ", numOfTyers=" + numOfTyers + "]";
	}
	
	
	

}
