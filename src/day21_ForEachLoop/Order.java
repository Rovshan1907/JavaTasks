package day21_ForEachLoop;

import java.util.Arrays;

public class Order {
    public static void main(String[] args) {
        int[] num = {0,1,2,3,4};
        int [] result = new int[num.length];

        for (int i = num.length-1, j=0; i >=0; i--) {
            result[j]=num[i];
        }

        System.out.println(Arrays.toString(result));

    }
}
/*
1. Write a program that sort the array of integer in descending
order
 */