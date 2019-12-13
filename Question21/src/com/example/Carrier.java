package com.example;

import java.util.Scanner;

public class Carrier implements MenuDrivenEntity, ICarrier {
	private String id;
	private double expense;
	private String modeOfTransport;
	private String[] listOfPorts;
	
	public Carrier(String value) {
		super();
		
		String res[]=value.split(",");
		this.id=res[0];
		this.expense=Double.parseDouble(res[1]);
		this.modeOfTransport=res[2];
		String add[]=new String[res.length-3];
		int m=0;
		
		for(int i=3;i<res.length;i++)
		{
			 add[m]=res[i];
			 m++;
		}
		this.listOfPorts=add;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getExpense() {
		return expense;
	}

	public void setExpense(double expense) {
		this.expense = expense;
	}

	public String getModeOfTransport() {
		return modeOfTransport;
	}

	public void setModeOfTransport(String modeOfTransport) {
		this.modeOfTransport = modeOfTransport;
	}

	public String[] getListOfPorts() {
		return listOfPorts;
	}

	public void setListOfPorts(String[] listOfPorts) {
		this.listOfPorts = listOfPorts;
	}

	

	@Override
	public void listOfPorts() {
		// TODO Auto-generated method stub
		System.out.println("List of ports :");
		for(String clist:listOfPorts)
		{
			System.out.println(clist);
		}

	}

	@Override
	public void noOfPorts() {
		System.out.println(listOfPorts.length);

	}

	@Override
	public void displayMenu() {
		System.out.println("Carrier menu");
		System.out.println("1.List the ports");
		System.out.println("2.Calculate number of ports");
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		choiceAction(choice);

	}

	@Override
	public void choiceAction(int choice) {
		
		if(choice==1)
		{
			listOfPorts();
		}
		else if(choice==2)
		{
			noOfPorts();
		}

	}

}
