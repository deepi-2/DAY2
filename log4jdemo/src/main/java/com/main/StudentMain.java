package com.main;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.service.StudentService;

public class StudentMain {
	
	private static final Logger LOGGER = LogManager.getLogger(StudentMain.class);

	public static void main(String[] args) {
		LOGGER.info("enter into the main program");
		StudentService studentService= new StudentService();
		LOGGER.info("created the student service object and calling add()");
		int ans = studentService.add(2, 3);
		LOGGER.info("addition of 2 numbers: "+ans);

	}

}
