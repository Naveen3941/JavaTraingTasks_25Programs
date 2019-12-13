package com.example;
import java.util.Scanner;

public class Customers {

	public static void main(String[] args) {
        boolean flag=false;
		Scanner scaneer = new Scanner(System.in);
		System.out.println("Enter the number of customer:");
		int noofCustomer = scaneer.nextInt();
		String store[] = new String[noofCustomer];
		for (int i = 0; i < noofCustomer; i++) {
			store[i] = scaneer.next();
		}
		System.out.println("Enter the name you want to search:");
		String check = scaneer.next();
		for (String print : store) {
			if (print.equals(check)) {
               System.out.println(print+" found!");
               flag=true;
			}

		}
		if(flag==false)
		{
			System.out.println(check+" not found!");
		}
	}

}
