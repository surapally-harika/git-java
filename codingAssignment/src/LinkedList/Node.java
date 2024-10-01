package LinkedList;

class Node {

	Car car;
	Node next;
	
	public Node(Car car) {
		this.car = car;
		this.next = null;
	}
}
class LinkedList{
	private Node head;
	
	public LinkedList() {
		this.head=null;
	}
	
	public void append(Car car) {
		Node next = new Node(car);
		if(head == null) {
			head = next;
		}else {
			Node current = head;
			while(current.next !=null) {
				current = current.next;
			}
			current.next = next;
		}
	}
	public Node getHead() {
		return head;
	}
	
}
	
	
	
