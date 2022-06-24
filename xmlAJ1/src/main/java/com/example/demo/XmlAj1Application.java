package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication

public class XmlAj1Application {

	public static void main(String[] args) {
		SpringApplication.run(XmlAj1Application.class, args);
		
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Address ad= (Address) ac.getBean("sofa");
		
		System.out.println("Xml based "+ad);
		
	}

}
