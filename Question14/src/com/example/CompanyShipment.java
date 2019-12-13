package com.example;

public class CompanyShipment extends Shipment {

	private double luxuryTax;
	private double corporateTax;
	public CompanyShipment(String name, String source, String destination, double price, double luxuryTax,
			double corporateTax) {
		super(name, source, destination, price);
		this.luxuryTax = luxuryTax;
		this.corporateTax = corporateTax;
		calculateShipmentAmount();
		Shipment shipment=new Shipment(name, source, destination, getPrice());
	}
	public double getLuxuryTax() {
		return luxuryTax;
	}
	public void setLuxuryTax(double luxuryTax) {
		this.luxuryTax = luxuryTax;
	}
	public double getCorporateTax() {
		return corporateTax;
	}
	public void setCorporateTax(double corporateTax) {
		this.corporateTax = corporateTax;
	}
	public double calculateShipmentAmount()
	{
		setPrice(getPrice()+getLuxuryTax()+getCorporateTax());
		return getPrice();
	}

}
