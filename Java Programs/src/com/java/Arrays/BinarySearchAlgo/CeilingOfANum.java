package com.java.Arrays.BinarySearchAlgo;

public class CeilingOfANum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 4, 16, 18, 26, 30};
        int target = 33;
        System.out.println(search(arr, target));
    }
    // return index of the smallest number >= target
    static int search(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        if(arr[e] < target ){
            return -1;       // such no. does not exist
        }

        while (s <= e) {      // sorted down to 1 element
            int m = s + (e-s)/2;
            if(target == arr[m]){
                return m;
            }
            else if(target < arr[m]){
                e = m - 1;
            }
            else if(target > arr[m]) {
                s = m+1;
            }
        }
        return s;   // while loop breaks s=e+1
    }
}