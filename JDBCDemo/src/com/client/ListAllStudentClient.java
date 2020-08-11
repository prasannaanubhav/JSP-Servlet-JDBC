package com.client;

import java.util.ArrayList;
import java.util.List;

import com.client.DTO.Student;
import com.client.service.IService;
import com.client.service.ServiceImpl;

public class ListAllStudentClient {

	public static void main(String[] args) {

		List<Student> lst = new ArrayList<>();

		IService service = new ServiceImpl();
		lst = service.getAllStudent();
		for (Student student : lst) {
			System.out.println(student);
		}
	}

}
