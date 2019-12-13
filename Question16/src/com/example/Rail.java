package com.example;

import java.util.List;

public class Rail extends GroundTransport
{
private int numberOfContainer;

public Rail(int id, String customerName, String arrivalPort, String departurePort, float weight, String capacity,
		int numberOfContainer) {
	super(id, customerName, arrivalPort, departurePort, weight, capacity);
	this.numberOfContainer = numberOfContainer;
}

public int getNumberOfContainer() {
	return numberOfContainer;
}

public void setNumberOfContainer(int numberOfContainer) {
	this.numberOfContainer = numberOfContainer;
}
public static void displayDetails(List<Rail> listOfRail)
{
	if(listOfRail.isEmpty())
	{
		System.out.println("No shipment available");
	}
	else
	{
		System.out.println("Mode of Transportation: Ground ");
	System.out.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s","Id","Customer name","Arrival port","Departure port","Weight","Number of container","Capacity");
	for(Rail list:listOfRail)
	{
		System.out.println(list);
	}
}
}

@Override
public String toString() {
	return String.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s",getId(),customerName.toString(),getArrivalPort(),getDeparturePort(),getWeight(),numberOfContainer,getCapacity());
	
}




}
