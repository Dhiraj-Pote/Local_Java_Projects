package com.java.Arrays;

//https://leetcode.com/problems/number-of-good-pairs/
public class goodPair {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 1};
        System.out.println(numIdenticalPairs(nums));
    }

    static int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int[] count = new int[101];

        for (int n : nums)
            count[n]++;

        for (int n : count)
            ans += (n * (n - 1)) / 2;

        return ans;
    }
}
