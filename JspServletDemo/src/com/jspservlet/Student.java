package com.jspservlet;

public class Student {

	private String firstname;
	private String lastname;
	private boolean goldcustomer;

	public Student() {

	}

	public Student(String firstname, String lastname, boolean goldcustomer) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.goldcustomer = goldcustomer;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public boolean isGoldcustomer() {
		return goldcustomer;
	}

	public void setGoldcustomer(boolean goldcustomer) {
		this.goldcustomer = goldcustomer;
	}

}
