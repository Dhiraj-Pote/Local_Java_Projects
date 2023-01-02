// Problem Statement: Find running sum in an array.

package com.java.Arrays;
import java.util.Arrays;

public class Running_sum {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4};
        System.out.println(Arrays.toString( optimisedSum (nums)));
    }

    public static int[] notOptimised(int[] nums) {
        //O(N2)--> TIME && O(N)--> SPACE
        int[] ans = new int[nums.length];   // Induction Variable Elimination
        int sum;                            // Induction Variable Elimination
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = 0; j <= i; j++) {     // Loop Fusion
                sum = sum + nums[j];
            }
            ans[i] = sum;
        }
        return ans;
    }

// Looping Optimization technique:
    public static int[] optimisedSum(int[] nums) {
        //O(N)--> TIME && O(1)--> SPACE

        for(int i=1; i< nums.length;i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
// Methods used:
   /* Induction Variable Elimination
      Loop Fusion
   */


