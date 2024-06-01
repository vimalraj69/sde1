package com.handson;

import java.util.Scanner;

class NoMatchException extends Exception{
	NoMatchException(String s){
		super(s);
	}
}
public class citizenDetails {
	
	public void enterdetails() throws NoMatchException{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the name :");
		String name = sc.next();
		System.out.println("Enter the Aadhar Number :");
		int AadharNo = sc.nextInt();
		System.out.println("Enter the city :");
		String city = sc.next();
		System.out.println("Enter the State :");
		String state = sc.next();
		System.out.println("Enter the Country :");
		String country = sc.next();
		
		if(!country.equals("India")) {
			throw new NoMatchException("country name should be India");
		}
		sc.close();
	}
	
	public static void main (String args []) {
		citizenDetails c = new citizenDetails();
		try {
			c.enterdetails();
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}

}
