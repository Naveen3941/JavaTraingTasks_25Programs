package com.example;

import java.util.ArrayList;
import java.util.List;

public class Container extends Cargo {
	private String containerNumber;
	
	public Container() {
		super();
	}

	public Container(String containerNumber) {
		super();
		this.containerNumber = containerNumber;
	}
    
	public String getContainerNumber() {
		return containerNumber;
	}

	public void setContainerNumber(String containerNumber) {
		this.containerNumber = containerNumber;
	}
//containerNumber.toString()+
	public void displayContainerDetails(List<Cargo> list,List<Container> container_list)
	{
		 List<String> result=new ArrayList<String>();
		 int m=0;
		System.out.format("%-20s %-15s %-15s %-15s %s\n", "Container Number", "Length", "Width", "Height", "Weight");
		 for(Container c2:container_list)
    	 {
			
			 result.add(c2.getContainerNumber());
    	 
    	 }
     for(Cargo c1:list)
     {
    	
    	 System.out.print(result.get(m)+"             ");
    	System.out.println(c1);
    	m++;
    	 
    }

	}

}
