package com.handson;

import java.util.*;

public class ValidSudoku {

	public static boolean verify(char arr[][]) {
		Set set = new HashSet();
	    for (int i=0; i<9; ++i) {
	        for (int j=0; j<9; ++j) {
	            char num = arr[i][j];
	            if (num != '.')
	                if (!set.add(num + " in row " + i) ||
	                    !set.add(num + " in column " + j) ||
	                    !set.add(num + " in block " + i/3 + "-" + j/3))
	                    return false;
	        }
	    }
	    return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the chars:");

		char arr[][] = new char[9][9];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = sc.next().charAt(0);
			}
		}
		System.out.print(verify(arr));
	}

}
