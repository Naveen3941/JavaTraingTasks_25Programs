package com.example;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the container price :");
		int containerPrice=scanner.nextInt();
		System.out.println("Enter the number of items in the container :");
		int numberOfContainer=scanner.nextInt();
		try
		{
		int res =containerPrice/numberOfContainer;
		System.out.println("The average price of the item is RS."+res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception :"+e);
		}

	}

}
