package com.client.service;

import java.util.List;

import com.client.DTO.Student;
import com.client.Dao.DaoImpl;
import com.client.Dao.IDao;

public class ServiceImpl implements IService{

	@Override
	public void addStudent(Student student) {
		
		IDao dao = new DaoImpl();
		dao.addStudent(student);
		
	}

	@Override
	public void updateStudent(Student student) {
		
		IDao dao = new DaoImpl();
		dao.updateStudent(student);
		
	}

	@Override
	public List<Student> getAllStudent() {
		IDao dao = new DaoImpl();
		List<Student> lst = dao.getAllStudent();
		return lst;
	}

	@Override
	public Student getStudentById(int id) {
		IDao dao = new DaoImpl();
		Student student = dao.getStudentById(id);
		return student;
	}

}
