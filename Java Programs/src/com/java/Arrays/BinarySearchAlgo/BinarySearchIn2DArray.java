package com.java.Arrays.BinarySearchAlgo;

import java.util.Arrays;
// row wise and column wise sorted.

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {21, 26, 37, 49},
                {24, 27, 39, 52},
        };
        System.out.println(Arrays.toString(search(arr, 49)));
    }

    static int[] search(int[][] arr, int target) {

        int r = 0;
        int c = arr.length - 1;

        while (r < arr.length && c >= 0) {

            if (target == arr[r][c]) {
                return new int[]{r, c};
            }

            if (target > arr[r][c]) {
                r++;
            } else {
                c--;
            }
        }

        return new int[]{-1, -1};
    }
}


