package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrier implements IMaintainCarrier {

	private String iataCode;
	private String user;
	private String address;
	private String carrierCode;
	static boolean flag = true;
	static List<Carrier> listOfCarriers = new ArrayList<Carrier>();
	
	public Carrier() {
		super();
	}
    	
	public Carrier(String iataCode, String user, String address, String carrierCode) {
		super();
		this.iataCode = iataCode;
		this.user = user;
		this.address = address;
		this.carrierCode = carrierCode;
	}

	public String getIataCode() {
		return iataCode;
	}

	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	@Override
	public Carrier createCarrier(String carrierValues) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String store[]=carrierValues.split(",");
		listOfCarriers.add(new Carrier(store[0], store[1], store[2], store[3]));
		System.out.println("Carrier successfully created");
		System.out.println("Do you want to continue(yes/no) :");
		String yesOrNo=scanner.next();
		if(yesOrNo.equals("no"))
		{
			flag=false;
		}
		return null;
	}

	@Override
	public Carrier retrieveCarrier(String carrierCode, Carrier[] carrierArray) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean check=false;
		Carrier carrier3=null;
		for(Carrier carrier2:carrierArray)
		{
			if(carrier2.carrierCode.equals(carrierCode))
			{
				 carrier3=carrier2;
				 System.out.println("Carrier details :");
				 System.out.println("IATA code :"+carrier2.getIataCode());
				 System.out.println("User :"+carrier2.getUser());
				 System.out.println("Address :"+carrier2.address);
				 System.out.println("Carrier code :"+carrier2.getCarrierCode());
				check=true;
			}
		}
		if(check==false)
		{
			System.out.println("Carrier code not found");	
		}
		
		System.out.println("Do you want to continue(yes/no) :");
		String yesOrNo=scanner.next();
		if(yesOrNo.equals("no"))
		{
			flag=false;
		}
		return carrier3;
	}

	@Override
	public Boolean deleteCarrier(String carrierCode, Carrier[] carrierArray) {
		// TODO Auto-generated method stub
		int count=0;
		boolean check=false;
		Scanner scanner=new Scanner(System.in);
		for(Carrier carrier:carrierArray)
		{
			if(carrier.getCarrierCode().equals(carrierCode))
			{
				listOfCarriers.remove(count);
				System.out.println("Carrier successfully deleted");
				check=true;
				
			}
			count++;
			
		}
		if(check==false)
		{
			System.out.println("Carrier code not found");
		}
		System.out.println("Do you want to continue(yes/no) :");
		String yesOrNo=scanner.next();
		if(yesOrNo.equals("no"))
		{
			flag=false;
		}
		
		return null;
	}

	@Override
	public Boolean updateCarrier(String carrierCode, Carrier[] carrierArray, String carrierValues) {
		String res[]=carrierValues.split(",");
		String iata=res[0];
		String user=res[1];
		String address=res[2];
		boolean check=false;
		Scanner scanner=new Scanner(System.in);
		for(Carrier carrier:carrierArray)
		{
			if(carrier.getCarrierCode().equals(carrierCode))
			{
				carrier.setIataCode(iata);
				carrier.setUser(user);
				carrier.setAddress(address);
				check=true;
				System.out.println("Carrier successfully updated");
			}
		}
		if(check==false)
		{
			System.out.println("Carrier code not found");
		}
		System.out.println("Do you want to continue(yes/no) :");
		String yesOrNo=scanner.next();
		if(yesOrNo.equals("no"))
		{
			flag=false;
		}
		// TODO Auto-generated method stub
		return null;
	}

	public void display(Carrier[] carriers) {
		Scanner scanner=new Scanner(System.in);
		System.out.format("%-15s %-15s %-15s %s\n", "IATA Code", "User Name", "Address", "Carrier code");
		for(Carrier carrier:carriers)
		{
			System.out.println(carrier);
		}
		System.out.println("Do you want to continue(yes/no) :");
		String yesOrNo=scanner.next();
		if(yesOrNo.equals("no"))
		{
			flag=false;
		}
	}
	

	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s %s\n", iataCode.toString(),user.toString(),address.toString(),carrierCode.toString());
	}

	public static void main(String[] args) throws IOException {
		
		
		Carrier carrier=new Carrier();
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		Scanner scanner = new Scanner(System.in);
		while(flag==true)
		{
		System.out.println("Carrier Maintainance");
		System.out.println("1.Create carrier");
		System.out.println("2.Retrieve carrier");
		System.out.println("3.Delete carrier");
		System.out.println("4.Update carrier");
		System.out.println("5.Display");
		System.out.println("Enter your choice :");
		int choice = scanner.nextInt();
		if(choice==1)
		{
			
		System.out.println("Enter the carrier values :");
		String res = bufferedReader.readLine();
		carrier.createCarrier(res);
		
	}
		else if(choice==2)
		{
		System.out.println("Enter the carrier code to retrive  :");
		String code= bufferedReader.readLine();
		Carrier codeList[]=listOfCarriers.toArray( new Carrier[listOfCarriers.size()]);
		carrier.retrieveCarrier(code, codeList);
	    }
		
		else if(choice==3)
		{
		System.out.println("Enter the carrier code to delete  :");
		String code= bufferedReader.readLine();
		Carrier codeList[]=listOfCarriers.toArray( new Carrier[listOfCarriers.size()]);
		carrier.deleteCarrier(code, codeList);
	    }
		else if(choice==4)
		{
		System.out.println("Enter the carrier code to updated :");
		String carrierCode=bufferedReader.readLine();
		System.out.println("Enter the carrier values");
		String carrierValues=bufferedReader.readLine();
		Carrier codeList[]=listOfCarriers.toArray( new Carrier[listOfCarriers.size()]);
		carrier.updateCarrier(carrierCode, codeList, carrierValues);
		}
		else if(choice==5)
		{
			Carrier codeList[]=listOfCarriers.toArray( new Carrier[listOfCarriers.size()]);
			carrier.display(codeList);
		}

	}

}
}