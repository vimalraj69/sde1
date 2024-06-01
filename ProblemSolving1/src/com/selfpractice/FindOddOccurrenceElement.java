package com.selfpractice;

import java.util.Scanner;

public class FindOddOccurrenceElement {
	static int oddOccur(int num[]) {
		for(int i =0;i< num.length; i++) {
			int count=1;
			if(num[i]!=0){
				for(int j=i+1;j<num.length; j++) {
					if(num[i]==num[j]) {
						count++;
						num[j]=0;
					}
				}
				if(count % 2==1) {
					return num[i];
				}
			}
			
		}
		return 0;
	}
	
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the size :");
		
		int n =sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the nums :");
		
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}

		System.out.print("odd occurence: "+oddOccur(arr));
		sc.close();
	}
}
