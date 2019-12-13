package com.example;

import java.util.List;

public class Truck extends GroundTransport{
	private int sizeOfContainer;

	public Truck(int id, String customerName, String arrivalPort, String departurePort, float weight, String capacity,
			int sizeOfContainer) {
		super(id, customerName, arrivalPort, departurePort, weight, capacity);
		this.sizeOfContainer = sizeOfContainer;
	}

	public int getSizeOfContainer() {
		return sizeOfContainer;
	}

	public void setSizeOfContainer(int sizeOfContainer) {
		this.sizeOfContainer = sizeOfContainer;
	}
	public static void displayDetails(List<Truck> listOfTruck)
	{
		if(listOfTruck.isEmpty())
		{
			System.out.println("No shipment available");
		}
		else
		{
			System.out.println("Mode of Transportation: Ground ");
		System.out.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s","Id","Customer name","Arrival port","Departure port","Weight","Size of container","capacity");
		for(Truck list:listOfTruck)
		{
			System.out.println(list);
		}
	}
	}

	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s %-15s%-15s%-20s%-15s",getId(),customerName.toString(),getArrivalPort(),getDeparturePort(),getWeight(),sizeOfContainer,getCapacity());
		
	}




	}
