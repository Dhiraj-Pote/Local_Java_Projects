// https://leetcode.com/problems/flipping-an-image/ GOOGLE QUESTION
package com.java.Arrays;

import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {0, 0, 1}, {0, 0, 0}};
        flipAndInvertImage(image);
        for (int[] row : image) {
            System.out.println(Arrays.toString(row));
        }
    }

    static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            for (int i = 0; i < (row.length + 1) / 2; i++) {
                int temp = row[i]^1;
                row[i] = row[row.length - 1 - i]^1;
                row[row.length - 1 - i] = temp;
            }
        }
        return image;
    }
}