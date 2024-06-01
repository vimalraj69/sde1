package com.handson;

import java.util.*;

import java.util.*;
public class Shortestcommonsubsequence {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Strings:");
		String str=sc.nextLine();
		String str2=sc.nextLine();
		char arr[]=str.toCharArray();
		char arr2[]=str2.toCharArray();
		String str4="";
		int c=0,k=0,b=0;
		
		if(str.equals(str2)){
		System.out.print(str);
		}else{

			if(arr.length<arr2.length){
				for(int i=0;i<arr.length;i++)
				{
					k=i;
					for(int j=0;j<arr2.length;j++){
						if(arr[k]==arr2[j]&&k<arr.length){
							k++;
							c++;
						}
					}
					if(k==0){
						b=i;
					}
				}
		}
		System.out.print(arr2[b]);
		System.out.print(str);
		}
	}

}

