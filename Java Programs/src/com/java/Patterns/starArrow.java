package com.java.Patterns;

import java.util.Scanner;
/*
 **
 ***
 ****
 ***
 **
 */

public class starArrow {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        // upside triangle
        for (int row = 1; row < 2 * n; row++) {
            int colInEachRow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= colInEachRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}