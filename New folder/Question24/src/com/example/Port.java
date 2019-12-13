package com.example;

public class Port {
	private Integer id;
	private String country;
	private String name;
	public Port(Integer id, String country, String name) {
		super();
		this.id = id;
		this.country = country;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
