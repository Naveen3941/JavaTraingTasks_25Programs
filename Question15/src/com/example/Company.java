package com.example;

import java.util.List;

public class Company extends ShipmentEntity
{
private String identifier;
private String iata;
private String fmc;

public Company(String shipmentEntityName, String identificationNumber) {
	super(shipmentEntityName, identificationNumber);
}
public Company(String shipmentEntityName, String identificationNumber, String identifier, String iata, String fmc) {
	super(shipmentEntityName, identificationNumber);
	this.identifier = identifier;
	this.iata = iata;
	this.fmc = fmc;
}
public String getIdentifier() {
	return identifier;
}
public void setIdentifier(String identifier) {
	this.identifier = identifier;
}
public String getIata() {
	return iata;
}
public void setIata(String iata) {
	this.iata = iata;
}
public String getFmc() {
	return fmc;
}
public void setFmc(String fmc) {
	this.fmc = fmc;
}
public static void display( List<Company> listOfCompany)
{
	System.out.format("%-15s %-25s %-15s %-15s %-15s\n","Name","Identification Number","Company Name","IATA","FMC");
	for(Company company:listOfCompany)
	{
		System.out.println(company);
	}
}
@Override
public String toString() {
	return String.format("%-15s %-25s %-15s %-15s %-15s\n",shipmentEntityName.toString(),identificationNumber,  identifier.toString(),iata.toString(),fmc.toString());
}

}
