package com.java.Arrays.LinearSearchAlgo;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class No_of_Even_Nos {
    public static void main(String[] args) {
        int[] arr = {22, 1, 60, 223344, 9621};

        int count = 0;
        for (int num: arr) {
            if(even(num)){
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean even(int num){
       int NoOfDigits = digits(num);
        return NoOfDigits % 2 == 0;
    }

    static int digits(int num){
            int length = 0;
            while (num > 0){
                length++;
                num /= 10;
        }
        return length;
    }
}