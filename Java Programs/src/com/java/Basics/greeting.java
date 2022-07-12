package com.java.Basics;

import java.util.Scanner;

// Take name as input and print a greeting message for that name.
public class greeting {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner inp = new Scanner(System.in);
        String name = inp.nextLine();
        System.out.println(name + " Hushar");
    }
}
