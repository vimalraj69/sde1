package com.selfpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LibraryInventory {
	
	public static void  booklending (String s, List<String> li) {
		if(li.contains(s)) {
			li.remove(s);
		}
		System.out.println("Book is lended");
	}
	public static void  bookreturn(String s, List<String> li) {
		
			li.add(s);
		
		System.out.println("Book is retured");
	}
	public static void main(String args []) {
		ArrayList<String> li = new ArrayList<>();
		ArrayList<String> auther = new ArrayList<>();

		li.add("java");auther.add("vimal");
		li.add("python");auther.add("raj");
		li.add("goLang");auther.add("luffy");
		li.add("php");auther.add("zoro");
		
		li.remove("goLang");
		System.out.println("is Removed go lang :"+li.contains("goLang"));
		
		if(li.contains("python")) {
			li.remove("python");
			System.out.println("python is removed form library ");
			
		}
		
		System.out.println("is library contains java book :"+li.contains("java"));
		System.out.println("is library empty :"+li.isEmpty());
		
		Collections.sort(li);
		
		for(String s : li) {
			System.out.println(s);
		}

		Collections.sort(auther);
		
		System.out.println("is library size:"+li.size());
		
		li.add("sql");auther.add("oracle");
		
		for(int i =0; i<li.size(); i++) {
			System.out.println("book :"+li.get(i)+" Auther "+auther.get(i));
		}
		
		Object arr [] = li.toArray();
		System.out.println("java book for lending :"); booklending("java",li);
		System.out.println("java book for returing :"); bookreturn("java",li);

		Iterator i = li.iterator();
				
				while(i.hasNext()) {
					if(i.equals("sql")) {
						i.remove();
					}
				}
				
		

		}
}
