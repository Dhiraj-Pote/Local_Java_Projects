package com.java.Arrays;

import java.util.Arrays;

public class Try {
    public static void main(String[] args) {
        int[] nums = { 2,5,5,11 };
        int target = 10;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if( i!=j && nums[i] + nums[j] == target)
                    return new int[] {i,j};
            }
        }
        return new int[] {-1,-1};
    }

}