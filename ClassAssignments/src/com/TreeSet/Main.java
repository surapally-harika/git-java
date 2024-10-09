package com.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		TreeSet<Vehicle> vehicles = new TreeSet<>();
		
		vehicles.add(new Vehicle(34556,2018,450000));
		vehicles.add(new Vehicle(87654,2016,550000));
		vehicles.add(new Vehicle(87654,2019,560000));
		vehicles.add(new Vehicle(92354,2020,450000));
		vehicles.add(new Vehicle(87653,2022,550000));
		
		Iterator<Vehicle> it = vehicles.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
