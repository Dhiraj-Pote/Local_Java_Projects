package com.java.Basics;

public class PalindromeCheck {
    public static void main(String[] args) {
        int number = 1120211;
        System.out.println(isPalindrome2(number));
    }

    static boolean isPalindrome2(int number) {
        int n=number,r=0,sum=0;
        while(number>0){
            r=number%10;
            sum = sum*10+r;
            number = number/10;
        }
        if(n == sum) return true;
        else
            return false;
    }


//    static boolean isPalindrome(int x) {
//        String temp = Integer.toString(x);
//        int[] numbers = new int[temp.length()];
//        for (int i = 0; i < temp. length(); i++) {
//            numbers[i] = temp.charAt(i) - '0';
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            if(numbers[i] != numbers[numbers.length-1-i])
//                return false;
//        }
//        return true;
//    }
}
