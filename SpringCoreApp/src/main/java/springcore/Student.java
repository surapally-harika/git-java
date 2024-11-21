package springcore;

public class Student {
	
	public Address address;
	
	
	
	public Student() {
		
	}



	public Student(Address address) {
		super();
		this.address = address;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}

	
	 
	
	
	

}
