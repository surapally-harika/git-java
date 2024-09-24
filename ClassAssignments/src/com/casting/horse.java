package com.casting;

import java.util.Objects;

public class horse extends animal {
	
	public  String name;
	public String gender;
	animal animal;
	
	
	public horse(String color, int height, int weight, String name, String gender, com.casting.animal animal) {
		super(color, height, weight);
		this.name = name;
		this.gender = gender;
		this.animal = animal;
	}


	
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public animal getAnimal() {
		return animal;
	}




	public void setAnimal(animal animal) {
		this.animal = animal;
	}




	public void details() {
		
		System.out.println("Name:"+this.getName());
		System.out.println("Gender:"+this.getGender());
		System.out.println("Color:"+this.getColor());
		System.out.println("Hight:"+this.getHight());
		System.out.println("Weight:"+this.getWeight());
	}




	@Override
	public int hashCode() {
		return Objects.hash(animal, gender, name);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		horse other = (horse) obj;
		return Objects.equals(animal, other.animal) && Objects.equals(gender, other.gender)
				&& Objects.equals(name, other.name);
	}
	
	

}
