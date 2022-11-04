package com.hca.beansoup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {
	
	@Bean
	public String name() {
		return "Miguel";
	}
	
	@Bean
	public Person shizukaPerson() {
		return new Person("shizuka", new Address());
	}
	
	@Bean
	public Person johnPerson() {
		return new Person("john", new Address());
	}

}
