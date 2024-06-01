package com.selfpractice;

import java.util.Scanner;

public class queen {
    
    static int minMovesToCaptureQueen(int a,int b,int c,int d,int e,int f) {
        if (a == e || b == f 
        	||Math.abs(a -e)==Math.abs(b- f) 
        	||Math.abs(c -e)==Math.abs(d - f)){
            return 1;
        }
        return 2;
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the num :");
		
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int d =sc.nextInt();
		int e =sc.nextInt();
		int f =sc.nextInt();

        int minMoves = minMovesToCaptureQueen(a, b, c, d, e, f);
        System.out.println("to capture the queen: " + minMoves);
        sc.close();
    }
}

