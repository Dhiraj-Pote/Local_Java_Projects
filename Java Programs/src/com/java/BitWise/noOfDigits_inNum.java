// Calculates number of digits in binary representation of any number;
package com.java.BitWise;
public class noOfDigits_inNum {
    public static void main(String[] args) {
        int n = 29125;  // 11101   // n is a number must be in decimal.
        int base = 10; //
        int ans = (int) (Math.log(n) / Math.log(base)) + 1;
        System.out.println(ans);
    }
}