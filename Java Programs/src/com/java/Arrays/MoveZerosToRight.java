package com.java.Arrays;
// https://leetcode.com/problems/move-zeroes/
import java.util.Arrays;

public class MoveZerosToRight {
    public static void main(String[] args) {
        int[] nums = {1, 5, 0, 4, 0, 0, 9};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

        static void moveZeroes(int[] nums) {
            int snowBallSize = 0;
            for (int i=0;i<nums.length;i++){
                if (nums[i]==0){
                    snowBallSize++;
                }
                else if (snowBallSize > 0) {
                   nums[i - snowBallSize] = nums[i];
                   nums[i] = 0;
                }
            }
        }
    }