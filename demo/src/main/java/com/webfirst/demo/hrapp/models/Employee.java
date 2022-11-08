package com.webfirst.demo.hrapp.models;

import java.time.LocalDate;

public class Employee {
	private long id;
	private String name;
	private String job;
	private double salary;
	private LocalDate dob;
	
	public Employee() {
		
	}
	
	public Employee(long id, String name, String job, double salary, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.salary = salary;
		this.dob = dob;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	
}
