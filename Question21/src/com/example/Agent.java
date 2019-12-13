package com.example;

import java.util.Scanner;

public class Agent implements MenuDrivenEntity, TaxPayer {

	private String id;
	private double expense;
	private double commission;

	public Agent(String value) {
		super();
		String res[]=value.split(",");
		this.id=res[0];
		this.expense=Double.parseDouble(res[1]);
		this.commission=Double.parseDouble(res[2]);
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
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

	@Override
	public double calculateRevenue() {
		// TODO Auto-generated method stub
		System.out.println("Revenue for "+id+ " is "+(expense+commission));
		return 0;
	}

	@Override
	public double calculateTax() {
		// TODO Auto-generated method stub
		System.out.println("Tax for "+id+ " is "+(commission*5/100));
		return 0;
	}

	@Override
	public void displayMenu() {
     System.out.println("Agent menu");
     System.out.println("1.Calculate agent revenue");
     System.out.println("2.Calculate agent tax");
     Scanner scanner=new Scanner(System.in);
     int choose=scanner.nextInt();
     choiceAction(choose);
    

	}

	@Override
	public void choiceAction(int choice) {
		if(choice==1)
		{
			calculateRevenue();
		}
		else if(choice==2)
		{
			calculateTax();
		}

	}

}
