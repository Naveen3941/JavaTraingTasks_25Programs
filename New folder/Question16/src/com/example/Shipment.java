package com.example;

public class Shipment {
	private int id;
	String customerName;
	private String arrivalPort;
	private String departurePort;
	private float weight;
	public Shipment(int id, String customerName, String arrivalPort, String departurePort, float weight) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.arrivalPort = arrivalPort;
		this.departurePort = departurePort;
		this.weight = weight;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getArrivalPort() {
		return arrivalPort;
	}
	public void setArrivalPort(String arrivalPort) {
		this.arrivalPort = arrivalPort;
	}
	public String getDeparturePort() {
		return departurePort;
	}
	public void setDeparturePort(String departurePort) {
		this.departurePort = departurePort;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public void displayDetails()
	{
		System.out.format("%-15s %-15s %-15s %-15s%-15s","Id","Customer name","Arrival port","Departure port","Weight");
	}

	

}
