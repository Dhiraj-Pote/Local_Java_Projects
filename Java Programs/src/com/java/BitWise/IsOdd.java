package com.java.BitWise;

public class IsOdd {
    public static void main(String[] args) {
        int n = 58;
        System.out.println(isodd(n));
    }
    private static boolean isodd(int n) {
        // if LSB == 1 -> n is odd.
        return (n & 1) == 1; // checks last digit whether 0 or 1;
    }
}