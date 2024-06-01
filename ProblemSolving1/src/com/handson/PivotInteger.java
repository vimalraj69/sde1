package com.handson;

import java.util.*;
import java.util.Scanner;

public class PivotInteger {
	static int pivot (int num) {
		
		List<Integer> back =new ArrayList<>();
		int i=num;
		int val=0;
		while ((num/2)< i) {
		    val += i;
			i--;
			back.add(val);
		}
		
		i=1;
		val=0;
		
		int ans=0;
		while (i <= num) {
		  val +=i;
		  if(back.contains(val)) {
			  ans= i;
		  }
		  i++;
		  
		}
		
		if(ans>0) return ans;
		return -1;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter num:");
		
		int num =sc.nextInt();
		
		System.out.print("is pivot Number :"+ pivot(num));
		
		
		sc.close();

	}
}
