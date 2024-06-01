package com.handson;

import java.util.*;
import java.util.Scanner;

 class WordPatternThree {
	
	public static boolean verify (String s , String arr[]){
		Map <Character , String> map =new HashMap<>();
		
		for (int i =0; i<s.length(); i++ ) {
			char c = s.charAt(i);
			
			if( !map.containsKey(c) ) {
				map.put(c, arr[i]);
			}else {
				String val = map.get(c);
				
				if( !val.equals(arr[i])) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public  static void  main ( String args[] ) {
		Scanner sc = new Scanner ( System.in );
		System.out.print("enter the pattern :");
		
		String pattern =sc.nextLine();
		System.out.print("enter the  s :");
		
		 String arr []=sc.nextLine().split(" ");
		 
		 System.out.print(verify(pattern, arr));
		 
		 
		 
	}

}
