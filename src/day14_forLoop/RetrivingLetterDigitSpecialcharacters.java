package day14_forLoop;

import java.util.Scanner;

public class RetrivingLetterDigitSpecialcharacters {
    public static void main(String[] args) {
    String str = new Scanner(System.in).nextLine();

        String letters = "",
                digits = "",
                specialChars = "";
        letters += str.charAt(0);

//        for (char i = str.charAt(0); i < str.charAt(str.length()) ; i++) {
        for (int i = 0; i < str.length() ; i++) {
           if (Character.isLetter(str.charAt(i))){
               letters += str.charAt(i) ;
           } else if (Character.isDigit(str.charAt(i))) {
               digits += str.charAt(i);
           } else {
               specialChars += str.charAt(i);
           }
        }
        System.out.println("letters: " + letters);
        System.out.println("digits: " + digits);
        System.out.println("special Chars: " + specialChars);
    }
}

/*
5. write a program that can retrive the digits, letters and special characters from a string
        Ex:
        input:
        mn@#123Ab!

        output:
        letters: mnAb
        digits: 123
        special chars: @#!
*/
