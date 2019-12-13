package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		Scanner scanner = new Scanner(System.in);
		List<Container> listOfContainer = new ArrayList<Container>();
		List<Commodity> listOfCommodity = new ArrayList<>();
		System.out.println("Enter the container number :");
		String containerNumber = scanner.next();
		System.out.println("Enter the capacity of container :");
		int capacityOfContainer = scanner.nextInt();
		System.out.println("Enter the number of commodities :");
		int numberOfCommodities = scanner.nextInt();
		System.out.println("Enter the commodities :");

		for (int i = 1; i <= numberOfCommodities; i++) {
			String res[] = bufferedReader.readLine().split(",");
			String number = res[0];
			float totalWeight = Float.parseFloat(res[1]);
			Integer quantity = Integer.parseInt(res[2]);
			listOfCommodity.add(new Commodity(number, totalWeight, quantity));
		}

		Commodity commodity[] = listOfCommodity.toArray(new Commodity[listOfCommodity.size()]);
		Container container = new Container(containerNumber, capacityOfContainer, commodity);
		ShipmentBO shipmentBO = new ShipmentBO();
		shipmentBO.validate(container, commodity);

	}

}
