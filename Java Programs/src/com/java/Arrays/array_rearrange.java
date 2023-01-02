package com.java.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class array_rearrange{
    public static void main(String[] args) {

        System.out.print("Enter length of array: ");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];
        //take array as input
        System.out.print("Enter Sorted array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }
        // print modified array after making function call
        System.out.println("Modified array: " + Arrays.toString(rearrange(arr, n)));
    }
    public static int[] rearrange(int[] arr, int n) {
        int start = 0; int end =  n-1;
        int i = 0;
        int[] temp = new int[n];
// rearranging numbers in new temp array
        while(start<=end) {
            temp[i++] = arr[end--];
            if(start<=end)
                temp[i++] = arr[start++];
        }
        arr = temp.clone();
        return arr;
    }
}
/*
Time Complexity: O(n)
Space Complexity: O(n)
*/