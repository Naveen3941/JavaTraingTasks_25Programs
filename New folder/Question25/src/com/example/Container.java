package com.example;

public class Container {
	private String number;
	private float containerWeight;
	private Commodity[] commodities;

	public Container() {
		super();
	}

	public Container(String number, float containerWeight, Commodity[] commodities) {
		super();
		this.number = number;
		this.containerWeight = containerWeight;
		this.commodities = commodities;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public float getContainerWeight() {
		return containerWeight;
	}

	public void setContainerWeight(float containerWeight) {
		this.containerWeight = containerWeight;
	}

	public Commodity[] getCommodities() {
		return commodities;
	}

	public void setCommodities(Commodity[] commodities) {
		this.commodities = commodities;
	}

	public void displayDetails(Commodity[] commodity) {
		System.out.println("Commodity details are:");
		System.out.format("%-15s%-15s%s\n", "Id", "Weight", "Quantity");
		for (Commodity commodity2 : commodity) {
			System.out.println(commodity2.getCommodityId() + "       " + commodity2.getTotalWeight() + "       "
					+ commodity2.getQuantity());
		}

	}

}
