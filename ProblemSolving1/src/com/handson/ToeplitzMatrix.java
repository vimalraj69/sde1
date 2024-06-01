package com.handson;

import java.util.Scanner;

public class ToeplitzMatrix {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i=1;i<m;i++) {
            for (int j =1;j<n;j++) {
                if (matrix[i][j]!= matrix[i-1][j-1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the elements :");
        for (int i = 0; i<rows; i++) {
            for (int j = 0;j<cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean isToeplitz = isToeplitzMatrix(matrix);
        System.out.println("is the matrix Toeplitz " + isToeplitz);

        sc.close();
    }
}

