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

        for (int row = 1; row <= 2*n-1 ; row++) {  // n = 4, r = 5, c = 3
            int colinrow = row > n ? 2*n - row : row;
            int spaceinrow = n - colinrow;
            for (int space = 1; space <= spaceinrow; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= colinrow; col++) {
                System.out.print(col+ " ");
            }
            System.out.println("");
        }
    }
}