package com.hca.beansoup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	@Bean
	public boolean soupBean() {
		return true;
	}

}
