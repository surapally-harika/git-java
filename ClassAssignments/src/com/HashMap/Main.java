package com.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		HashMap<Person,Passport> personPassport = new HashMap<>();
		
		personPassport.put(new Person("Harika",21), new Passport(2345565,"INDIA","3-6-2018"));
		personPassport.put(new Person("Hari",22), new Passport(875645,"USA","25-8-2021"));
		personPassport.put(new Person("prem",18), new Passport(765343,"UK","13-11-2016"));
		personPassport.put(new Person("manu",23), new Passport(135835,"USA","26-10-2020"));
		personPassport.put(new Person("manohar",24), new Passport(983567,"INDIA","21-4-2019"));
		
		personPassport.put(new Person("Harika",21), new Passport(2345565,"UK","3-6-2018"));
		
		Set<Person> keys = personPassport.keySet();
		for(Person p : keys) {
			System.out.println(p);
		}
		
		Collection<Passport> values = personPassport.values();
		
		values.forEach(s -> System.out.println(s));
		
		Set<Entry<Person,Passport>> entries = personPassport.entrySet();
		
		for(Entry e : entries) {
			System.out.println("key:"+e.getKey()+" value: "+e.getValue());
		}
	}

}
