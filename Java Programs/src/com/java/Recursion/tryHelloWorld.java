package com.java.Recursion;

public class tryHelloWorld {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n) {
        System.out.println("krsna");
        if(n == 5) return;
        print(n+1);
    }
}