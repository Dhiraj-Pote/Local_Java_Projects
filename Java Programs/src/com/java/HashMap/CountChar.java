package com.java.HashMap;
import java.util.HashMap;
import java.util.Map;

public class CountChar {
    public static void main(String[] args) {
        String name = "dhddiraj";
        char[] arr = name.toCharArray(); // [d, h, i, r, a, j]

        Map<Character, Integer> map = new HashMap<>();

        for (char ch1 : arr) {
            int count = 0;
            for (char ch2 : arr) {
                if (ch1 == ch2) count++;
            }
            map.put(ch1, count);
        }
        System.out.println(map);
    }
}