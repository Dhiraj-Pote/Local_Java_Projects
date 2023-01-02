package com.java;

import java.util.Arrays;

public class numtoarr {
    public static void main(String[] args) {

        System.out.println(factorial(3));
    }
    public static int factorial(int n)
    {
        int f = 1;
        if (n == 0|| n == 1)
            return 1;
        for (int i = 2; i <= n; i++)
            f = f * i;
        return f;
    }
}
