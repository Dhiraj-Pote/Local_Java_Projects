package com.java.Arrays.BinarySearchAlgo;

public class FindTargetUsingBSA {       // when you know that the Array is sorted
    public static void main(String[] args) {
        int[] arr = {22, 30, 35, 39, 45, 60, 71};
        int target = 71;
        System.out.println(BinarySearch(arr, target));
    }

    static int BinarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] == target) {
                return m;
            } else if (arr[m] < target) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;   // If num not Found
    }
}