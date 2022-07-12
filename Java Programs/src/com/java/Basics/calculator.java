package com.java.Basics;
// add sub multi. divide calculator program

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.print("Enter operation to perform: ");
            char op = inp.next().charAt(0);      // input the operator

            if (op == '+' || op == '-' || op == '*' || op == '/') {

                System.out.print("Enter two numbers: ");
                int n1 = inp.nextInt();                       // input two numbers
                int n2 = inp.nextInt();

                if (op == '+') {
                    ans = n1 + n2;
                }
                if (op == '-') {
                    ans = n1 - n2;
                }
                if (op == '*') {
                    ans = n1 * n2;
                }
                if (op == '/') {
                    ans = n1 / n2;
                }
                System.out.println("Answer is: " + ans);
            } else if (op == 'x') {                         // X to exit the program
                break;
            } else {
                System.out.println("Invalid input");
            }
        }

    }
}