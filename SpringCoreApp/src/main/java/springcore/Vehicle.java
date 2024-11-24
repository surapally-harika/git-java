package springcore;

public class Vehicle {
	
	private int regisration_num;
	private int price;
	private int model;
	
	
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param regisration_num
	 * @param price
	 * @param model
	 */
	public Vehicle(int regisration_num, int price, int model) {
		super();
		this.regisration_num = regisration_num;
		this.price = price;
		this.model = model;
	}



	/**
	 * @return the regisration_num
	 */
	public int getRegisration_num() {
		return regisration_num;
	}



	/**
	 * @param regisration_num the regisration_num to set
	 */
	public void setRegisration_num(int regisration_num) {
		this.regisration_num = regisration_num;
	}



	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}



	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}



	/**
	 * @return the model
	 */
	public int getModel() {
		return model;
	}



	/**
	 * @param model the model to set
	 */
	public void setModel(int model) {
		this.model = model;
	}



	@Override
	public String toString() {
		return "Vehicle [regisration_num=" + regisration_num + ", price=" + price + ", model=" + model + "]";
	}
	

}
