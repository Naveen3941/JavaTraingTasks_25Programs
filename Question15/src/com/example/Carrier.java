package com.example;

import java.util.List;

public class Carrier extends ShipmentEntity {
	private String carrierCode;
	private String iata;
	public Carrier(String shipmentEntityName, String identificationNumber, String carrierCode, String iata) {
		super(shipmentEntityName, identificationNumber);
		this.carrierCode = carrierCode;
		this.iata = iata;
	}
	public String getCarrierCode() {
		return carrierCode;
	}
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	public static void display(List<Carrier> listOfCarrier)
	{
		System.out.format("%-15s %-25s %-15s %-15s\n","Name","Identification Number","Code Name","IATA");	
		for(Carrier carrier:listOfCarrier)
		{
			System.out.println(carrier);
		}
	}
	@Override
	public String toString() {
		return String.format("%-15s %-25s %-15s %-15s\n",shipmentEntityName.toString(),identificationNumber,  carrierCode.toString(),iata.toString());
	}
	

}
