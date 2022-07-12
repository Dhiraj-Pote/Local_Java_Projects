package com.java.Arrays;
import  java.util.Arrays;
import java.util.Scanner;

public class SwapArr {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr = {1, 3, 5, 7, 9};
        int index1 = inp.nextInt();     // taking indices to be swapped
        int index2 = inp.nextInt();
        swap(arr, index1, index2);      // function call

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2) {   // swapping function
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}