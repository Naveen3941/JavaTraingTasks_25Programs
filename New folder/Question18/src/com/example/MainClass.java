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
        System.out.println("1.Customer Shipment");
        System.out.println("2.Company Shipment");
        System.out.println("Enter your choice :");
        int choice=scanner.nextInt();
        System.out.println("Enter the name :");
        String name=bufferedReader.readLine();
        System.out.println("Enter the weight :");
        double weight=scanner.nextDouble();
        System.out.println("Enter the quantity :");
        int quantity=scanner.nextInt();
        System.out.println("Enter the shipment transfer cost :");
        double transfer=scanner.nextDouble();
        System.out.println("Enter the maximum shipment capacity");
        double shipmentCapacity=scanner.nextDouble();
        if(choice==1)
        {
        	System.out.println("Enter the referal fee :");
        	int referalFee=scanner.nextInt();
        	CustomerShipment customerShipment=new CustomerShipment(name,weight,quantity,transfer,shipmentCapacity,referalFee);
        	customerShipment.calculateCost();
        	customerShipment.operatingCapacity();
        	
        }
        else if(choice==2)
        {
        	System.out.println("Enter the tax percentage :");
        	int tax=scanner.nextInt();
        	CompanyShipment companyShipment=new CompanyShipment(name,weight,quantity,transfer,shipmentCapacity,tax);
        	companyShipment.calculateCost();
        	companyShipment.operatingCapacity();
        	
        }
        
        
        
	}

}
