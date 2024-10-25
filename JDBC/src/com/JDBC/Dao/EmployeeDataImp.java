package com.JDBC.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.JDBC.Model.Employee;
import com.JDBConnection.jdbconnection;

public class EmployeeDataImp implements EmployeeData {

	@Override
	public String addEmployee(Employee emp) throws SQLException {
		
		Connection con = jdbconnection.provideConnection();
		
//		Statement st =	 con.createStatement();
//		int result = st.executeUpdate("INSERT INTO employee1(name,salary,age) VALUES ('"+emp.getName()+"',"+emp.getSalary()+","+emp.getAge()+")");
//		
		
		 PreparedStatement ps =    con.prepareStatement("INSERT INTO student(name,salary,age) VALUES(?, ?, ?)");

		   
         ps.setString(1, emp.getName()); 
         ps.setInt(2, emp.getSalary());
         ps.setInt(3, emp.getAge());
         
     int result =     ps.executeUpdate();
     
		if(result > 0) {
			return"employee is inserted in database";
		}
		
		return "employee is not inserted in database";
	}

	@Override
	public Employee Update(int salary, int empid) throws SQLException {
		
		Connection con = jdbconnection.provideConnection();
		
//		Statement st = con.createStatement() ;
//		int result = st.executeUpdate("UPDATE employee1 SET salary = "+salary+" WHERE empid="+empid+"");
		
		 PreparedStatement ps =    con.prepareStatement("UPDATE employee1 SET salary = ? WHERE empid = ?");
		 ps.setInt(1, salary);
		 ps.setInt(2, empid);
		 int result =     ps.executeUpdate();
		
		if(result > 0) {
//		ResultSet resultset = st.executeQuery("SELECT * FROM employee1 WHERE empid ="+empid+"");
			PreparedStatement ps1 =    con.prepareStatement("SELECT * employee1 WHERE  empid = ?");
			ps1.setInt(1, empid);
			ResultSet resultset = ps1.executeQuery();
		if(resultset.next()) {
			int empid1 = resultset.getInt("empid");
			String name = resultset.getString("name");
			int salary1 = resultset.getInt("salary");
			int age = resultset.getInt("age");
			
			Employee emp = new Employee(empid1,name,salary1,age);
			return emp;
		}else {
			return null;
			}
		}
		return null;
	}

	@Override
	public Employee Delete(int empid) throws SQLException {
		
		Connection con = jdbconnection.provideConnection();
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM employee1 WHERE empid ?");
		ps.setInt(1,empid);
		ResultSet resultset =  ps.executeQuery();
//		Statement st = con.createStatement();
		
//		ResultSet resultset = st.executeQuery("SELECT * FROM employee1 WHERE empid="+empid+"");
		
		if(resultset.next()) {
			int empid1= resultset.getInt("empid");
			String name = resultset.getString("name");
			int salary = resultset.getInt("salary");
			int age = resultset.getInt("age");
			
			Employee emp = new Employee(empid1,name,salary,age);
			
//			int result = emp.executeUpdate("DELETE  FROM employee1 WHERE empid = "+empid+"");
			PreparedStatement ps1 = con.prepareStatement("DELETE  FROM employee1 WHERE empid ?");
			ps1.setInt(1,empid);
			int result = ps1.executeUpdate();
			if(result > 0) {
				return emp;
			}
			
		}
		
		return null;
	}

}
