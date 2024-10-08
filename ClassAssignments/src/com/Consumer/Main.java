package com.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		List<Vehicle> vehicles = new ArrayList<>();
		
		vehicles.add(new Vehicle(234564,200000,"KN"));
		vehicles.add(new Vehicle(234545,2500000,"BMW"));
		vehicles.add(new Vehicle(87654,2300000,"TOYOTO"));
		vehicles.add(new Vehicle(45467,300000,"HONDA"));
		vehicles.add(new Vehicle(985765,3200000,"KN"));
		
//		Consumer<Vehicle> v1 = v -> {
//			System.out.println(v.registration_Num);
//		};
		
		Stream<Vehicle> v = vehicles.stream();
		v.forEach(System.out::println);

		
		
		
	}

}
