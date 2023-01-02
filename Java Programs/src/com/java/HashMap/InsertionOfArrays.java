package com.java.HashMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InsertionOfArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int n1: nums1 ) {
            set.add(n1);
        }

        for (int n2: nums2 ) {
            if(set.contains(n2)) {
                set2.add(n2);
            }
        }
        int[] arr = new int[set2.size()];

        int i = 0;
        for (Integer e: set2) {
            arr[i++] = e;
        }

        return arr;
    }
}
