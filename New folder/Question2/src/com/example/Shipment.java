package com.example;

public class Shipment {
	private int id;
	private String shipperName;
	private String modeOfTransportation;
	private float totalWeight;
	private String arrivalPort;
	private String departurePort;
	private static int nextShipmentId = 1000;

	public Shipment() {

	}

	public Shipment(int id, String shipperName, String modeOfTransportation, float totalWeight, String arrivalPort,
			String departurePort) {
		super();
		this.id = id;
		this.shipperName = shipperName;
		this.modeOfTransportation = modeOfTransportation;
		this.totalWeight = totalWeight;
		this.arrivalPort = arrivalPort;
		this.departurePort = departurePort;
	}

	public static Shipment createNewShipment(String shipperName, String modeOfTransportation, float totalWeight,
			String arrivalPort, String departurePort) {
		nextShipmentId++;
		
		return new Shipment(nextShipmentId,shipperName,modeOfTransportation,totalWeight,arrivalPort,departurePort);

	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {

		return String.format("%-15d%-15s%-25s%-15s%-20s%s", id, shipperName.toString(), modeOfTransportation.toString(),
				totalWeight + "Kg", arrivalPort.toString(), departurePort.toString());
		
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShipperName() {
		return shipperName;
	}

	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}

	public String getModeOfTransportation() {
		return modeOfTransportation;
	}

	public void setModeOfTransportation(String modeOfTransportation) {
		this.modeOfTransportation = modeOfTransportation;
	}

	public float getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(float totalWeight) {
		this.totalWeight = totalWeight;
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

	public static int getNextShipmentId() {
		return nextShipmentId;
	}

	public static void setNextShipmentId(int nextShipmentId) {
		Shipment.nextShipmentId = nextShipmentId;
	}

}
