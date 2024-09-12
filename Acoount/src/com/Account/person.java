package com.Account;

public class person {
	
	public String name;
	public int age;
	public String gender;
	account account;
	
	public  person(String name, int age, String gender,account account) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.account = account;
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

	public account getAccount() {
		return account;
	}

	public void setAccount(account account) {
		this.account = account;
	}


	
	
	
	
}
