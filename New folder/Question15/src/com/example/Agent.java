package com.example;

import java.util.List;

public class Agent extends ShipmentEntity{
	private String name;
	private String iata;
	private String fmc;
	public Agent(String shipmentEntityName, String identificationNumber, String name, String iata, String fmc) {
		super(shipmentEntityName, identificationNumber);
		this.name = name;
		this.iata = iata;
		this.fmc = fmc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	public String getFmc() {
		return fmc;
	}
	public void setFmc(String fmc) {
		this.fmc = fmc;
	}
	public static void display( List<Agent> listOfAgent)
	{
		System.out.format("%-15s %-25s %-15s %-15s %-15s\n","Name","Identification Number ","Agent Name","IATA","FMC");
		for(Agent agent:listOfAgent)
		{
			System.out.println(agent);
		}
	}
	@Override
	public String toString() {
		return String.format("%-15s %-25s %-15s %-15s %-15s\n",shipmentEntityName.toString(),identificationNumber,  name.toString(),iata.toString(),fmc.toString());
	}
	

}
