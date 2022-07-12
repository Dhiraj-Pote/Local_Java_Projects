package com.java.Basics;

import java.util.Scanner;

public class Number_Line {

    public static void main(String[] args) {
        System.out.println(" Enter number ");
        Scanner inp = new Scanner(System.in);
                float num = inp.nextFloat();
                if (num >0)
                {
                    System.out.println("positive");
                }
                else if(num <0){
                    System.out.println("negative");
                }
                else {
                    System.out.println("zero");
                }
    }
}
