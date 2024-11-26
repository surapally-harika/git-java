package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Configuration
@ComponentScan
public class Main {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext();
		
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

//		Employee e = ac.getBean("emp1", Employee.class);
//		System.out.println(e);
		
		Department d = ac.getBean("department", Department.class);
		System.err.println(d);
		
		Department d1 = ac.getBean("dept", Department.class);
		System.err.println(d1);

	}

}
