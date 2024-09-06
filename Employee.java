package com.Employee;

public class Employee {

	public String name;
	public int empid;
	public int age;
	public String gender;
	public int salary;
	public String address;
	
	
	public Employee(String name,int empid,int age,String gender,int salary,String address) {
		
		this.name="harika";
		this.empid=001;
		this.age=21;
		this.gender="female";
		this.salary=50000;
		this.address="hyderabad";
		
	}
	public void empinfo() {
		System.out.print(name);
		System.out.print(empid);
		System.out.print(age);
		System.out.print(gender);
		System.out.print(salary);
		System.out.print(address);
		
	}
	public void salary() {
		
		
	}
	

}
