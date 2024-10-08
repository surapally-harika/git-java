package com.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.stream.Employee;

public class Main {

	public static void main(String[] args) {
		
		Function<Truck,Bus> truckbus = tb -> {
			Bus b = new Bus(tb.getRegistration_Num(),tb.getPrice(),tb.getModel(),tb.getCapacity());
			return b;
		};
		
		Predicate<Bus> p = tb -> {
			if(tb.getModel() >=2018) {
				return true;
			}return false;
		};
		
		List<Truck> t = new ArrayList<>();
		
		t.add(new Truck("TS56EA2345",700000,2017,500));
		t.add(new Truck("TS78DF8745",750000,2014,250));
		t.add(new Truck("HP34FG3445",5600000,2018,300));
		t.add(new Truck("TS29GH5456",780000,2021,450));
		t.add(new Truck("AR72VH657",680000,2020,400));
		

		List<Bus> bus = new ArrayList<>();		
		 for(int i=0; i<t.size(); i++) {
			    Truck tb =    t.get(i);
			     Bus b =    new Bus(tb.getRegistration_Num(),tb.getPrice(),tb.getModel(),tb.getCapacity());
			     bus.add(b);
			    
		 }
//		 bus.forEach(System.out::println);
		
		Stream<Bus> stream = bus.stream();
		List<Bus> b1 = stream.filter(p).toList();
		for(Bus b : b1) {
			System.out.println(b);
		}
		
		
	}

}
