package com.example;

public class ShipmentBO {

	public boolean validateShipment(String s1, String s2, Port[] p) {

		int count = 0;
		for (Port port : p) {
			if ((port.getName().trim().equals(s1) || port.getName().trim().equals(s2)) && !s1.equals(s2)) {
				count++;

			}
		}
		if (count == 2) {

			return true;
		}

		return false;

	}

	public void displayShipmentDetails(Shipment shipmentObj, Port[] ports, String p1, String p2) {
		System.out.println("Shipment Details");
		System.out.format("%-15s%-15s%-15s%-15s\n", "Shipment id", "Shipment name", "Arrival place", "Departure place");

		System.out.println(shipmentObj.getId() + "                    " + shipmentObj.getName() + "       "
				+ shipmentObj.getArrivalPort().getName() + "/" + shipmentObj.getArrivalPort().getCountry() + "       "
				+ shipmentObj.getDeparturePort().getName() + "/" + shipmentObj.getDeparturePort().getCountry());

	}

}
