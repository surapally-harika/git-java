package com.String;
import java.util.Scanner;

public class Student {
	public int roll;
	public String name;
	
	
	public Student() {
		
	}
	
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}



	public static void main(String[] args) {
		
		Student stud = new Student();
		System.out.println(stud.name);
		System.out.println(stud.roll);
		
		Student stud1 = new Student(1,"ABC");
		System.out.println(stud1.name);
		System.out.println(stud1.roll);
		
		
		Scanner sc =new Scanner(System.in);
		System.out.print("enter name:");
		String st = sc.nextLine();
		System.out.println("enter age:");
		int i=sc.nextInt();
		System.out.print("enter the gender:");
		String s = sc.nextLine();
		System.out.println("Name:"+st);
		System.out.println("Age:"+i);
		System.out.println("Gender:"+s);
		sc .close();

	}

}
