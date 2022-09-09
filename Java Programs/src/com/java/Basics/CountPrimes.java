package com.java.Basics;
//https://leetcode.com/problems/count-primes/
// Given an integer n, return the number of prime numbers that are strictly less than n.

public class CountPrimes {
    public void main(String[] args) {
        int[] cost =  {1,2,3,2};
        int[] time = {1,2,3,2};

        System.out.println(getMinCost(cost));
    }
    static int getMinCost(int[] cost) {
        int sum = cost[0];
        int min = cost[1];
        for (int i = 1; i < cost.length; i++) {
            if(cost[i]<min) min = cost[i];
        }
        return min + sum;
    }
}