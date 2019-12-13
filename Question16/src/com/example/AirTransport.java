package com.example;

import java.util.List;

public class AirTransport extends Shipment
{
private String airwaysName;

public AirTransport(int id, String customerName, String arrivalPort, String departurePort, float weight,
		String airwaysName) {
	super(id, customerName, arrivalPort, departurePort, weight);
	this.airwaysName = airwaysName;
}

public String getAirwaysName() {
	return airwaysName;
}

public void setAirwaysName(String airwaysName) {
	this.airwaysName = airwaysName;
}
public static void displayDetails(List<AirTransport> listOfAirTransport)
{
	if(listOfAirTransport.isEmpty())
	{
		System.out.println("No shipment available");
	}
	else
	{
		System.out.println("Mode of Transportation: Air ");
	System.out.format("%-15s %-15s %-15s %-15s%-15s%-15s","Id","Customer name","Arrival port","Departure port","Weight","Airways name");
	System.out.println();
	for(AirTransport list:listOfAirTransport)
	{
		System.out.println(list);
	}
}
}

@Override
public String toString() {
	return String.format("%-15s %-15s %-15s %-15s%-15s%-15s",getId(),customerName.toString(),getArrivalPort(),getDeparturePort(),getWeight(),airwaysName.toString());
	
}




}
