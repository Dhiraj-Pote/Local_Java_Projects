package com.java.Projects;
import java.util.Scanner;

public class Java_Banking_Application {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = user.nextLine();

        System.out.print("Enter your ID: ");
        String id = user.nextLine();

        System.out.print("\\u000C");

        bankAccount obj1 = new bankAccount(name, id);
        obj1.showMenu();
    }

}

class bankAccount {
    int balance, previousTransaction;
    String customerName, customerId;

    bankAccount(String cName, String cId) {
        customerName = cName;
        customerId = cId;
    }

    void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0)
            System.out.println("Deposited: " + previousTransaction);
        else if (previousTransaction < 0)
            System.out.println("Withdraw: " + Math.abs(previousTransaction));
        else
            System.out.println("No transaction occurred.");
    }

    void showMenu() {
        char option;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n ---------------------" +
                "\n Welcome, " + customerName +
                "\n Your ID is : " + customerId +
                "\n ---------------------" +
                "\n A. Check balance. " +
                "\n B. Deposit. " +
                "\n C. Withdraw. " +
                "\n D. Previous transaction." +
                "\n E. Exit");

        do {
            System.out.println(" --------------------- \n Enter an option \n ---------------------");
            option = scanner.next().toUpperCase().charAt(0);

            switch (option) {
                case 'A' -> System.out.println(" --------------------- \n Balance = " +
                        balance + "\n ---------------------");
                case 'B' -> {
                    System.out.println("""
                            ---------------------\s
                            Enter an amount to deposit\s
                            ---------------------""".indent(1));
                    int amount = scanner.nextInt();
                    deposit(amount);
                }
                case 'C' -> {
                    System.out.println(" --------------------- " +
                            "\s Enter an amount to withdraw = " +
                            "\s ---------------------");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                }
                case 'D' -> {
                    System.out.println(" --------------------- \n");
                    getPreviousTransaction();
                    System.out.println(" --------------------- ");
                }
                case 'E' -> System.out.println(" --------------------- ");
                default -> System.out.println("Please enter a valid option!");
            }

        } while (option != 'E');

        System.out.println("Thank you for using our service!");
    }
}