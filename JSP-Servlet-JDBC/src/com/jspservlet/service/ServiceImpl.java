package com.jspservlet.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.jspservlet.model.Student;

public class ServiceImpl {

	private DataSource dataSource;
	
	public ServiceImpl(DataSource thedataDataSource) {
		this.dataSource=thedataDataSource;
	}
	
	public List<Student> getListOfStudent() throws SQLException{
		
		List<Student> list = new ArrayList<>();
		Connection connection = dataSource.getConnection();
		String sql = "select*from student";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()) {
        	Student student = new Student(resultSet.getString("firstname"), resultSet.getString("lastname"), resultSet.getString("email"));
        	student.setId(resultSet.getInt("id"));
        	list.add(student);
        }
        connection.close();
		return list;
	}
	
	public void addStudent(Student student) throws SQLException {
		
		Connection connection = dataSource.getConnection();
		String sql = "insert into student (firstname,lastname,email) values(?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, student.getFirstname());
		preparedStatement.setString(2, student.getLastname());
		preparedStatement.setString(3, student.getEmail());
		 preparedStatement.executeUpdate();
	    connection.close();
	}
	
	public Student loadStudent(int id) throws SQLException {
		Connection connection = dataSource.getConnection();
		Student student =null;
		String sql = "select*from student where id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		ResultSet rs = preparedStatement.executeQuery();
		while(rs.next()) {
			student = new Student(rs.getString("firstname"), rs.getString("lastname"), rs.getString("email"));
			student.setId(rs.getInt("id"));
		}
	    connection.close();
		return student;
	}
	
	public void updateStudent(Student student) throws SQLException {
		Connection connection = dataSource.getConnection();
		String sql = "update student set firstname=?,lastname=?,email=? where id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, student.getFirstname());
		preparedStatement.setString(2, student.getLastname());
		preparedStatement.setString(3, student.getEmail());
		preparedStatement.setInt(4, student.getId());
		preparedStatement.executeUpdate();
		connection.close();
	}

	public void deleteStudent(int id) throws SQLException {
		Connection connection = dataSource.getConnection();
		String sql = "delete from student where id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		preparedStatement.executeUpdate();
		connection.close();
		
	}
}
