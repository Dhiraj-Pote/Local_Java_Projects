package com.java.Basics;
// https://leetcode.com/problems/find-the-difference/

public class FindDiff {
    public static void main(String[] args) {
        String s = "abcdui";
        String t = "abdcusi";
        System.out.println(findTheDifference(s,t));
    }

    static char findTheDifference(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()) c ^= cs; // XOR operator;
        for(char ct : t.toCharArray()) c ^= ct;
        return c;
    }
}