package com.java.Basics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner inp = new Scanner(System.in);
        int n1 = inp.nextInt();

        switch (n1) {
            case 3 -> System.out.println("odd");
            case 8 -> System.out.println("even");
            default -> System.out.println("enter correct");
        }
    }

}