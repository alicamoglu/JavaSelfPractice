package day13;

import java.util.Scanner;
//import java.util.*;
import java.lang.*;
public class frequencyOfWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a sentence:");
        String sentence1 = input.nextLine();
        System.out.print("enter a word:");
        String word1 = input.next();
//        input.nextLine();

        System.out.println(countString(sentence1,word1));
//        System.out.println(countMatches(sentence1,word1));
    }

    public static int countString (String sentence,String word){

        int count = sentence.length() - sentence.replaceAll(word,"").length();
        int count2 = count/word.length();

        return count2;
    }

//    public static int countMatches(String sentence,String word) {
//
//        int count3 = StringUtils.countMatches(sentence, word);
//        return count3;
//    }


}

/*
6. Create a method named frequencyOfWord that takes two arguments:
        1. sentence (String)
        2. word (String)

        The method should return the frequency of the word from the sentence

        Ex:
        frequencyOfWord("Java java jAvA", "java")  ==> 4
*/
