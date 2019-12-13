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
        List<AgentShippment> listofAgentShipment=new ArrayList<AgentShippment>();
       // List<Shipment> listofShipment=new ArrayList<Shipment>();
        System.out.println("Enter the shipment name :");
        String shipmentName=bufferedReader.readLine();
        System.out.println("Enter the source :");
        String source=bufferedReader.readLine();
        System.out.println("Enter the destination :");
        String destination=bufferedReader.readLine();
        System.out.println("Enter the price :");
        double price=scanner.nextDouble();
        System.out.println("1. Agent");
        System.out.println("2. Company");
        System.out.println("Enter your choice :");
        int choice=scanner.nextInt();
        if(choice==1)
        {
        	System.out.println("Enter the referal fee :");
        	double referalFee=scanner.nextDouble();
        	AgentShippment agentShippment=new AgentShippment(shipmentName, source, destination, price,referalFee);

        }
        else
        {
        	System.out.println("Enter the luxury tax and corporate tax :");
        	double luxury=scanner.nextDouble();
        	double corporateTax=scanner.nextDouble();
        	CompanyShipment companyShipment=new CompanyShipment(shipmentName, source, destination, price, luxury, corporateTax);
        }

	}

}
