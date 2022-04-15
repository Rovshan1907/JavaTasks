package day22_MultiDimensionalArray;

import java.util.Arrays;
import java.util.Collection;

public class day22_MultiDimensionalArray {
    public static void main(String[] args) {


        int[] arr1 = {1,2,3},
        arr2 ={4,5,6} ;
        int[][] arr2D = new int[2][];
        arr2D[0] = arr1;
        arr2D[1] = arr2;

        int [][] result = new int [arr2D.length][];

        for (int i = 0; i < arr2D.length; i++) {
            int[] temp= new int[arr2D[i].length];
            for (int j = 0; j < arr2D.length; j++) {
                temp[(temp.length - 1)-j] = arr2D[i][j];

            }
            result[(arr2D.length - 1) - i] = temp;
        }

        System.out.println(Arrays.deepToString(result));


    }
}
/*
1. Write a program that can reverse a two dimensional array (return new
                array)
        Ex:
        array = { {1,2,3}, {4,5,6}};
        output:
        reverse = { {6,5,4}, {3,2,1},};
 */

// ask that question