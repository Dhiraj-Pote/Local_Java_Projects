package com.java.Arrays;
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class Buy_Sell {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 4, 10, 2, 12};
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minSoFar = prices[0];
        for (int price : prices) {
            minSoFar = Math.min(minSoFar, price);
            int currentProfit = price - minSoFar;
            maxProfit = Math.max(maxProfit, currentProfit);
        }
        return maxProfit;
    }
}