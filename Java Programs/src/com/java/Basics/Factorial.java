package com.java.Basics;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact1(6));
    }
    static int fact1(int n){
        if(n>0)
            return n * fact1(n - 1);
        else
            return 1;
        }

//    static int fact2(int n){
//        int fact = 1;
//        for (int i = n; i > 0; i--) {
//            fact*=i;
//        }
//        return fact;
//    }
}
