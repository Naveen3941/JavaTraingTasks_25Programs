package com.example;

public interface IMaintainCarrier {
	
	public Carrier createCarrier(String carrierValues);
	public Carrier retrieveCarrier(String carrierCode, Carrier[] carrierArray);
	public Boolean deleteCarrier(String carrierCode, Carrier[] carrierArray);
	public Boolean updateCarrier(String carrierCode, Carrier[] carrierArray, String carrierValues);
}
