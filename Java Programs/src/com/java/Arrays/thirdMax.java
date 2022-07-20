package com.java.Arrays;
import java.util.Arrays;

public class thirdMax {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2};
        System.out.println(thirdMaxNum(nums));
    }

    static int thirdMaxNum(int[] nums) {
        int tM = 0;
        boolean distinct = false;
        Arrays.sort(nums); // 1 2 2 3
        if (nums.length <= 2) return nums[nums.length - 1];
        else {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) continue;

            }
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1])
                    return nums[nums.length - 3];
            }
        }
        return tM;
    }
}
