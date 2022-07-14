package com.java.Basics;
//https://leetcode.com/problems/majority-element

public class Try {
    public static void main(String[] args) {
        int[] nums = {5,2,5,2,2,5,5,2,2,5,5,5,2,2,2,2,2};
        System.out.println(majorityElement(nums));
    }

    static int majorityElement(int[] nums) {
        int mE = nums[0], count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == mE){
                count++;
            }else if(count==0){
                mE = nums[i];
                count = 1;
            }
            else
                count --;
        }
        return mE;
    }
}