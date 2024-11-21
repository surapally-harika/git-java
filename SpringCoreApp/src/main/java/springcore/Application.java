package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		  ApplicationContext ap = new ClassPathXmlApplicationContext("application.xml");   
	      
	     Address ad = ap.getBean("address",Address.class);
	     System.out.println(ad);
	     
	     Student st = (Student) ap.getBean("student"); 
	        System.out.println(st);

	}

}
