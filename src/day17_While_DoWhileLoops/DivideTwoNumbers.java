package day17_While_DoWhileLoops;

public class DivideTwoNumbers {
    public static void main(String[] args) {

int c = 14;
int d = 3;

int count = 0;
 while(c >= d){
     c-= d;
     count++;
 }
        System.out.println(count+" with c remainder of" +c);




    }
}
/*
1. Write a program that can divide two positive numbers without
using / (division) and * (multiplication) operators.
 */