package com.java.Arrays.BinarySearchAlgo;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c', 'd', 'k', 'p', 't'};
        char target = 't';
        System.out.println(search(letters, target));
    }

    // return index of the smallest number >= target
    static char search(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;

        while (s <= e) {        // sorted down to 1 element
            int m = s + (e-s)/2;

            if(target < letters[m]){
                e = m - 1;
            }
            else {
                s = m+1;
            }
        }
        return letters[s % letters.length];    // while loop breaks s=e+1
    }          // because texts are wrap around.
}