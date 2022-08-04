package com.java.string;

public class StringPalindrome {
    public static void main(String[] args) {
        String name = "Krsnansrk";
        System.out.println(ispalindrome(name));
    }

    static boolean ispalindrome(String name) {
        name = name.toLowerCase();
        for (int i = 0; i < (name.length()/2); i++) {
            if(name.charAt(i) != name.charAt(name.length()-1-i))
                return false;
        }
        return true;
    }
}