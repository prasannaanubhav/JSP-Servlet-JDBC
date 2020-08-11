package com.client;

import java.sql.Date;

import com.client.DTO.Student;
import com.client.service.IService;
import com.client.service.ServiceImpl;

public class UpdateStudentClient {

	public static void main(String[] args) {


		Student student1 = new Student("Shubham", "Jha", Date.valueOf("1999-01-28"), "8899005522", 15400,
				Date.valueOf("2013-05-22"));
		
		IService service = new ServiceImpl();
		service.updateStudent(student1);

	}

}
