package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Predicate<Employee> p = st -> {
			if(st.getSalary() >=40000) {
				return true;
			}return false;
		};
		

		
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Harika", 21, 45000));
		emp.add(new Employee("Hari", 23, 55000));
		emp.add(new Employee("Gayatri", 25, 35000));
		emp.add(new Employee("manu", 20, 25000));
		emp.add(new Employee("prem", 24, 40000));
		
//		Stream<Employee> stream = emp.stream();
//		
//		List<Employee> emp1 = stream.filter(p).toList();
//		
//		for(Employee e : emp1) {
//			System.out.println(e);
//		}
	}

}
