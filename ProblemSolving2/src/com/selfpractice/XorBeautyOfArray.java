package com.selfpractice;

import java.util.Scanner;

public class XorBeautyOfArray {
    
	public static int xorBeauty(int[] nums) {
        int xor = -1;
        if (nums.length == 1) return nums[0];
        for (int i = 1; i < nums.length; i+=2) {
            int a = nums[i - 1], b = nums[i];
            if (xor == -1) xor = a ^ 0 ^ a ^ b ^ a ^ b ^ 0 ^ b;
            else xor ^= a ^ 0 ^ a  ^ a ^ b ^ 0 ^ b;
        }
        return nums.length % 2 == 1 ? xor - nums[nums.length - 1] : xor;
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the size and element:");
		
		int  n =sc.nextInt();
		
		int arr[]= new int[n];
		
		for(int i =0;i< n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print( xorBeauty(arr));
    }
}

