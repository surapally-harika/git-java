package com.Employee;

public class Employee {

	public String name;
	public int empid;
	public int age;
	public String gender;
	public int salary;
	
	address address;
	

	public Employee(String name, int empid, int age, String gender, int salary, address address) {
		super();
		this.name = name;
		this.empid = empid;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.address = address;
		
	}



	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}


	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
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


	public address getAddress() {
		return address;
	}


	public void setAddress(address address) {
		this.address = address;
	}


	
}