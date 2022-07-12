package com.java.Patterns;
import java.util.Scanner;
/*
    *
   **
  ***
 ****
*****
 */
public class starTriangle_Rightside {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j < n - 1 - i)
                System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}