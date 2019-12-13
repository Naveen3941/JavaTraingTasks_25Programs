package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws IOException {
		List<Port> l1=new ArrayList<Port>();
		System.out.println("Enter the number of ports");
		Scanner s12=new Scanner(System.in);
		 InputStreamReader r=new InputStreamReader(System.in);    
		    BufferedReader sc=new BufferedReader(r);            
		        
		
		int n=s12.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the port "+i+" details");
			String s1=sc.readLine();
			String a[]=s1.split(" ");
			int id=Integer.parseInt(a[0]);
			String name=a[1];
			System.out.println("is the port from same country[Y/N]");
			String s2=sc.readLine();
			System.out.println(s2);
			if(s2.equals("N"))
			{
			System.out.println("Enter the country");
			String s3=sc.readLine();
			l1.add(new Port(id, name, s3));
			}
			else
			{
				
				String s4="India";
				l1.add(new Port(id, name, s4));
			}
			
			
		}
		System.out.println("The port details are");
		System.out.format("%-15s %-15s %-15s","Id","Name","Country");
		System.out.println();
		for(Port p:l1)
		{
			System.out.println(p);
		}

	}

}
