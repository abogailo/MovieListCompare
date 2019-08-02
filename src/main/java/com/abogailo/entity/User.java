package com.abogailo.entity;

import java.util.Date;

public class User {
	// POJO

	private Integer person_id;
	private String last_name;
	private String first_name;
	private String state;
	private String city;
	private Date dob;
	private String email;

	// Constructor
	public User(Integer person_id, String last_name, String first_name, String state, String city, Date date,
			String email) {
		this.person_id = person_id;
		this.last_name = last_name;
		this.first_name = first_name;
		this.state = state;
		this.city = city;
		this.dob = date;
		this.email = email;
	}

	// getters and setters
	public Integer getPerson_id() {
		return person_id;
	}

	public void setPerson_id(Integer person_id) {
		this.person_id = person_id;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}