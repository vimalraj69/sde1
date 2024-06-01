package com.handson;

import java.util.Scanner;

public class BuildArrayfromPermutation {
    public static void changeElement(int arr []) {
    	
    	int ans [] =new int [arr.length];
    	
    	for(int i =0 ;i < arr.length; i++) {
    		ans[arr[i]]=arr[i];
    	}
        for(int i : ans) {
        	System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the size :");
        int n=sc.nextInt();
        System.out.print("Enter the nums :");
        int arr[]=new int[n];
        for(int i =0;i< n;i++) {
        	arr[i]=sc.nextInt();
        }
        
       changeElement(arr);
    }
}

