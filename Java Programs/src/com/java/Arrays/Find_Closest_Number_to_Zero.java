package com.java.Arrays;

//https://leetcode.com/problems/find-closest-number-to-zero/
public class Find_Closest_Number_to_Zero {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 2, 2, 1, 3};
        System.out.println(findClosestNumber(nums));
    }

    static int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE, closest_num = 0;
        for(int n : nums) {
            if(Math.abs(n)< min) {
                min = Math.abs(n);
                closest_num = n;
            } else if(Math.abs(n)==min && n>0) {
                closest_num = n;
            }
        }
        return closest_num;
    }
}