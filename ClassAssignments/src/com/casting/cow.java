package com.casting;

public class cow  extends animal{

	public String name;
	public String gender;
	horse horse;
	



	public cow(String color, int height, int weight, String name, String gender, com.casting.horse horse) {
		super(color, height, weight);
		this.name = name;
		this.gender = gender;
		this.horse = horse;
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


	public horse getHorse() {
		return horse;
	}


	public void setHorse(horse horse) {
		this.horse = horse;
	}
	
	

}
