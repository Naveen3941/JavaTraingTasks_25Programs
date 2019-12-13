package example;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Enter the cargo details:");
		System.out.println("Enter the name");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		System.out.println("Enter the description");
		String b=sc.nextLine();
		System.out.println("Enter the length");
		double c=sc.nextDouble();
		System.out.println("Enter the width");
		
		double d=sc.nextDouble();
		System.out.println("The cargo details are:");
		Cargo c1=new Cargo();
		c1.setName(a);
		c1.setDescription(b);
		c1.setLength(c);
        c1.setWidth(d);
        c1.displayCargoDetails();
	}

}
