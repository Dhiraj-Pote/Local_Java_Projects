package com.java.Basics;

public class isPrime {
    public static void main(String[] args) {
        int n = 40;
        Boolean isPrime = true;

        if (n == 1) {
            System.out.println(isPrime);
        } else {
            for (int i = 2; i * i <= n; i++) {  // checking numbers until sqrt(n)
                if (n % i == 0) {  // condition
                    isPrime = false;
                    break;
                }
            }
            System.out.println(isPrime);
        }
    }
}