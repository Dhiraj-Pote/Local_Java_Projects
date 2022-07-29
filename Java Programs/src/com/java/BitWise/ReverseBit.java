package com.java.BitWise;

public class ReverseBit { // bitwise reversal of 32-bit number
    public static void main(String[] args) {
        int n  = 43261596;

       int ans = 0;
        for (int i = 1; i <= 32; i++) {
            ans = (ans << 1) | (n&1);
            n = n>>1;
        }
        System.out.println(ans);
    }
}