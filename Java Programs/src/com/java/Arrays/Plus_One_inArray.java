// https://leetcode.com/problems/plus-one/
package com.java.Arrays;
import java.util.Arrays;

public class Plus_One_inArray {
    public static void main(String[] args) {
        int[] nums = { 9,9 };
        System.out.println(Arrays.toString(addOne(nums)));
    }

    static int[] addOne(int[] nums) {
        for (int i = nums.length-1; i >= 0; i--) {
            if(nums[i] < 9 ) {
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }
        int[] newNums = new int[nums.length+1];
                newNums[0] = 1;
        return newNums;
    }
}