package com.java.Arrays.BinarySearchAlgo;

public class Sqrt_BinarySearch {
    public static void main(String[] args) {
        int n = 56;
        System.out.println(mySqrt(n));
    }

    static int mySqrt(int x) {
        long s = 0, e = x, ans =0;

        while(s<=e){
            long m = s + (e-s)/2 ;
            if(m*m<=x){
                ans=m;
                s = m + 1;
            }
            if(m*m>x) e = m - 1;
            else
                s = m + 1;
        }
        return (int)ans;
    }
}