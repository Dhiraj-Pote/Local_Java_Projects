package com.java.Arrays.SortingAlgorithms.MergeSort;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] nums = { 5,4,3,2,1 };
        mergeInPlace(nums, 0, nums.length);
        System.out.println(Arrays.toString(nums));
    }

    static void mergeInPlace(int[] nums,int s, int e ) {
        if(e-s == 1) return;

        int mid = s + (e-s)/2;

        mergeInPlace(nums, s, mid);
        mergeInPlace(nums, mid, e);
        mergeArrays(nums, s, mid, e);

    }

    static void mergeArrays(int[] nums, int s, int mid, int e) {
        int[] mix = new int[e - s];
        int i = s, j = mid, k = 0;

        while (i < mid && j < e) {
            if (nums[i] < nums[j]) {
                mix[k] = nums[i];
                i++;
            } else {
                mix[k] = nums[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            mix[k] = nums[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k] = nums[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            nums[s+l] = mix[l];
        }
    }
}
