package day14_forLoop;

import java.util.Scanner;

public class StarsShape$repeat_String$ {
    public static void main(String[] args) {
        int times = new Scanner(System.in).nextInt();
        starslines(times);
    }
    public static void starslines(int num){
        for (int i = num; i >=0 ; i--) {
            System.out.println("*".repeat(6));
        }
    }
}

/*
1. Use a loop to print the following shape:

        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
*/
