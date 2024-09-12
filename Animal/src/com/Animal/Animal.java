package com.Animal;

public class Animal {
	
	public String name;
	public int age;
	public int numOflegs;
	public String isVegiterion;
	
	
	public Animal(String name, int age, int numOflegs, String isVegiterion) {
		super();
		this.name = name;
		this.age = age;
		this.numOflegs = numOflegs;
		this.isVegiterion = isVegiterion;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getNumOflegs() {
		return numOflegs;
	}


	public void setNumOfSeats(int numOflegs) {
		this.numOflegs = numOflegs;
	}


	public String getIsVegiterion() {
		return isVegiterion;
	}


	public void setIsVegiterion(String isVegiterion) {
		this.isVegiterion = isVegiterion;
	}
	
	
	public void details() {
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(numOflegs);
		System.out.println(isVegiterion);
		
	}

}
