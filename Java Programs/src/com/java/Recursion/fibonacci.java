package com.java.Recursion;

public class fibonacci {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(fibo(n));  // num:  0 1 1 2 3 5  8  13  21 34 55 89
                                      // ind:  0 1 2 3 4 5  6  7   8  9  10 11
    }

    static int fibo(int n) {
        if(n<2) return n;

        return fibo(n-1) + fibo(n-2);
    }
}