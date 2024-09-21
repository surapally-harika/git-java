package com.Vehicle;

public class Mian {

	public static void main(String[] args) {
	  
		
		Bike b = new Bike("Honda", 40000, 4);
		b.Start();
		b.Accelerate();
		b.Break();
		b.Stop();
	
		
		Car c = new Car("TOYOTO", 2500000, 3455);
		
		c.Start();
		c.startAC();
		c.Break();
		c.Accelerate();
		c.Stop();
		
		
		
		
		
	}

}
