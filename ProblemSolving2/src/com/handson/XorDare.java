package com.handson;

import java.util.Scanner;

public class XorDare {
    static int getMaxStrength(int[] arr,int k) {
        int maxStrength= k;
        for (int num :arr) {
            maxStrength = Math.max(maxStrength,num | k);
        }
        return maxStrength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.print("Enter the size of the array and K value: ");
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements of the array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int maxStrength = getMaxStrength(arr, k);
            System.out.println("Maximum possible strength: " + maxStrength);
        }
        sc.close();
    }
}

