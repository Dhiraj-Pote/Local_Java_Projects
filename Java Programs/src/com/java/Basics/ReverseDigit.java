package com.java.Basics;
// Printing number in reverse order.

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        int reverse = 0;

        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        System.out.println(reverse);
    }
}