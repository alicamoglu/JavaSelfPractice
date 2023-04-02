package day22_WrapperClasses_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

/*1. Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
        str = "Wooden Spoon!"

        output:
        letters= "WoodenSpoon";
        Digits = "";
        specialChars = " !";*/
public class Task1 {
    public static void main(String[] args) {
//        String str = "Wooden Spoon!";
        System.out.println("enter a string with letters,digits, and specialCharacters");
        String str = new Scanner(System.in).nextLine();
//        for (int i = 0; i < str.length(); i++) {
//            str[i]
//        }
        String letters = "";
        String specialChars = "";
        String Digits = "";
        char[] arr1 = str.toCharArray();
        for (char c : arr1) {
            if(Character.isLetter(c)){
                letters += c;
            }else if (Character.isDigit(c)){
                Digits += c;
            }else {
                specialChars+=c;
            }
        }
        System.out.println("letters:" + letters);
        System.out.println("Digits:" + Digits);
        System.out.println("specialChars:" + specialChars);


    }
}
