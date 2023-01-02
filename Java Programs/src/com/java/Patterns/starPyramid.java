package com.java.Patterns;
import java.util.Scanner;
/*
    *
   ***
  *****
 *******
           */
public class starPyramid {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                if(j >= n-i-1 && j <= n+i-1)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}