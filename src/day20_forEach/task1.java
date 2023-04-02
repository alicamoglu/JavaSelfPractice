package day20_forEach;

import java.util.Scanner;

//1.  Write a program that can count the even and odd number from an array of integers
//        Note: MUST use for each loop
public class task1 {
    public static void main(String[] args) {
        int numberOfOdd = 0,numberOfEven = 0;
        int[] anArray = {11,23,22,33,44,78,92,2,14};
        for (int each : anArray) {
            switch (each%2){
                case 0:
                numberOfEven++;
                break;
                default:
                numberOfOdd++;
            }
        }
        System.out.println("evens: "+numberOfEven);
        System.out.println("odds: "+numberOfOdd);
    }
}
