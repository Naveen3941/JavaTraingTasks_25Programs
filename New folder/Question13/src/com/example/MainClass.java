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
		Scanner scanner=new Scanner(System.in);
		List<Cargo> list=new ArrayList<Cargo>();
		List<Container> container_list=new ArrayList<Container>();
		System.out.println("Enter the number of containers :");
		int numberofContainer=scanner.nextInt();
		for(int i=1;i<=numberofContainer;i++)
		{
			System.out.println("Enter the container "+i+" details");
			String res[]=sc.readLine().split(",");
			String containerNumber=res[0];
			float length=Float.parseFloat(res[1]);
			float width=Float.parseFloat(res[2]);
			float height=Float.parseFloat(res[3]);
			double weight=Double.parseDouble(res[4]);
			list.add(new Cargo(length,width,height,weight));
			container_list.add(new Container(containerNumber));
			
		}
		 Container container=new Container();
		 container.displayContainerDetails(list,container_list);

	}

}
