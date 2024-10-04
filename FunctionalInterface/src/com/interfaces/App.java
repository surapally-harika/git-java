package com.interfaces;

public class App  {
	
	public  static void printEmployeName(NameInter nameInter) {
		
		Employee e = new Employee("harika",21,50000);
		String name = nameInter.getName(e);
		System.out.println(name);
		
	}
 
	public static void main(String[] args) {
		
		printEmployeName(e -> {
			return e.getName();
		});
	}
}
