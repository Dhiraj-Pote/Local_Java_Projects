package com.java.string;

import java.util.Scanner;

class string_capitalize {
    public static void main(String[] args) {

        // create a string.
        Scanner inp = new Scanner(System.in);
        String message = inp.nextLine();
        // stores each characters to a char array
        char[] charArray = message.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            // if the array element is a letter
            if (Character.isLetter(charArray[i])) {
                // change the letter into uppercase
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }

        // convert the char array to the string
        message = String.valueOf(charArray);
        System.out.println("Message: " + message);
    }
}