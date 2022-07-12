package com.java.Basics;

import java.util.Scanner;

public class Salary_Calculator {
    public static double Salary_calculation(double hours_week, double pay_per_hr) {
        return 52 * (hours_week * pay_per_hr);                                     // calculating package
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Hours: ");
        double h = inp.nextDouble();
        System.out.print("Enter Pay/Hr: ");
        double p = inp.nextDouble();
        double Total_Salary = Salary_calculation(h, p);
        System.out.print("Total Package is:->  " + Total_Salary);
    }
}