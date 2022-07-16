package com.java.Patterns;
import java.util.Scanner;
/*    1
    2 1 2
  3 2 1 2 3
4 3 2 1 2 3 4
 */
public class pyramidNum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int j = 1; j <= n-row; j++) {  // space 3 2 1 0
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {   // num 1 21 321 4321
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {  // num    2  23  234
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}