package com.example;

import java.util.List;

public class ContainerShip extends WaterTransport{
	
private String companyName;

public ContainerShip(int id, String customerName, String arrivalPort, String departurePort, float weight,
		String capacity, String companyName) {
	super(id, customerName, arrivalPort, departurePort, weight, capacity);
	this.companyName = companyName;
}

public String getCompanyName() {
	return companyName;
}

public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public static void displayDetails(List<ContainerShip> listOfContainerShip)
{
	if(listOfContainerShip.isEmpty())
	{
		System.out.println("No shipment available");
	}
	else
	{
		System.out.println("Mode of Transportation: Water ");
	System.out.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s","Id","Customer name","Arrival port","Departure port","Weight","Company name","Capacity");
	System.out.println();
	for(ContainerShip list:listOfContainerShip)
	{
		System.out.println(list);
	}
}
}

@Override
public String toString() {
	return String.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s",getId(),customerName.toString(),getArrivalPort(),getDeparturePort(),getWeight(),getCompanyName(),getCapacity());
	
}




}
