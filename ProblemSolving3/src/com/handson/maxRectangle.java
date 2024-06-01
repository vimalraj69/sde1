package com.handson;

import java.util.*;
public class maxRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[][] mat= new int[4][num];
		for(int i=0;i<4;i++) {
			for(int j=0;j<num;j++) {
				mat[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		int max=0;
		int row=0;
		int col=0;
		for(int i=0;i<num;i++) {
			for(int j=0;j<4;j++) {
				int sum=0;
				if(i<num-2 && j<4-2) {
					row=i+2+1;
					col=j+2+1;
					for(int k=i;k<row&&row<num;k++) {
						for(int m=j;m<col;m++) {
							sum=sum+mat[k][m];
						}
					}
					if(max<sum) {
						max=sum;
					}
				}
			}
		}
		System.out.print(max);
	}

}

