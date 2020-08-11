package com.client.DTO;

import java.sql.Date;

public class Student {

	private int studentId;
	private String studentName;
	private String studentLastName;
	private Date studentBirthDate;
	private String studentMobileNumber;
	private long studentFees;
	private Date studentAdmissionDate;

	public Student() {

	}

	public Student(String studentName, String studentLastName, Date studentBirthDate, String studentMobileNumber,
			long studentFees, Date studentAdmissionDate) {

		this.studentName = studentName;
		this.studentLastName = studentLastName;
		this.studentBirthDate = studentBirthDate;
		this.studentMobileNumber = studentMobileNumber;
		this.studentFees = studentFees;
		this.studentAdmissionDate = studentAdmissionDate;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public Date getStudentBirthDate() {
		return studentBirthDate;
	}

	public void setStudentBirthDate(Date studentBirthDate) {
		this.studentBirthDate = studentBirthDate;
	}

	public String getStudentMobileNumber() {
		return studentMobileNumber;
	}

	public void setStudentMobileNumber(String studentMobileNumber) {
		this.studentMobileNumber = studentMobileNumber;
	}

	public long getStudentFees() {
		return studentFees;
	}

	public void setStudentFees(long studentFees) {
		this.studentFees = studentFees;
	}

	public Date getStudentAdmissionDate() {
		return studentAdmissionDate;
	}

	public void setStudentAdmissionDate(Date studentAdmissionDate) {
		this.studentAdmissionDate = studentAdmissionDate;
	}

	@Override
	public String toString() {
		return "studentId = " + studentId + ", studentName = " + studentName + ", studentLastName =" + studentLastName
				+ ", studentBirthDate = " + studentBirthDate + ", studentMobileNumber = " + studentMobileNumber
				+ ", studentFees = " + studentFees + ", studentAdmissionDate = " + studentAdmissionDate ;
	}

}
