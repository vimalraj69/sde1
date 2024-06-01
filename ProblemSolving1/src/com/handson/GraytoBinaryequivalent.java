package com.handson;

import java.util.Scanner;

public class GraytoBinaryequivalent {
    public static int grayToBinary(int n) {
        int binary = 0;
        while (n > 0) {
            binary ^= n;
            n >>= 1;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the num :");
        int n=sc.nextInt();
        
        System.out.println("Grey to binary :" +grayToBinary(n));
    }
}

