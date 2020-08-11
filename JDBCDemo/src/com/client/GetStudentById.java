package com.client;

import com.client.DTO.Student;
import com.client.service.IService;
import com.client.service.ServiceImpl;

public class GetStudentById {

	public static void main(String[] args) {

		IService service = new ServiceImpl();
		Student student = service.getStudentById(1);
		System.out.println(student);

	}

}
