package com.java.Basics;
// To calculate Fibonacci Series up to n numbers->  0 1 1 2 3 5 ...

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int next = 0;

        System.out.print("Enter number: ");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();                       // taking input

        System.out.print("Fibonacci series: ");

        for (int i = 1; i <=num; i++) {
            System.out.print(n1 + " ");              // Printing Series
            next = n1 + n2;
            n1 = n2;
            n2 = next;

        }
    }
}