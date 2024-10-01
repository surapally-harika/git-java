package LinkedList;

public class Car {

	
	public String registration_Num;
	public String model;
	public int price;
	
	
	public Car(String registration_Num, String model, int price) {
		super();
		this.registration_Num = registration_Num;
		this.model = model;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Car [registration_Num=" + registration_Num + ", model=" + model + ", price=" + price + "]";
	}
	
	
	
}
