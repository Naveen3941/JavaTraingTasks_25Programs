package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) throws IOException {
		boolean b1=false;
		int count=0;
		List<Company> l1=new ArrayList<Company>();
		System.out.println("Enter the number of companies :");
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader sc=new BufferedReader(r);
	    Scanner sc1=new Scanner(System.in);
	    int n=sc1.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	    	System.out.println("Enter the company "+i+" details :");
	    	System.out.println("Enter company id :");
	    	String a=sc.readLine();
	    	System.out.println("Enter the company's IATA code");
	    	String b=sc.readLine();
	    	System.out.println("Enter the company's FMC code");
	    	String c=sc.readLine();
	    	System.out.println("Enter the company's state :");
	    	String d=sc.readLine();
	    	System.out.println("Enter the company's country :");
	    	String e=sc.readLine();
	    	Address a1=new Address(d, e);
	    	
	    	l1.add(new Company(a,b, c, a1));
	    }

	    for(Company c1:l1)
	    {
	    	
	    	if(c1.getAddress().getCountry().equals("india"))
	    	{
	    		count++;
	    		if(n==count)
	    		{
	    		System.out.println("All companies are inside india"); 
	    		
	    		b1=true;
	    		break;
	    		}
	    	}
	    }
	    if(b1==false)
	    {
	    	System.out.println("Companies outside India :");
	    List<Company> l2=l1.stream().filter(m1->!m1.getAddress().getCountry().equals("india")).collect(Collectors.toList());
	    
	    Company c1[]= l2.toArray(new Company[l2.size()]);
	    CompanyBO b12=new CompanyBO();
	    b12.displayCompanyDetails(c1);
	    }
	    
	    
	    
	    

	}

}
