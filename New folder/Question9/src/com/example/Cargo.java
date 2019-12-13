package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cargo {

	public static void main(String[] args) throws IOException {
		boolean flag=false;
		HashMap<Integer, String> h1=new HashMap<>();
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader sc = new BufferedReader(r);
		
		Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the number of cargo");
       int numberofCargo=scanner.nextInt();
       System.out.println("Enter the cargo id");
       int store[]=new int[numberofCargo];
       for(int i=0;i<numberofCargo;i++)
       {
    	   store[i]=scanner.nextInt();
       }
       System.out.println("Enter the number of shipment");
       int numberofShipment=scanner.nextInt();
       System.out.println("Enter the shipment name");
       for(int i=0;i<numberofShipment;i++)
       {
    	   h1.put(store[i], sc.readLine());
       }
       System.out.println("Enter the cargo id");
       int c_id=scanner.nextInt();
       for(Map.Entry m:h1.entrySet())
       {
    	   if(m.getKey().equals(c_id))
    	   {
    		   System.out.println(m.getValue());
    		   flag=true;
    	   }
    	   
       }
       if(flag==false)
	   {
		  System.out.println("Yet to be shipped "); 
	   }
       
	}

}
