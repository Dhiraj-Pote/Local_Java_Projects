package com.java.Basics;

import java.util.Scanner;

public class RevString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // input for dataStream
        String dataStream = in.nextLine();
        System.out.println(unaffectedChar(dataStream));
    }

    static int unaffectedChar(String dataStream) {
        String nstr = "";
        char ch;

        for (int i = 0; i < dataStream.length(); i++) {
            ch = dataStream.charAt(i); //extracts each character
            nstr = ch + nstr; //adds each character in front of the existing string
        }
        int count = 0;
        for (int i = 0; i < dataStream.length(); i++) {
            if (dataStream.charAt(i) == nstr.charAt(i))
                count++;
        }
        return count;
    }

}