package com.handson;

import java.util.Stack;

public class RemoveMiddleElementRecursive {

    public static void removeMiddleElement(Stack<Integer> stack) {
        int n = stack.size();
        if (n == 0) return;
        removeMiddleHelper(stack, n, 0);
    }

    private static void removeMiddleHelper(Stack<Integer> stack, int n, int current) {
        // Base case: If we've reached the middle
        if (current == n / 2) {
            stack.pop();
            return;
        }
        
        // Pop the top element and recurse
        int top = stack.pop();
        removeMiddleHelper(stack, n, current + 1);
        
        // Push the top element back after the middle element is removed
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original Stack: " + stack);
        removeMiddleElement(stack);
        System.out.println("Stack after removing middle element: " + stack);
    }
}

