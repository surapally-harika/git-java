package com.TreeMap;

import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
	
		TreeMap<Owner,Vehicle> treemap = new TreeMap<>();
		
		treemap.put(new Owner("harika",21,"female"), new Vehicle(4546,34000));
		treemap.put(new Owner("hari",22,"male"), new Vehicle(8756,35000));
		treemap.put(new Owner("prem",20,"male"), new Vehicle(8975,47000));
		treemap.put(new Owner("gayatri",22,"female"), new Vehicle(5645,45000));
		treemap.put(new Owner("hani",21,"female"), new Vehicle(7654,50000));
		
		
	}

}
