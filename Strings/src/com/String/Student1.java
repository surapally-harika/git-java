package com.String;

public class Student1 {
	public int empid;
	public String name;
	public int age;
	public String gender;
	public String address;
	public int salary;
	
	

	public Student1(int empid, String name, int age, String gender, String address, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.salary = salary;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public static void main(String[] args) {
		Student1 st = new Student1(1,"gaya3",21,"Female","Gayatri Nagar",50000);
		System.out.println("Empid:"+st.getEmpid());
		System.out.println("Name:"+st.getName());
		System.out.println("Age:"+st.getAge());
		System.out.println("Gender:"+st.getGender());
		System.out.println("Address:"+st.getAddress());
		System.out.println("Salary:"+st.getSalary());
		
		
		
	}

}
