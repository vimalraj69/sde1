package com.handson;

import java.util.Scanner;

public class ConcatenationofArray {
    public static void addArray(int arr []) {
    	
    	int ans [] =new int [arr.length+arr.length];
    	int j=0;
    	for(int i =0 ;i < ans.length; i++) {
    		if(i< arr.length) {
    			ans[i]=arr[i];
    		}else {
    			ans[i]=arr[j++];
    		}
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
        
       addArray(arr);
    }
}

