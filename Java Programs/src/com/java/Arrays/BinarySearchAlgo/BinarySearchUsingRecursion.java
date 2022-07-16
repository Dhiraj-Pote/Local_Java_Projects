package com.java.Arrays.BinarySearchAlgo;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] nums = {4, 6, 8, 10, 11, 13, 14, 15, 19, 28};
        System.out.println(search(nums, 19, 0, nums.length - 1));
    }

    static int search(int[] nums, int target, int s, int e) {
        int m = s + (e - s) / 2;

        if (s > e) return -1;

        if (target == nums[m]) {
            return m;
        }
        if (target > nums[m]) {
            return search(nums, target, m + 1, e);
        } else
            return search(nums, target, s, m - 1);
    }
}