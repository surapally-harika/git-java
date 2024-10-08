package com.Function;

public class Truck {

	public String registration_Num;
	public int price;
	public int model;
	public int capacity;
	
	
	public Truck(String registration_Num, int price, int model, int capacity) {
		super();
		this.registration_Num = registration_Num;
		this.price = price;
		this.model = model;
		this.capacity = capacity;
	}


	public String getRegistration_Num() {
		return registration_Num;
	}


	public void setRegistration_Num(String registration_Num) {
		this.registration_Num = registration_Num;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getModel() {
		return model;
	}


	public void setModel(int model) {
		this.model = model;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	@Override
	public String toString() {
		return "Truck [registration_Num=" + registration_Num + ", price=" + price + ", model=" + model + ", capacity="
				+ capacity + "]";
	}
	
	
	
}
