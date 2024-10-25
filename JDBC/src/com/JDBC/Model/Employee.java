package com.JDBC.Model;

public class Employee {
	
	private int empid;
	private String name;
	private int salary;
	private int age;
	
	public Employee() {
		
	}
	
	public Employee(int empid, String name, int salary, int age) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	
	
	public Employee( String name, int salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	
	
	

}
