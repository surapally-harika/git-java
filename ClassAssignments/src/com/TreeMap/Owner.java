package com.TreeMap;

public class Owner implements Comparable<Owner>{

	public String name;
	public int age;
	public String gender;
	
	public Owner(String name, int age, String gender) {
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
	
	@Override
	public String toString() {
		return "Owner [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	@Override
	public int compareTo(Owner o) {
		if(o.getAge())
	}
	
	
	
}
