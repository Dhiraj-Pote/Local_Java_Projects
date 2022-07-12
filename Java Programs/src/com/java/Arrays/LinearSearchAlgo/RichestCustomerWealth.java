package com.java.Arrays.LinearSearchAlgo;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 5, 7}, {2, 9}, {2, 6, 8}};
        System.out.println(sum(accounts));
        }

    static int sum(int[][] accounts){
        int MaxWealth = 0;
        for (int[] person : accounts) {
            int sum = 0;
            for (int bank : person) {
                sum += bank;
            }
            if(sum > MaxWealth){
                MaxWealth = sum;
            }
        }
        return MaxWealth;
    }
}
