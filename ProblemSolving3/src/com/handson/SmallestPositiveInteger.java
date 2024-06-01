package com.handson;

import java.util.*;
public class SmallestPositiveInteger  {
	
	public static void SmallInt(int arr[]) {
		Arrays.sort(arr);
		int smallest=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=smallest) {
				smallest=smallest+arr[i];
			}
			else {
				break;
			}
		}
		System.out.print(smallest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the num:");
		int num=sc.nextInt();
		System.out.print("Enter arry elements: ");
		int[] arr=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		SmallInt(arr);

	}

}

