package day14_forLoop;

import java.util.Scanner;

public class SumOfAllNumberBetween {
    public static void main(String[] args) {
        System.out.print("enter the number until it to add 1: ");
        int num = new Scanner(System.in).nextInt();


        int sum = 0;

        for (int i = 2; i <=num ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

/*
3. write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
        input: 100
        output: 5050

        input: 50
        output: 1275
        */
