package com.employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		System.out.println(em.isOpen());
		
		EntityTransaction et = em.getTransaction();
		
//		Employee emp = new Employee(4, "harika", 45000);
//		et.begin();
//		em.persist(emp);
//		et.commit();
//		System.out.println(emp);
//		
//
//		 Employee emp2 =  em.find(Employee.class, 1);
//		  
//			EntityTransaction  et2 =  em.getTransaction();
//			  
//			   et2.begin();
//			
//			   
//			     emp2.setName("Hari");
//			  
//			     
//			
//			  et2.commit();
//			  
//			  System.out.println(emp2);
			  
			  
			  
			  Employee emp =  em.find(Employee.class, 3);
			  
			
				   et.begin();
				
				   
				     em.remove(emp);
				  
				     
				
				  et.commit();
				  
				  System.out.println(emp);
		
	}

}
