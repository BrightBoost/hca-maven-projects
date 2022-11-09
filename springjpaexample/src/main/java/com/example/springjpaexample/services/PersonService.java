package com.example.springjpaexample.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springjpaexample.models.Person;
import com.example.springjpaexample.repositories.PersonRepository;


@Service
public class PersonService {
	
	private PersonRepository repository;

	@Autowired
	public PersonService(PersonRepository repository) {
		super();
		this.repository = repository;
	}
	
	// getting all persons
	public List<Person> getAllPersons() {
		return repository.findAll();
	}
	
	// getting person by id
	public Person getPersonById(long id) {
		Optional<Person> personOpt = repository.findById(id);
		if(personOpt.isPresent()) {
			return personOpt.get();
		} else {
			return null;
		}
	}
	
	// storing person
	public Person savePerson(Person p) {
		return repository.save(p);
	}
	
}
