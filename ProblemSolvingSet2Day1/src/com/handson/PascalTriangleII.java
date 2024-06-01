package com.handson;

import java.util.*;
public class PascalTriangleII {
	public static void pascal2(int n) {
		
		int arr[][] = new int [n+1][n+1];
		List<Integer> l = new ArrayList<>();
		arr[0][0]=1;
		
		for(int i =1; i<=n; i++) {
			for(int j =0; j<= n; j++) {
				if((j ==0) || i==j) {
					arr[i][j]=1;
				}else {
					arr[i][j]=arr[i-1][j-1]+ arr[i-1][j];
				}
			}
		}
		
		for(int i =0;i<arr[3].length;i++) {
			System.out.print(arr[3][i]);
			l.add(arr[3][i]);
		}
		
		
	}
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number :");
		pascal2(3);
	}
// cv= cv* (rowindex-i+1)/i;
//row.set(1,row.get(j)+row.get(j-1))
}
