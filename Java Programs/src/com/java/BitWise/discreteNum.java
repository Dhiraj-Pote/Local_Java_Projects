package com.java.BitWise;

public class discreteNum {
    public static void main(String[] args) {
        int[] nums = {3,2,4,2,5,5,11,3,4};
        System.out.println(searchnum(nums));
    }

    private static int searchnum(int[] nums) {
        int ans = 0;

        for (int e: nums ) {
            ans^=e;    // bcuz  a^a =0 distinct will survive.
        }
        return ans;
    }
}