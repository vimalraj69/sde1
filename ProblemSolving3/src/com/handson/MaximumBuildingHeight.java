package com.handson;

import java.util.*;
public class MaximumBuildingHeight {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter restriction: ");
		int num2=s.nextInt();
		int arr[][]=new int[num2][num2];
		for(int i=0;i<num2;i++){
			for(int j=0;j<num2;j++){
				arr[i][j]=s.nextInt();
			}
		}
		System.out.print("Enter n: ");
		int num=s.nextInt();
		int arr2[]=new int[num];
		int k=1,c=0;
		for(int i=0;i<num;i++){
			arr2[i]=k++;
		}
		for(int j=0;j<num;j++) {
			if(j==0){
				arr2[j]=0;
			}
			else{
				c=0;
		for(int i=0;i<num2;i++){
		    if(arr2[j]==arr[i][0]){
				arr2[j]=arr[i][1];
				c++;
			}
		}
		if(c==0){
			arr2[j]=arr2[j-1]+1;
		}
			}
		}
		int max=0;
		for(int i=0;i<num;i++){
			if(arr2[i]>max){
				max=arr2[i];
			}
		}
		System.out.print(max);
	}
}

