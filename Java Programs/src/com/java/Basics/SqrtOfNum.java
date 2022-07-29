package com.java.Basics;

public class SqrtOfNum {
        public static void main(String[] args) {
            int n = 8;
            System.out.println(mySqrt(n));
        }

        static int mySqrt(int n) {
            int ans = 0;
            while (ans*ans <= n) {
                ans++;
            }
            return ans - 1;
        }
}