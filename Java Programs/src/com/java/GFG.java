package com.java;

class GFG {

    // function to calculate
// factorial of a number


    // Function to calculate
// sum of all numbers
    public static int Solve(int n) {
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {

            do {
                arr[i] = n % 10;
                n /= 10;
                i++;
            } while (n != 0);
        }

        int fact = 6;

        int digitsum = 0;
        for (int i = 0; i < 3; i++)
            digitsum += arr[i];
        digitsum *= (fact / 3);


        int res = 0;
        for (int i = 1, k = 1;
             i <= 3; i++) {
            res += (k * digitsum);
            k = k * 10;
        }

        return res;
    }


    public static void main(String[] args) {

        // n distinct digits
        int num = 123;


        // Print sum of all
        // the numbers formed
        System.out.println(Solve(num));
    }
}
