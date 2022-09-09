package com.java.Arrays;

public class findPivotIndex {
    public static void main(String[] args) {
        int[] nums = {2,-4,3,-6, 2,2};
        System.out.println(pivotIndex(nums));
    }

    static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int totalSum = 0;
        for (int e: nums ) {
            totalSum += e;
        }

        for (int i = 0; i < nums.length; i++) {
            rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) return i;
            leftSum += nums[i];
        }
        return-1;
    }
}