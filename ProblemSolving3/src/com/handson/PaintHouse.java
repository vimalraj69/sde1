package com.handson;

import java.util.*;
public class PaintHouse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter House Count: ");
		int n=s.nextInt();
		System.out.print("Enter colour: ");
		int col=s.nextInt();
		System.out.print("Enter array elements: ");
		int mat[][]=new int[n][col];
		for(int i=0;i<n;i++){
			for(int j=0;j<col;j++){
				mat[i][j]=s.nextInt();
			}
		}
		int min=0,a=-1,sum=0,b=0;
		for(int i=0;i<n;i++){
			min=100;
			for(int j=0;j<col;j++){
				if(a!=j){
					if(i==0 && j==0){
						min= mat[i][j];
						a=i;
					}
					else if(mat[i][j]<min){
						min=mat[i][j];

						a=i;

					}
				}
			}
			sum+=min;
		}
		System.out.print(sum);
	}

}
