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
		boolean flag=false;
		List<User> list=new ArrayList<User>();
		System.out.println("Enter the total number of users");
		int numberofUsers=scanner.nextInt();
		System.out.println("Enter user details");
		for(int i=0;i<numberofUsers;i++)
		{
			String store=sc.readLine();
			String res[]=store.split(",");
			String username=res[0];
			String firstname=res[1];
			String lastname=res[2];
			String contact=res[3];
			list.add(new User(username,firstname,lastname,contact));
		}
		System.out.println("1) Search user by user name");
		System.out.println("2) Search user by first name and last name");
		System.out.println("Enter your option");
		int option=scanner.nextInt();
		if(option==1)
		{
			System.out.println("Enter the user name to search");
			String name_search=sc.readLine();
			for(User u:list)
			{
				
				if(u.getUsername().equals(name_search))
				{
					System.out.println("User details :");
					System.out.println("Username :"+u.getUsername());
					System.out.println("Firstname :"+u.getFirstname());
					System.out.println("Lastname :"+u.getLastname());
					System.out.println("Contact :"+u.getContact());
					flag=true;
				}
			}
		}
		if(option==2)
		{
			System.out.println("Enter the first name and last name  to search");
			String firstname_search=sc.readLine();
			String lastname_search=sc.readLine();
			for(User u:list)
			{
			if(u.getFirstname().equals(firstname_search) && u.getLastname().equals(lastname_search))
				{
					System.out.println("User details :");
					System.out.println("Username :"+u.getUsername());
					System.out.println("Firstname :"+u.getFirstname());
					System.out.println("Lastname :"+u.getLastname());
					System.out.println("Contact :"+u.getContact());
					flag=true;
				}
			}
		}
		
		if(flag==false)
		{
			System.out.println("User not found");
		}

	}

}
