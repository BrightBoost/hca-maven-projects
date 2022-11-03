package com.whatever.dao;

import com.whatever.model.Student;

public interface RegistrationDAO {
	public Long persistStudent(Student student);
	public Student findById(Long id);
}
