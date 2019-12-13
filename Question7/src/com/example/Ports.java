package com.example;

public class Ports {
	
	private int id;
	private String portName;
	private int railTransportation;
	private int roadTransportation;
	private int airTransportation;
	
	
	public Ports(int id, String portName, int railTransportation, int roadTransportation, int airTransportation) {
		super();
		this.id = id;
		this.portName = portName;
		this.railTransportation = railTransportation;
		this.roadTransportation = roadTransportation;
		this.airTransportation = airTransportation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPortName() {
		return portName;
	}
	public void setPortName(String portName) {
		this.portName = portName;
	}
	public int getRailTransportation() {
		return railTransportation;
	}
	public void setRailTransportation(int railTransportation) {
		this.railTransportation = railTransportation;
	}
	public int getRoadTransportation() {
		return roadTransportation;
	}
	public void setRoadTransportation(int roadTransportation) {
		this.roadTransportation = roadTransportation;
	}
	public int getAirTransportation() {
		return airTransportation;
	}
	public void setAirTransportation(int airTransportation) {
		this.airTransportation = airTransportation;
	}
	@Override
	public String toString() {
		return "Ports [id=" + id + ", portName=" + portName + ", railTransportation=" + railTransportation
				+ ", roadTransportation=" + roadTransportation + ", airTransportation=" + airTransportation + "]";
	}
	 
	

}
