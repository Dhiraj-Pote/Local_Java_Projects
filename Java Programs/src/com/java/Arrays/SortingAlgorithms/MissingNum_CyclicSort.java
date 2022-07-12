package com.java.Arrays.SortingAlgorithms;
// AMAZON Quesn.   https://leetcode.com/problems/missing-number/

public class MissingNum_CyclicSort {
    public static void main(String[] args) {
        int[] nums = { 4,0,5,3,1 };  // 1-N nos. distinct nos.
        sort(nums);
        System.out.println(sort(nums));
    }

    static int sort(int[] nums) {
        int i = 0;
        while (i<nums.length){
            if (nums[i] < nums.length && nums[i] != nums[nums[i]]) {
                swap(nums, i, nums[i]);
            }
            else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j) return j; // case 1 when max num is present in array
        }
        return nums.length ;
    }

    static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}