package com.webfirst.demo.exampleform;

public class Dog {
	private String name;
	private int age;
	private int humanAge;

	public Dog() {
		
	}

	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.humanAge = age * 7;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
		this.humanAge = age * 7;
	}
	
	public int getHumanAge() {
		return this.humanAge;
	}
	
	
}
