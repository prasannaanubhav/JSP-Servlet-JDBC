package com.client.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.client.DTO.Student;
import com.client.connection.DriverManagerConnection;

public class DaoImpl implements IDao {

	private static Connection connection = DriverManagerConnection.getConnection();

	@Override
	public void addStudent(Student student) {

		String sql = "insert into users (studentId,studentName,studentLastName,studentBirthDate,studentMobileNumber,studentFees,studentAdmissionDate)"
				+ "values (?,?,?,?,?,?,?)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, student.getStudentId());
			preparedStatement.setString(2, student.getStudentName());
			preparedStatement.setString(3, student.getStudentLastName());
			preparedStatement.setDate(4, student.getStudentBirthDate());
			preparedStatement.setString(5, student.getStudentMobileNumber());
			preparedStatement.setLong(6, student.getStudentFees());
			preparedStatement.setDate(7, student.getStudentAdmissionDate());

			int rows = preparedStatement.executeUpdate();
			if (rows > 0) {
				System.out.println("student inserted");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateStudent(Student student) {

		String sql = "update users set studentMobileNumber=? where studentName=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, student.getStudentMobileNumber());
			preparedStatement.setString(2, student.getStudentName());

			int rows = preparedStatement.executeUpdate();
			if (rows > 0) {
				System.out.println("Table updated");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Override
	public List<Student> getAllStudent() {

		String sql = "select*from users";
		List<Student> list = new ArrayList<Student>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Student student = new Student(rs.getString("studentName"), rs.getString("studentLastName"),
						rs.getDate("studentBirthDate"), rs.getString("studentMobileNumber"), rs.getLong("studentFees"),
						rs.getDate("studentAdmissionDate"));
				student.setStudentId(rs.getInt("studentId"));
				list.add(student);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return list;
	}

	@Override
	public Student getStudentById(int id) {

		String sql = "select*from users where studentId=?";
		Student student = new Student();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id);

			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				student = new Student(rs.getString("studentName"), rs.getString("studentLastName"),
						rs.getDate("studentBirthDate"), rs.getString("studentMobileNumber"), rs.getLong("studentFees"),
						rs.getDate("studentAdmissionDate"));
				student.setStudentId(rs.getInt("studentId"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}

}
