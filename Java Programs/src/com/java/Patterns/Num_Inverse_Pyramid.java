package com.java.Patterns;
import java.util.Scanner;
/*
1 2 3 4 3 2 1
  1 2 3 2 1
    1 2 1
      1
 */

public class Num_Inverse_Pyramid {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int r = inp.nextInt();
        int n1 = 1;
        int n2 = r - 1;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < 2 * r - 1 - i; j++) {
                if (j >= i && j <= 2 * r - i) {
                    if (j >= r) {
                        System.out.print(n2 + " ");
                        n2--;
                    } else {
                        System.out.print(n1 + " ");
                        n1++;
                    }
                } else System.out.print("  ");
            }
            System.out.println();
            n1 = 1;
            n2 = r - i - 2;
        }
    }
}