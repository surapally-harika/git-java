package com.Generic;

import java.util.ArrayList;

public class Main {

	public static <E> void print(E[] elements){
		for(E element : elements) {
			System.out.println(element);
		}
	}
	
	public static void main(String[] args) {
		
		Integer[] arr = {3,6,4,8,6,7};
		GenericClass<Integer> arr1 = new GenericClass<>(arr);
		System.out.println(arr1.get(0));
    
		print(arr);
	}

}
