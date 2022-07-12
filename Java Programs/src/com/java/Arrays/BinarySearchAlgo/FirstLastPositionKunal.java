package com.java.Arrays.BinarySearchAlgo;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
import java.util.Arrays;

public class FirstLastPositionKunal {
    public static void main(String[] args) {
        int[] nums = {1, 5, 5, 5, 5, 7, 7, 8, 9};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = FindIndex(nums, target, true);
        if(ans[0] != -1){
        ans[1] = FindIndex(nums, target, false);}
        return ans;
    }

    static int FindIndex(int[] nums, int target, boolean startindex) {
        int index = -1;
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (nums[m] > target) {
                e = m - 1;
            }
            if (nums[m] < target) {
                s = m + 1;
            }
            if (nums[m] == target) {
                index = m;
                if (startindex) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
        }
        return index;
    }
}