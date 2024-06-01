package com.handson;

import java.util.Scanner;

public class school {
	
	static int totalStudents=0;
	final static int MAX_CAPACITY=500;
	
	public void enrollStudent() {
		if(totalStudents<=MAX_CAPACITY) {
			totalStudents++;

		}else {
			System.out.print("Enrollment Finished");
		}
	}

	public int getTotalStudents() {
		return totalStudents;
	}
	
	
	
	
	public static void main (String args[]) {
		school s1 = new school();
		s1.enrollStudent();
		school s2 = new school();
		s2.enrollStudent();
		
		
		
		System.out.println("Total Student Enrolled:"+totalStudents);
		System.out.println("Maxmimum Capacity :"+MAX_CAPACITY);

	}

}
