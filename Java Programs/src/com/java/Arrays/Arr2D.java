package com.java.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Arr2D {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] ar1 = new int[5];

        int[][] arr = new int[3][2];

        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col<arr[row].length; col++){
                arr[row][col] = inp.nextInt();
            }
        }
            for (int row = 0; row < arr.length; row++){
                for (int col = 0; col<arr[row].length; col++){     // traditional way
                    System.out.print(arr[row][col] + " ");
                }
                System.out.println();
            }

        for (int row = 0; row < arr.length; row++){
                System.out.println(Arrays.toString(arr[row]));   // shortcut
        }

            for (int a[]: arr){
                System.out.println(Arrays.toString(a)) ;         // enhanced for loop
            }

    }
}