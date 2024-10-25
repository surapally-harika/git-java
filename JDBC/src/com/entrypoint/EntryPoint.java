package com.entrypoint;

import java.util.Scanner;

import com.main.jdbc.AddUtility;
import com.main.jdbc.DeleteUtility;
import com.main.jdbc.UpdateUtility;

public class EntryPoint {

	public static void main(String[] args) {
		

		System.out.println("Welcome to Employee Managment");
		 

		 Scanner sc = new Scanner(System.in);
		 
		 boolean flag = true;
		 
		 while(flag) {
			 
			 System.out.println("Enter a number to perfrom operation \n"
				 		+ "Enter 1 to add employee \n"
				 		+ "Enter 2 to update employee details \n"
				 		+ "Enter 3 to remove a employee details ");
		 
		    int number = sc.nextInt();
		    
		   sc.nextLine();
		    
		    switch (number) {
			case 1: {
				  
				// add student 
				
				AddUtility add =  new AddUtility();
				
				add.addEmployee(sc);
				
				break;
			}
			case 2: {
				  
				// update marks of student 
				
				UpdateUtility up = new UpdateUtility();
				
				up.update(sc);
				
				break;
			}
			case 3:{
				// remove student
				
				DeleteUtility rs = new DeleteUtility();
				
				rs.delete(sc);
				
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + number);
			}
		    
		    
		    // 
		    System.out.println("Do you want to continue Pass yes or no");
		    
		     String response = sc.nextLine();
		     
		     if(response.equals("no")) {
		    	 flag = false;
		     }
		    
		 }
		
	}

}
