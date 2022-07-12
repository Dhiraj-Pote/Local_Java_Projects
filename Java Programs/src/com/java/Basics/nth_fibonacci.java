package com.java.Basics;

import java.util.Scanner;

public class nth_fibonacci {
    public static void main(String[] args) {
        System.out.print("enter nth term: ");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        int a = 0;                            //                          0 1 1 2 3 5 8 13 21 34 55 ...
        int b = 1;                           //  indexing starts from-    0
        int next;
        while (n > 0) {
            next = a + b;
            a = b;
            b = next;
            n--;
        }
        System.out.println(a);
    }
}