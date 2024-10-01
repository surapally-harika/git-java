package List;



 class Node {

	Person person;
	Node next;
	
	public Node(Person person) {
		this.person = person;
		this.next = null;
	}
}
class LinkedList{
	private Node head;
	
	public LinkedList() {
		this.head=null;
	}
	
	public void append(Person person) {
		Node next = new Node(person);
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
	
	
	