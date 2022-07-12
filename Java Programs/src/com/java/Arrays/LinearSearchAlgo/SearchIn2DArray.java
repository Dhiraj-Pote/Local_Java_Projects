package com.java.Arrays.LinearSearchAlgo;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 34, 57},
                {2, 5, 9},
                {10, 12, 5}
        };
        int target = 5;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }

}
