package com.handson;

import java.util.Scanner;

public class WaterBottle2 {
 static int waterBottles(int bottles, int exchange) {
	        int total= bottles;
	        int empty= bottles;
	        
	        while(empty >= exchange){
	            int exchangedBottles = empty/exchange;
	            total+=exchangedBottles;
	            empty= exchangedBottles +empty%exchange;
	        }
	        
	        return total;
	    }
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Bottle and exchange:");
		
		int bottle =sc.nextInt();
		int exchange =sc.nextInt();
		
		System.out.print( waterBottles(bottle,exchange));
		
		
		sc.close();

	}
}
