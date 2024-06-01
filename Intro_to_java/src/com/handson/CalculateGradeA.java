package com.handson;
/*The total number of students in a class are 90 out of which 45 are 
boys. If 50% of the total students secured grade 'A' out of which 
20 are boys, then write a program to calculate the total number 
of girls getting grade 'A'.

 */
public class CalculateGradeA {
	public static void main (String args[]) {
		int Total=90;
		int boys=45;
		int A_boys=20;
		int girls=Total-boys;
		int A_grade=(int)(0.5*Total);
		int A_girls=A_grade-A_boys;
		System.out.println("A grade girls are "+A_girls);
		
		
	}

}
