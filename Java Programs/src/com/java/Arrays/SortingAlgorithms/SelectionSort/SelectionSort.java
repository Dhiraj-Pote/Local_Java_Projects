package com.java.Arrays.SortingAlgorithms.SelectionSort;
// Sort the array using insertion sort
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {-3, 1, 5, 0, 6, -4, 9, 2};
        selection(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void selection(int[] nums) {
        // finding the max num in given range & swapping it with the num. in last position.
        for (int i = 0; i < nums.length; i++) {
            int lastIndex = nums.length-1-i;  // it reduces searching range
            int MaxIndex = IndexOfMaxNum(nums, lastIndex);
            swap(nums, MaxIndex, lastIndex);
        }
    }

    static void swap(int[] nums, int maxIndex, int lastIndex) {
        int temp = nums[maxIndex];
        nums[maxIndex] = nums[lastIndex];
        nums[lastIndex] = temp;
    }

    static int IndexOfMaxNum(int[] nums, int endindex) {
        int maxIndex = 0;
        for (int i = 0; i <=endindex; i++) {
            if(nums[i] > nums[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}