package com.selfpractice;


class Person6 {
	String name;
	String type;
	Person6(String name, String type){
		this.name = name;
		this.type =type;
	}
	void displayinfo() {
		System.out.println("Name :"+name);
		System.out.println("Type :"+type);
	}
}
class UndergraduateStudent extends Person6{
	int currentyear;
	UndergraduateStudent(String name , String type,int currentyear){
		super(name , type);
		this.currentyear=currentyear;
		
	}	
	void displayinfo() {
		super.displayinfo();
		System.out.println("Current Year :"+currentyear);
	}
	
}
class graduateStudent extends Person6{
	int passedyear;
	graduateStudent(String name , String type, int passedyear){
		super(name , type);
		this.passedyear = passedyear;
	}
	void displayinfo() {
		super.displayinfo();
		System.out.println("Passed Year :"+passedyear);
	}
	
}
public class university {
	public static void main (String args []) {
		Person6 p;
		
		p= new UndergraduateStudent("Vimal","underGraduate",2024);
		p.displayinfo();
		
		p= new graduateStudent("raj","Passed Out",2025);
		
		p.displayinfo();
	}
	

}
