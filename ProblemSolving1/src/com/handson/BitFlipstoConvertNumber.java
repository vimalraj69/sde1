package com.handson;

import java.util.Scanner;

public class BitFlipstoConvertNumber {
    public static int minBitFlips(int start,int goal) {
        int res= start ^ goal;
        int Count= 0;
        while(res!= 0) {
            Count+= res&1;
            res>>= 1;
        }
        return Count;
    }

    public static void main(String[] args) {
    	Scanner sc= new Scanner (System.in);
    	System.out.print("Enter the start and goal :");
        int start = sc.nextInt();
        int goal = sc.nextInt();
        System.out.println(minBitFlips(start,goal)); 
    }
}

