package com.java.Arrays.LinearSearchAlgo;

public class EvenNos {
    public static void main(String[] args) {
        int[] arr = {-12, 4, 91, -2244, 0, 72, 9961};  // 5 nos. having even length

        int count = 0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean even(int num) {
        return lengthOfNO(num) % 2 == 0;
    }

    static int lengthOfNO(int num) {
        if (num < 0) {
            num *= -1;
        }
        if (num == 0) {
            return 1;
        }
        return (int) (Math.log10(num)) + 1;
    }
}