package com.java.Basics;
//https://leetcode.com/problems/count-primes/
// Given an integer n, return the number of prime numbers that are strictly less than n.

public class CountPrimes {
    public static void main(String[] args) {
        int n = 30;
        boolean[] prime = new boolean[n + 1];
        System.out.println(isPrime(n, prime));
    }

    static int isPrime(int n, boolean[] prime) { // Sieve of Eratosthenes.
        int count = 0;

        if (n == 0 || n == 1) return 0;

        for (int i = 2; i * i <= n; i++) {
            if (!prime[i]) {
                for (int j = 2 * i; j < n; j += i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (!prime[i]) count++;
        }
        return count;
    }
}