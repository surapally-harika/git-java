package com.Function;

public class Employee {

	public String empName;
	public int empage;
	public String gender;
	public int salary;
	
	public Employee() {
		
	}

	

	public Employee(String empName, int empage, String gender, int salary) {
		super();
		this.empName = empName;
		this.empage = empage;
		this.gender = gender;
		this.salary = salary;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public int getEmpage() {
		return empage;
	}



	public void setEmpage(int empage) {
		this.empage = empage;
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



	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empage=" + empage + ", gender=" + gender + ", salary=" + salary
				+ "]";
	}



	
	
	
	
}
