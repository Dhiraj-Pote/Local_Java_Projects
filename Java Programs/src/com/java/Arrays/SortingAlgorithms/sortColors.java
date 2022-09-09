package com.java.Arrays.SortingAlgorithms;
import java.util.Arrays;
// leetcode 75

public class sortColors {
    public static void main(String[] args) {
        int[] nums = {0,2,1,1,2,0};
        sortcolors(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sortcolors(int[] nums) {
        int l= 0, index = 0, r = nums.length-1;

        while (index<=r){
            if(nums[index] == 0)
                swap(nums, l++, index++);

            else if(nums[index] == 2)
                swap(nums, index , r--);

            else index++;
        }
    }

    static void swap(int[] nums, int n1, int n2) {
        int temp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = temp;
    }
}
