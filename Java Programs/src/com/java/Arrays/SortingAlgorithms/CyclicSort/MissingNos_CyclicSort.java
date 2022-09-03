package com.java.Arrays.SortingAlgorithms.CyclicSort;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class MissingNos_CyclicSort {
    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7, 8, 7, 2, 2, 1, 6};
        System.out.println(findDisappearedNumbers(nums));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else i++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                ans.add(j + 1);
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