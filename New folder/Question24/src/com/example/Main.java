package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, InvalidPortException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		Scanner scanner = new Scanner(System.in);
		List<Port> listOfPorts = new ArrayList<Port>();
		Port port;
		listOfPorts.add(new Port(1, "India", "  Chennai"));
		listOfPorts.add(new Port(2, "America", "California"));
		listOfPorts.add(new Port(3, "England", "London"));
		listOfPorts.add(new Port(4, "Australia", "Melbourne"));
		Port ports[] = listOfPorts.toArray(new Port[listOfPorts.size()]);
		System.out.println("Enter the Shipment Id");
		int shipmentId = scanner.nextInt();
		System.out.println("Enter the ShipmentName");
		String shipmentName = bufferedReader.readLine();
		System.out.println("Availble ports are");
		System.out.println("ID       Country         PortName");

		for (Port p : listOfPorts) {
			System.out.println(p.getId() + "        " + p.getCountry() + "         " + p.getName());
		}
		System.out.println("Enter the arrival port name");
		String arrivalPort = bufferedReader.readLine();
		System.out.println("Enter the departure port name");
		String departurePort = bufferedReader.readLine();
		ShipmentBO shipmentBO = new ShipmentBO();

		boolean res = shipmentBO.validateShipment(arrivalPort, departurePort, ports);

		if (res == true) {
			Port arrival = null;
			Port departure = null;
			for (Port p2 : ports) {
				if (p2.getName().trim().equals(arrivalPort)) {
					arrival = p2;

				}
				if (p2.getName().trim().equals(departurePort)) {
					departure = p2;

				}
			}
			Shipment shipment = new Shipment(shipmentId, shipmentName, arrival, departure);
			shipmentBO.displayShipmentDetails(shipment, ports, arrivalPort, departurePort);
		} else {
			try {

				throw new InvalidPortException("InvalidPortException : The port name is invalid");
			} catch (InvalidPortException e) {
				System.out.println(e.getMessage());
			}

		}

	}

}
