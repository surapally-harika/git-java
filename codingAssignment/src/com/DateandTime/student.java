package com.DateandTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class student {
	public String name;
	public String gender;
	public String DOB;
	public int marks;
	
	public static int getage(String date) {
		
		DateTimeFormatter dateFormate = DateTimeFormatter.ofPattern("yy-MM-dd");
		LocalDate id = LocalDate.parse(date,dateFormate);
		Period p= Period.between(id, LocalDate.now());
		System.out.println(p.getYears());
		
		return 0;
		
	}
	
	public  static int getDays(String date) {
		DateTimeFormatter dateFormate = DateTimeFormatter.ofPattern("yy-MM-dd");
		LocalDate id = LocalDate.parse(date,dateFormate);
		Period p= Period.between(id, LocalDate.now());
		System.out.println(p.getDays());
		
		return 0;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name = sc.next();
		System.out.println("Enter the gender:");
		String gender = sc.next();
		System.out.println("Enter the marks:");
		int marks=sc.nextInt();
		System.out.println("Enter the DOB:");
		String date = sc.next();
		
		getage("Age:"+date);
		getDays("TotalDays:"+date);
		

	}

}
