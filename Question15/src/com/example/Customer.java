package com.example;

import java.util.List;

public class Customer extends ShipmentEntity {
	private Integer id;
	private String name;
	
	
	
	
	public Customer(String shipmentEntityName, String identificationNumber, Integer id, String name) {
		super(shipmentEntityName, identificationNumber);
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void  display(List<Customer> listOfCustomer)
	{
		System.out.format("%-15s %-25s %-15s %-15s\n","Name","Identification Number","Customer Id","Customer Name");
		for(Customer customer:listOfCustomer)
		{
			System.out.println(customer);
		}
	}
	@Override
	public String toString() {
		return String.format("%-15s %-25s %-15s %-15s\n",shipmentEntityName.toString(),identificationNumber,  id,name);
	}
	

}
