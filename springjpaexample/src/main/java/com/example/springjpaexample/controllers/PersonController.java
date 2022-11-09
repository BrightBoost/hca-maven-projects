package com.example.springjpaexample.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springjpaexample.models.Person;
import com.example.springjpaexample.services.PersonService;

@RestController
public class PersonController {

	private PersonService service;

	@Autowired
	public PersonController(PersonService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("person")
	public List<Person> getAll() {
		return service.getAllPersons();
	}
	
	@GetMapping("person/{id}")
	public Person getPersonById(@PathVariable long id) {
		return service.getPersonById(id);
	}
	
	@PostMapping("person")
	public Person savePerson(@RequestBody Person p) {
		return service.savePerson(p);
	}
	
}
