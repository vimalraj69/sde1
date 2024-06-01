package com.selfpractice;

import java.util.ArrayList;
import java.util.List;

class library {
	static List<String > books = new ArrayList<>();
	static List<String > Auther = new ArrayList<>();
	static List<Integer > ISBN = new ArrayList<>();



	library() {
		books.add("java");
		books.add("Dsa");
		books.add("dsi");
		Auther.add("vimal");
		Auther.add("raj");
		ISBN.add(101);
		ISBN.add(102);
		ISBN.add(103);
		
	}
	
	
	public String searchBook (String book) {
		if(book.contains(book)) {
			return "Book avilable";
		}
		return "Not found";
	}
	public String searchBook (String book, String auther) {
		if(book.contains(book) && Auther.contains(auther)) {
			return "Book avilable";
		}
		return "Not found";
	}
	public String searchBook (String book, String auther, int isbn) {
		if(book.contains(book) && Auther.contains(auther) 
				&& ISBN.contains(isbn)) {
			return "Book avilable";
		}
		return "Not found";
	}
}
public class libraryManagementSystem {
	public static void main(String args[]) {
		library l = new library();
		System.out.println(l.searchBook("java"));
		System.out.println(l.searchBook("java", "vimal"));
		System.out.println(l.searchBook("java", "vimal",101));

	}
	
	

}
