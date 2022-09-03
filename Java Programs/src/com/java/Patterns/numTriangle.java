package com.java.Patterns;

import java.util.Scanner;
/*
     1
     12
     123
     1234
 */

public class numTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}