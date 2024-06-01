package com.handson;

import java.util.Scanner;

public class EggDropWith2EggsandNFloors {
	
	static int drop (int n) {
		int x =(int)Math.sqrt( n* 2);
		
		while(x *(x+1) /2 < n) {
			
			x++;
		}
		return x;
	}
	
	public static void main (String args []) {
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter the no of Floor :");
		int floor = sc.nextInt();
		
		System.out.print("Minimum no of moves :"+drop(floor));
		
		
	}

}
