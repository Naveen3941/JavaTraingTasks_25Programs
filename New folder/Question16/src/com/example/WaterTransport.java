package com.example;

public class WaterTransport extends Shipment {
	private String capacity;

	public WaterTransport(int id, String customerName, String arrivalPort, String departurePort, float weight,
			String capacity) {
		super(id, customerName, arrivalPort, departurePort, weight);
		this.capacity = capacity;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	

}
