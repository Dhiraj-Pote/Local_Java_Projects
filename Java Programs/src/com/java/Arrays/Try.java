package com.java.Arrays;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
    }

    public void Merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        var result = new int[m+n];

        while(i < m && j < n)
        {
            if(nums1[i] > nums2[j])
                result[k++] = nums2[j++];
            else
                result[k++] = nums1[i++];
        }

        while(j < n)
            result[k++] = nums2[j++];

    }
}
