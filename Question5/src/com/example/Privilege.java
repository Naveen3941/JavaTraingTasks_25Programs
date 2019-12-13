package com.example;

public class Privilege {
	private String name;
   
	public Privilege() {
		super();
	}

	public Privilege(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Privilege [name=" + name + "]";
	}
   	

}
