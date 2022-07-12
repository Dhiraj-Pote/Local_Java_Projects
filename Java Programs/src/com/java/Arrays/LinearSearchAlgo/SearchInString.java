package com.java.Arrays.LinearSearchAlgo;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Raina";
        char target = 'a';
        System.out.println(search2(str, target));

//    static boolean search(String str, char target) {  // searching char in string
//        for (int i = 0; i <str.length(); i++) {
//            if (target == str.charAt(i)) {
//                return true;
//            }
//        }
//        return false;
//    }
    }

    static boolean search2(String str, char target) {
        for (char i: str.toCharArray()) {
            if(target == i)
                return true;
        }
        return false;
    }
}