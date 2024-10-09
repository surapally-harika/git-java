package com.TreeMap;

public class Vehicle {
	
	public int registration_num;
	public int model_Price;
	
	
	public Vehicle(int registration_num, int model_Price) {
		super();
		this.registration_num = registration_num;
		this.model_Price = model_Price;
	}
	
	public int getRegistration_num() {
		return registration_num;
	}
	public void setRegistration_num(int registration_num) {
		this.registration_num = registration_num;
	}
	public int getModel_Price() {
		return model_Price;
	}
	public void setModel_Price(int model_Price) {
		this.model_Price = model_Price;
	}
	
	
	@Override
	public String toString() {
		return "Vehicle [registration_num=" + registration_num + ", model_Price=" + model_Price + "]";
	}
	
	
	

}
