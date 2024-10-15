package com.Exception;

public class Main {
	
	public static void info(Employee emp)throws EmployeeException{
		try {
			System.out.println(emp.name);
			System.out.println(emp.empid);
		}catch(NullPointerException e) {
			throw new EmployeeException("Employee data is not found");
		}
	}

	public static void main(String[] args) {
		
		try {
			info(null);
		}catch(EmployeeException e) {
			System.out.println(e);
		}

	}

}
