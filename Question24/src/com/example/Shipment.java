package com.example;

public class Shipment {
	private Integer id;
	private String name;
	private Port arrivalPort;
	private Port departurePort;
	public Shipment(Integer id, String name, Port arrivalPort, Port departurePort) {
		super();
		this.id = id;
		this.name = name;
		this.arrivalPort = arrivalPort;
		this.departurePort = departurePort;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Port getArrivalPort() {
		return arrivalPort;
	}
	public void setArrivalPort(Port arrivalPort) {
		this.arrivalPort = arrivalPort;
	}
	public Port getDeparturePort() {
		return departurePort;
	}
	public void setDeparturePort(Port departurePort) {
		this.departurePort = departurePort;
	}
	
	
	

}
