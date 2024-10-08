package com.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		 
		Function<Person,Employee> personemployee = pe -> {
			Employee emp = new Employee(pe.getName(),pe.getAge(),pe.getGender(), 23000);
			return emp;
		};
		
		List<Person> persons = new ArrayList();
		persons.add(new Person("Harika","female",21));
		persons.add(new Person("Hari","male",22));
		persons.add(new Person("Prem","male",12));
		persons.add(new Person("Manu","male",22));
		persons.add(new Person("Manohar","male",24));
		
		
		Stream<Person> stream = persons.stream();
		Stream<Employee> stream1 = stream.map(personemployee);
		stream1.forEach(emp -> System.out.println(emp));
		
//		System.out.println();
//
//		List<Employee> emps = new ArrayList<>();
//		 
//		 for(int i=0; i<persons.size(); i++) {
//			    Person st =    persons.get(i);
//			     Employee emp1 =    new Employee(st.getName(), st.getAge(), st.getGender(), 35000);
//			    emps.add(emp1);
//			    
//		 }
//		 
//		 
//		 emps.forEach(System.out::println);
	}

}
