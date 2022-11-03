package com.whatever.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.whatever.dao.RegistrationDAO;
import com.whatever.model.Student;

@Component
public class RegistrationService {
	private final RegistrationDAO registrationDAO;
	
	@Autowired
	public RegistrationService(RegistrationDAO registrationDAO) {
		this.registrationDAO = registrationDAO;
	}
	
	public Long registerStudent(Student student) throws StudentAlreadyRegisteredException {
		if(this.registrationDAO.findById(student.getId()) != null) {
			throw new StudentAlreadyRegisteredException("Woops, we have this one already");
		}
		
		long newStudentId = registrationDAO.persistStudent(student);
		return newStudentId;
	}

}
