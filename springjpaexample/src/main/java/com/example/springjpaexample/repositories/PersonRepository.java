package com.example.springjpaexample.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springjpaexample.models.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
	@Override 
	List<Person> findAll();
	
}
