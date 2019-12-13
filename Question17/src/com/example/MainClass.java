package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	private static List<Ferries> listOfFerries=new ArrayList<>();
	private static List<ContainerShips> listOfContainerShip=new ArrayList<ContainerShips>();
    
     private static List<BulkShips> listOfBulkShips=new ArrayList<>();
     
     
	
	public static List<ContainerShips> getListOfContainerShip() {
		return listOfContainerShip;
	}

	public static void setListOfContainerShip(List<ContainerShips> listOfContainerShip) {
		MainClass.listOfContainerShip = listOfContainerShip;
	}

	public static List<BulkShips> getListOfBulkShips() {
		return listOfBulkShips;
	}

	public static void setListOfBulkShips(List<BulkShips> listOfBulkShips) {
		MainClass.listOfBulkShips = listOfBulkShips;
	}

	public List<Ferries> getListOfFerries() {
		return listOfFerries;
	}

	public void setListOfFerries(List<Ferries> listOfFerries) {
		this.listOfFerries = listOfFerries;
	}

	public static void main(String[] args) throws IOException {
	
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        Scanner scanner=new Scanner(System.in);	
        
      System.out.println("Enter the number of carriers :");
      int numberOfCarrier=scanner.nextInt();
      for(int i=1;i<=numberOfCarrier;i++)
      {
    	  System.out.println("Enter the carrier "+i+" details :");
    	  String res[]=bufferedReader.readLine().split(",");
    	
    	  if(res[4].equals("Ferries"))
    	  {
    		 
    		  listOfFerries.add(new Ferries(res[0],res[1],res[2],res[3],res[4],Integer.parseInt(res[5])));
    		  
    	  }
    	  else if(res[4].equals("ContainerShip"))
    	  {
    		  listOfContainerShip.add(new ContainerShips(res[0], res[1], res[2], res[3], res[4], Integer.parseInt(res[5])));
    	  }
    	  else if(res[4].equals("BulkShip"))
    	  {
    		  listOfContainerShip.add(new ContainerShips(res[0], res[1], res[2], res[3], res[4], Integer.parseInt(res[5])));
    	  }
      }
      System.out.println("Ship details are");
      if(!listOfFerries.isEmpty())
      {
    	  Ferries ferries=new Ferries();
      ferries.displayShipDetails();
      }
      if(!listOfBulkShips.isEmpty())
      {
    	  BulkShips bulkShips=new BulkShips();
      bulkShips.displayShipDetails();
      }
      if(!listOfContainerShip.isEmpty())
      {
    	  ContainerShips containerShips=new ContainerShips();
      containerShips.displayShipDetails();
      }
      
	}

}
