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
        String shipmentName ,identificationNumber,name;
        int id=0;
    	//String identificationNumber = null;
    	
        List<Customer> listOfCustomer=new ArrayList<Customer>();
        List<Company> listOfCompany=new ArrayList<Company>();
        List<Agent> listOfAgent=new ArrayList<Agent>();
        List<Carrier> listOfCarrier=new ArrayList<Carrier>();
        System.out.println("Enter the number of shipment entity");
        int numberOfShipment=scanner.nextInt();
        for(int i=1;i<=numberOfShipment;i++)
        {
        	System.out.println("Enter the shipment entity "+i+" details :");
        	System.out.println("Select the shipment entity type");
        	System.out.println("1)Customer");
        	System.out.println("2)Company");
        	System.out.println("3)Agent");
        	System.out.println("4)Carrier");
        	int choose=scanner.nextInt();
        	if(choose==1)
        	{
        	String res[]=bufferedReader.readLine().split(",");
        	shipmentName=res[0];
        	 identificationNumber=res[1];
        	  id=Integer.parseInt(res[2]);
        	  name=res[3];
        	listOfCustomer.add(new Customer(shipmentName, identificationNumber, id, name));
        	
        	}
        	else if(choose==2)
        	{
        	String res[]=bufferedReader.readLine().split(",");
        	shipmentName=res[0];
        	 identificationNumber=res[1];
        	String  identifier=res[2];
        	 String iata=res[3];
        	 String fmc=res[4];
        	listOfCompany.add(new Company(shipmentName, identificationNumber, identifier, iata,fmc));
        	
        	}
        	
        	else if(choose==3)
        	{
        	String res[]=bufferedReader.readLine().split(",");
        	shipmentName=res[0];
        	 identificationNumber=res[1];
        
        	String nameofAgent=res[2];
        	 String iata=res[3];
        	 String fmc=res[4];
        	listOfAgent.add(new Agent(shipmentName, identificationNumber, nameofAgent, iata,fmc));
        	
        	}
        	
        	else if(choose==4)
        	{
        	String res[]=bufferedReader.readLine().split(",");
        	shipmentName=res[0];
        	 identificationNumber=res[1];
        
        	String carrierCode=res[2];
        	 String iata=res[3];
        	 
        	listOfCarrier.add(new Carrier(shipmentName, identificationNumber, carrierCode, iata));
        	
        	}
        	
        }
        System.out.println("Shipment details are");
        System.out.println("Enter the shipment entity type to display");
        String shipmentType=bufferedReader.readLine();
        if(shipmentType.equals("Customer"))
        {
        	
        	
        	Customer.display(listOfCustomer);
        }
        else if(shipmentType.equals("Company"))
        {
        	Company.display(listOfCompany);
        }
        else if(shipmentType.equals("Agent"))
        {
        	Agent.display(listOfAgent);
        }
        else if(shipmentType.equals("Carrier"))
        {
        	Carrier.display(listOfCarrier);
        }
        
       
	}

}
