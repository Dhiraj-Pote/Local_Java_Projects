package com.java.Arrays.BinarySearchAlgo;

public class try1 {
    public static void main(String[] args) {
        int n = 63;
        System.out.println(mySqrt(n));
    }

    static int mySqrt(int n) {
        int s = 0, e = n, ans =0;

        while(s<=e){
            int m = s + (e-s)/2 ;
            if(m*m<=n){
                ans = m;
                s = m + 1;
            }
            if(m*m>n) e = m - 1;
            else
                s = m + 1;
        }
        return ans;
    }
}
