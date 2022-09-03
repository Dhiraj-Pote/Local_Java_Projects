package com.java.Recursion;

public class OnetoN {
    public static void main(String[] args) {
        revPrint(5);
    }

    static void revPrint(int n) {

        if(n==0) return;
        revPrint(n-1);
        System.out.println(n);
    }
}
