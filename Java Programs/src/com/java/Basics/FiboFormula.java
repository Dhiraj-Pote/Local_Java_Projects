package com.java.Basics;

// 1/sqrt(5){ ((1 + sqrt(5))/2)^n - ((1 - sqrt(5))/2)^n } -> n th fibo num.

public class FiboFormula {
    public static void main(String[] args){
        System.out.println(fibo(12));
    }

    static int fibo(int n) {
        if (n < 2) return n;
        if (n == 2) return 1;
        if (n == 3) return 2;

        double sqrt = Math.sqrt(5);

        return (int) (((Math.pow(((1 + sqrt) / 2), n)) - (Math.pow(((1 - sqrt) / 2), n))) / sqrt);
    }
}