package com.java.Arrays.LinearSearchAlgo;
import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = {25, 41, 55, 20, 28, 0, 6};
        int num = inp.nextInt();
        System.out.println(ei(arr, num)); // Function call..
    }

    static boolean ee(int[] arr, int num) {  // check if Element Exist
        for (int i : arr) {
            if (num == i) {
                return true;
            }
        }
        return false;
    }

    static int ei(int[] arr, int index) {   // Element at given Index
        if (index < arr.length && index >= 0) {
            return arr[index];
        } else
            return -1;
    }

    static int se(int[] arr, int num) {  // Search element & return Index
        for (int index = 0; index < arr.length; index++) {
            if (num == arr[index]) {
                return index;
            }
        }
        return -1;
    }
}