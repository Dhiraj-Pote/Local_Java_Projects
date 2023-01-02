package com.java;
import java.util.Scanner;

class Espresso extends items {
    public int milk = 60;
    public int cream = 75;
    public int syrup = 100;

    public int Billing(int i) {

        if (i == 1) {
            return milk;
        } else if (i == 2) {
            return cream;
        } else {
            return syrup;
        }
    }
}

class Cappuccino extends items {
    public int milkPrice = 80;
    public int creamPrice = 90;
    public int syrupPrice = 125;

    public int calculateBill(int i) {

        if (i == 1) {
            return milkPrice;
        } else if (i == 2) {
            return creamPrice;
        } else {
            return syrupPrice;
        }
    }
}

class Latte extends items {
    public int milkPrice = 100;
    public int creamPrice = 125;
    public int syrupPrice = 150;

    public int calculate(int i) {

        if (i == 1) {
            return milkPrice;
        } else if (i == 2) {
            return creamPrice;
        } else {
            return syrupPrice;
        }
    }
}

class items {
    public void Menu() {
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

public class Coffee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch;
        int choice;
        int addOn;
        int Bill = 0;

        do {
            items c = new items();
            c.Menu();
            System.out.println("Which coffee you want from Menu?  " + "1-Espresso, 2-Cappuccino, 3-Latte");
            choice = sc.nextInt();
            System.out.println("What addons you want from Menu?   " + "1-Milk, 2-Cream, 3-Syrup");
            addOn = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    Espresso e1 = new Espresso();
                    switch (addOn) {
                        case 1 -> Bill += e1.Billing(1);
                        case 2 -> Bill += e1.Billing(2);
                        case 3 -> Bill += e1.Billing(3);
                    }
                }
                case 2 -> {
                    Cappuccino c1 = new Cappuccino();
                    switch (addOn) {
                        case 1 -> Bill += c1.calculateBill(1);
                        case 2 -> Bill += c1.calculateBill(2);
                        case 3 -> Bill += c1.calculateBill(3);
                    }
                }
                case 3 -> {
                    Latte l1 = new Latte();
                    switch (addOn) {
                        case 1 -> Bill += l1.calculate(1);
                        case 2 -> Bill += l1.calculate(2);
                        case 3 -> Bill += l1.calculate(3);
                    }
                }
            }
            System.out.println("Do you want to order more?(y/n)");
            ch = sc.next().charAt(0);
        } while (ch == 'y');
        System.out.println("Total Bill: " + Bill);
    }
}

/*

 */
