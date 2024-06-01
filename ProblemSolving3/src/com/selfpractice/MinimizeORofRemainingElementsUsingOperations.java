package com.selfpractice;

import java.util.*;

public class MinimizeORofRemainingElementsUsingOperations {
	 public static int minOrAfterOperations(int[] nums, int k) {
	        int pre = 0;
	        int start = 0;
	        for (int i = 30; i >= 0; --i) {
	            start |= (1 << i);
	            int cur = start;
	            int mergeCnt = 0;
	            for (int num : nums) {
	                cur &= num;
	                if ((cur | pre) != pre) {
	                    ++mergeCnt;
	                } else {
	                    cur = start;
	                }
	            }
	            if (mergeCnt > k) {
	                pre |= (1 << i);
	            }
	        }
	        return pre;
	    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.print(minOrAfterOperations(arr, k));
        
        sc.close();
    }
}
