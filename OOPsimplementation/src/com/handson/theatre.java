package com.handson;

import java.util.Scanner;

public class theatre  {
	
	int theatreId;
	String theatreName;
	int totalTheatreScreens ;
	String theatreLocation;
	
	public theatre(int id , String name , int total, String location) {
		theatreId=id;
		theatreName=name;
		totalTheatreScreens=total;
		theatreLocation=location;
	}
	
	public void display () {
		System.out.println("theatreId :"+theatreId);
		System.out.println("theatreName :"+theatreName);
		System.out.println("totalTheatreScreens :"+totalTheatreScreens);
		System.out.println("theatreLocation :"+theatreLocation);
		System.out.println("\n");



	}
	
	
	
	
	public static void main (String args[]) {
		theatre t1= new theatre(1,"INOX",2,"Salem");
		theatre t2= new theatre(2,"Arrs",5,"Salem");
		t1.display();
		t2.display();


	}

}
