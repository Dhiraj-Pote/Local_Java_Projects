package com.java.Arrays.SortingAlgorithms.InsertionSort;
// Sort arrays using Insertion Sort Algorithm
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {-3, 1, 5, 0, 6, -4, 9, 2};
        insertionsort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertionsort(int[] nums){
        for (int i = 1; i < nums.length ; i++) {
            for (int j = i; j > 0; j--) {
                if(nums[j-1] > nums[j])
                    swap(nums, j , j-1);
                else break;
            }
        }
    }

    static void swap(int[] nums, int n1, int n2) {
        int temp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = temp;
    }

}