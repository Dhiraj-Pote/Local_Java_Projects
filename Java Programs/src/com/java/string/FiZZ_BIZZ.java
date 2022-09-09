package com.java.string;

import java.util.ArrayList;
import java.util.List;
// leetcode 412
// answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//answer[i] == "Fizz" if i is divisible by 3.
//answer[i] == "Buzz" if i is divisible by 5.
//answer[i] == i

public class FiZZ_BIZZ {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    static List<String> fizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = i + 1;
            if (num % 15 == 0) list.add(i, "FizzBuzz");
            else if (num % 5 == 0) list.add(i, "Buzz");
            else if (num % 3 == 0) list.add(i, "Fizz");
            else list.add(Integer.toString(num));
        }
        return list;
    }
}
