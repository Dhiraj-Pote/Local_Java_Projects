package com.java.Arrays.SortingAlgorithms;

public class FirstMissing_Positive_CyclicSort {
    public static void main(String[] args) {
        int[] nums = { 3,4,-1,1 };  // 1-N nos. distinct nos.
        sort(nums);
        System.out.println(sort(nums));
    }

    static int sort(int[] nums) {
        int i = 0;
        while (i<nums.length){
            if ( nums[i] > 0 && nums[i] <= nums.length  && nums[i] != nums[nums[i]-1]) {
                swap(nums, i, nums[i]-1);
            }
            else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1) return j+1; // case 1 when max num is present in array
        }
        return nums.length+1 ;
    }

    static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}