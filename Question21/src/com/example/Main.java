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
        Scanner scanner=new Scanner(System.in);
        Carrier carrier = null;
        Agent agent=null;
        Company company=null;
       
        System.out.println("Enter the number of shipment entity :");
        int numberOfShipment=scanner.nextInt();
        for(int i=1;i<=numberOfShipment;i++)
        {
        	System.out.println("Enter the entity "+i+" details :");
        	String res=bufferedReader.readLine();
        	if(res.startsWith("CA"))
        	{
        		
        		  carrier=new Carrier(res);
        		 
        	}
        	else if(res.startsWith("AG"))
        	{
        		agent=new Agent(res);
        	}
        	else if(res.startsWith("CO"))
        	{
        		company=new Company(res);
        	}
        }
        System.out.println("Enter the entity id");
        String entity=bufferedReader.readLine();
        if(entity.startsWith("CA"))
    	{
        	carrier.displayMenu();
    		 
    	}
        else if(entity.startsWith("AG"))
    	{
        	agent.displayMenu();
    		 
    	}
        else if(entity.startsWith("CO"))
    	{
        	company.displayMenu();
    		 
    	}
      

	}

}
