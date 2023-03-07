package day11_string;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {
/*        5. Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
        But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                Input:
                one
                eight
                Output:
                oneight*/
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String firstWord = input.nextLine();
        System.out.print("Enter second word: ");
        String secondWord = input.nextLine();
        String result = firstWord.equals(secondWord)? firstWord :
                firstWord+ secondWord;
        System.out.println(result);
    }
}
