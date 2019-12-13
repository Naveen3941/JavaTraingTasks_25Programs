package com.example;

public class CompanyShipment extends Shipment {
	private Integer tax;
   double res;
	public CompanyShipment(String name, Double weight, Integer quantity, Double transferCost,
			Double maxShipmentCapacity) {
		super(name, weight, quantity, transferCost, maxShipmentCapacity);
	}

	public CompanyShipment(String name, Double weight, Integer quantity, Double transferCost,
			Double maxShipmentCapacity, Integer tax) {
		super(name, weight, quantity, transferCost, maxShipmentCapacity);
		this.tax = tax;
	}

	public Integer getTax() {
		return tax;
	}

	public void setTax(Integer tax) {
		this.tax = tax;
	}

	@Override
	public void calculateCost() {
		res=((getWeight()*getQuantity()*getTransferCost()));
		res=res+(res*getTax()/100);
		System.out.println("Cost for the shipment is "+res);
		
	}

	@Override
	public void operatingCapacity() {
		if(res>(getMaxShipmentCapacity()*getTransferCost()))
		{
			System.out.println("The shipment is not within the shipping capacity of the company");
		}
		else
		{
			System.out.println("The shipment is within the shipping capacity of the company");
		}
		
	}

}
