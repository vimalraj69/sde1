package com.handson;

import java.util.Scanner;

public class PoorPigs {
	static void pigcheck(int buckt,int minDie,int minTest) {
		int result=0;
		if(minTest==minDie) {
			System.out.print("2");
		}
		else {
			int ans=minTest/minDie;
			 result=buckt/ans;
			 System.out.print(result);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Buckets: ");
		int buckt=sc.nextInt();
		System.out.print("Enter minutesToDie : ");
		int minDie=sc.nextInt();
		System.out.print("Enter minutesToTest : ");
		int minTest=sc.nextInt();
		pigcheck(buckt,minDie,minTest);

	}
	
	


}
