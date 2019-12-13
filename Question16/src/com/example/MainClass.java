package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws IOException {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        Scanner scanner=new Scanner(System.in);
        List<AirTransport> listOfAirTransport=new ArrayList<AirTransport>();
        List<Truck> listOfTruck=new ArrayList<>();
        List<Rail> listOfRail =new ArrayList<>();
        List<BulkCarrier> listOfBulkCarriers=new ArrayList<>();
        List<ContainerShip> listOfContainerShip=new ArrayList<>();
        List<Ferries> listOfFerries=new ArrayList<>();
        System.out.println("Enter the number of shipments");
        int numberOfShipments=scanner.nextInt();
        for(int i=1;i<=numberOfShipments;i++)
        {
        	System.out.println("Enter the transportation "+i+" details");
        	System.out.println("Select the transportation mode");
        	System.out.println("1)Air");
        	System.out.println("2)Truck");
        	System.out.println("3)Rail");
        	System.out.println("4)BulkCarrier");
        	System.out.println("5)ContainerShip");
        	System.out.println("6)Ferries");
        	System.out.println("Enter your choice");
        	int choice=scanner.nextInt();
        	System.out.println("Enter the shipment "+i+" details");
        	String res[]=bufferedReader.readLine().split(",");
        	if(choice==1)
        	{
        		int id=Integer.parseInt(res[0]);
        		float weight=Float.parseFloat(res[4]);
        		listOfAirTransport.add(new AirTransport(id, res[1], res[2], res[3], weight, res[5]));
        		
        	}
        	else if(choice==2)
        	{
        		int id=Integer.parseInt(res[0]);
        		float weight=Float.parseFloat(res[4]);
        		int sizeOfContainer=Integer.parseInt(res[6]);
        		listOfTruck.add(new Truck(id, res[1], res[2], res[3], weight,res[5], sizeOfContainer));
        		
        	}
        	else if(choice==3)
        	{
        		int id=Integer.parseInt(res[0]);
        		float weight=Float.parseFloat(res[4]);
        		int numberOfContainer=Integer.parseInt(res[6]);
        		listOfRail.add(new Rail(id, res[1], res[2], res[3], weight,res[5], numberOfContainer));
        		
        	}
        	else if(choice==4)
        	{
        		int id=Integer.parseInt(res[0]);
        		float weight=Float.parseFloat(res[4]);
        		//int numberOfContainer=Integer.parseInt(res[6]);
        		listOfBulkCarriers.add(new BulkCarrier(id, res[1], res[2], res[3], weight,res[5], res[6]));
        		
        	}
        	else if(choice==5)
        	{
        		int id=Integer.parseInt(res[0]);
        		float weight=Float.parseFloat(res[4]);
        		//int numberOfContainer=Integer.parseInt(res[6]);
        		listOfContainerShip.add(new ContainerShip(id, res[1], res[2], res[3], weight,res[5], res[6]));
        		
        	}
        	else if(choice==6)
        	{
        		int id=Integer.parseInt(res[0]);
        		float weight=Float.parseFloat(res[4]);
        		//int numberOfContainer=Integer.parseInt(res[6]);
        		listOfFerries.add(new Ferries(id, res[1], res[2], res[3], weight,res[5], res[6]));
        		
        	}
        	
        	
        	
        }
        System.out.println("Enter the mode to display");
        String mode=bufferedReader.readLine();
        if(mode.equals("Air"))
        {
        	AirTransport.displayDetails(listOfAirTransport);
        }
        else if(mode.equals("Truck"))
        {
        	Truck.displayDetails(listOfTruck);
        }
        else if(mode.equals("Rail"))
        {
        	Rail.displayDetails(listOfRail);
        }
        else if(mode.equals("BulkCarrier"))
        {
        	BulkCarrier.displayDetails(listOfBulkCarriers);
        }
        else if(mode.equals("ContainerShip"))
        {
        	ContainerShip.displayDetails(listOfContainerShip);
        }
        else if(mode.equals("Ferries"))
        {
        	Ferries.displayDetails(listOfFerries);
        }
        

	}

}
