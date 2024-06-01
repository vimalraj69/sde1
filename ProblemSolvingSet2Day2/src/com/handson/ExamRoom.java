package com.handson;

import java.util.*;

public class ExamRoom {

	int arr[];
	static int count = 1;

	public ExamRoom(int size) {
		arr = new int[size];
	}

	public int seat() {
		if (count == 1) {
			arr[0] = count;
			count++;
			return 0;
		}
		if (count == 2) {
			arr[arr.length - 1] = count;
			count++;
			return arr.length - 1;
		}

		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1 && arr[i + 1] == 0) {
				int j = i+1;
				
				int gap = 0;
				while (j < arr.length) {
					if (arr[j] > 0 ) {
						
						break;
					}
					gap++;
					j++;
				}
				
				if (gap >2 && gap % 2 == 0) {
					arr[i+(gap / 2)] = count;
					count++;
					return ((gap / 2))+i;
				} else if (gap>2 && gap % 2!=0 ){
					arr[(gap / 2) + 1] = count;
					count++;
					return (gap / 2) + 1;

				}
			}
		}

		return 0;

	}

	public void leave(int i) {
		arr[i] = 0;
		count--;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size :");
		int size = sc.nextInt();

		ExamRoom r = new ExamRoom(size);

		System.out.print(r.seat() + " ");
		System.out.print(r.seat() + " ");
		System.out.print(r.seat() + " ");
		System.out.print(r.seat() + " ");
		r.leave(4);
		System.out.print(r.seat() + " ");
	}

}
