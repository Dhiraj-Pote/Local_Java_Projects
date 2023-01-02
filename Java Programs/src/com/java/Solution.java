package com.java;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {7, 1, 2, 3};
        int len = arr.length;
        modifyValues(len, arr);
    }
    public static void modifyValues(int len, int[] arr)
    {
        int i;
        for(i=0;i<len;i++)
        {
            if(arr[i]%2==0)
            {
                arr[i]*=(len-1);
            }
            else
            {
                arr[i]*=len;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
