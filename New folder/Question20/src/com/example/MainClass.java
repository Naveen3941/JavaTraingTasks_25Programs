package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        Scanner scanner=new Scanner(System.in);
        ShipmentBO shipmentBO=new ShipmentBO();
		System.out.println("Enter the number of shipment");
		int numberOfShipment=scanner.nextInt();
		Shipment ship[]=new Shipment[numberOfShipment];
		for(int i=1;i<=numberOfShipment;i++)
		{
			System.out.println("Enter the Shipment "+i+" details");
			String res[]=bufferedReader.readLine().split(",");
			
			ShipmentStatus shipmentStatus=new ShipmentStatus(res[4], res[5]);
			int id=Integer.parseInt(res[0]);
			 ship[i-1]=new Shipment(id,res[1],res[2],res[3],shipmentStatus);
			
		}
		System.out.println("Enter the type to display the data (JSON/XML)");
		String display=bufferedReader.readLine();
		if(display.equals("json"))
		{
			
			shipmentBO.convertToJSON(ship);
		}
		else if(display.equals("csv"))
		{
			shipmentBO.convertToCSV(ship);
		}

	}

}
