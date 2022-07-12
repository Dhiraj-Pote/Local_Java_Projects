package com.java.Arrays.BinarySearchAlgo;

public class FloorOfANum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 4, 16, 18, 26, 30};
        int target = 1;
        System.out.println(search(arr, target));
    }

    // return index of the smallest number <= target
    static int search(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        int m;
        while (s <= e) {    // sorted down to 1 element
            m = s + (e - s) / 2;
            if (target == arr[m]) {
                return arr[m];
            } else if (target < arr[m]) {
                e = m - 1;
            } else if (target > arr[m]) {
                s = m + 1;
            }
        }
        return e;    // while loop breaks s=e+1
    }
}