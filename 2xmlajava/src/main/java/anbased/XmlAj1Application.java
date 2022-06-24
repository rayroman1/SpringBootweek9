package anbased;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ComponentScan
public class XmlAj1Application {

	public static void main(String[] args) {
		SpringApplication.run(XmlAj1Application.class, args);
		
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		
		ac.register(Phone.class);
        ac.refresh();
        
        AnnotationConfigApplicationContext ac1 = new AnnotationConfigApplicationContext(AppCon.class);

		
	
        
		Phone e = (Phone) ac.getBean("phone");
		System.out.println("E annotation based "+ e);
		Student w= (Student) ac1.getBean(Student.class);
		System.out.println("W java based "+ w);
	}

}
