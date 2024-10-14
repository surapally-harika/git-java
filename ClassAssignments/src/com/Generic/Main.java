package com.Generic;

import com.Function.Person;

public class Main {

	public static void main(String[] args) {
		
		Integer[] arr = {4,7,4,2};
		Generic<Integer> arr1 = new Generic<>(arr);
		System.out.println(arr1.get(0));
		
		Person[] p = {new Person("Harika","female",21),new Person("Hani","female",22),new Person("Hari","male",23)};
		Generic<Person> p1 = new Generic<>(p);
		System.out.println(p1.get(2));
	}

}
