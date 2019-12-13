package com.example;

public class AgentShippment extends Shipment {
	private double referalFee;




public AgentShippment(String name, String source, String destination, double price, double referalFee) {
		super(name, source, destination, price);
		this.referalFee = referalFee;
		//System.out.println("entered");
		calculateShipmentAmount();
		Shipment shipment=new Shipment(name, source, destination, getPrice());
	}

public double getReferalFee() {
	return referalFee;
}

public void setReferalFee(double referalFee) {
	this.referalFee = referalFee;
}
public double calculateShipmentAmount()
{ 
	setPrice(getPrice()+getReferalFee());
	
	return getPrice();
}
}
