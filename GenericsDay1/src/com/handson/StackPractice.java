package com.handson;

import java.util.Iterator;
import java.util.Stack;

public class StackPractice {
	public static void main(String args []) {
		Stack<Integer> integerStack = new Stack<>();
		integerStack.add(10);
		integerStack.add(20);
		integerStack.add(30);
		integerStack.add(40);
		
		integerStack.pop();
		
		System.out.println("Top of the stack :"+ integerStack.peek());
		
		System.out.println("position of 30 :"+ integerStack.lastIndexOf(30));
		System.out.println("Empty or Not :"+ integerStack.isEmpty());
		System.out.println("Size :"+ integerStack.size());
		System.out.println("Capacity :"+ integerStack.capacity());
		
		Object arr [] = integerStack.toArray();
		for(int i : integerStack) {
			System.out.println(i);
		}
		integerStack.clear();
		System.out.println("Empty or Not :"+ integerStack.isEmpty());






	}

}
