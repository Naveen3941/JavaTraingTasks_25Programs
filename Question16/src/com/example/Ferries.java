package com.example;

import java.util.List;

public class Ferries extends WaterTransport {
private String agentName;

public Ferries(int id, String customerName, String arrivalPort, String departurePort, float weight, String capacity,
		String agentName) {
	super(id, customerName, arrivalPort, departurePort, weight, capacity);
	this.agentName = agentName;
}

public String getAgentName() {
	return agentName;
}

public void setAgentName(String agentName) {
	this.agentName = agentName;
}
public static void displayDetails(List<Ferries> listOfFerries)
{
	if(listOfFerries.isEmpty())
	{
		System.out.println("No shipment available");
	}
	else
	{
		System.out.println("Mode of Transportation: Water ");
	System.out.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s","Id","Customer name","Arrival port","Departure port","Weight","Agent name","Capacity");
	System.out.println();
	for(Ferries list:listOfFerries)
	{
		System.out.println(list);
	}
}
}

@Override
public String toString() {
	return String.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s",getId(),customerName.toString(),getArrivalPort(),getDeparturePort(),getWeight(),getCapacity(),getAgentName());
	
}




}

