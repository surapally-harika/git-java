package com.JDBC.Dao;

import java.sql.SQLException;

import com.JDBC.Model.Employee;

public interface EmployeeData {

	public String addEmployee(Employee emp) throws SQLException;
	
	public Employee Update(int salary,int empid) throws SQLException;
	
	public Employee Delete(int empid) throws SQLException;
}
