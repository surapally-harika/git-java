package com.main.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

import com.JDBC.Dao.EmployeeData;
import com.JDBC.Dao.EmployeeDataImp;
import com.JDBC.Model.Employee;

public class AddUtility {

	public static void addEmployee(Scanner sc) {

		       
	       
	          System.out.println("Enter the name of employee");
	           
	           String name =     sc.nextLine();
	         
	         System.out.println("Enter the salary ofemployee");
	         
	          int salary =   sc.nextInt();
	           
	           System.out.println("Enter the age of employee");
	             int age  =   sc.nextInt();
	             
	             
	             Employee emp = new Employee(name,salary,age);
	    

	             
	             EmployeeData empd = new EmployeeDataImp();
	             
	            try {
					String result =  empd.addEmployee(emp);
					
					System.out.println(result);
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
		
	}

}
