package com.client;

import java.sql.Date;
import com.client.DTO.Student;
import com.client.service.IService;
import com.client.service.ServiceImpl;

public class AddStudentClient {

	public static void main(String[] args) {
		
		Student student1 = new Student("Shubham", "Jha", Date.valueOf("1999-01-28"), "8969950778", 15400,
				Date.valueOf("2013-05-22"));
		
		Student student2 = new Student("Ayush", "Mishra", Date.valueOf("1997-08-16"), "7788996611", 15400,
				Date.valueOf("2013-05-22"));

		IService service = new ServiceImpl();
		service.addStudent(student1);
		service.addStudent(student2);

	}
}
