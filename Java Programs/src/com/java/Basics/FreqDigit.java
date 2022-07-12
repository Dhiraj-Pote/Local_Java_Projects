package com.java.Basics;

public class FreqDigit {
    public static void main(String[] args) {
        int n = 133873;
        int count = 0;

        while (n > 0) {
            int rem = n % 10;            // remainder-> last single digit

            if (rem == 3) {              // is digit equal to 3 ..?
                count++;
            }
            n /= 10;                // 13337  1333  133  13  1
        }
        System.out.println("Freq of 3 is " + count);
    }
}