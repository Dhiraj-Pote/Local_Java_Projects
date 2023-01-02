package com.java.Patterns;
import java.util.Scanner;

/*****
  ****
   ***
    **
     */

public class starTriangle_RightsideDown {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if(j < n - i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}