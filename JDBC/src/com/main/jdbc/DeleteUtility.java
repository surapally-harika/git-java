package com.main.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

import com.JDBC.Dao.EmployeeData;
import com.JDBC.Dao.EmployeeDataImp;
import com.JDBC.Model.Employee;

public class DeleteUtility {

	public void delete(Scanner sc) {

		System.out.println("Enter the empid");
		int empid = sc.nextInt();
		
		EmployeeData empd = new EmployeeDataImp();
		
		try {
			Employee emp = empd.Delete(empid);
			System.out.println(emp);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
