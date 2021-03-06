package com.java.Basics;
// https://leetcode.com/problems/find-the-difference/

public class Try {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abdce";
        System.out.println(findTheDifference(s,t));
    }

    static char findTheDifference(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()) c ^= cs;
        for(char ct : t.toCharArray()) c ^= ct;
        return c;
    }
}