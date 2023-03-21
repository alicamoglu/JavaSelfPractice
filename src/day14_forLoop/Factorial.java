package day14_forLoop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("enter a number to find its factorial: ");
        int number = new Scanner(System.in).nextInt();

        int product = 1;

        for (int i = 1; i <= number; i++) {
            product *= i;
        }
        System.out.println(product);
    }

}

/*
4. Write a program that can return the factorial number of any given number

        Ex:
        input: 5
        output: 120
        ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
        */
