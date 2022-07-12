package com.java.Arrays.BinarySearchAlgo;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class FindFirstAndLastPositionOfNumber {
    public static void main(String[] args) {
        int[] nums = {1, 5, 5, 5, 5, 7, 7, 8, 9};
        int target = 5;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = FindFirstIndex(nums, target);
        ans[1] = FindLastIndex(nums, target);
        return ans;
    }

    static int FindFirstIndex(int[] nums, int target) {
        int index = -1;
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (nums[m] >= target) {
                e = m - 1;
            } else {
                s = m + 1;
            }
            if (nums[m] == target) {
                index = m;
            }
        }
        return index;
    }

    static int FindLastIndex(int[] nums, int target) {
        int index = -1;
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (nums[m] <= target) {
                s = m + 1;
            } else {
                e = m - 1;
            }
            if (nums[m] == target) {
                index = m;
            }
        }
        return index;
    }
}