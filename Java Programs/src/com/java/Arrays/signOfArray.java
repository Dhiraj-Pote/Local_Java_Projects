package com.java.Arrays;

public class signOfArray {
        public void main(String[] args) {
            int[] cost =  {1,2,3,2};
            int[] time = {1,2,3,2};

            System.out.println(getMinCost(cost));
        }

        public int getMinCost(int[] cost) {
            int sum = cost[0];
            int min = cost[1];
            for (int i = 1; i < cost.length; i++) {
                if(cost[i]<min) min = cost[i];
            }
            return min + sum;
        }
    }
