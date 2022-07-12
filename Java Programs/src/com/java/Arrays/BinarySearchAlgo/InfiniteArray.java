package com.java.Arrays.BinarySearchAlgo;
// Infinite array means- arr.length not possible.

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,10,12,14,15,18,20,22,25,29,33,36,49,55};
        int target = 15;
        System.out.println(range(arr, target));
    }

    static int range(int[] arr, int target){
        int s = 0;
        int e = 1;
        while(arr[e] < target){
            int newstart = e + 1;
            e = e + (e-s + 1)*2;
            s = newstart;
        }
        return BinarySearch(arr, target, s, e);
    }

    static int BinarySearch(int[] arr, int target, int s, int e) {

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