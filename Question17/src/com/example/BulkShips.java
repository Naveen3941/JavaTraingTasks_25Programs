package com.example;

import java.util.List;

public class BulkShips extends WaterCarrier {
	private Integer noOfCargoes;

	public BulkShips() {
		super();
	}

	public BulkShips(String carrierName, String carrierCode, String iataCode, String carrierAddress, String carrierType,
			Integer noOfCargoes) {
		super(carrierName, carrierCode, iataCode, carrierAddress, carrierType);
		this.noOfCargoes = noOfCargoes;
	}

	public Integer getNoOfCargoes() {
		return noOfCargoes;
	}

	public void setNoOfCargoes(Integer noOfCargoes) {
		this.noOfCargoes = noOfCargoes;
	}

	@Override
	public void displayShipDetails() {
		
		MainClass mainClass = new MainClass();

		for (BulkShips bulk : mainClass.getListOfBulkShips()) {

			System.out.println(bulk + "            " + bulk.returnOwner(bulk));

		}

	}

	@Override
	public String toString() {

		return String.format("%-20s %-15s %-15s %-15s %-15s %s", getCarrierType(), getCarrierName(), getCarrierCode(),
				getIataCode(), getCarrierAddress(), getNoOfCargoes());

	}

}
