package com.example;

import java.util.Scanner;

public class Company implements MenuDrivenEntity, TaxPayer {

	private String id;
	private double expense;
	private double profit;

	public Company(String value) {
		super();
		String res[]=value.split(",");
		this.id=res[0];
		this.expense=Double.parseDouble(res[1]);
		this.profit=Double.parseDouble(res[2]);
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

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	@Override
	public double calculateRevenue() {
		System.out.println("Revenue for "+id+ " is "+(expense+profit));
		return 0;
	}

	@Override
	public double calculateTax() {
		System.out.println("Tax for "+id+ " is "+(profit*8/100));
		return 0;
	}

	@Override
	public void displayMenu() {
		 System.out.println("Company menu");
	     System.out.println("1.Calculate company revenue");
	     System.out.println("2.Calculate company tax");
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
