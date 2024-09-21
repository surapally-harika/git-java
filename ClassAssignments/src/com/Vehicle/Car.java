package com.Vehicle;

public class Car extends Vehicle{
	public String modelName;
	public int Price;
	
	
	

	public Car(String modelName, int price, int VehicleNum) {
		super(VehicleNum);
		this.modelName = modelName;
		Price = price;
		
	}





	@Override
	public String toString() {
		return "Car [modelName=" + modelName + ", Price=" + Price + "]";
	}




	public void startAC() {
		System.out.println("car is in AC mood");
	}




	

}
