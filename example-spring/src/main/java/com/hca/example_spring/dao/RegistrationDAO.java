package com.hca.example_spring.dao;

import com.hca.example_spring.model.Student;

public interface RegistrationDAO {
	public Long persistStudent(Student student);

	public Student findById(Long id);
}
