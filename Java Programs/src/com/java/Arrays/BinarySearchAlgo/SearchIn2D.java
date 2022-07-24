package com.java.Arrays.BinarySearchAlgo;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] matrix = {      // last ele. of row < 1st ele. of nxt row
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 30;

        System.out.println(searchMatrix(matrix, target));
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = 0;
        while (row < m && col < n) {
            if (target == matrix[row][col]) return true;
            if (target > matrix[row][n - 1]) row++;
            else col++;
        }
        return false;
    }
}