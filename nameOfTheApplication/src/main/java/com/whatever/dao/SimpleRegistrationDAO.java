package com.whatever.dao;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import com.whatever.model.Student;

@Component
public class SimpleRegistrationDAO implements RegistrationDAO {

	private HashMap<Long, Student> hashMap;
	private Long counter = 60L;
	
	public SimpleRegistrationDAO() {
		this.hashMap = new HashMap<Long, Student>();
		this.hashMap.put(10L, new Student(10, "Pradeepa", "Kasirajan", "Computer science"));
		this.hashMap.put(11L, new Student(11, "Brian", "Quagan", "Computer science"));
		this.hashMap.put(12L, new Student(12, "Joey", "McGovern", "Computer science"));
		this.hashMap.put(13L, new Student(13, "Sarah", "Rajala", "Computer science"));
	}

	@Override
	public Long persistStudent(Student student) {
		long newId = counter++;
		this.hashMap.put(newId, new Student(newId, student.getFirstName(), student.getLastName(), student.getMajor()));
		return newId;
		
	}

	@Override
	public Student findById(Long id) {
		return hashMap.get(id);
	}

}
