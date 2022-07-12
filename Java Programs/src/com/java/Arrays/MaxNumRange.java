package com.java.Arrays;
import java.util.Scanner;

public class MaxNumRange {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = {25, 88, 20, 30, 80, 5};   // initialise array
        int s = inp.nextInt();
        int e = inp.nextInt();
        System.out.println(maxRange(arr, s, e));
    }
    // Function to return max value in given array range
    static int maxRange(int[] arr, int s, int e) {
        int maxValue = arr[0];
        for (int i = s; i <= e; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return (maxValue);
    }
}
