package com.vehicle;

public class Vehicle {
	public String nameOfVehicle;
	public int price ;
	public String model;
	public String color;
	
    public  Vehicle(int price) {
    	 	this.price=price;
	
	}
	 
	public Vehicle(String nameOfVehicle, int price, String model, String color) {
		super();
		this.nameOfVehicle = nameOfVehicle;
		this.price = price;
		this.model = model;
		this.color = color;
	}

	

	public String getNameOfVehicle() {
		return nameOfVehicle;
	}


	public void setNameOfVehicle(String nameOfVehicle) {
		this.nameOfVehicle = nameOfVehicle;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
	
}
