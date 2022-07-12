package com.java.Arrays;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 3094, 57},
                {2, 88, 9},
                {10, 12, 519},
                {99}
        };
        System.out.println(max(arr));
    }

    static int max(int[][] arr) {
        int max = arr[0][0];
        for (int[] row : arr) {
            for (int ele : row) {
                if (ele > max) {
                    max = ele;
                }
            }
        }
        return max;
    }
}