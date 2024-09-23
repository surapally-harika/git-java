package com.interfaces;

public class person implements human{

	public String name;
	public int age;
	public String gender;
	
	
	public person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void getinfo() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		
	
	}
	
	
	@Override
	public void walk() {
		System.out.println("person can walk");
		
	}

	@Override
	public void talk() {
		
		System.out.println("person can talk");
	}

	@Override
	public void eat() {
		
		System.out.println("person can eat");
	}

	@Override
	public void sleep() {
		
	System.out.println("person can sleep");	
	}

	
}
