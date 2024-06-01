package com.selfpractice;

import java.util.Scanner;

class WaterBottles {
 static int bottles(int bottle, int exchange) {
        int Drunk = bottle; 
        int empty = bottle; 
        
        while (empty >= exchange) {
            int fullBottles = empty / exchange;
           Drunk += fullBottles;
            empty = fullBottles + (empty % exchange);
        }
        
        return Drunk;
    }

 	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the bottle and exchange:");
		int n=sc.nextInt();
		int m=sc.nextInt();
	
		System.out.print("reversed: "+bottles(n,m));
		sc.close();
	}

}

