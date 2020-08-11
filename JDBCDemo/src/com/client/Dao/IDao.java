package com.client.Dao;

import java.util.List;

import com.client.DTO.Student;

public interface IDao {
	
	public void addStudent(Student student);
	public void updateStudent(Student student);
	public List<Student> getAllStudent();
	public Student getStudentById(int id);

}
