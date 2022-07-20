package com.java.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate
public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums = {5,2,3,8,9,1};
        System.out.println(containsDuplicate(nums));
    }
    static boolean containsDuplicate(int[] nums) {
        Set<Integer> distinct = new HashSet<>();
        for(int i : nums)
            if(!distinct.add(i))   // if duplicate exist
                return true;
        return false;
    }
}