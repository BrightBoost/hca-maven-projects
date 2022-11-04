package com.hca.beansoup;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeansoupApplication {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(BeansoupApplication.class, args);
		System.out.println("What bean would you like?");

		String bean = scanner.nextLine();
		
		List<String> beans = Arrays.asList(ac.getBeanDefinitionNames());
		
		if(beans.contains(bean)) {
			switchBeans(bean);
		} else {
			System.out.println("Don't have that, but I do have:");
			for(String beanName : ac.getBeanDefinitionNames()) {
				System.out.println(beanName);
			}
		}
		scanner.close();
		
	}
	
	public static void switchBeans(String bean) {
		switch(bean) {
		case "coffeeBean":
			System.out.println("Add water for magic");
			break;
		case "greenBean":
			System.out.println("That sounds like you can make soup");
			break;
		default:
			System.out.println("Don't try to make soup with " + bean + "!!!!");
			break;
		}
	}

}
