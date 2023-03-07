package day11_string;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {
/*
4. Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
        Input:
        apple
        banana
        Output:
        ppleanana
*/
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String firstWord = input.nextLine();
        System.out.print("Enter second word: ");
        String secondWord = input.nextLine();

        System.out.println(firstWord.substring(1) + secondWord.substring(1));
    }
}


