package com.java.Arrays.BinarySearchAlgo;

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {2, 22, 30, 32, 35, 36, 37, 38, 49, 28, 20, 10, 7};

        System.out.println(Search(arr));
    }

    static int Search(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
           int m = s + (e - s) / 2;

            if (arr[m] > arr[m + 1]) {
                e = m;
            } else {
                s = m + 1;
            }
        }
        return e;   // If num not Found , returns 0
    }
}