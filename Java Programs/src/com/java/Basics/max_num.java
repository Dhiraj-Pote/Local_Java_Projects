package com.java.Basics;
// max of 3 numbers

import java.util.Scanner;

public class max_num {
    public static void main(String[] args) {
        System.out.print("Enter 3 num's: ");
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();

        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);
    }
}