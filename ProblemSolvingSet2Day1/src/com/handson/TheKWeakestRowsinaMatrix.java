package com.handson;




import java.util.*;

public class TheKWeakestRowsinaMatrix {

	public static void weakrow( int arr[][],  int k) {
		try {
			List<Integer> list = new ArrayList<>();
			TreeMap <Integer,Integer> map = new TreeMap<>();
			
			for(int i =0;i< arr.length;i++) {
				int sum=0;
				for(int j =0;j<arr.length; j++) {
					sum+=arr[i][j];
				}
				list.add(sum);
			}
			
			int i =0;
			int count =0;
			while(count < k) {
				for(int j =0; j< list.size(); j++) {
					if(list.get(j) != -1) {
						if( i== list.get(j)) {
							System.out.print(j+" ");
							list.set(j, -1);
							count++;
						}
					}	
				}
				i++;
			}
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size and  Arrays  :");

		int size1 = sc.nextInt();
		int arr [] []=new int[size1][size1];

		for (int i = 0; i < size1; i++) {
			for(int j =0; j< size1;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter k :");
		int k =sc.nextInt();
		
		

		weakrow(arr,k);

	}

}
 


