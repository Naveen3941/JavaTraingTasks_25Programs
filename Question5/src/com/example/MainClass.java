package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws IOException {
	   
	    Role r1=new Role();
	    RoleBO r2=new RoleBO();
	    List<String> l1=new ArrayList<>();
	    List<Role> l2=new ArrayList<>();
	    InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader sc=new BufferedReader(r);
	    Scanner sc1=new Scanner(System.in);
       System.out.println("Enter number of role :");
       int n=sc1.nextInt();
       Privilege p1[]=new Privilege[n];
       for(int i=1;i<=n;i++)
       {
    	   System.out.println("Enter the role "+i+" details :");
    	   System.out.println("Enter role name :");
    	   String a=sc.readLine();
    	   System.out.println("Enter Description :");
    	   String b=sc.readLine();
    	   System.out.println("Enter the privileges :");
    	   String c=sc.readLine();
    	   Privilege p2=new Privilege(c);
    	    p1[i-1]=p2;
    	  
    	   l2.add(new Role(a,b,p1));
       }
       
       Role role[]=l2.toArray(new Role[l2.size()]);
       r2.display(role);

	}

}
