package com.java.Patterns;
import java.util.Scanner;
                   /*
                   * *
                  * * *
                 * * * *
                  * * *
                   * *
                    */

public class starKite {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        for (int row = 1; row < 2 * n; row++) {
            int colInEachRow = row > n ? 2 * n - row : row;  // for n = 3-> 1 2 3 4 3 2 1
            int spacesInEachRow = n-colInEachRow;
            for (int i = 0; i <=spacesInEachRow ; i++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= colInEachRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}