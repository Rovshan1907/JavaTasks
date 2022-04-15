package day21_ForEachLoop;

import java.util.Arrays;

public class EvenAndOdd {
    public static void main(String[] args) {
int[] num = {11,21,31,42,51,63,72};

int countEven =0;
int countOdd = 0;

        for (int each : num) {
            if (each%2 ==0){
                countEven++;
            }else{
                countOdd++;
            }
        }

        System.out.println(Arrays.toString(num) +" has "+countEven+" even numbers and "+countOdd+"odd numbers");

    }
}
/*
2. Write a program that can count the even and odd number from an
array of integers
Note: MUST use for each loop
 */