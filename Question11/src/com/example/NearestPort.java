package com.example;

import java.util.Scanner;

public class NearestPort {

	public static void main(String[] args) {

     int least=10;
     int count=0;
     int value=0;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the number of ports :");
    int numberofPorts=scanner.nextInt();
    int store[][]=new int[numberofPorts][numberofPorts];
    int res[]=new int[numberofPorts];
    System.out.println("Enter the distance between all ports :");
    for(int i=0;i<numberofPorts;i++)
    {
    	for(int j=0;j<numberofPorts;j++)
    	{
    		store[i][j]=scanner.nextInt();
    	}
    }
    
    	for(int i=0;i<numberofPorts;i++)
    	{
    	for(int j=0;j<numberofPorts;j++)
    	{
    		res[j]=res[j]+store[i][j];
    	}
    	/////////////////condition 1///////////////////////////////
    	    if(i==0)
    	   {
    		for(int q:res)
    		{
    			count++;
    			if(q!=0 && least>q)
    			{
    				least=q;
    				 value=count;
    			}
    		}
    		if(least==10)
    		{
    			System.out.println("No ports are closer to port1");
    		}
    		else
    		{
    			System.out.println("Port"+(i+1)+" is closer to Port"+value);
    		}
    	   }
    	
       /////////////////condition 2///////////////////////////////
    	    else if(i==1)
    	    {
    	    	for(int q:res)
        		{
        			count++;
        			if(q!=0 && least>q)
        			{
        				least=q;
        				 value=count;
        			}
        		}
        		if(least==10)
        		{
        			System.out.println("No ports are closer to port2");
        		}
        		else
        		{
        			System.out.println("Port"+(i+1)+" is closer to Port"+value);
        		}
    	    }
    	 
    	    /////////////////condition 3///////////////////////////////
    	    else if(i==2)
    	    {
    	    	for(int q:res)
        		{
        			count++;
        			if(q!=0 && least>q)
        			{
        				least=q;
        				 value=count;
        			}
        		}
        		if(least==10)
        		{
        			System.out.println("No ports are closer to port3");
        		}
        		else
        		{
        			System.out.println("Port"+(i+1)+" is closer to Port"+value);
        		}
    	    }
    	    
    	    /////////////////condition 4///////////////////////////////
    	    else if(i==3)
    	    {
    	    	for(int q:res)
        		{
        			count++;
        			if(q!=0 && least>q)
        			{
        				least=q;
        				 value=count;
        			}
        		}
        		if(least==10)
        		{
        			System.out.println("No ports are closer to port4");
        		}
        		else
        		{
        			System.out.println("Port"+(i+1)+" is closer to Port"+value);
        		}
    	    }   
    	////////////////////////failing case////////////////////////
    	least=10;
    	count=0;
    	value=0;
    	
    	}
    
	}
	
	
}
