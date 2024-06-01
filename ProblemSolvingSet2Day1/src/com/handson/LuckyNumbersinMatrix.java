
package com.handson;

import java.util.*;

public class LuckyNumbersinMatrix {

	public static void luckyNum(int arr[][]) {
		try {
			List<Integer> minList = new ArrayList<>();
			List<Integer> maxList = new ArrayList<>();
			
			
			for(int i =0 ;i< arr.length ; i++) {
				int min =Integer.MAX_VALUE;
				int max =Integer.MIN_VALUE;
				for(int j =0;j< arr.length; j++) {
					min = Math.min(min, arr[i][j]);
					max = Math.max(max, arr[j][i]);
				}
				minList.add(min);
				maxList.add(max);
			}
			
			for(int i : minList) {
				if(maxList.contains(i)) {
					System.out.print(i); break;
				}
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size and  Arrays  :");

		int size1 = sc.nextInt();
		int arr[][]= new int [size1][size1];

		for (int i = 0; i < size1; i++) {
			for(int  j =0; j< size1; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		

		luckyNum(arr);

	}

}
