package com.java.Arrays;
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

public class Buy_Sell2 {
    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] - prices[i-1] > 0) profit += prices[i] - prices[i-1];
        }
        return profit;
    }
}
