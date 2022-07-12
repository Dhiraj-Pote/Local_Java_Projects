package com.java.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDArrlist {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> mal = new ArrayList<>();

        for (int i = 0; i < 4; i++) {   // initialize size
            mal.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                mal.get(i).add(inp.nextInt());
            }
        }
        System.out.println(mal);
    }
}
