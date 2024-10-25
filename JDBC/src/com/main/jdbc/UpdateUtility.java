package com.main.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

import com.JDBC.Dao.EmployeeData;
import com.JDBC.Dao.EmployeeDataImp;
import com.JDBC.Model.Employee;

public class UpdateUtility {

	public  void update(Scanner sc)  {

		System.out.println("Enter the empid:");
		int empid = sc.nextInt();
		System.out.println("Enter the salary:");
		int salary = sc.nextInt();
		
		
		EmployeeData empd = new EmployeeDataImp();
		
		try {
			Employee emp = empd.Update(salary,empid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
