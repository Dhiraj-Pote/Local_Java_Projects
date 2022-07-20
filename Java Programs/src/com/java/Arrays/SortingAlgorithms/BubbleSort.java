package com.java.Arrays.SortingAlgorithms;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 0, -8, 1, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        boolean swapped;
        int i = arr.length;  // i act as a counter to reduce the search space,
        while(i>0) {
            swapped = false;
            for (int j = 1; j < i; j++) {
                if (arr[j] > arr[j - 1]) {
                    swap(arr, j,j-1);
                    swapped = true;
                }
            }
            i--;
            if (!swapped){
                break;
        }
        }
    }
    static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}
