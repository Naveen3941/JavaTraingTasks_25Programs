package com.example;

public class ShipmentBO {
	public void validate(Container container, Commodity[] commodity) {
		float res = 0;

		for (Commodity commodity2 : commodity) {
			res = res + commodity2.getTotalWeight();
		}

		if (container.getContainerWeight() >= res) {

			Container container2 = new Container();
			container2.displayDetails(commodity);
		} else {
			try {
				throw new ContainerOverloadedException("ContainerOverloadedException: Container is overloaded");
			} catch (ContainerOverloadedException e) {
				System.out.println(e.getMessage());
			}

		}
	}

}
