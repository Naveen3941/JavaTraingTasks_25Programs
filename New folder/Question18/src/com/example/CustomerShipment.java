package com.example;

public class CustomerShipment extends Shipment {
	
	private double referalFee;
	double res;
	

	public CustomerShipment(String name, Double weight, Integer quantity, Double transferCost,
			Double maxShipmentCapacity) {
		super(name, weight, quantity, transferCost, maxShipmentCapacity);
	}

	public CustomerShipment(String name, Double weight, Integer quantity, Double transferCost,
			Double maxShipmentCapacity, double referalFee) {
		super(name, weight, quantity, transferCost, maxShipmentCapacity);
		this.referalFee = referalFee;
	}

	public double getReferalFee() {
		return referalFee;
	}

	public void setReferalFee(double referalFee) {
		this.referalFee = referalFee;
	}

	@Override
	public void calculateCost() {
		// TODO Auto-generated method stub
		
		 System.out.println("Cost for the shipment is "+((getWeight()*getQuantity()*getTransferCost())+getReferalFee()));
		 res=((getWeight()*getQuantity()*getTransferCost())+getReferalFee());
		
		
	}

	@Override
	public void operatingCapacity() {
		// TODO Auto-generated method stub
		if(res>(getMaxShipmentCapacity()*getTransferCost()))
		{
			System.out.println("The shipment is not within the shipping capacity of the agent");
		}
		else
		{
			System.out.println("The shipment is within the shipping capacity of the agent");
		}
	}
	
	

}
