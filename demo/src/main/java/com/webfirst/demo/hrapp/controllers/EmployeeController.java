package com.webfirst.demo.hrapp.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.webfirst.demo.hrapp.models.Employee;

@RestController
public class EmployeeController {

	public static List<Employee> employeeList = new ArrayList<>();

	@PostMapping("employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		employeeList.add(employee);
		return employee;
	}

	@GetMapping("employees")
	public List<Employee> getAllEmployees() {
		return employeeList;
	}

	@GetMapping("employee/{id}")
	public Employee getEmployeeById(@PathVariable long id) {
		for (Employee e : employeeList) {
			if (e.getId() == id) {
				return e;
			}
		}
		return null;
	}

	@GetMapping("employee")
	public Employee getEmployeeByName(@RequestParam String name) {
		for (Employee e : employeeList) {
			if (e.getName().equals(name)) {
				return e;
			}
		}
		return null;
	}

	@PutMapping("employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		for (Employee e : employeeList) {
			if (e.getId() == employee.getId()) {
				e.setName(employee.getName());
				e.setJob(employee.getJob());
				e.setSalary(employee.getSalary());
				e.setDob(employee.getDob());
			}
		}
		return null;
	}

	@DeleteMapping("employee/{id}")
	public boolean deleteEmployeeById(@PathVariable long id) {
		for (Employee e : employeeList) {
			if (e.getId() == id) {
				employeeList.remove(e);
				return true;
			}
		}
		return false;
	}

}
