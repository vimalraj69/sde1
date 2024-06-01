package com.handson;

import java.util.Scanner;

public class minutes {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the durations : ");
        long min = read.nextLong();
        long min_inYear = 365*24*60; 
        long years = min/ min_inYear; 
        long remaining_minutes = min % min_inYear;
        long minutesInDay = 24*60;
        long days = remaining_minutes / minutesInDay; 
        
        System.out.println("Years= " + years);
        System.out.println("Days= " + days);
    }
}

