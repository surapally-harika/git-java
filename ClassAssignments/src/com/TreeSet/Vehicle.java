package com.TreeSet;

import java.util.Objects;

public class Vehicle implements Comparable<Vehicle>{
	
	public int registration_Num;
	public int model;
	public int price;
	
	public Vehicle(int registration_Num, int model, int price) {
		super();
		this.registration_Num = registration_Num;
		this.model = model;
		this.price = price;
	}

	public int getRegistration_Num() {
		return registration_Num;
	}

	public void setRegistration_Num(int registration_Num) {
		this.registration_Num = registration_Num;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [registration_Num=" + registration_Num + ", model=" + model + ", price=" + price + "]";
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(model, price, registration_Num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return model == other.model && price == other.price && registration_Num == other.registration_Num;
	}
	
	@Override
	public int compareTo(Vehicle o) {
		
	    if(this.getPrice() > o.getPrice()) {
			return -1;
		}else if(this.getPrice() == o.getPrice()) {
			
			     if(this.getModel() > o.getModel()) {
			    	    return -1;
			     }else {
			    	  return 1;
			     }
		}else {
			return 1;
		}
	}
	
	
	

}
