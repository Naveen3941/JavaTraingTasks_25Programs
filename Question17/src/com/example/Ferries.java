package com.example;

import java.util.List;

public class Ferries extends WaterCarrier {
	private Integer maxLoad;

	public Ferries() {
		super();
	}

	public Ferries(String carrierName, String carrierCode, String iataCode, String carrierAddress, String carrierType,
			Integer maxLoad) {
		super(carrierName, carrierCode, iataCode, carrierAddress, carrierType);
		this.maxLoad = maxLoad;
	}

	public Integer getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(Integer maxLoad) {
		this.maxLoad = maxLoad;
	}

	@Override
	public void displayShipDetails() {
		System.out.format("%-20s%-15s%-15s%-15s%-15s%-25s%s\n", "Carrier type", "Name", "Code", "IATAcode", "Location",
				"Capacity", "OwnedBy");
		MainClass mainClass = new MainClass();
		mainClass.getListOfFerries();
		for (Ferries ferries : mainClass.getListOfFerries()) {

			System.out.println(ferries + "            " + ferries.returnOwner(ferries));

		}

	}

	@Override
	public String toString() {

		return String.format("%-20s %-15s %-15s %-15s %-15s %s", getCarrierType(), getCarrierName(), getCarrierCode(),
				getIataCode(), getCarrierAddress(), getMaxLoad());

	}

}
