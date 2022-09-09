package com.java.string;

public class trial {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    static boolean isSubsequence(String s, String t) {
        int s_index = 0;
        if(s.length() == 0) return true;

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(s_index))
                s_index++;
            if (s_index == s.length()) return true;
        }
        return false;
    }
}
