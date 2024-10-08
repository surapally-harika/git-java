package com.Consumer;

public class Vehicle {

	public int registration_Num;
	public int price;
	public String model;
	
	public Vehicle() {
		
	}
	
	public Vehicle(int registration_Num, int price, String model) {
		super();
		this.registration_Num = registration_Num;
		this.price = price;
		this.model = model;
	}

	public int getRegistration_Num() {
		return registration_Num;
	}

	public void setRegistration_Num(int registration_Num) {
		this.registration_Num = registration_Num;
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

	@Override
	public String toString() {
		return "vehicle [registration_Num=" + registration_Num + ", price=" + price + ", model=" + model + "]";
	}
	
	
	
}
