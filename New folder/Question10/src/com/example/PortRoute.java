package com.example;

import java.util.Scanner;

public class PortRoute {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of ports");
		
		int result=0,res2=0;
		
		int numberofPorts=scanner.nextInt();
		int a[][]=new int[numberofPorts][numberofPorts];
		for(int i=0;i<numberofPorts;i++)
		{
			for(int j=0;j<numberofPorts;j++)
			{
				a[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Enter two port number A and B:");
		int port1=scanner.nextInt();
		int port2=scanner.nextInt();
		for(int i=0;i<(numberofPorts-(numberofPorts-1));i++)
		{
			for(int j=0;j<numberofPorts;j++)
			{
				result=result+a[i][j];
			}
		}
		
		if(result==2)
		{
			System.out.println("There is route");
		}
		else
		{
			System.out.println("There is no route");
		}

	}

}
