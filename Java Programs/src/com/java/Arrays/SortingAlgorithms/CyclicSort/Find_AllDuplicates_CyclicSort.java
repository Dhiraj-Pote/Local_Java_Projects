package com.java.Arrays.SortingAlgorithms.CyclicSort;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.ArrayList;
import java.util.List;

public class Find_AllDuplicates_CyclicSort {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicates(nums));
    }

    static List<Integer> findDuplicates(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else i++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                ans.add(nums[j]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}