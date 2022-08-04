package com.java.string;

public class validPalindrome2 {
    public static void main(String[] args) {
        String s = "aaam";   // afgtklgfa; // aaaa;
        System.out.println(isValidAfterRemoving(s));
    }

      static boolean isValidAfterRemoving(String s) {
          if(!checkPalindrome(s)) {}


          return true;



    }

    static boolean checkPalindrome(String s){
        int len = s.length();
        char[] arr = s.toCharArray();

        for (int i = 0; i < len; i++) {
            if(arr[i] == arr[len-1-i]){
                continue;
            }
            return false;
        }
        return true;
    }
}