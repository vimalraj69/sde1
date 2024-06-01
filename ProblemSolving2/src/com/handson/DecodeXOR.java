package com.handson;

import java.util.Arrays;
import java.util.Scanner;

public class DecodeXOR {
	static int[] decode(int[] encoded) {
        int first = 0;
        int n = encoded.length+1;
        for(int i=1;i<=n;i++){
            first ^= i; 
        }
        for(int i=1;i<n-1;i+=2) {
        	first ^= encoded[i];
        }
        
        int[] ans = new int[n];
        ans[0] = first;
        for(int i=0;i<n-1;i++){
            ans[i+1] = ans[i] ^ encoded[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size:");
		
		int size =sc.nextInt();
		
		int arr[]=new int [size];
		System.out.print("enter the Elements :");
		for(int i=0;i< size;i++ ) {
			arr[i]=sc.nextInt();
		}
		
		int ans[]=decode(arr);
		
		for(int i : ans) {
			System.out.print(i+" ");
		}

    }
}

