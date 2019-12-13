package com.example;

public class User {
	private String username;
	private String firstname;
	private String lastname;
	private String contact;
	public User() {
		super();
	}
	public User(String username, String firstname, String lastname, String contact) {
		super();
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.contact = contact;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	

}
