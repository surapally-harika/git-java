package com.interfaces;

public class employee extends person{
	
	public int empid;
	public int salary;
	public String skills;
	person person;
	
	

	public employee(String name, int age, String gender, int empid, int salary, String skills,
			com.interfaces.person person) {
		super(name, age, gender);
		this.empid = empid;
		this.salary = salary;
		this.skills = skills;
		this.person = person;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
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


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getSkills() {
		return skills;
	}


	public void setSkills(String skills) {
		this.skills = skills;
	}


	public void getinfo() {
		
		System.out.println("Empid:"+empid);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
		System.out.println("Salary:"+salary);
		System.out.println("skills:"+skills);
		
	}

	
	
	
}
