package day15_LoopsContinue;

import java.util.Scanner;

/*
2. Create a class named PositiveNegative and write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
        Ex:
   Inputs:
        10
        20
        -1
        0
        3
        Output:
        3 positive and 1 negative
*/
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int positive = 0,
                negative = 0;
        for (int i = 0; i < 6; i++) {
            if (scan.nextInt()<0){
                negative++;
            }else {
                positive++;
            }
            System.out.println(positive + " positive and " + negative + " negative");
        }
    

    }
}
