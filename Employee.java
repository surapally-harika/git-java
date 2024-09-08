package com.Employee;

public class Employee {

	public String name;
	public int empid;
	public int age;
	public String gender;
	public int salary;
	public String address;
	
	public Employee() {
		
	}
	
	
	public Employee(String name,int empid,int age,String gender,int salary,String address) {
		this.name = name;
		this.empid = empid;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.address = address;	
		
	}
	
	public void empinfo() {
		System.out.print(this.name);
		System.out.print(this.empid);
		System.out.print(this.age);
		System.out.print(this.gender);
		System.out.print(this.salary);
		System.out.print(this.address);
		
	}
	
	public void getsalary() {
		
		
		System.out.println("Employee salary"+this.salary);
		
		
	}
	

}
