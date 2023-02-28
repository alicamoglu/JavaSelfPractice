package day06;

public class MedianNumber {
    public static void main(String[] args) {
    int a = 10, b = 15, c = 20;
    int median = 0;

    if (c < a && a < b || b < a && a < c) {
        median = a;
    }
    if (c < b && b < a || a < c && b < c) {
        median = b;
    }
    if (a < c && c < b || b < c && c < a) {
        median = c;
    }

        System.out.println(median + " is the median number");


    }



}


/*
1. Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers

        Ex:
        a = 10, b= 15, c = 20;

        Output:
        15 is the median number
*/
