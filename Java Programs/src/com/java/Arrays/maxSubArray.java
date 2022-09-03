package com.java.Arrays;

public class maxSubArray { // Kadane's Algorithm: leetcode 53;
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    static int maxSubArray(int[] nums) {
        int ans = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxSum = Math.max(nums[i] + maxSum, nums[i]);
            ans = Math.max(ans, maxSum);
        }
        return ans;
    }
}
