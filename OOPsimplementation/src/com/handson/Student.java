package com.handson;

import java.util.Scanner;

public class Student  {
	
	String studentName;
	int id;
	int age;
	String garde;
	public Student () {
		this.id=0;
		studentName="Unknown";
		this.age=0;
		garde="Unknown";
		
		
	}
	public Student (int id , String name, int age, String grade) {
		this.id=id;
		studentName=name;
		this.age=age;
		this.garde=grade;
		
		
	}
	
	public void display () {
		System.out.println("studentName :"+studentName);
		System.out.println("id :"+id);
		System.out.println("age :"+age);
		System.out.println("garde :"+garde);
		System.out.println("\n");



	}
	
	
	
	
	public static void main (String args[]) {
		Student s1= new Student();
		Student s2= new Student(2,"Vimal",22,"O");
		s1.display();
		s2.display();


	}

}
