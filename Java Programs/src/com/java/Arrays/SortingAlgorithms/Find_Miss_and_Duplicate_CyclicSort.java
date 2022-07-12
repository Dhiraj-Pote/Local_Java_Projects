package com.java.Arrays.SortingAlgorithms;
// https://leetcode.com/problems/set-mismatch/
import java.util.Arrays;

public class Find_Miss_and_Duplicate_CyclicSort {
    public static void main(String[] args) {
        int[] nums = { 2,2,1,4 };
        System.out.println(Arrays.toString(sort(nums)));
    }

    static int[] sort(int[] nums){
        int i =0;
        while(i<nums.length) {
            // checks if no's are in their correct position.
            if(nums[i] != nums[nums[i]-1])
                swap(nums, i, nums[i]-1);
            else
                i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1)
                return new int[]{ nums[j], j+1 };
        }
        return new int[] {-1, -1};
    }

    static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}
