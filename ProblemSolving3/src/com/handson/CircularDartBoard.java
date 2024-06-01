package com.handson;

import java.util.*;
public class CircularDartBoard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius:");
		int radius=sc.nextInt();
		System.out.print("Enter row:");
		int row=sc.nextInt();
		System.out.print("Enter col:");
		int col=sc.nextInt();
		int count=0;
		int[][] dart=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				dart[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
		  if(dart[i][0]>0 && dart[i][1]>0) {
			  if(dart[i][0]<=radius && dart[i][1]<=radius*2) {
				  count++;
			  }
		  }
		  else {
			  if(dart[i][0]>=(-radius) && dart[i][1]>=(-radius)) {
				  count++;
			  }
		  }
		}
		System.out.print(count);
	}

}

