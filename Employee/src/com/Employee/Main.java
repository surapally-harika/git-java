package com.Employee;

public class Main {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee("harika",001,21,"female",50000,new address("hyderabad","telangana",500003));
				
//		emp.setEmpid(001);
//		emp.setName("harika");
//		emp.setAge(21);
//		emp.setGender("female");
//		emp.setSalary(50000);
		
		System.out.println(emp);		
		System.out.println(emp.getEmpid());
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getGender());
		System.out.println(emp.getSalary()); 
		
		
//		emp.address=new address("hyderabad","telangana",500003);		
//		emp.address.setCity("hyderabad");
//		emp.address.setPincode(508253);
//		emp.address.setState("telangana");
		
		System.out.println(emp.address);
		System.out.println(emp.address.getCity());
		System.out.println(emp.address.getPincode());
		System.out.println(emp.address.getState());
	

	}

}
