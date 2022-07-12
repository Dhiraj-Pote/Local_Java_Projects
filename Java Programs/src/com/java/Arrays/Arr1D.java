package com.java.Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class Arr1D {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
        System.out.println(Arrays.toString(arr)); // 1.  best way to print arrays.

        for (int i = 0; i < arr.length; i++) {        // conventional way
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int j : arr) {                   // enhanced for loop
            System.out.print(j + " ");
        }


    }
}