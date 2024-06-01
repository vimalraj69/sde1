package com.handson;

import java.util.*;

public class SingleDenominationCombination {
	 public static int multiples(int[] arr, int k, int num) {
	        Arrays.sort(arr);
	        int nums = k * num;
	        int[] total = new int[nums];
	        int index = 0;

	        for (int i = 0; i < num; i++) {
	            for (int j = 1; j <= k; j++) {
	                total[index] = arr[i] * j;
	                index++;
	            }
	        }

	        Arrays.sort(total);
	        int ans = total[k];
	        return ans;
	    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = sc.nextInt();

        System.out.print("Enter array elements: ");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = multiples(arr, k, num);
        System.out.print(result);
    }

   
}

