package com.hca.myfirstspringbootapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasicConfiguration {
	
	@Bean
	public String name() {
		return "Joelle";
	}
	
	@Bean
	public int age() {
		return 25;
	}
	
//	@Bean("blabla")
//	public Person per() {
//		return new Person();
//	}

}
