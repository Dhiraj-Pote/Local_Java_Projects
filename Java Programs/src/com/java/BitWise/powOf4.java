package com.java.BitWise;

public class powOf4 {
    public static void main(String[] args) {

        System.out.println(isPowerOfFour(256)); // 10000
    }
    static boolean isPowerOfFour(int n) {
        if(n==0) return false;
        if(n==1) return true;

        while(n!=4){
            if(n%4!=0) return false;
            n/=4;
        }
        return true;
    }
}
