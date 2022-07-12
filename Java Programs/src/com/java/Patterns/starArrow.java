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
        for (int row = 1; row < 2*n; row++) {
            for (int j = 1; j <=n; j++) {
                if(row<=n) {   // logic for upside triangle
                    if(j<=row)
                    System.out.print("* ");
                }
                else          // logic for downside triangle
                    if(j<=2*n-row)
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}