package com.Vehicle;

public class Vehicle {
	public int VehicleNum;
	
	public Vehicle() {
		
	}
	
	
	public Vehicle(int vehicleNum) {
		super();
		VehicleNum = vehicleNum;
	}
	
	
	
	public String toString() {
		return "Vehicle [VehicleNum=" + VehicleNum + "]";
	}


	public void Start() {
		System.out.println("The vehicle is in start mood");
	}
	public void Stop() {
		System.out.println("The vehicle is in start mood");
	}
	public void Break() {
		System.out.println("The vehicle is in break mood");
	}
	public void Accelerate() {
		System.out.println("The vehicle is in accelerate mood");
	}
	

}
