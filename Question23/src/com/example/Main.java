package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the total number of items");
        int numberOfItems=scanner.nextInt();
        int result=0;
        String price;
        for(int i=1;i<=numberOfItems;i++)
        {
        	System.out.println("Enter the shipping price of the item "+i+" :");
        	try
        	{
        		price=scanner.next();
        	result=result+Integer.parseInt(price);
        	}
        	catch(NumberFormatException  e)
        	{
        		System.out.println("Exception : java.lang.NumberFormatException");
        		System.out.println("Re-enter the item price :");
        		price=scanner.next();
        		result=result+Integer.parseInt(price);
        	}
        }
        System.out.println("Total cost of the container is"+result);
	}

}
