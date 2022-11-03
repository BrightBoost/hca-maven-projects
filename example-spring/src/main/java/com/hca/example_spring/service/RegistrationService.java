package com.hca.example_spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.hca.example_spring.dao.RegistrationDAO;
import com.hca.example_spring.model.Student;

@Component
public class RegistrationService {
	private final RegistrationDAO registrationDAO;

	@Autowired
	public RegistrationService(RegistrationDAO registrationDAO) {
		this.registrationDAO = registrationDAO;
	}

	public Long registerStudent(Student student) throws StudentAlreadyRegisteredException {
		if (this.registrationDAO.findById(student.getId()) != null) {
			throw new StudentAlreadyRegisteredException();
		}
		return registrationDAO.persistStudent(student);
	}
}
