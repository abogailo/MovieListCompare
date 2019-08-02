package com.abogailo.entity;

public class Login {
	// POJO

	private Integer person_id;
	private String user_name;
	private String pswd;

	// Constructor
	public Login(int person_id, String user_name, String pswd) {
		this.person_id = person_id;
		this.user_name = user_name;
		this.pswd = pswd;
	}

	// getters and setters
	public Integer getPerson_id() {
		return person_id;
	}

	public void setPerson_id(Integer person_id) {
		this.person_id = person_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
}