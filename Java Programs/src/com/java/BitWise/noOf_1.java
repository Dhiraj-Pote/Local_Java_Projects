package com.java.BitWise;

public class noOf_1 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(9));
    }
    static int hammingWeight(int n) {
        int count = 0;
        while(n!=0){
            count+=(n & 1);
            n = n>>1;
        }
        return count;
    }
}
