package com.Arrays;

import java.util.ArrayList;

public class Students {

	public static void main(String[] args) {
		
		
		ArrayList<String> student=new ArrayList<>();
		student.add("Harika");
		student.add("prem");
		student.add("gayatri");
		student.add("hari");
		student.add("manohar");
		
		for(int i=0;i<student.size();i++ ) {
			System.out.println(student.get(i));
		}

	}

}
