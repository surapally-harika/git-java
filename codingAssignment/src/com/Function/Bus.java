package com.Function;

public class Bus {

	public String registration_Num;
	public int price;
	public int model;
	public int no_Seats;
	
	public Bus(String registration_Num, int price, int model, int no_Seats) {
		super();
		this.registration_Num = registration_Num;
		this.price = price;
		this.model = model;
		this.no_Seats = no_Seats;
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

	public int getNo_Seats() {
		return no_Seats;
	}

	public void setNo_Seats(int no_Seats) {
		this.no_Seats = no_Seats;
	}

	@Override
	public String toString() {
		return "Bus [registration_Num=" + registration_Num + ", price=" + price + ", model=" + model + ", no_Seats="
				+ no_Seats + "]";
	}
	
	
	
}
