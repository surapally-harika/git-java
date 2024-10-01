package List;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		Person p1 = new Person("Harika",21,"female");
		Person p2 = new Person("Hari",21,"male");
		Person p3 = new Person("Prem",12,"male");
		Person p4 = new Person("Gayatri",21,"female");
		Person p5 = new Person("Manu",25,"male");
		
		list.append(p1);
		list.append(p2);
		list.append(p3);
		list.append(p4);
		list.append(p5);
		
		 Node current = list.getHead();
	        while (current != null) {
	            System.out.println(current.person);
	            current = current.next;
	        }
//	        Node[] nodeArray = new Node[4]; 
//	        current = list.getHead();
//	        int i=0;
//	        for (int i = 0; i < nodeArray.length; i++) {
//	            System.out.println(nodeArray[i].person);
//	        }
//	        for (Node node : nodeArray) {
//	            System.out.println(node.person);
//	        }
	}

}
