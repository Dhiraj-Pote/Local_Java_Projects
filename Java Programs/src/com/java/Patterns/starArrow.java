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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // downside triangle
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}