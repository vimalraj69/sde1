package com.handson;

public class ArrayOverLoading {
	
	public void processArray(int arr[], int sum){
		for(int i : arr) {
			sum+=i;
		}
		System.out.println("Sum :"+sum);
		
	}
	public void processArray(double arr[], double avg){
		for(double i : arr) {
			avg+=i;
		}
		System.out.println("Avaerage :"+avg/arr.length);
	}
	
	public void processArray(int arr[]){
		int max=Integer.MIN_VALUE;
		for(int i : arr) {
			max= Math.max(max, i);
		}
		System.out.println("maximun val :"+max);
		
	}
	
	public static void main(String args []) {
		ArrayOverLoading ov=new ArrayOverLoading();
		int arr[]= {1,4,5,6,4,8};
		double arr1 []= {1.0,2.5,3.5};
		ov.processArray(arr);
		ov.processArray(arr,0);
		ov.processArray(arr1,0);
		
		System.out.print(ov);
		
	}

}
