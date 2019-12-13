package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader sc = new BufferedReader(r);
		Scanner sc1=new Scanner(System.in);
		boolean oneMode=false;
		boolean twoMode=false;
		List<Ports> p1=new ArrayList<>();
		List<Ports> one=new ArrayList<>();
		List<Ports> two=new ArrayList<>();
		System.out.println("Enter number of ports :");
        int n=sc1.nextInt();
       
        System.out.println("Enter port details :");
        for(int i=1;i<=n;i++)
        {
        	 
        	String a=sc.readLine();
        	
        	String res[]=a.split("\\|");
        	
        	int id=Integer.parseInt(res[0]);
        	String name=res[1];
        	int rail=Integer.parseInt(res[2]);
        	int road=Integer.parseInt(res[3]);
        	int air=Integer.parseInt(res[4]);
        	
        	p1.add(new Ports(id, name, rail, road, air) );
        	
        }
        
        
        for(Ports p:p1)
        {
        	int z=p.getAirTransportation()+p.getRailTransportation()+p.getRoadTransportation();
        	if(z==1)
        	{
        		one.add(p);
        		oneMode=true;
        	}
        	else if(z>1)
        	{
        		two.add(p);
        		twoMode=true;
        	}
        }
        System.out.println("One mode of transportation");
        if(oneMode==false)
        {
        	System.out.println("No such transportation available");
        }
        else
        {
        	System.out.format("%-5s%s\n","Id","Name"); 
        	for(Ports p:one)
        	{
        		System.out.println(p.getId()+"    "+p.getPortName());
        	}
        }
        System.out.println("More than one mode of transportation");
        if(twoMode==false)
        {
        	System.out.println("No such transportation available");
        }
        else
        {
        	System.out.format("%-5s%s\n","Id","Name"); 
        	for(Ports p:two)
        	{
        		System.out.println(p.getId()+"    "+p.getPortName());
        	}
        }
        
	}
}
