package com.java.BitWise;

import java.util.Scanner;

public class i_th_Bit {
    public static void main(String[] args) {
        int n = 21;  // 1 0 1 0 1
        int i_thBit;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter i_th Bit : ");
        i_thBit = inp.nextInt();

        System.out.println((n & (1 << i_thBit - 1)) > 0 ? 1 : 0); // if out > 0; 3rd bit is 1: else = 0;
    }
}