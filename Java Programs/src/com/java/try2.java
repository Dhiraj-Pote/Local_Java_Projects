package com.java;

public class try2 {
    public static void main(String[] args) {
        String leftAlignFormat = "| %-15s | %n";
        System.out.format("+-----------------+------+-------+-------+%n");
        System.out.format("| Product/Add On  | Milk | Cream | Syrup |%n");
        System.out.format("+-----------------+------+-------+-------+%n");
        System.out.format(leftAlignFormat, "Espresso        | 60   | 75    | 100  ");
        System.out.format("+-----------------+------+-------+-------+%n");
        System.out.format(leftAlignFormat, "Cappuccino      | 80   | 90    | 125  ");
        System.out.format("+-----------------+------+-------+-------+%n");
        System.out.format(leftAlignFormat, "Latte           | 60   | 75    | 100  ");
        System.out.format("+-----------------+------+-------+-------+%n");
   }
}
