package com.JDBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class jdbconnection {
	
	public static Connection con;
	
	public static Connection provideConnection() {
		
		if(con == null) {
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "root");
//				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "root");
				
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return con;
	}
	

}
