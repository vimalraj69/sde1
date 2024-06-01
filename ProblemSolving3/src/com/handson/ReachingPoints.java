package com.handson;

import java.util.Scanner;
import java.util.*;
public class ReachingPoints {
	
	static boolean recur (int a , int b, int tx, int ty  ) {
		if( a>tx || b>ty ) {
			return false;
		}else if (a==tx && b==ty) {
			return true;
		}
		
			
	  return recur(a, (a+b) ,tx, ty) || recur((a+b), b ,tx, ty);
      
			
			
		
	}
	
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter nums:");
		
		int sx =sc.nextInt();
		int sy =sc.nextInt();
		int tx =sc.nextInt();
		int ty =sc.nextInt();
		 System.out.println("is Posible :"+recur(sx,sy,tx,ty));
		
		
		sc.close();

	}
}
