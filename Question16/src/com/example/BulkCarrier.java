package com.example;

import java.util.List;

public class BulkCarrier extends WaterTransport{
	private String name;

	public BulkCarrier(int id, String customerName, String arrivalPort, String departurePort, float weight,
			String capacity, String name) {
		super(id, customerName, arrivalPort, departurePort, weight, capacity);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static void displayDetails(List<BulkCarrier> listOfBulkCarriers)
	{
		if(listOfBulkCarriers.isEmpty())
		{
			System.out.println("No shipment available");
		}
		else
		{
			System.out.println("Mode of Transportation: Water ");
		System.out.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s","Id","Customer name","Arrival port","Departure port","Weight","Company name","capacity");
		for(BulkCarrier list:listOfBulkCarriers)
		{
			System.out.println(list);
		}
	}
	}

	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s",getId(),customerName.toString(),getArrivalPort(),getDeparturePort(),getWeight(),getName(),getCapacity());
		
	}




	}
