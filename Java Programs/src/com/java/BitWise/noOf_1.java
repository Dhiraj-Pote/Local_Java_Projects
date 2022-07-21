package com.java.BitWise;

public class noOf_1 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(11)); // 1011
    }
    static int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            if((n & 1) ==1) count++;  // +1 every time, when lsb is one
            n = n>>1;  // right shift
        }
        return count;
    }
}
