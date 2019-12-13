package com.example;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
    System.out.println("Enter the number of shipments :");
    Scanner sc=new Scanner(System.in);
    List<Shipment> l1=new ArrayList<>();
    int a=sc.nextInt();
    for(int i=1;i<=3;i++)
    {
    	System.out.println("Enter the shipment "+i+"details");
    	System.out.println("Enter the shipper name");
    	String b=sc.next();
    	System.out.println("Enter the mode of transportation:");
    	String c=sc.next();
    	System.out.println("Enter the total weight:");
    	float d=sc.nextInt();
    	System.out.println("Enter the arrival port :");
    	String e=sc.next();
    	System.out.println("Enter the departure port :");
    	String f=sc.next();
    	int id=Shipment.getNextShipmentId();
    	
    	l1.add(Shipment.createNewShipment(b, c, d, e, f));
    	
    }
    System.out.println(l1);
    String s1 = String.format("%-15s%-15s%-25s%-15s%-20s%s", "Id", "Shippername", "Mode of transportation",
			"Total weight", "Arrivalport", "Departure port");
    System.out.println(s1);

    for(Shipment s:l1)
    {
    	System.out.println(s);
    }

	}

}
