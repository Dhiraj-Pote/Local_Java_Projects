package com.java.string;

public class removeThreeConsiChar {
    public static void main(String[] args) {
        String s = "avpaabba";
        System.out.println(makeFancyString(s));
    }
    static String makeFancyString(String s) {
        String a = "";

        int count = 0;
        for (int i = 2; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                if (s.charAt(i - 1) == s.charAt(i - 2)) {
                    count++;
                }
                else {
                    a += s.charAt(i-2) ;
                }
            }
            else {
                a += s.charAt(i-1);
            }

        }

        return a;
    }

}
