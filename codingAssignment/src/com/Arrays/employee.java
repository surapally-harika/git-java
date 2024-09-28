package com.Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class employee {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<>();
		ArrayList<Integer> Salary = new ArrayList<>();
		ArrayList<Integer> empid = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		name.add("Harika");
		name.add("Hari");
		name.add("Prem");
		
		Salary.add(23000);
		Salary.add(25000);
		Salary.add(30000);
		
		empid.add(1);
		empid.add(2);
		empid.add(3);
//		for(int i=1;i<=3;i++) {
//			System.out.println("emp"+i);
//			String names=sc.next();
//		}
//		System.out.println("Enter the Salary:");
//		for(int i=1;i<=3;i++) {
//			System.out.println("emp"+i);
//			int Salarys=sc.nextInt();
//		}
//		System.out.println("Enter the empid:");
//		for(int i=1;i<=3;i++) {
//			System.out.println("emp"+i);
//			int empids=sc.nextInt();
//		}
		
		System.out.println("Employee Names:");
		Iterator<String> it = name.iterator();
			while(it.hasNext()) {

				System.out.println(it.next());
			}
			System.out.println("Employee Salary:");
			Iterator<Integer> it1 = Salary.iterator();
			while(it1.hasNext()) {
				System.out.println(it1.next());
			}
			System.out.println("Employee empid:");
			Iterator<Integer> it2 = empid.iterator();
			while(it2.hasNext()) {
				System.out.println(it2.next());
			}
		}

}
