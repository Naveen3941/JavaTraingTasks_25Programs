package com.example;

import java.util.List;

public class Shipment {
private String name;
private String source;
private String destination;
private double price;

public Shipment() {
	super();
}
public Shipment(String name, String source, String destination, double price) {
	super();
	this.name = name;
	this.source = source;
	this.destination = destination;
	this.price = price;
	calculateShipmentAmount();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
double calculateShipmentAmount()
{   System.out.println("Agent details :");
	System.out.format("%-15s %-15s %-15s %s","Name","Source","Destination","Total Amount");
	System.out.println();
	
	
		System.out.format("%-15s %-15s %-15s %s",name.toString(),source.toString(),destination.toString(),price);
	
	return price;
	
}
@Override
public String toString() {
	return String.format("%-15s %-15s %-15s %s",name.toString(),source.toString(),destination.toString(),price);
}

}
