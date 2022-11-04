package com.hca.myfirstspringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyFirstSpringBootAppApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(MyFirstSpringBootAppApplication.class, args);
		for(String beanName : ac.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}
		
		Person person = ac.getBean(Person.class);
		System.out.println(person);
	}

}
