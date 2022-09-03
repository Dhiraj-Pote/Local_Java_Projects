package com.java.Arrays.SortingAlgorithms.CyclicSort;
// AMAZON https://leetcode.com/problems/find-the-duplicate-number/submissions/
public class Duplicate_num_CyclicSort {
    public static void main(String[] args) {
        int[] nums = {3,1,3,4,2};
        System.out.println(sort(nums));
    }
    static int sort(int[] nums) {
        int i = 0;
        while(i< nums.length){
            if(nums[i] != nums[nums[i]-1])
            swap(nums, i, nums[i]-1);
            else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1)
                return nums[j];
        }
        return -1;
    }

    static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}
