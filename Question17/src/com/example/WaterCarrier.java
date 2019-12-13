package com.example;

public abstract class WaterCarrier {
	private	String carrierName;
	private	String carrierCode;
	private	String iataCode;
	private	String carrierAddress;
	private	String carrierType;
	
	public WaterCarrier() {
		super();
	}
	public WaterCarrier(String carrierName, String carrierCode, String iataCode, String carrierAddress,
			String carrierType) {
		super();
		this.carrierName = carrierName;
		this.carrierCode = carrierCode;
		this.iataCode = iataCode;
		this.carrierAddress = carrierAddress;
		this.carrierType = carrierType;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public String getCarrierCode() {
		return carrierCode;
	}
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}
	public String getIataCode() {
		return iataCode;
	}
	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}
	public String getCarrierAddress() {
		return carrierAddress;
	}
	public void setCarrierAddress(String carrierAddress) {
		this.carrierAddress = carrierAddress;
	}
	public String getCarrierType() {
		return carrierType;
	}
	public void setCarrierType(String carrierType) {
		this.carrierType = carrierType;
	}
	public  abstract void  displayShipDetails();
	static WaterCarrier createShip(String carrierName, String carrierCode, 
			String iataCode, String carrierAddress,String carrierType,
			Integer capacity)
	{
	return null;	
	}
	static String returnOwner(WaterCarrier waterCarrier)
	{
		if(waterCarrier.carrierType.equals("Ferries"))
		{
			return "Agent";
		}
		else
		{
	   return "Company";	
	     }
	}


}
