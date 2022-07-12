package com.java.Arrays;

import java.util.Scanner;

public class Small_Max_NumArr {
    public static void main(String[] args) {
        int[] arr = {20, 30, 8, 100};    // initialise array
        System.out.println(smallest(arr));
        System.out.println(max(arr));
    }

    static int max(int[] arr) {    // Function to return max value in an array
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return (maxValue);
    }

    static int smallest(int[] arr) {
        int SNum = arr[0];
        for (int ele : arr) {
            if (ele < SNum) {
                SNum = ele;
            }
        }
        return SNum;
    }
}