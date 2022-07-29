package com.java.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParenthesis {
    public static void main(String[] args) {
        String x = "(){()[]}";
        System.out.println(isValid(x));
    }

    static boolean isValid(String x) {
        // if len of string is odd
        if (x.length() % 2 != 0) return false;

        Deque<Character> stack = new ArrayDeque<>();   // Deque is faster than Stack

        for (char c : x.toCharArray()) { // iterate through each bracket

            if (c == '(' || c == '[' || c == '{') { // if opening bracket then add to stack
                stack.push(c);
                continue;
            }
            if (stack.isEmpty()) return false; // if starting bracket is closed one

            // checking if next bracket does not matches with previous one, return false
            // else it matches and remove the previous element
            // Do this for entire loop
            switch (c) {
                case ')' -> {
                    if (stack.peek() == '[' || stack.peek() == '{') return false;
                    else stack.pop();
                }
                case ']' -> {
                    if (stack.peek() == '(' || stack.peek() == '{') return false;
                    else stack.pop();
                }
                case '}' -> {
                    if (stack.peek() == '[' || stack.peek() == '(') return false;
                    else stack.pop();
                }
            }
        }
        return (stack.isEmpty()); // If Stack is empty return true else it returns false
    }
}