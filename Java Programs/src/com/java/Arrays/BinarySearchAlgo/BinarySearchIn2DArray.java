package com.java.Arrays.BinarySearchAlgo;

import java.util.Arrays;
// row wise and column wise sorted.

public class BinarySearchIn2DArray {
    public static void main(String[] args) { // row wise and col wise sorted
        int[][] arr = {          // row wise & col wise sorted
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {21, 26, 37, 49},
                {24, 28, 39, 51},
                {27, 29, 41, 52}
        };
        System.out.println(Arrays.toString(search(arr, 27)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - (matrix.length - matrix[0].length + 1);

        while(r < matrix.length && c >= 0){
            if(target == matrix[r][c]) return new int[] { r, c};
            if(target > matrix[r][c]) r++;
            else c--;
        }
        return new int[] { -1, -1 };
    }
}