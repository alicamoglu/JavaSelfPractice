package day13;

import java.util.Scanner;

public class CombineWordsWithMethod {
    public static void main(String[] args) {
/*5.  Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String word1 = input.nextLine();
        System.out.print("Enter second word: ");
        String word2 = input.nextLine();

        System.out.println(combineWords(word1,word2));
    }

    public static String combineWords(String firstWord, String secondWord) {
        return firstWord.equals(secondWord)? firstWord : firstWord+ secondWord;

    }
}
