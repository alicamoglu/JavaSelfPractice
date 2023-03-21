package day16_nestedLoop;

import java.util.Scanner;

/*
1. Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
addition to task : centeral building and with a scanner building
*/
public class StarPyramid {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println("*".repeat(i));
        }
        String empty = "",
                star = "*";
        for (int i = 1; i <= number; i++) {
            empty += star;
            System.out.println(empty);
        }
        empty = "*";
        star = "**";
        for (int i = 0; i <= number ; i++) {
            System.out.println(center(empty,4*number)); //why 4*number : it gives error because string is lenger witdh of center.
            empty += star;
        }
    }
    public static String center(String str, int width){
        int leftPad = (width - str.length()) / 2;
        int rightPad = width - str.length() - leftPad;
        return String.format("%" + leftPad + "s%s%" + rightPad + "s", "", str, "");
    }





}
