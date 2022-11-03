package com.whatever;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.whatever.model.Student;
import com.whatever.service.RegistrationService;
import com.whatever.service.StudentAlreadyRegisteredException;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("/beans.xml");
    	RegistrationService rs = ac.getBean(RegistrationService.class);
    	Long newStudent = -1L;
		try {
			newStudent = rs.registerStudent(new Student("Nathan", "Poole", "Computer science"));
		} catch (StudentAlreadyRegisteredException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(newStudent);
    }
}
