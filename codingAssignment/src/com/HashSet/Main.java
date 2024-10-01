package com.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		HashSet<Person> hs = new HashSet<>();
		Person p1 = new Person("Harika",21,"female");
		Person p2 = new Person("Hari",23,"male");
		Person p3 = new Person("Prem",12,"male");
		Person p4 = new Person("Manohar",25,"male");
		Person p5 = new Person("Manu",21,"male");
		 hs.add(p1);
		 hs.add(p2);
		 hs.add(p3);
		 hs.add(p4);
		 hs.add(p5);
		 Person p6 = new Person("Manu",21,"male");
		 hs.add(p6);
		 System.out.println(hs.size());
		 
		 Iterator<Person> it = hs.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
	}

}
