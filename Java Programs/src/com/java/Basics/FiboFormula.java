package com.java.Basics;

// 1/sqrt(5){ ((1 + sqrt(5))/2)^n + ((1 - sqrt(5))/2)^n } -> n th fibo num.

public class FiboFormula {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
        System.out.println(fibo(i));
    }
    }

    static int fibo(int n) {
        double sqrt = Math.sqrt(5);
        if(n<2) return n;
        if(n == 2) return 1;
        if(n == 3) return 2;

        return (int) ((( Math.pow(((1 + sqrt)/2), n) ) - ( Math.pow(((1 - sqrt)/2), n) ) )/sqrt);
    }

}