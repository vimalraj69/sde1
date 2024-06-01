package com.selfpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class student{
	String name; int age; String grade;
	
	student(String name, int age, String grade){
		this.name = name;
		this.age= age;
		this.grade = grade;
	}
	
}

public class linkedListPractice {
	static LinkedList<student> li = new LinkedList<>();
	
	public void add(student s) {
		li.add(s);
	}
	
	public void removeByName(String  s) {
		for(student st : li) {
			if(st.name.equals(s)) {
				li.remove(st);
			}
		}
	}
	
	public void removeByAge(int n) {
		for(student st : li) {
			if(st.age == n) {
				li.remove(st);
			}
		}
	}
	
	public boolean check(String s) {
		for(student st : li) {
			if(st.name.equals(s)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(li.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public void display () {
		for(student st : li) {
			System.out.println("Name : "+st.name+" age :"+st.age+" grade :"+st.grade);
		}
	}
	
	public int total() {
		return li.size();
	}
	
	public Object[] toArray() {
		 return li.toArray();
	}
	
	public void reverseDisplay() {
		for(int i =li.size(); i>=0 ; i--) {
			System.out.println("name :"+li.get(i).name+" age "+li.get(i).age);
		}
		
	}
	
	public List<String> sortNames () {
		List <String > names = new ArrayList<>();
		
		for(student st : li) {
			names.add(st.name);
		}
		Collections.sort(names);
		
		return names;
		}
	
	public List<Integer> sortAge () {
		List <Integer > age = new ArrayList<>();
		
		for(student st : li) {
			age.add(st.age);
		}
		Collections.sort(age);
		
		return age;
		}
	
	public void clear() {
		li.clear();
	}
	
	public <T> void print( List<T > l) {
		for(int i =0 ; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		
	}
	
	public static void main(String args []) {
		student s1 = new student("vimal",21,"O");
		student s2 = new student("giri",20,"F");
		student s3 = new student("jaswin",19,"E");
		
		li.add(s1);
		li.add(s2);
		li.add(s3);
		
		linkedListPractice ll = new linkedListPractice();
		ll.display();
		System.out.println("Student Vimal is present in the list ? :"+ ll.check("vimal"));
		
		List <String>name = ll.sortNames();
		List <Integer>age = ll.sortAge();
		
		System.out.println("Sort by name");
		ll.print(name);
		System.out.println("Sort by Age");
		ll.print(age);

		
		
		
		
		
		

		

	}
}
