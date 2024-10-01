package LinkedList;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		Car c1 = new Car("TS03WE345", "TOYOTO", 230000);
		Car c2 = new Car("TS03XA046", "BMW", 300000);
		Car c3 = new Car("TS45GH455", "THAR", 500000);
		Car c4 = new Car("TS67VB345", "BMW", 230000);
		Car c5 = new Car("TS85FG345", "TOYOTO", 230000);
		
		
		list.append(c1);
		list.append(c2);
		list.append(c3);
		list.append(c4);
		list.append(c5);
		
		 Node current = list.getHead();
	        while (current != null) {
	            System.out.println(current.car);
	            current = current.next;
	        }
	        
	}

}
