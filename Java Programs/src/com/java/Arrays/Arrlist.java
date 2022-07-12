package com.java.Arrays;

import java.util.ArrayList;

public class Arrlist {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(5);
        al.add(45);
        al.add(46);
        al.add(47);
        al.add(48);
        al.add(49);
        al.add(50);
        int a = al.set(0,34);
        System.out.println(al.get(0));
        System.out.println(al);
    }
}
