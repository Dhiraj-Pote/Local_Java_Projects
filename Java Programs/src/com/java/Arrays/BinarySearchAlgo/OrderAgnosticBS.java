package com.java.Arrays.BinarySearchAlgo;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {33, 30, 21, 5, 4, 2, 0};
        System.out.println(search(arr, 2));
    }

    static int search(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        if (arr[s] > arr[e]) {
            while (s <= e) {
                int m = s + (e - s) / 2;
                if (target == arr[m]) {
                    return m;
                }
                if (target < arr[m]) {
                    s = m + 1;
                }
                if (target > arr[m]) {
                    e = m - 1;
                }
            }
        } else {
            while (s <= e) {
                int m = s + (e - s) / 2;
                if (target == arr[m]) {
                    return m;
                }
                if (target > arr[m]) {
                    s = m + 1;
                }
                if (target < arr[m]) {
                    e = m - 1;
                }
            }
        }
        return -1;
    }
}