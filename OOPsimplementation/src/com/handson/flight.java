package com.handson;

import java.util.Scanner;

public class flight  {
	private int flightNo;
	private String destination;
	private float distance;
	private float fuel;
	public void FEEDINFO (int no , String d, float dis, float fu) {
		flightNo=no;
		destination=d;
		distance=dis;
		fuel=fu;
	}
	public int  CALFUEL () {
		if(fuel<=1000) {
			return 500;
		}else if(fuel> 1000 && fuel<=2000) {
			return 1100;
		}else {
			return 2200;
		}
		
		
	}
	
	public void SHOWINFO () {
		System.out.println("flightNo :"+flightNo);
		System.out.println("destination :"+destination);
		System.out.println("distance :"+distance);
		System.out.println("fuel :"+fuel);
		System.out.println("\n");



	}
	
	
	
	
	public static void main (String args[]) {
		flight f1= new flight();
		f1.FEEDINFO(110,"delhi",2000,1500);
		f1.SHOWINFO();
		System.out.print(f1.CALFUEL());


	}

}
