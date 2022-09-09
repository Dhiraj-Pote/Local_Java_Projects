package com.java.string;

import java.util.Scanner;

public class RevString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // input for str
        String str = "Krishna";
        System.out.println(unaffectedChar(str));
    }

    static String unaffectedChar(String str) {
        StringBuilder str2 = new StringBuilder();
        char ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); //extracts each character
            str2.insert(0, ch); //adds each character in front of the existing string
        }

        return str2.toString();
    }

}