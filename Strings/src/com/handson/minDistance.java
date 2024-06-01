package com.handson;

import java.util.Scanner;

public class minDistance {
	static void minDistance(String []words , String str1 , String str2) {
		
		int min=Integer.MAX_VALUE;
		
		
		for(int i =0 ;i < words.length; i++) {
			
			if(str1.equals(words[i])) {
				int count=0;
				for(int j =i+1 ; j< words.length ; j++) {
					if(!str2.equals(words[j])) {
						count++;
					}else {
						count++;
						break;
					}
				}
				min=Math.min(min, count);
			}
			
		}
		System.out.print("Minimum distance between words :"+min);
		
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the  Sentence  :");
		
		String word[] =sc.nextLine().split(" ");
		
		System.out.print("enter the words :");
		
		String str1=sc.next();
		String str2=sc.next();

		minDistance(word , str1 , str2);
		sc.close();

	}
}
