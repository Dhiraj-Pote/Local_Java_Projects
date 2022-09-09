package com.java.Arrays;
import java.util.Arrays;

class Main
{
    public static void countFreq(int[] arr, int n)
    {
        boolean[] visited = new boolean[arr.length];
        Arrays.fill(visited, false);

        for (int i = 0; i < arr.length; i++) {

            // Skip this element if already processed
            if (visited[i])
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if(count==1)
                System.out.println(arr[i]);
        }

    }

    public static void main(String []args)
    {
        int[] arr = {1,2,3,1,1,7};
        int n = 4;
        countFreq(arr, n);
    }
}