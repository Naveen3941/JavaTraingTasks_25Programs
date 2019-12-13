package com.example;

import java.util.List;

public class ContainerShips extends WaterCarrier{
	private Integer noOfContainers;
	

	public ContainerShips() {
		super();
	}

	public ContainerShips(String carrierName, String carrierCode, String iataCode, String carrierAddress,
			String carrierType, Integer noOfContainers) {
		super(carrierName, carrierCode, iataCode, carrierAddress, carrierType);
		this.noOfContainers = noOfContainers;
	}

	public Integer getNoOfContainers() {
		return noOfContainers;
	}

	public void setNoOfContainers(Integer noOfContainers) {
		this.noOfContainers = noOfContainers;
	}
	@Override
	public void displayShipDetails() {
		
		MainClass mainClass = new MainClass();

		for (ContainerShips containerShips : mainClass.getListOfContainerShip()) {

			System.out.println(containerShips + "            " + containerShips.returnOwner(containerShips));

		}

	}

	@Override
	public String toString() {

		return String.format("%-20s %-15s %-15s %-15s %-15s %s", getCarrierType(), getCarrierName(), getCarrierCode(),
				getIataCode(), getCarrierAddress(), getNoOfContainers());

	}

}